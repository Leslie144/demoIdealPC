package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entities.MarcaEntities;

public interface IMarcaService {
	public void insert(MarcaEntities vc);

	public List<MarcaEntities> list();
}
