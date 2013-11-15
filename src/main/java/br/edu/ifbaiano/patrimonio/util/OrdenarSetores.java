package br.edu.ifbaiano.patrimonio.util;

import java.util.Collections;
import java.util.Comparator;

import br.edu.ifbaiano.patrimonio.entity.Setor;

public enum OrdenarSetores implements Comparator<Setor> {

    PorSigla {
	@Override
	public int compare(Setor setor1, Setor setor2) {
	    return setor1.getSigla().compareTo(setor2.getSigla());
	}
    },

    PorNome {
	@Override
	public int compare(Setor setor1, Setor setor2) {
	    return setor1.getNome().compareTo(setor2.getNome());
	}
    },

    PorSiga {
	@Override
	public int compare(Setor setor1, Setor setor2) {
	    return setor1.getSiga().compareTo(setor2.getSiga());
	}
    };

    public Comparator<Setor> asc() {
	return this;
    }

    public Comparator<Setor> desc() {
	return Collections.reverseOrder(this);
    }

}
