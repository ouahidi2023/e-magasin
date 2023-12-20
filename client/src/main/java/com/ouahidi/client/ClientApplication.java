package com.ouahidi.client;

import com.ouahidi.client.entities.Client;
import com.ouahidi.client.repositories.ClientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClientApplication.class, args);
    }

    @Bean
    CommandLineRunner start(ClientRepository clientRepository ){
        return args->{
            Client c1 = Client.builder()
                    .nom("Hilali")
                    .prenom("Hamid")
                    .ville("Rabat")
                    .build();
            clientRepository.save(c1);
            Client c2 = Client.builder()
                    .nom("Zerouali")
                    .prenom("Hind")
                    .ville("Fes")
                    .build();
            clientRepository.save(c2);

        };

    }
}
