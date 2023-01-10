package com.exercicioentrevista.exercicio2api.repository;

import com.exercicioentrevista.exercicio2api.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
}
