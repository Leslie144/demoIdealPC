package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entities.MarcaEntities;

public interface IMarcaDao {
	public void insert(MarcaEntities vc);
	
	public void delete(int idMarca);

	public List<MarcaEntities> list();
	
	public void update(MarcaEntities marca);
}
