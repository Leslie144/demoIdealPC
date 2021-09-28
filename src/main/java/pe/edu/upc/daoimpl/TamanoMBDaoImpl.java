package pe.edu.upc.daoimpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.ITamanoMBDao;
import pe.edu.upc.entities.TamanoMBEntities;

public class TamanoMBDaoImpl implements ITamanoMBDao {

	@PersistenceContext(unitName = "demoIdealPC")
	private EntityManager em;

	@Transactional
	public void insert(TamanoMBEntities vc) {
		// TODO Auto-generated method stub
		try {
			em.persist(vc);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error al insertar el tamaño del Motherboard");
		}
	}

	@SuppressWarnings("unchecked")
	public List<TamanoMBEntities> list() {
		// TODO Auto-generated method stub
		List<TamanoMBEntities> lista = new ArrayList<TamanoMBEntities>();
		try {
			Query q = em.createQuery("select v from TamanoMBEntities V");
			lista = (List<TamanoMBEntities>) q.getResultList();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return lista;
	}

	@Transactional
	@Override
	public void delete(int idTamanoMB) {
		// TODO Auto-generated method stub
		TamanoMBEntities tmb = new TamanoMBEntities();
		try {
			tmb = em.getReference(TamanoMBEntities.class, idTamanoMB);
			em.remove(tmb);
		} catch (Exception e) {
			System.out.println("Error al eliminar el Tamaño del Motherboard");
		}
	}
	
	@Transactional
	@Override
	public void update(TamanoMBEntities tamanomb) {
		// TODO Auto-generated method stub
		try {
			em.merge(tamanomb);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}