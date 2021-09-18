package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entities.TipoUsuarioEntities;

public interface ITipoUsuarioDao {
	public void insert(TipoUsuarioEntities vc);

	public List<TipoUsuarioEntities> list();
}