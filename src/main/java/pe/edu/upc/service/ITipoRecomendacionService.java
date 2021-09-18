package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entities.TipoRecomendacionEntities;

public interface ITipoRecomendacionService {
	public void insert(TipoRecomendacionEntities vc);

	public List<TipoRecomendacionEntities> list();
}