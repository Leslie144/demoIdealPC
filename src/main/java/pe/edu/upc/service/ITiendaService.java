package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entities.Tienda;

public interface ITiendaService {
	public void insert(Tienda t);
	public List<Tienda>list();
}
