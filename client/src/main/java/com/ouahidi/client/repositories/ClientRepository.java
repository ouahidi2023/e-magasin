package com.ouahidi.client.repositories;

import com.ouahidi.client.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository  <Client , Long>{
}
