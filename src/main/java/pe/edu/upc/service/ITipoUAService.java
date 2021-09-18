package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entities.TipoUAEntities;

public interface ITipoUAService {
public void insert(TipoUAEntities vc);
	
	public List<TipoUAEntities> list();
}
