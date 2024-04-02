package com.generation.hello.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/helloworld")
public class HelloWorldController {

	@GetMapping() //Requisições do tipo GET/Busca
	public String hello() {

		return "Hello World <br> Trabalho Em Equipe <br> Proatividade <br> Responsabilidade Pessoal <br> Orientação ao Detalhe <br> Turma 73";
	}
	
}
