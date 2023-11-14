package com.diogoregis.imobiliariaweb;

import com.diogoregis.imobiliariaweb.util.Populos;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ImobiliariawebApplication {

	public static void main(String[] args) {
		SpringApplication.run(ImobiliariawebApplication.class, args);
		Populos.run();
	}

}
