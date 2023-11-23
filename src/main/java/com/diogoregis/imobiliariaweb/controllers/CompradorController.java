package com.diogoregis.imobiliariaweb.controllers;


import com.diogoregis.imobiliariaweb.dto.CompradorForm;
import com.diogoregis.imobiliariaweb.models.Comprador;
import com.diogoregis.imobiliariaweb.services.CompradorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(value = "/compradores")
public class CompradorController {

    @Autowired
    private CompradorService compradorRepository;

    @GetMapping(value = "/api")
    public ResponseEntity<List<Comprador>> findAll(){
        List<Comprador> list = compradorRepository.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Comprador> findById(@PathVariable Long id){
        Comprador obj = compradorRepository.findById(id);
        return ResponseEntity.ok().body(obj);
    }

    @GetMapping
    public String listarCompradores(Model model){
        List<Comprador> compradores = compradorRepository.findAll();
        model.addAttribute("compradores", compradores);
        return "listaCompradores";
    }

    @GetMapping(value = "/form")
    public String chamaForm(Model model){
        return "formComprador";
    }

    @PostMapping
    public String cadastrarCompradorForm(@ModelAttribute CompradorForm compradorForm){
        Comprador comprador = compradorRepository.novoComprador(compradorForm);
        compradorRepository.save(comprador);
        System.out.println(compradorForm.getNome());
        System.out.println(compradorForm.getContato());
        System.out.println(compradorForm.getCpf());
        return "redirect:/compradores";
    }

}
