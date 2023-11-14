package com.diogoregis.imobiliariaweb.controllers;


import com.diogoregis.imobiliariaweb.models.Comprador;
import com.diogoregis.imobiliariaweb.repositories.CompradorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/compradores")
public class CompradorController {

    @Autowired
    private CompradorRepository compradorRepository;

    @GetMapping
    public ResponseEntity<List<Comprador>> findAll(){
        List<Comprador> list = compradorRepository.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Optional<Comprador>> findById(@PathVariable Long id){
        Optional<Comprador> obj = compradorRepository.findById(id);
        return ResponseEntity.ok().body(obj);
    }


}
