package pe.edu.upc.serviceimpl;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IDistritoDao;
import pe.edu.upc.entities.DistritoEntities;
import pe.edu.upc.service.IDistritoService;

@Named // #2
@RequestScoped // #4
public class DistritoServiceImpl implements IDistritoService {

	@Inject // #3
	private IDistritoDao dDao;
	
	@Override
	public void insert(DistritoEntities vc) {
		// TODO Auto-generated method stub
		dDao.insert(vc); // #5
	}
	@Override
	public void eliminar(int idMedicCenter) {
		dDao.eliminar(idMedicCenter);
	}
	@Override
	public void modificar(DistritoEntities ds) {
		dDao.modificar(ds);
	}
	@Override
	public List<DistritoEntities> list() {
		// TODO Auto-generated method stub
		return dDao.list(); // #6
	}
	@Override
	public List<DistritoEntities> finByNameDistrito(DistritoEntities de) {
		return dDao.finByNameDistrito(de);
	}

}
