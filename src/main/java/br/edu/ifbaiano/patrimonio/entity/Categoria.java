package br.edu.ifbaiano.patrimonio.entity;

import java.io.Serializable;

public class Categoria implements Serializable {

    private String nome;
    private Grupo grupo;

    public Categoria() {
    }

    public Categoria(String nome, Grupo grupo) {
	this.nome = nome;
	this.grupo = grupo;
    }

    public String getNome() {
	return nome;
    }

    public void setNome(String nome) {
	this.nome = nome;
    }

    public Grupo getGrupo() {
	return grupo;
    }

    public void setGrupo(Grupo grupo) {
	this.grupo = grupo;
    }

}
