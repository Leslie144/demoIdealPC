package pe.edu.upc.daoimpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.ITipoUsuarioDao;
import pe.edu.upc.entities.TipoUsuarioEntities;

public class TipoUsuarioDaoImpl implements ITipoUsuarioDao {

	@PersistenceContext(unitName = "demoIdealPC")
	private EntityManager em;

	@Transactional
	public void insert(TipoUsuarioEntities vc) {
		// TODO Auto-generated method stub
		try {
			em.persist(vc);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error al insertar un Tipo de Usuario");
		}
	}

	@SuppressWarnings("unchecked")
	public List<TipoUsuarioEntities> list() {
		// TODO Auto-generated method stub
		List<TipoUsuarioEntities> lista = new ArrayList<TipoUsuarioEntities>();
		try {
			Query q = em.createQuery("select v from TIPO_USUARIO v");
			lista = (List<TipoUsuarioEntities>) q.getResultList();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return lista;
	}
}
