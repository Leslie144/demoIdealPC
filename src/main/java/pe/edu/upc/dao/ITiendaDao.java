package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entities.Tienda;

public interface ITiendaDao {
	public void insert(Tienda t);
	
	public List<Tienda> list();
}
