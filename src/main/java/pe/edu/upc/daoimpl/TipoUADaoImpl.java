package pe.edu.upc.daoimpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.ITipoUADao;
import pe.edu.upc.entities.TipoUAEntities;

public class TipoUADaoImpl implements ITipoUADao {

	@PersistenceContext(unitName = "demoIdealPC")
	private EntityManager em;

	@Transactional
	@Override
	public void insert(TipoUAEntities vc) {
		// TODO Auto-generated method stub
		try {
			em.persist(vc);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error al insertar un Tipo de UA");
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<TipoUAEntities> list() {
		// TODO Auto-generated method stub
		List<TipoUAEntities> lista = new ArrayList<TipoUAEntities>();
		try {
			Query q = em.createQuery("select v from TipoUAEntities v");
			lista = (List<TipoUAEntities>) q.getResultList();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error al listar una Tipo UA: " + e);
		}
		return lista;
	}

	@Transactional
	@Override
	public void delete(int id_tua) {
		// TODO Auto-generated method stub
		TipoUAEntities tipo_ua = new TipoUAEntities();
		try {
			tipo_ua = em.getReference(TipoUAEntities.class, tipo_ua);
			em.remove(id_tua);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}

	@Transactional
	@Override
	public void update(TipoUAEntities vc) {
		// TODO Auto-generated method stub
		try {
			em.merge(vc);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
}
