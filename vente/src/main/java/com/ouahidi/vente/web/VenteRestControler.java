package com.ouahidi.vente.web;

import com.ouahidi.vente.clients.Client;
import com.ouahidi.vente.entities.Vente;
import com.ouahidi.vente.produits.Produit;
import com.ouahidi.vente.repositories.VenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class VenteRestControler {
    @Autowired
    private VenteRepository venteRepository;
    @Autowired
    private ClientOpenFeingControler clientOpenFeingControler;
    @Autowired
    private ProduitOpenFeingControler produitOpenFeingControler;


    @GetMapping("/ventes")
    public List<Vente> findall() {
        List<Vente> lv = venteRepository.findAll();

        List<Client> lc = clientOpenFeingControler.finall();

        List<Produit> lp = produitOpenFeingControler.finall();

        for (Vente v : lv) {
            for (Client c : lc)
                if (v.getIdClient() == c.getIdClient()) {
                    v.setClient(c);
                    break;
                }
            for (Produit p : lp)
                if (p.getIdProduit() == v.getIdProduit())
                    v.setProduit(p);
        }

        return lv;

    }

    @GetMapping("/ventes/{id}")
    public Vente findby(@PathVariable Long id) {
        Vente v= venteRepository.findById(id).get();
        Client c=clientOpenFeingControler.findBy(v.getIdClient());
        Produit p = produitOpenFeingControler.findBy(v.getIdProduit());
        v.setProduit(p);
        v.setClient(c);
        return v;


    }

}
