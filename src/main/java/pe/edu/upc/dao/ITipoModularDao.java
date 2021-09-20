package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entities.TipoModularEntities;

public interface ITipoModularDao {

	public void insert(TipoModularEntities vc);
	public List<TipoModularEntities> list();
}
