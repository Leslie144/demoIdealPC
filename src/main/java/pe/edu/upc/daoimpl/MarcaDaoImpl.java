package pe.edu.upc.daoimpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import pe.edu.upc.dao.IMarcaDao;
import pe.edu.upc.entities.MarcaEntities;

public class MarcaDaoImpl implements IMarcaDao {

	@PersistenceContext(unitName = "demoIdealPC")
	private EntityManager em;

	public void insert(MarcaEntities vc) {
		// TODO Auto-generated method stub
		try {
			em.persist(vc);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error al insertar una Marca");
		}
	}
	
	public void delete(int idMarca) {
		try {
			em.remove(idMarca);
		} catch (Exception e) {
			System.out.println("Error al eliminar una Marca");
		}
	}

	@SuppressWarnings("unchecked")
	public List<MarcaEntities> list() {
		// TODO Auto-generated method stub
		List<MarcaEntities> lista = new ArrayList<MarcaEntities>();
		try {
			Query q = em.createQuery("select v from TIPO_USUARIO v");
			lista = (List<MarcaEntities>) q.getResultList();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return lista;
	}
}
