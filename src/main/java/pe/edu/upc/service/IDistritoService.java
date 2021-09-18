package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entities.DistritoEntities;

public interface IDistritoService {
	public void insert(DistritoEntities vc);

	public List<DistritoEntities> list();
}
