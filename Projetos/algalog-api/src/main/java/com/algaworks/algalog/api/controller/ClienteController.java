package com.algaworks.algalog.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.algalog.domain.model.Cliente;

@RestController
public class ClienteController {

	@GetMapping("/clientes")
	public List<Cliente> listar() {

		var cliente1 = new Cliente();
		var cliente2 = new Cliente();

		cliente1.setId(1L);
		cliente1.setNome("João");
		cliente1.setTelefone("34 99999-1111");
		cliente1.setEmail("joaodascouves@algaworks.com");

		cliente2.setId(2L);
		cliente2.setNome("Maria");
		cliente2.setTelefone("11 1111-9999");
		cliente2.setEmail("mariadasilva@algaworks.com");

		return Arrays.asList(cliente1,cliente2);
		// "Parabéns! \nVocê chegou na classe identificada como '@RestController',
		// responsável por responder a esta requisição GET ";
	}
}
