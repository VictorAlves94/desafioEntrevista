package com.exercicioentrevista.exercicio2api.model;


import jakarta.persistence.*;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "pessoa")
public class Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @OneToMany
    @JoinColumn(name = "endereco_id")

    private List<Endereco> endereco;

    private int dataNascimento;

    private String nome;

    public Pessoa() {
    }

    public Pessoa(Long id, List<Endereco> endereco) {
        this.id = id;
        this.endereco = endereco;
    }


    public List<Endereco> getEndereco() {
        return endereco;
    }

    public void setEndereco(@NotNull List<Endereco> endereco) {
        this.endereco = endereco;
    }

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



    public Long getId() {
        return id;
    }


}
