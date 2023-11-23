package com.diogoregis.imobiliariaweb.dto;

import com.diogoregis.imobiliariaweb.models.Categoria;
import com.diogoregis.imobiliariaweb.models.Cidade;
import com.diogoregis.imobiliariaweb.models.Corretor;
import lombok.Data;

import java.time.Instant;

@Data
public class ImovelForm {

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
    private Categoria tipo;
    private Cidade cidade;
    private Corretor corretor;
    private Boolean imovelAtivo = true;
    private Boolean imovelVendido = false;
}
