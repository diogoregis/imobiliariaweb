package com.diogoregis.imobiliariaweb.controllers;


import com.diogoregis.imobiliariaweb.models.Imovel;
import com.diogoregis.imobiliariaweb.repositories.ImovelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/imoveis")
public class ImovelController {

    @Autowired
    private ImovelRepository imovelRepository;

    @GetMapping
    public ResponseEntity<List<Imovel>> findAll(){
        List<Imovel> list = imovelRepository.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Optional<Imovel>> findById(@PathVariable Long id){
        Optional<Imovel> obj = imovelRepository.findById(id);
        return ResponseEntity.ok().body(obj);
    }


}
