package com.diogoregis.imobiliariaweb.services;

import com.diogoregis.imobiliariaweb.models.Categoria;
import com.diogoregis.imobiliariaweb.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository repository;

    public List<Categoria> findAll(){
        return repository.findAll();
    }

    public Categoria findById(Long id){
        Optional<Categoria> obj = repository.findById(id);
        return obj.get();
    }

    public void save(Categoria categoria){
        repository.save(categoria);
    }

}
