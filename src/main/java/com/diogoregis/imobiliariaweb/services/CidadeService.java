package com.diogoregis.imobiliariaweb.services;

import com.diogoregis.imobiliariaweb.models.Cidade;
import com.diogoregis.imobiliariaweb.repositories.CidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CidadeService {

    @Autowired
    private CidadeRepository service;

    public List<Cidade> findAll(){
        return service.findAll();
    }

    public Cidade findById(Long id){
        Optional<Cidade> obj = service.findById(id);
        return obj.get();
    }

}
