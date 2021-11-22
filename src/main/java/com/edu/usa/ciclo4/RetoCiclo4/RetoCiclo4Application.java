package com.edu.usa.ciclo4.RetoCiclo4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages ={"com.edu.usa.Ciclo4.RetoCiclo4"})
public class RetoCiclo4Application {

	public static void main(String[] args) {
		SpringApplication.run(RetoCiclo4Application.class, args);
	}

}
