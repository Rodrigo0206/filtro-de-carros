package com.tinnova.filtro.de.carros;

import org.springframework.boot.SpringApplication;

public class TestFiltroDeCarrosApplication {

	public static void main(String[] args) {
		SpringApplication.from(FiltroDeCarrosApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
