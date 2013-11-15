package br.edu.ifbaiano.patrimonio.util;

import java.util.Collections;
import java.util.Comparator;

import br.edu.ifbaiano.patrimonio.entity.Sala;

public enum OrdenarSalas implements Comparator<Sala> {

    PorNome {
	@Override
	public int compare(Sala sala1, Sala sala2) {
	    return sala1.getNome().compareTo(sala2.getNome());
	}
    },

    PorLocalidade {
	@Override
	public int compare(Sala sala1, Sala sala2) {
	    return sala1.getLocalidade().compareTo(sala2.getLocalidade());
	}
    };

    public Comparator<Sala> asc() {
	return this;
    }

    public Comparator<Sala> desc() {
	return Collections.reverseOrder(this);
    }
}
