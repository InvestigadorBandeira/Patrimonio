package br.edu.ifbaiano.patrimonio.dao;

import br.edu.ifbaiano.patrimonio.dao.xml.db.Bens;
import br.edu.ifbaiano.patrimonio.entity.Bem;

public class BemDAO extends AbstractDAO<Bem> {

    public BemDAO() {
	super(new Bens(), "Bens");
    }

    @Override
    protected void setDados() {
	dados = ((Bens) dao.instance()).getBens();
    }

}
