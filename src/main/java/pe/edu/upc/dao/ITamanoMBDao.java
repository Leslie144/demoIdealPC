package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entities.TamanoMBEntities;

public interface ITamanoMBDao {
	public void insert(TamanoMBEntities vc);
	
	public List<TamanoMBEntities> list();
}
