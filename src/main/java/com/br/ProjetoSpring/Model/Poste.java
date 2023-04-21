package com.br.ProjetoSpring.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table (name="poste")

public class Poste {
	
	@Id
	@GeneratedValue(generator = "seq_poste")
	@SequenceGenerator(name = "seq_poste", sequenceName ="seq_poste")
	private Integer Id;
	private String titulo;
	private String conteudo;
	
	public Poste() {
		
	}
	
	public Poste(Integer id, String titulo, String conteudo) {
		this.Id = id;
		this.titulo = titulo;
		this.conteudo = conteudo;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}
}
