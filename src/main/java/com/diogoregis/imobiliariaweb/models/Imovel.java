package com.diogoregis.imobiliariaweb.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.Instant;

@Data
@Builder
@AllArgsConstructor
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


    public Imovel() {
        this.moment = Instant.now();

    }
}
