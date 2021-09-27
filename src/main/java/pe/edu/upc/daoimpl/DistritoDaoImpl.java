package pe.edu.upc.daoimpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IDistritoDao;
import pe.edu.upc.entities.DistritoEntities;

public class DistritoDaoImpl implements IDistritoDao {

	@PersistenceContext(unitName = "demoIdealPC")
	private EntityManager em;

	@Transactional
	@Override
	public void insert(DistritoEntities vc) {
		// TODO Auto-generated method stub
		try {
			em.persist(vc);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error al insertar un Distrito");
		}
	}

	@Transactional
	@Override
	public void eliminar(int idDistrito) {
		// TODO Auto-generated method stub
		try {
			em.persist(idDistrito);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error al insertar un Distrito");
		}

	}

	@Transactional
	@Override
	public void modificar(DistritoEntities dis) {
		// TODO Auto-generated method stub
		try {
			em.merge(dis);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<DistritoEntities> list() {
		// TODO Auto-generated method stub
		List<DistritoEntities> lista = new ArrayList<DistritoEntities>();
		try {
			Query q = em.createQuery("select v from DISTRTITO v");
			lista = (List<DistritoEntities>) q.getResultList();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return lista;

	}

	@Override
	public List<DistritoEntities> finByNameDistrito(DistritoEntities ds) {
		// TODO Auto-generated method stub
		return null;
	}

}
