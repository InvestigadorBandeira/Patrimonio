package br.edu.ifbaiano.patrimonio.entity;

import java.io.Serializable;

public class Sala implements Serializable {

    private String nome;
    private Localidade localidade;

    public Sala() {
    }

    public Sala(String nome, Localidade localidade) {
	this.nome = nome;
	this.localidade = localidade;
    }

    public String getNome() {
	return nome;
    }

    public void setNome(String nome) {
	this.nome = nome;
    }

    public Localidade getLocalidade() {
	return localidade;
    }

    public void setLocalidade(Localidade localidade) {
	this.localidade = localidade;
    }

}
