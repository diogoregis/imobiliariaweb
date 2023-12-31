package com.diogoregis.imobiliariaweb.controllers;


import com.diogoregis.imobiliariaweb.dto.CidadeForm;
import com.diogoregis.imobiliariaweb.models.Cidade;
import com.diogoregis.imobiliariaweb.services.CidadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@Controller
@RequestMapping(value = "/cidades")
public class CidadeController {

    @Autowired
    private CidadeService cidadeRepository;

    /*@GetMapping
    public ResponseEntity<List<Cidade>> findAll(){
        List<Cidade> list = cidadeRepository.findAll();
        return ResponseEntity.ok().body(list);
    }*/

    @GetMapping
    public String listaCidades(Model model){
        List<Cidade> cidades = cidadeRepository.findAll();
        model.addAttribute("cidades", cidades);
        return "listaCidades";
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Cidade> findById(@PathVariable Long id){
        Cidade obj = cidadeRepository.findById(id);
        return ResponseEntity.ok().body(obj);
    }

    @GetMapping(value = "/form")
    public String chamaFormulario(Model model){
        return "formCidade";
    }

    @PostMapping
    public String saveForm(@ModelAttribute CidadeForm cidadeForm){
        Cidade cidade= new Cidade();
        cidade.setNome(cidadeForm.getNome());
        cidadeRepository.save(cidade);
        return "redirect:/cidades";
    }


}
