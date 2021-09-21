package pe.edu.upc.serviceimpl;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.ITipoModularDao;
import pe.edu.upc.entities.TipoModularEntities;
import pe.edu.upc.service.ITipoModularService;

@Named
@RequestScoped
public class TipoModularServiceImpl implements ITipoModularService {

	@SuppressWarnings("cdi-ambiguous-dependency")
	@Inject
	private ITipoModularDao tmDao;

	public void insert(TipoModularEntities vc) {
		// TODO Auto-generated method stub
		tmDao.insert(vc);
	}

	public List<TipoModularEntities> list() {
		// TODO Auto-generated method stub
		return tmDao.list();
	}

	@Override
	public void eliminar(int cid_tipo_modular) {
		// TODO Auto-generated method stub
		tmDao.eliminar(cid_tipo_modular);
	}

	@Override
	public void modificar(TipoModularEntities vc) {
		// TODO Auto-generated method stub
		tmDao.modificar(vc);
	}
}
