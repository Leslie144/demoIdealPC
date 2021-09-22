package pe.edu.upc.serviceimpl;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.ITipoPanelDao;
import pe.edu.upc.entities.TipoPanelEntities;
import pe.edu.upc.service.ITipoPanelService;

@Named // #2
@RequestScoped // #4
public class TipoPanelServiceImpl implements ITipoPanelService {

	@Inject // #3
	private ITipoPanelDao tpDao;

	// Methods #1
	public void insert(TipoPanelEntities vc) {
		// TODO Auto-generated method stub
		tpDao.insert(vc); // #5
	}

	public List<TipoPanelEntities> list() {
		// TODO Auto-generated method stub
		return tpDao.list(); // #6
	}
}