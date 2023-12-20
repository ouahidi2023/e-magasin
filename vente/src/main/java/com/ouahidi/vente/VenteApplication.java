package com.ouahidi.vente;

import com.ouahidi.vente.clients.Client;
import com.ouahidi.vente.entities.Vente;
import com.ouahidi.vente.repositories.VenteRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableFeignClients
public class VenteApplication {

    public static void main(String[] args) {
        SpringApplication.run(VenteApplication.class, args);
    }
@Bean
    CommandLineRunner start(VenteRepository venteRepository )
    { return args->{
        Vente v1 = Vente.builder()
                .an(2022)
                .mois("Mai")
                .idClient(1L)
                .idProduit(1L)
                .quantite(4)
                .build();
        venteRepository.save(v1);

        Vente v2 = Vente.builder()
                .an(2021)
                .mois("Avril")
                .idClient(1L)
                .idProduit(2L)
                .quantite(3)
                .build();
        venteRepository.save(v2);
        Vente v3 = Vente.builder()
                .an(2023)
                .mois("Octobre")
                .idClient(2L)
                .idProduit(2L)
                .quantite(10)

                .build();
        venteRepository.save(v1);
        Vente v4 = Vente.builder()
                .an(2020)
                .mois("Mai")
                .idClient(2L)
                .idProduit(3L)
                .build();
        venteRepository.save(v4);



    };

    }
}
