package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entities.DistritoEntities;

public interface IDistritoDao {
	public void insert(DistritoEntities vc);
	
	public void delete(int idDistrito);

	public List<DistritoEntities> list();
	
	public void update(DistritoEntities distrito);
}
