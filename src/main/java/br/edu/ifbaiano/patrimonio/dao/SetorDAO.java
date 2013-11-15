package br.edu.ifbaiano.patrimonio.dao;

import br.edu.ifbaiano.patrimonio.dao.xml.db.Setores;
import br.edu.ifbaiano.patrimonio.entity.Setor;

public class SetorDAO extends AbstractDAO<Setor> {

    public SetorDAO() {
	super(new Setores(), "Setores");
    }

    @Override
    protected void setDados() {
	dados = ((Setores) dao.instance()).getSetores();
    }
}
