package com.br.javaBackEnd02.BackEnd02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@SpringBootApplication
public class BackEnd02Application {

	public static void main(String[] args) {
		SpringApplication.run(BackEnd02Application.class, args);
	}


}
