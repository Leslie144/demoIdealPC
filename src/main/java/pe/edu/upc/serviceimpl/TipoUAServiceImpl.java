package pe.edu.upc.serviceimpl;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.ITipoUADao;
import pe.edu.upc.entities.TipoUAEntities;
import pe.edu.upc.service.ITipoUAService;

@Named // #2
@RequestScoped // #4
public class TipoUAServiceImpl implements ITipoUAService {

	@Inject
	private ITipoUADao tuaDao;
	@Override
	// Methods #1
	public void insert(TipoUAEntities vc) {
		// TODO Auto-generated method stub
		tuaDao.insert(vc); // #5
	}
	@Override
	public List<TipoUAEntities> list() {
		// TODO Auto-generated method stub
		return tuaDao.list(); // #6
	}

	@Override
	public void delete(int id_tua) {
		// TODO Auto-generated method stub
		tuaDao.delete(id_tua);
	}

	@Override
	public void update(TipoUAEntities vc) {
		// TODO Auto-generated method stub
		tuaDao.update(vc);
	}

}
