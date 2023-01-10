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

    public PessoaResource(PessoaRepository pessoaRepository) {
        this.pessoaRepository = pessoaRepository;
    }

    @GetMapping
    public List<Pessoa> listar(){
        return pessoaRepository.findAll();
    }
    @PostMapping
    public Pessoa criar(@RequestBody Pessoa pessoa) {

        return pessoaRepository.save(pessoa);
    }
    @PutMapping
    public Pessoa atualizar(@RequestBody Pessoa pessoa) {
        if (pessoa.getId() > 0) {
            return pessoaRepository.save(pessoa);
        }
        return pessoa;
    }
    @DeleteMapping
    public void deletar(@RequestBody Pessoa pessoa){
        pessoaRepository.delete(pessoa);

    }

    }

