package pe.edu.upc.serviceimpl;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.ITiendaDao;
import pe.edu.upc.entities.Tienda;
import pe.edu.upc.service.ITiendaService;

@Named
@RequestScoped
public class TiendaServiceImpl implements ITiendaService{
	@Inject
	private ITiendaDao tDao;
	
	@Override
	public void insert(Tienda t) {
		tDao.insert(t);
	}
	
	@Override
	public void eliminar(int idTienda) {
		tDao.eliminar(idTienda);
	}
	
	@Override
	public List<Tienda>list(){
		return tDao.list();
	}
	
	@Override
	public void modificar(Tienda tienda) {
		tDao.modificar(tienda);
	}
	

}
