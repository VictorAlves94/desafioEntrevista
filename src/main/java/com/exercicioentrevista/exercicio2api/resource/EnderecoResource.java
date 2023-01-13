package com.exercicioentrevista.exercicio2api.resource;

import com.exercicioentrevista.exercicio2api.model.Endereco;
import com.exercicioentrevista.exercicio2api.model.Pessoa;
import com.exercicioentrevista.exercicio2api.repository.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/endereco")
public class EnderecoResource {

        @Autowired
        private EnderecoRepository enderecoRepository;

        public EnderecoResource (EnderecoRepository enderecoRepository) {
            this.enderecoRepository = enderecoRepository;
        }


        @GetMapping
        public List<Endereco> listar() {
            return enderecoRepository.findAll();
        }

        @PostMapping
        public Endereco criar(@RequestBody Endereco endereco) {

            Pessoa pessoa_id = null;
            return enderecoRepository.save(new Endereco(pessoa_id));
        }

        @PutMapping
        public Endereco atualizar(@RequestBody Endereco endereco) {
            if (endereco.getendereco_id() > 0) {
                return enderecoRepository.save(endereco);
            }
            return endereco;
        }

        @DeleteMapping
        public void deletar(@RequestBody Endereco endereco) {
            enderecoRepository.delete(endereco);

        }
        @GetMapping("/{endereco}")
        public Endereco buscarPeloCodigo(@PathVariable Long endId) {
            return null;

        }
    }


