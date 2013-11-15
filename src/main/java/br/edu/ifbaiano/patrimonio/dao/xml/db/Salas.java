package br.edu.ifbaiano.patrimonio.dao.xml.db;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.edu.ifbaiano.patrimonio.entity.Sala;
import br.edu.ifbaiano.patrimonio.util.OrdenarSalas;

public class Salas {

    private List<Sala> salas = new ArrayList<Sala>();

    public List<Sala> getSalas() {
	Collections.sort(salas, OrdenarSalas.PorNome);
	return salas;
    }

    public void setSalas(List<Sala> salas) {
	this.salas = salas;
    }

}
