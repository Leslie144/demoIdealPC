package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entities.DistritoEntities;

public interface IDistritoService {
	public void save(DistritoEntities vc);
	
	public void delete(int idDistrito);

	public List<DistritoEntities> list();
}
