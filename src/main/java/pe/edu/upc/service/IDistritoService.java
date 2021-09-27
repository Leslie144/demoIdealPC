package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entities.DistritoEntities;

public interface IDistritoService {
	public void insert(DistritoEntities vc);

	public void eliminar(int idDistrito);
	public void modificar(DistritoEntities dis);
	public List<DistritoEntities> list();
	public List<DistritoEntities> finByNameDistrito(DistritoEntities ds);
}
