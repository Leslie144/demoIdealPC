package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entities.TipoUAEntities;

public interface ITipoUAService {
	public void insert(TipoUAEntities vc);

	public void delete(int id_tua);
	
	public List<TipoUAEntities> list();
}
