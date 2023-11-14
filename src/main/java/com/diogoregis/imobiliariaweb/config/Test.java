package com.diogoregis.imobiliariaweb.config;

import com.diogoregis.imobiliariaweb.models.Categoria;
import com.diogoregis.imobiliariaweb.models.Cidade;
import com.diogoregis.imobiliariaweb.models.Comprador;
import com.diogoregis.imobiliariaweb.models.Corretor;
import com.diogoregis.imobiliariaweb.repositories.CategoriaRepository;
import com.diogoregis.imobiliariaweb.repositories.CidadeRepository;
import com.diogoregis.imobiliariaweb.repositories.CompradorRepository;
import com.diogoregis.imobiliariaweb.repositories.CorretorRepository;
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

    @Autowired
    private CompradorRepository compradorRepository;

    @Autowired
    private CorretorRepository corretorRepository;

    @Autowired
    private CidadeRepository cidadeRepository;


    public void run(String... args) throws Exception {

        Categoria c1 = new Categoria("Casa");
        Categoria c2 = new Categoria("Apartamento");
        Categoria c3 = new Categoria("Comercial");

        categoriaRepository.saveAll(Arrays.asList(c1,c2,c3));

        Comprador com1 = new Comprador(null,"Fulano de Tal", "(81) 99521-4050", "08483500427");
        Comprador com2 = new Comprador(null,"Anderson Fagundes", "(81) 99999-4050", "08883527421");
        Comprador com3 = new Comprador(null,"Carlos Brow", "(81) 99521-9999", "08783527421");
        Comprador com4 = new Comprador(null,"José Sicrano", "(81) 99991-4050", "38883527421");

        compradorRepository.saveAll(Arrays.asList(com1,com2, com3, com4));

/*        Corretor cor1 = Corretor.builder().nome("Acreano Souza").build();
        Corretor cor2 = Corretor.builder().nome("Eduardo Silva").build();
        Corretor cor3 = Corretor.builder().nome("Matheus Canastra").build();
        Corretor cor4 = Corretor.builder().build();*/

        Corretor cor1 = new Corretor("Acreano Souza");
        Corretor cor2 = new Corretor("Eduardo Silva");
        Corretor cor3 = new Corretor();
        Corretor cor4 = new Corretor("Matheus Canastra");

        corretorRepository.saveAll(Arrays.asList(cor1, cor2, cor3, cor4));

        Cidade cid1 = Cidade.builder().nome("Salvador").build();
        Cidade cid2 = Cidade.builder().nome("Maceio").build();
        Cidade cid3 = Cidade.builder().nome("João Pessoa").build();
        Cidade cid4 = Cidade.builder().nome("Recife").build();

        cidadeRepository.saveAll(Arrays.asList(cid1, cid2, cid3, cid4));

    }

}
