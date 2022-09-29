package com.kodnest.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@EnableWebMvc
public class PringbootPostgresqlHibernateCrudExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(PringbootPostgresqlHibernateCrudExampleApplication.class, args);
	}

}
