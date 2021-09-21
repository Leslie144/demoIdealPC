package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entities.TipoUAEntities;

public interface ITipoUADao {
	public void insert(TipoUAEntities vc);

	public void delete(int id_tua);

	public List<TipoUAEntities> list();
}
