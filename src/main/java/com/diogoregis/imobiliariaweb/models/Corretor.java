package com.diogoregis.imobiliariaweb.models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;


@Data
@Entity
@Table(name = "tb_corretor")
public class Corretor implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome = "Elias";
    private String creci = "2356-9";
    private String contato = "(81) 93214-5647";

    public Corretor() {

    }

    public Corretor(String nome) {
        this.nome = nome;

    }
}
