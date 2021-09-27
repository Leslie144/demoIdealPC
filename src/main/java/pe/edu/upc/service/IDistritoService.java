package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entities.DistritoEntities;

public interface IDistritoService {
	public void insert(DistritoEntities vc);
	
	public void delete(int idDistrito);

	public List<DistritoEntities> list();
	
	public void update(DistritoEntities distrito);
}
