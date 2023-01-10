package com.exercicioentrevista.exercicio2api.resource;

import com.exercicioentrevista.exercicio2api.model.Pessoa;
import com.exercicioentrevista.exercicio2api.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pessoas")
public class PessoaResource {
    @Autowired
    private PessoaRepository pessoaRepository;

    @GetMapping
    public List<Pessoa> listar(){
        return pessoaRepository.findAll();
    }
//    @PostMapping
//    public void cadastrarPessoa(RequestBody) {
//
//        pessoaRepository.save(Entity);
//
//    }

    }
