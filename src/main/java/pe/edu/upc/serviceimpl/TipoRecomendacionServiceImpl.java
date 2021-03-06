package pe.edu.upc.serviceimpl;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.ITipoRecomendacionDao;
import pe.edu.upc.entities.TipoRecomendacionEntities;
import pe.edu.upc.service.ITipoRecomendacionService;

@Named // #2
@RequestScoped // #4
public class TipoRecomendacionServiceImpl implements ITipoRecomendacionService {

	@Inject
	private ITipoRecomendacionDao trDao;
	@Override
	// Methods #1
	public void insert(TipoRecomendacionEntities vc) {
		// TODO Auto-generated method stub
		trDao.insert(vc); // #5
	}
	@Override
	public List<TipoRecomendacionEntities> list() {
		// TODO Auto-generated method stub
		return trDao.list(); // #6
	}

	@Override
	public void delete(int id_recomendacion) {
		// TODO Auto-generated method stub
		trDao.delete(id_recomendacion);
	}

	@Override
	public void update(TipoRecomendacionEntities vc) {
		// TODO Auto-generated method stub
		trDao.update(vc);
	}
	@Override
	public List<TipoRecomendacionEntities> finByNameTipoRecomendacion(TipoRecomendacionEntities tr) {
		// TODO Auto-generated method stub
		return trDao.finByNameTipoRecomendacion(tr); // #6
	}
}
