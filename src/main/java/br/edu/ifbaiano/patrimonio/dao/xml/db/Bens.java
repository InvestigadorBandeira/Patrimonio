package br.edu.ifbaiano.patrimonio.dao.xml.db;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.edu.ifbaiano.patrimonio.entity.Bem;
import br.edu.ifbaiano.patrimonio.util.OrdenarBens;

public class Bens {

    private List<Bem> bens = new ArrayList<Bem>();

    public List<Bem> getBens() {
	Collections.sort(bens, OrdenarBens.PorSetor);
	return bens;
    }

    public void setBens(List<Bem> bens) {
	this.bens = bens;
    }

}
