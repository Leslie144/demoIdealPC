package pe.edu.upc.daoimpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.ITipoPanelDao;
import pe.edu.upc.entities.TipoPanelEntities;

public class TipoPanelDaoImpl implements ITipoPanelDao {

	@PersistenceContext(unitName = "demoIdealPC")
	private EntityManager em;

	@Transactional
	public void insert(TipoPanelEntities vc) {
		// TODO Auto-generated method stub
		try {
			em.persist(vc);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error al insertar un Tipo de Panel");
		}
	}

	@SuppressWarnings("unchecked")
	public List<TipoPanelEntities> list() {
		// TODO Auto-generated method stub
		List<TipoPanelEntities> lista = new ArrayList<TipoPanelEntities>();
		try {
			Query q = em.createQuery("select v from TIPO_USUARIO v");
			lista = (List<TipoPanelEntities>) q.getResultList();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return lista;
	}

	@Transactional
	@Override
	public void delete(int idTipoPanel) {
		// TODO Auto-generated method stub
		TipoPanelEntities tip = new TipoPanelEntities();
		try {
			tip = em.getReference(TipoPanelEntities.class, idTipoPanel);
			em.remove(tip);
		} catch (Exception e) {
			System.out.println("Error al eliminar un Tipo de Panel");
		}
	}

	@Transactional
	@Override
	public void update(TipoPanelEntities tipopanel) {
		// TODO Auto-generated method stub
		try {
			em.merge(tipopanel);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}