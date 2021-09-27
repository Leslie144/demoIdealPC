package pe.edu.upc.daoimpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IMarcaDao;
import pe.edu.upc.entities.MarcaEntities;

public class MarcaDaoImpl implements IMarcaDao {

	@PersistenceContext(unitName = "demoIdealPC")
	private EntityManager em;

	@Transactional
	@Override
	public void insert(MarcaEntities ma) {
		// TODO Auto-generated method stub
		try {
			em.persist(ma);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error al insertar una Marca: " + e);
		}
	}

	@Transactional
	@Override
	public void delete(int idMarca) {
		MarcaEntities mar = new MarcaEntities();
		try {
			mar = em.getReference(MarcaEntities.class, idMarca);
			em.remove(mar);
		} catch (Exception e) {
			System.out.println("Error al eliminar una Marca");
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<MarcaEntities> list() {
		// TODO Auto-generated method stub
		List<MarcaEntities> lista = new ArrayList<MarcaEntities>();
		try {
			Query q = em.createQuery("from MarcaEntities m");
			lista = (List<MarcaEntities>) q.getResultList();
		} catch (Exception e) {
			System.out.println("Error al listar una Marca: " + e);
		}
		return lista;
	}
	
	@Transactional
	@Override
	public void update(MarcaEntities marca) {
		try {
			em.merge(marca);
		} catch (Exception e) {
			System.out.println("Error al actualizar una Marca: " + e);
		}
	}

	/*@Transactional
	@Override
	public void update(MarcaEntities marca) {
		MarcaEntities mar = new MarcaEntities();
		try {
			mar = em.getReference(MarcaEntities.class, marca);
			em.merge(mar);
		} catch (Exception e) {
			System.out.println("Error al actualizar una Marca: " + e);
		}
	}*/
}
