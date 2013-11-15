package br.edu.ifbaiano.patrimonio.util;

import java.util.Collections;
import java.util.Comparator;

import br.edu.ifbaiano.patrimonio.entity.Categoria;

public enum OrdenarCategorias implements Comparator<Categoria> {

    PorNome {
	@Override
	public int compare(Categoria categoria1, Categoria categoria2) {
	    return categoria1.getNome().compareTo(categoria2.getNome());
	}
    },

    PorGrupo {
	@Override
	public int compare(Categoria categoria1, Categoria categoria2) {
	    return categoria1.getGrupo().compareTo(categoria2.getGrupo());
	}
    };

    public Comparator<Categoria> asc() {
	return this;
    }

    public Comparator<Categoria> desc() {
	return Collections.reverseOrder(this);
    }

}
