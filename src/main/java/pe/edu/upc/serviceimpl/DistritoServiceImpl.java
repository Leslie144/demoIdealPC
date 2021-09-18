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

	// Methods #1
	public void insert(DistritoEntities vc) {
		// TODO Auto-generated method stub
		dDao.insert(vc); // #5
	}

	public List<DistritoEntities> list() {
		// TODO Auto-generated method stub
		return dDao.list(); // #6
	}

}
