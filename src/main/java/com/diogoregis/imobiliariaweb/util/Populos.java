package com.diogoregis.imobiliariaweb.util;


import com.diogoregis.imobiliariaweb.models.Categoria;
import com.diogoregis.imobiliariaweb.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;


public class Populos {


    @Autowired
    private static CategoriaRepository service;

    private static String[] nomes = {"Apartamento", "Casa", "Comercial"};



    public static void run(){
        popular();
    }


    private static Categoria criaCategoria(String nome){

        Categoria categoria = Categoria.builder().tipo(nome)
                .build();

        return categoria;
    }

    private static void popular(){

        for(int i = 0; i < nomes.length; i++){
            service.save(criaCategoria(nomes[i]));
        }

    }

}