package com.diogoregis.imobiliariaweb.controllers;


import com.diogoregis.imobiliariaweb.models.Cidade;
import com.diogoregis.imobiliariaweb.services.CidadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/cidades")
public class CidadeController {

    @Autowired
    private CidadeService cidadeRepository;

    @GetMapping
    public ResponseEntity<List<Cidade>> findAll(){
        List<Cidade> list = cidadeRepository.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Cidade> findById(@PathVariable Long id){
        Cidade obj = cidadeRepository.findById(id);
        return ResponseEntity.ok().body(obj);
    }


}
