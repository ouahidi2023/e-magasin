package com.ouahidi.vente.web;

import com.ouahidi.vente.clients.Client;
import com.ouahidi.vente.produits.Produit;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name="PRODUIT-SERVICE")
public interface ProduitOpenFeingControler {

    @GetMapping("/produits")
    public List<Produit> finall();

    @GetMapping ("/produits/{id}")
    public Produit findBy(@PathVariable  Long id);


}
