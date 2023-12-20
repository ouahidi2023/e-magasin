package com.ouahidi.vente.entities;

import com.ouahidi.vente.clients.Client;
import com.ouahidi.vente.produits.Produit;
import jakarta.persistence.*;
import lombok.*;
import org.bouncycastle.asn1.x500.style.RFC4519Style;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor @Builder @ToString
public class Vente {
@Id @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long idVente;
    private Integer an;
    private String mois;
    private Long idProduit;
    @Transient
    private Produit produit;
    private Integer quantite;
    private Long idClient;
    @Transient
    private Client client;
}
