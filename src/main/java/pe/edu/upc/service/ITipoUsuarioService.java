package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entities.TipoUsuarioEntities;

public interface ITipoUsuarioService {
	public void insert(TipoUsuarioEntities vc);

	public List<TipoUsuarioEntities> list();
}
