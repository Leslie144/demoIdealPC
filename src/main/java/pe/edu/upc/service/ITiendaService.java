package pe.edu.upc.service;

import java.util.List;
import pe.edu.upc.entities.Tienda;

public interface ITiendaService {
	public void insert(Tienda t);
	public void eliminar(int idTienda);
	public List<Tienda>list();
	public void modificar(Tienda tienda);
	public List<Tienda> finByNameTienda(Tienda tienda);
}
