package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entities.MarcaEntities;

public interface IMarcaService {
	public void save(MarcaEntities vc);
	
	public void delete(int idMarca);

	public List<MarcaEntities> list();
}
