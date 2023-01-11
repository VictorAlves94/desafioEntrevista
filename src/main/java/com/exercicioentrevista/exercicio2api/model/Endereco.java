package com.exercicioentrevista.exercicio2api.model;

import jakarta.persistence.Embeddable;

@Embeddable
public class Endereco {
    private String logadouro;
    private String cep;
    private String numero;
    private String cidade;


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
