package com.nelioalves.cursomc.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController // controlador Rest
@RequestMapping(value="/categorias") // repospode por esse endpoint

public class CategoriaResource {

	@RequestMapping(method = RequestMethod.GET) // Get requisição basica
	public String listar() {
		return "REST está funcionando";
	}

}
