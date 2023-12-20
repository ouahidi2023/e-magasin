package com.ouahidi.produit.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Data  @NoArgsConstructor @AllArgsConstructor @Builder @ToString
public class Produit {
    @Id @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long idProduit;
    private String marque;
    private String description;
    private Double prix;

}
