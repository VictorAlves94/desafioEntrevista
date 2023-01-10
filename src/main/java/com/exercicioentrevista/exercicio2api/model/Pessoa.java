package com.exercicioentrevista.exercicio2api.model;


import jakarta.persistence.*;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;

@Entity
@Table(name = "pessoa")
public class Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pessoa)) return false;
        Pessoa pessoa = (Pessoa) o;
        return getId().equals(pessoa.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @NotNull
    private String nome;


    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDataNascimento(int dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public int getDataNascimento() {
        return dataNascimento;
    }
    @NotNull
    private Endereco endereco;
    @NotNull
    private int dataNascimento;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }


}
