package com.exercicioentrevista.exercicio2api.model;
import jakarta.persistence.*;


@Entity
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "endereco_id")
    private Long endereco_id;


    private String logadouro;
    private String cep;
    private String numero;

    private String cidade;
    @ManyToOne
    @JoinColumn(name = "pessoa_id")
    private Pessoa pessoa_id;

    public Endereco() {
    }

    public Endereco(Pessoa pessoa_id) {
        this.pessoa_id = pessoa_id;
    }


    public Long getendereco_id() {
        return endereco_id;
    }



    public Pessoa getpessoa_id() {
        return pessoa_id;
    }


    public Long getEndereco_id() {
        return endereco_id;
    }

    public Pessoa getPessoa_id() {
        return pessoa_id;
    }

    public Endereco(Long endereco_id, String logadouro, String cep, String numero, String cidade, Pessoa pessoa_id) {
        this.endereco_id = endereco_id;
        this.logadouro = logadouro;
        this.cep = cep;
        this.numero = numero;
        this.cidade = cidade;
        this.pessoa_id = pessoa_id;
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
