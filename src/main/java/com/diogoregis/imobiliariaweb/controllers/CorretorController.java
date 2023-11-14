package com.diogoregis.imobiliariaweb.controllers;


import com.diogoregis.imobiliariaweb.models.Corretor;
import com.diogoregis.imobiliariaweb.services.CorretorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/corretores")
public class CorretorController {

    @Autowired
    private CorretorService corretorRepository;

    @GetMapping
    public ResponseEntity<List<Corretor>> findAll(){
        List<Corretor> list = corretorRepository.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Corretor> findById(@PathVariable Long id){
        Corretor obj = corretorRepository.findById(id);
        return ResponseEntity.ok().body(obj);
    }


}
