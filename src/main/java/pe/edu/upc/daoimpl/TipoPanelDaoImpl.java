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
}