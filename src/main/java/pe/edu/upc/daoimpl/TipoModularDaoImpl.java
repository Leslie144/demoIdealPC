package pe.edu.upc.daoimpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.ITipoModularDao;
import pe.edu.upc.entities.TipoModularEntities;

public class TipoModularDaoImpl implements ITipoModularDao{

	@PersistenceContext(unitName = "demoIdealPC")
	private EntityManager em;
	
	@Transactional
	public void insert(TipoModularEntities vc) {
		// TODO Auto-generated method stub
		try {
			em.persist(vc);
		}catch(Exception e) {
			System.out.println("Error al insertar un Tipo Modular");
		}
	}

	@SuppressWarnings("unchecked")
	public List<TipoModularEntities> list() {
		// TODO Auto-generated method stub
		List<TipoModularEntities> lista = new ArrayList<TipoModularEntities>();
		try{
			Query q = em.createQuery("select v from TIPO_MODULAR v");
			lista = (List<TipoModularEntities>) q.getResultList();
		} catch (Exception e) {
			//TODO:handle exception
		}
		return lista;
	}
}
