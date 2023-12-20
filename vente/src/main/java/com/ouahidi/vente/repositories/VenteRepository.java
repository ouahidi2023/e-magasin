package com.ouahidi.vente.repositories;

import com.ouahidi.vente.entities.Vente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VenteRepository extends JpaRepository  <Vente,Long> {
}
