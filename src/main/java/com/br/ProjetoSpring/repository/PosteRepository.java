package com.br.ProjetoSpring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.br.ProjetoSpring.Model.Poste;


@Repository
public interface PosteRepository extends JpaRepository<Poste, Integer>{

}
