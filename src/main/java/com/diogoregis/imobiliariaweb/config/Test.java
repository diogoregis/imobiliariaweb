package com.diogoregis.imobiliariaweb.config;

import com.diogoregis.imobiliariaweb.models.Categoria;
import com.diogoregis.imobiliariaweb.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class Test implements CommandLineRunner {

    @Autowired
    private CategoriaRepository categoriaRepository;


    public void run(String... args) throws Exception {

        Categoria c1 = new Categoria(null, "Casa");
        Categoria c2 = new Categoria(null, "Apartamento");
        Categoria c3 = new Categoria(null, "Comercial");

        categoriaRepository.saveAll(Arrays.asList(c1,c2,c3));

    }

}
