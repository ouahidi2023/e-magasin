package com.ouahidi.client.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
import org.springframework.web.bind.annotation.GetMapping;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor @ToString
@Builder
public class Client {
    @Id  @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long idClient;
    private String nom;
    private String prenom;
    private String ville;

}
