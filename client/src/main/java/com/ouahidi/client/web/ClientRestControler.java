package com.ouahidi.client.web;

import com.ouahidi.client.entities.Client;
import com.ouahidi.client.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ClientRestControler {

    @Autowired
    private ClientRepository clientRepository ;

    @GetMapping ("/clients")
    public List<Client> findall(){
        return clientRepository.findAll();

    }

    @GetMapping ("/clients/{id}")
    public Client findby(@PathVariable Long id){
        return clientRepository.findById(id).get();

    }


}
