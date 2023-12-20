package com.ouahidi.produit.config;


import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "global.params")
@Setter
@Getter
public class ConfigGlobalProduit {
    int g1;
    int g2;
}
