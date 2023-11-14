package com.diogoregis.imobiliariaweb.repositories;

import com.diogoregis.imobiliariaweb.models.Comprador;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompradorRepository extends JpaRepository<Comprador, Long> {
}
