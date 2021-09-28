package pe.edu.upc.daoimpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.ITipoRecomendacionDao;
import pe.edu.upc.entities.TipoRecomendacionEntities;

public class TipoRecomendacionDaoImpl implements ITipoRecomendacionDao {

	@PersistenceContext(unitName = "demoIdealPC")
	private EntityManager em;
	@Transactional
	@Override
	public void insert(TipoRecomendacionEntities vc) {
		// TODO Auto-generated method stub
		try {
			em.persist(vc);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error al insertar un Tipo de Recomendación");
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<TipoRecomendacionEntities> list() {
		// TODO Auto-generated method stub
		List<TipoRecomendacionEntities> lista = new ArrayList<TipoRecomendacionEntities>();
		try {
			Query q = em.createQuery("select v from TipoRecomendacionEntities v");
			lista = (List<TipoRecomendacionEntities>) q.getResultList();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error al listar una Tipo Recomendación: " + e);

		}
		return lista;
	}

	@Transactional
	@Override
	public void delete(int id_recomendacion) {
		// TODO Auto-generated method stub
		TipoRecomendacionEntities tipo_recomendacion = new TipoRecomendacionEntities();
		try {
			tipo_recomendacion = em.getReference(TipoRecomendacionEntities.class, id_recomendacion);
			em.remove(tipo_recomendacion);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error al eliminar un tipo recomendación " + e);
		}
	}
	
	@Transactional
	@Override
	public void update(TipoRecomendacionEntities vc) {
		// TODO Auto-generated method stub
		try {
			em.merge(vc);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<TipoRecomendacionEntities> finByNameTipoRecomendacion(TipoRecomendacionEntities tr) {
		// TODO Auto-generated method stub
				List<TipoRecomendacionEntities> lista = new ArrayList<TipoRecomendacionEntities>();
				try {
					Query q = em.createQuery("from TipoRecomendacionEntities v where v.tRecomendacion like ?1");
					q.setParameter(1, "%" + tr.gettRecomendacion() + "%");
					lista = (List<TipoRecomendacionEntities>) q.getResultList();
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("Error al listar una Tipo Recomendación: " + e);

				}
				return lista;
	}

}
