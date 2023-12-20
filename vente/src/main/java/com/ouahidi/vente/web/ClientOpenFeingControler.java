package com.ouahidi.vente.web;

import com.ouahidi.vente.clients.Client;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name="CLIENT-SERVICE")
public interface ClientOpenFeingControler {

    @GetMapping("/clients")
    public List<Client> finall();

    @GetMapping ("/clients/{id}")
    public Client findBy(@PathVariable  Long id);


}
