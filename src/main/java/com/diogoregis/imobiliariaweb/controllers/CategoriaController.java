package com.diogoregis.imobiliariaweb.controllers;


import com.diogoregis.imobiliariaweb.dto.CategoriaForm;
import com.diogoregis.imobiliariaweb.models.Categoria;
import com.diogoregis.imobiliariaweb.services.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@Controller
@RequestMapping(value = "/categorias")
public class CategoriaController {

    @Autowired
    private CategoriaService categoriaRepository;

    @GetMapping
    public String listaCategorias(Model model) {
        List<Categoria> categorias = categoriaRepository.findAll();
        model.addAttribute("categorias", categorias);
        return "listaCategorias";
    }

    @GetMapping(value = "/form")
    public String chamaFormulario(Model model){
        //TODO
        return "formCategoria";
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Categoria> findById(@PathVariable Long id){
        Categoria obj = categoriaRepository.findById(id);
        return ResponseEntity.ok().body(obj);
    }

    @PostMapping(value = "/api")
    public void save(Categoria categoria){
        categoriaRepository.save(categoria);
    }

    @PostMapping
    public String saveForm(@ModelAttribute CategoriaForm categoriaForm){
        Categoria categoria = new Categoria();
        categoria.setTipo(categoriaForm.getTipo());
        categoriaRepository.save(categoria);
        return "redirect:/categorias";
    }


    @GetMapping(value = "/api")
    public ResponseEntity<List<Categoria>> findAll(){
        List<Categoria> list = categoriaRepository.findAll();
        return ResponseEntity.ok().body(list);
    }


}
