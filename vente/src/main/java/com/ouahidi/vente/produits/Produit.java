package com.ouahidi.vente.produits;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Produit {
    private Long idProduit;
    private String marque;
    private String description;
    private Double prix;

}
