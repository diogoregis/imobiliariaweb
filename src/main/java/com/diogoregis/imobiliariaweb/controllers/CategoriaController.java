package com.diogoregis.imobiliariaweb.controllers;


import com.diogoregis.imobiliariaweb.models.Categoria;
import com.diogoregis.imobiliariaweb.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaController {

    @Autowired
    private CategoriaRepository categoriaRepository;

    @GetMapping
    public ResponseEntity<List<Categoria>> findAll(){
        List<Categoria> list = categoriaRepository.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Optional<Categoria>> findById(@PathVariable Long id){
        Optional<Categoria> obj = categoriaRepository.findById(id);
        return ResponseEntity.ok().body(obj);
    }

    public void save(Categoria categoria){
        categoriaRepository.save(categoria);
    }


}
