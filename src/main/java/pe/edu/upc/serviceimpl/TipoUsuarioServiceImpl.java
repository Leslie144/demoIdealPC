package pe.edu.upc.serviceimpl;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.ITipoUsuarioDao;
import pe.edu.upc.entities.TipoUsuarioEntities;
import pe.edu.upc.service.ITipoUsuarioService;

@Named // #2
@RequestScoped // #4
public class TipoUsuarioServiceImpl implements ITipoUsuarioService {

	@Inject // #3
	private ITipoUsuarioDao tuDao;
	@Override

	// Methods #1
	public void insert(TipoUsuarioEntities vc) {
		// TODO Auto-generated method stub
		tuDao.insert(vc); // #5
	}
	@Override

	public List<TipoUsuarioEntities> list() {
		// TODO Auto-generated method stub
		return tuDao.list(); // #6
	}

}
