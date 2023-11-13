package com.diogoregis.imobiliariaweb.models;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Data
@Entity
@Table(name = "tb_cidade")
public class Cidade implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;

    public Cidade(String nome) {
        this.nome = nome;
    }

    public Cidade() {

    }
}
