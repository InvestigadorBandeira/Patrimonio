package br.edu.ifbaiano.patrimonio.dao;

import br.edu.ifbaiano.patrimonio.dao.xml.db.Salas;
import br.edu.ifbaiano.patrimonio.entity.Sala;

public class SalaDAO extends AbstractDAO<Sala> {

    public SalaDAO() {
	super(new Salas(), "Salas");
    }

    @Override
    protected void setDados() {
	dados = ((Salas) dao.instance()).getSalas();
    }

}
