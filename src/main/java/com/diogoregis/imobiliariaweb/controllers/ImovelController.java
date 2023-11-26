package com.diogoregis.imobiliariaweb.controllers;


import com.diogoregis.imobiliariaweb.dto.ImovelForm;
import com.diogoregis.imobiliariaweb.models.Categoria;
import com.diogoregis.imobiliariaweb.models.Imovel;
import com.diogoregis.imobiliariaweb.services.CategoriaService;
import com.diogoregis.imobiliariaweb.services.CorretorService;
import com.diogoregis.imobiliariaweb.services.ImovelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(value = "/imoveis")
public class ImovelController {

    @Autowired
    private CorretorService corretorService;

    @Autowired
    private CategoriaService categoriaService;
    @Autowired
    private ImovelService imovelRepository;

    @GetMapping(value = "/api")
    public ResponseEntity<List<Imovel>> findAll(){
        List<Imovel> list = imovelRepository.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/api/{id}")
    public ResponseEntity<Imovel> findById(@PathVariable Long id){
        Imovel obj = imovelRepository.findById(id);
        return ResponseEntity.ok().body(obj);
    }

    @GetMapping
    public String listarImoveis(Model model){
        List<Imovel> imoveis = imovelRepository.findAll();
        model.addAttribute("imoveis", imoveis);
        return "listaImoveis";
    }

    @GetMapping(value = "/form")
    public String chamaForm(Model categoria){
        List<Categoria> categorias = categoriaService.findAll();
        categoria.addAttribute("categorias", categorias);
        return "formImovel";
    }
    @PostMapping
    public String saveForm(@ModelAttribute ImovelForm imovelForm){
        imovelRepository.save(imovelRepository.criarImovel(imovelForm));
        return "redirect:/imoveis";
    }

}
