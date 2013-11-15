package br.edu.ifbaiano.patrimonio.entity;

import java.io.Serializable;
import java.math.BigDecimal;

public class Bem implements Serializable {

    private String contaContabil;
    private String tomboSiga;
    private String tomboAntigo;
    private Categoria categoria;
    private String descricao;
    private BigDecimal valor = BigDecimal.ZERO;
    private Setor setor;
    private Sala sala;
    private String situacao;
    private String estadoConservacao;

    public String getContaContabil() {
	return contaContabil;
    }

    public void setContaContabil(String contaContabil) {
	this.contaContabil = contaContabil;
    }

    public String getTomboSiga() {
	return tomboSiga;
    }

    public void setTomboSiga(String tomboSiga) {
	this.tomboSiga = tomboSiga;
    }

    public String getTomboAntigo() {
	return tomboAntigo;
    }

    public void setTomboAntigo(String tomboAntigo) {
	this.tomboAntigo = tomboAntigo;
    }

    public Categoria getCategoria() {
	return categoria;
    }

    public void setCategoria(Categoria categoria) {
	this.categoria = categoria;
    }

    public String getDescricao() {
	return descricao;
    }

    public void setDescricao(String descricao) {
	this.descricao = descricao;
    }

    public BigDecimal getValor() {
	return valor;
    }

    public void setValor(BigDecimal valor) {
	this.valor = valor;
    }

    public Setor getSetor() {
	return setor;
    }

    public void setSetor(Setor setor) {
	this.setor = setor;
    }

    public Sala getSala() {
	return sala;
    }

    public void setSala(Sala sala) {
	this.sala = sala;
    }

    public String getSituacao() {
	return situacao;
    }

    public void setSituacao(String situacao) {
	this.situacao = situacao;
    }

    public String getEstadoConservacao() {
	return estadoConservacao;
    }

    public void setEstadoConservacao(String estadoConservacao) {
	this.estadoConservacao = estadoConservacao;
    }

}
