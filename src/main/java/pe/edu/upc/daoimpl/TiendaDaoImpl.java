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
	@PersistenceContext(unitName= "demoIdealPC")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insert(Tienda t) {
		try {
			em.persist(t);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<Tienda> list(){
		List<Tienda> lista=new ArrayList<Tienda>();
		try {
			Query q=em.createQuery("from Tienda p");
			lista = (List<Tienda>) q.getResultList();
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return lista;
	}
	@Transactional
	@Override
	public void eliminar(int idTienda) {
		Tienda tiend =new Tienda();
		try {
			tiend=em.getReference(Tienda.class, idTienda);
			em.remove(tiend);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<Tienda> finByNameTienda(Tienda de) {
		List<Tienda> lista = new ArrayList<Tienda>();
		try {
			Query q = em.createQuery("from Tienda m where m.nombreTienda like ?1");
			q.setParameter(1, "%" + de.getNombreTienda() + "%");
			lista = (List<Tienda>) q.getResultList();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return lista;
	}
	@Transactional
	@Override
	public void modificar(Tienda tienda) {
		try {
			em.merge(tienda);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
