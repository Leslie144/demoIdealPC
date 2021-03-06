package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entities.TipoRecomendacionEntities;

public interface ITipoRecomendacionDao {
	public void insert(TipoRecomendacionEntities vc);

	public void delete(int id_recomendacion);

	public List<TipoRecomendacionEntities> list();

	public void update(TipoRecomendacionEntities vc);
	
	public List<TipoRecomendacionEntities> finByNameTipoRecomendacion(TipoRecomendacionEntities tr);
}
