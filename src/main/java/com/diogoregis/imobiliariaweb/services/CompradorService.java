package com.diogoregis.imobiliariaweb.services;

import com.diogoregis.imobiliariaweb.models.Comprador;
import com.diogoregis.imobiliariaweb.repositories.CompradorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CompradorService {

    @Autowired
    private CompradorRepository repository;

    public List<Comprador> findAll(){
        return repository.findAll();
    }

    public Comprador findById(Long id){
        Optional<Comprador> obj = repository.findById(id);
        return obj.get();
    }

    public void save(Comprador comprador){
        repository.save(comprador);
    }

}
