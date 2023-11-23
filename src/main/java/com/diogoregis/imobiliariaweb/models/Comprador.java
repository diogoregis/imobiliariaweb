package com.diogoregis.imobiliariaweb.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Entity
@Table(name = "tb_comprador")
public class Comprador implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String contato;
    private String cpf;

    public Comprador() {

    }

    public Comprador(String nome, String contato, String cpf) {
        this.id = null;
        this.nome = nome;
        this.contato = contato;
        this.cpf = cpf;

    }

}
