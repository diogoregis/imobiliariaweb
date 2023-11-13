package com.diogoregis.imobiliariaweb.models;


import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;


@Data
@Builder
@Entity
@Table(name = "tb_corretor")
public class Corretor implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String creci;
    private String contato;

    public Corretor() {

    }
}
