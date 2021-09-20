package pe.edu.upc.daoimpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;


import pe.edu.upc.dao.ITiendaDao;
import pe.edu.upc.entities.Tienda;

public class TiendaDaoImpl implements ITiendaDao{
	@PersistenceContext(unitName= "ProyectoIdealPc")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insert(Tienda t) {
		try {
			em.persist(t);
		}catch (Exception e) {
			System.out.println("Error al insertar Tienda");
		}
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<Tienda> list(){
		List<Tienda> lista=new ArrayList<Tienda>();
		try {
			Query q=em.createQuery("select p from Tienda p");
			lista = (List<Tienda>) q.getResultList();
		}catch (Exception e) {
			System.out.println("Error al listar Tienda");
		}
		return lista;
	}

}
