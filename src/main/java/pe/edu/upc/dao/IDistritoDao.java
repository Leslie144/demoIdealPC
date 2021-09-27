package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entities.DistritoEntities;

public interface IDistritoDao {
	public void insert(DistritoEntities vc);
	public void eliminar(int idDistrito);
	public void modificar(DistritoEntities distrito);
	
	public List<DistritoEntities> finByNameDistrito(DistritoEntities ds);

	public List<DistritoEntities> list();
	
	public void update(DistritoEntities distrito);
}
