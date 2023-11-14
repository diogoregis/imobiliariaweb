package com.diogoregis.imobiliariaweb.repositories;

import com.diogoregis.imobiliariaweb.models.Imovel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImovelRepository extends JpaRepository<Imovel, Long> {

}
