package com.diogoregis.imobiliariaweb.models;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.time.Instant;

@Data
@Entity
@Table(name = "tb_imovel")
public class Imovel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Instant moment;
    private String foto;
    private String descricao;
    private Integer quartos;
    private Integer suites;
    private Integer banheiros;
    private Integer vagas;
    private Integer salas;
    private Integer areaMetros;
    private Double precoImovel;

    @ManyToOne
    @JoinColumn(name = "cateforia_id")
    private Categoria tipo;
    @ManyToOne
    @JoinColumn(name = "cidade_id")
    private Cidade cidade;
    @ManyToOne
    @JoinColumn(name = "corretor_id")
    private Corretor corretor;

    private Boolean imovelAtivo = true;
    private Boolean imovelVendido = false;


    public Imovel(String foto, String descricao, Integer quartos, Integer suites, Integer banheiros, Integer vagas, Integer salas, Integer areaMetros, Double precoImovel, Categoria tipo, Cidade cidade, Corretor corretor) {
        this.foto = foto;
        this.moment = Instant.now();
        this.descricao = descricao;
        this.quartos = quartos;
        this.suites = suites;
        this.banheiros = banheiros;
        this.vagas = vagas;
        this.salas = salas;
        this.areaMetros = areaMetros;
        this.precoImovel = precoImovel;
        this.tipo = tipo;
        this.cidade = cidade;
        this.corretor = corretor;
    }

    public Imovel() {
    }
}
