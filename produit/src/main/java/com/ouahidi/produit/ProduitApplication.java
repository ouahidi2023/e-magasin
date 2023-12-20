package com.ouahidi.produit;

import com.ouahidi.produit.config.ConfigGlobalProduit;
import com.ouahidi.produit.config.ProduitConfig;
import com.ouahidi.produit.entities.Produit;
import com.ouahidi.produit.repositories.ProduitRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

@SpringBootApplication

@EnableConfigurationProperties({ConfigGlobalProduit.class, ProduitConfig.class})
public class ProduitApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProduitApplication.class, args);
    }


    @Bean
CommandLineRunner start(ProduitRepository produitRepository)
{
    return args->{

        Produit p1 = Produit.builder()
                .marque("HP")
                .description("PC portable i5")
                .prix(9999.0)
                .build();
   produitRepository.save(p1);

        Produit p2 = Produit.builder()
                .marque("HP")
                .description("PC portable i7")
                .prix(10000.0)
                .build();
        produitRepository.save(p2);
        Produit p3 = Produit.builder()
                .marque("DELL")
                .description("PC portable i5")
                .prix(8888.0)

                .build();
        produitRepository.save(p3);

    }
            ;
}
}
