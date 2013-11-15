package br.edu.ifbaiano.patrimonio.entity;

import java.io.Serializable;

public class Setor implements Serializable {

    private String sigla;
    private String nome;
    private String siga;

    public String getSigla() {
	return sigla;
    }

    public void setSigla(String sigla) {
	this.sigla = sigla;
    }

    public String getNome() {
	return nome;
    }

    public void setNome(String nome) {
	this.nome = nome;
    }

    public String getSiga() {
	return siga;
    }

    public void setSiga(String siga) {
	this.siga = siga;
    }

}
