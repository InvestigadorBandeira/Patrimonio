package br.edu.ifbaiano.patrimonio.dao;

import br.edu.ifbaiano.patrimonio.dao.xml.db.Categorias;
import br.edu.ifbaiano.patrimonio.entity.Categoria;

public class CategoriaDAO extends AbstractDAO<Categoria> {

    public CategoriaDAO() {
	super(new Categorias(), "Categorias");
    }

    @Override
    protected void setDados() {
	dados = ((Categorias) dao.instance()).getCategorias();
    }
}
