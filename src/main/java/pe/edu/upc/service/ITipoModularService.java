package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entities.TipoModularEntities;

public interface ITipoModularService {

	public void insert (TipoModularEntities vc);
	public List<TipoModularEntities> list();
	public void eliminar(int id_tipomodular);
	public void modificar(TipoModularEntities vc);
}
