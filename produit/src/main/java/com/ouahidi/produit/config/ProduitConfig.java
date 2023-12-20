package com.ouahidi.produit.config;


import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;


@ConfigurationProperties(prefix = "produit.params")
@Setter
@Getter
public class ProduitConfig {
    int p1;
    int p2;
}
