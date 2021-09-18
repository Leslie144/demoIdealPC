package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entities.TipoRecomendacionEntities;

public interface ITipoRecomendacionDao {
	public void insert(TipoRecomendacionEntities vc);

	public List<TipoRecomendacionEntities> list();
}
