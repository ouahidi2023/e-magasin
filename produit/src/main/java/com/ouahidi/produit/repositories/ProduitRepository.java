package com.ouahidi.produit.repositories;

import com.ouahidi.produit.entities.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProduitRepository extends JpaRepository  <Produit , Long>{
}
