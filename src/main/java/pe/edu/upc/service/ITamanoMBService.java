package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entities.TamanoMBEntities;

public interface ITamanoMBService {
	public void insert(TamanoMBEntities vc);

	public List<TamanoMBEntities> list();

	public void delete(int idTamanoMB);

	public void update(TamanoMBEntities tamanomb);
}
