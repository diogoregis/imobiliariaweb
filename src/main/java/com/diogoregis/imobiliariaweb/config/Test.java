package com.diogoregis.imobiliariaweb.config;

import com.diogoregis.imobiliariaweb.models.*;
import com.diogoregis.imobiliariaweb.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.core.io.ResourceLoader;

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

    @Autowired
    private ImovelRepository imovelRepository;

/*    @Bean
    public CommandLineRunner resourceLocator(ResourceLoader resourceLoader) {
        return args -> {
            System.out.println("Resource locations:");
            resourceLoader.getResource("classpath:/").getFile().getAbsolutePath();
        };
    }*/

    public void run(String... args) throws Exception {

        Categoria c1 = new Categoria("Casa");
        Categoria c2 = new Categoria("Apartamento");
        Categoria c3 = new Categoria("Comercial");

        categoriaRepository.saveAll(Arrays.asList(c1,c2,c3));

        Comprador com1 = new Comprador("Fulano de Tal", "(81) 99521-4050", "08483500427");
        Comprador com2 = new Comprador("Anderson Fagundes", "(81) 99999-4050", "08883527421");
        Comprador com3 = new Comprador("Carlos Brow", "(81) 99521-9999", "08783527421");
        Comprador com4 = new Comprador("José Sicrano", "(81) 99991-4050", "38883527421");

        compradorRepository.saveAll(Arrays.asList(com1,com2, com3, com4));

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

        Imovel imovel1 = new Imovel("Foto ...", "Apartemento de frente ao mar",
                3,
                1,
                2,
                1,
                1,
                68,
                350000.00,
                c1,cid1,cor1);

        imovelRepository.save(imovel1);



    }

}
