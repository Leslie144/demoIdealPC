package pe.edu.upc.serviceimpl;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.ITamanoMBDao;
import pe.edu.upc.entities.TamanoMBEntities;
import pe.edu.upc.service.ITamanoMBService;

@Named // #2
@RequestScoped // #4
public class TamanoMBServiceImpl implements ITamanoMBService {

	@Inject // #3
	private ITamanoMBDao tmbDao;

	// Methods #1
	public void insert(TamanoMBEntities vc) {
		// TODO Auto-generated method stub
		tmbDao.insert(vc); // #5
	}

	public List<TamanoMBEntities> list() {
		// TODO Auto-generated method stub
		return tmbDao.list(); // #6
	}
}