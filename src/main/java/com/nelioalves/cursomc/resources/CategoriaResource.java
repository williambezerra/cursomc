package com.nelioalves.cursomc.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nelioalves.cursomc.domain.Categoria;

@RestController // controlador Rest
@RequestMapping(value="/categorias") // repospode por esse endpoint

public class CategoriaResource {

	@RequestMapping(method = RequestMethod.GET) // Get requisição basica
	//Lista
	public List<Categoria> listar() {
		
		//fazendo o teste de class categoria do domain
		Categoria cat1 = new Categoria(1, "Informática");
		Categoria cat2 = new Categoria(2, "Escritório");
		
		List<Categoria> lista = new ArrayList<>();
		lista.add(cat1);
		lista.add(cat2);
		

		return lista;
	}

}
