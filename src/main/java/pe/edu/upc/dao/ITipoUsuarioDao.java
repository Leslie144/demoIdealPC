package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entities.TipoUsuarioEntities;

public interface ITipoUsuarioDao {
	public void insert(TipoUsuarioEntities vc);
	public List<TipoUsuarioEntities> list();
	public void eliminar (int cid_tipo_usuario);
	public void modificar(TipoUsuarioEntities vc);
}