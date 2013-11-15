package br.edu.ifbaiano.patrimonio.dao.xml.db;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.edu.ifbaiano.patrimonio.entity.Categoria;
import br.edu.ifbaiano.patrimonio.util.OrdenarCategorias;

public class Categorias {

    private List<Categoria> categorias = new ArrayList<Categoria>();

    public List<Categoria> getCategorias() {
	Collections.sort(categorias, OrdenarCategorias.PorNome);
	return categorias;
    }

    public void setCategorias(List<Categoria> categorias) {
	this.categorias = categorias;
    }

}
