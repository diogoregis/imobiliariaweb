package com.diogoregis.imobiliariaweb.models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
@Entity
@Table(name = "tb_categoria")
public class Categoria implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String tipo;

    public Categoria(String tipo) {
        this.tipo = tipo;
    }

    public Categoria() {

    }
}
