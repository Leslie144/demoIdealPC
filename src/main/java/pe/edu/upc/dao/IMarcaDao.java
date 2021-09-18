package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entities.MarcaEntities;

public interface IMarcaDao {
	public void insert(MarcaEntities vc);

	public List<MarcaEntities> list();
}
