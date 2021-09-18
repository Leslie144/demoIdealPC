package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entities.TipoUAEntities;

public interface ITipoUADao {
	public void insert(TipoUAEntities vc);
	
	public List<TipoUAEntities> list();
}
