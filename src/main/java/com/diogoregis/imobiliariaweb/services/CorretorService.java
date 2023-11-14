package com.diogoregis.imobiliariaweb.services;

import com.diogoregis.imobiliariaweb.models.Corretor;
import com.diogoregis.imobiliariaweb.repositories.CorretorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CorretorService {

    @Autowired
    private CorretorRepository repository;

    public List<Corretor> findAll(){
        return repository.findAll();
    }

    public Corretor findById(Long id){
        Optional<Corretor> obj = repository.findById(id);
        return obj.get();
    }

    public void save(Corretor corretor){
        repository.save(corretor);
    }

}
