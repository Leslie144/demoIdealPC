package pe.edu.upc.serviceimpl;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IMarcaDao;
import pe.edu.upc.entities.MarcaEntities;
import pe.edu.upc.service.IMarcaService;

@Named // #2
@RequestScoped // #4
public class MarcaServiceImpl implements IMarcaService {

	@Inject // #3
	private IMarcaDao mDao;

	// Methods #1
	public void insert(MarcaEntities marca) {
		// TODO Auto-generated method stub
		mDao.insert(marca); // #5
	}
	
	public void delete(int idMarca) {
		mDao.delete(idMarca);
	}

	public List<MarcaEntities> list() {
		// TODO Auto-generated method stub
		return mDao.list(); // #6
	}
	
	public void update(MarcaEntities marca) {
		mDao.update(marca);
	}
}

