package com.diogoregis.imobiliariaweb.repositories;

import com.diogoregis.imobiliariaweb.models.Cidade;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CidadeRepository extends JpaRepository<Cidade, Long> {
}
