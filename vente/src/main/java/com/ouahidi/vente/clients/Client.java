package com.ouahidi.vente.clients;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class Client {
    private Long idClient;
    private String nom;
    private String prenom;
    private String ville;
}
