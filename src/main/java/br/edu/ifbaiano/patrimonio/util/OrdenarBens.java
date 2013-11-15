package br.edu.ifbaiano.patrimonio.util;

import java.util.Collections;
import java.util.Comparator;

import br.edu.ifbaiano.patrimonio.entity.Bem;

public enum OrdenarBens implements Comparator<Bem> {

    PorContaContabil {
	@Override
	public int compare(Bem bem1, Bem bem2) {
	    return bem1.getContaContabil().compareTo(bem2.getContaContabil());
	}
    },

    PorTomboSiga {
	@Override
	public int compare(Bem bem1, Bem bem2) {
	    return bem1.getTomboSiga().compareTo(bem2.getTomboSiga());
	}
    },

    PorTomboAntigo {
	@Override
	public int compare(Bem bem1, Bem bem2) {
	    return bem1.getTomboAntigo().compareTo(bem2.getTomboAntigo());
	}
    },

    PorCategoria {
	@Override
	public int compare(Bem bem1, Bem bem2) {
	    return bem1.getCategoria().getNome()
		    .compareTo(bem2.getCategoria().getNome());
	}
    },

    PorSetor {
	@Override
	public int compare(Bem bem1, Bem bem2) {
	    return bem1.getSetor().getNome()
		    .compareTo(bem2.getSetor().getNome());
	}
    },

    PorSala {
	@Override
	public int compare(Bem bem1, Bem bem2) {
	    return bem1.getSala().getNome().compareTo(bem2.getSala().getNome());
	}
    };

    public Comparator<Bem> asc() {
	return this;
    }

    public Comparator<Bem> desc() {
	return Collections.reverseOrder(this);
    }
}
