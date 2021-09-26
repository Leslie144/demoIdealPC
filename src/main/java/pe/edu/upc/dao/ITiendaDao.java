package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entities.Tienda;

public interface ITiendaDao {
	public void insert(Tienda t);
	public void eliminar(int idTienda);
	public void modificar (Tienda tienda);
	public List<Tienda> list();
	public List<Tienda>finByNameTienda(Tienda td);
}
