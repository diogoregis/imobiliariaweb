package com.diogoregis.imobiliariaweb.services;

import com.diogoregis.imobiliariaweb.models.Imovel;
import com.diogoregis.imobiliariaweb.repositories.ImovelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ImovelService {

    @Autowired
    private ImovelRepository repository;

    public List<Imovel> findAll(){
        return repository.findAll();
    }

    public Imovel findById(Long id){
        Optional<Imovel> obj = repository.findById(id);
        return obj.get();
    }

    public void save(Imovel imovel){
        repository.save(imovel);
    }

}
