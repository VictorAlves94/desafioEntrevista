package com.exercicioentrevista.exercicio2api.model;
import jakarta.persistence.*;

import java.util.Collections;
import java.util.List;

@Entity
@Table
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "endId")
    private Long endId;
    private String logadouro;
    private String cep;
    private String numero;

    private String cidade;


    public Endereco() {
    }

    public Long getEndId() {
        return endId;
    }

    public Pessoa getCodigo_pessoa() {
        return codigo_pessoa;
    }

    @ManyToOne
    @JoinColumn(name = "pessoa_id")
    public Pessoa codigo_pessoa;
    public Endereco(Long endId, String logadouro, String cep, String numero, String cidade) {
        this.endId = endId;
        this.logadouro = logadouro;
        this.cep = cep;
        this.numero = numero;
        this.cidade = cidade;
    }

    public String getLogadouro() {
        return logadouro;
    }

    public void setLogadouro(String logadouro) {
        this.logadouro = logadouro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }










}
