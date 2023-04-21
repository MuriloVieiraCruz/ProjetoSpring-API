package com.br.ProjetoSpring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.ProjetoSpring.Model.Poste;
import com.br.ProjetoSpring.repository.PosteRepository;

@RestController
@RequestMapping("/poscontroller")
@CrossOrigin(origins = "*")
public class PosteController {
	
	@Autowired
	private PosteRepository posteRepository;
	
	@PostMapping("/inserir")
	public Poste inserir(@RequestBody Poste poste ) {
		return posteRepository.save(poste);
	}
	
	@GetMapping("/todos")
	public List<Poste> buscarTodos() {
		return posteRepository.findAll();
	}
}
