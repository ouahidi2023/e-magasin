package com.ouahidi.produit.web;

import com.ouahidi.produit.config.ConfigGlobalProduit;
import com.ouahidi.produit.config.ProduitConfig;
import com.ouahidi.produit.entities.Produit;
import com.ouahidi.produit.repositories.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProduitRestControler {
    @Autowired
    private ProduitRepository produitRepository;
   @Autowired
   private ProduitConfig produitConfig;


   @Autowired
   private    ConfigGlobalProduit configGlobalProduit;

   @GetMapping("/testConfig")
   public ProduitConfig produitconfig(){
       return produitConfig;
   }

    @GetMapping("/testGlobalConfig")
    public ConfigGlobalProduit globalconfig(){
        return configGlobalProduit;
    }

   @GetMapping("/produits")
    public List<Produit> findall() {
        return produitRepository.findAll();

    }


    @GetMapping("/produits/{id}")
    public Produit findby(@PathVariable Long id) {
        return produitRepository.findById(id).get();


    }
}