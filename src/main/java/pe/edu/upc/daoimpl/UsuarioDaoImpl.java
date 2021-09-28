package pe.edu.upc.daoimpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IUsuarioDao;
import pe.edu.upc.entities.Usuario;

public class UsuarioDaoImpl implements IUsuarioDao {
	@PersistenceContext(unitName = "demoIdealPC")
	private EntityManager em;

	@Transactional
	@Override
	public void insert(Usuario u) {
		// TODO Auto-generated method stub
		try {
			em.persist(u);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error al insertar Usuario: " + e);
		}
	}

	@Transactional
	@SuppressWarnings("unchecked")
	@Override
	public List<Usuario> list() {
		// TODO Auto-generated method stub
		List<Usuario> lista = new ArrayList<Usuario>();
		try {
			Query q = em.createQuery("select p from Usuario p");
			lista = (List<Usuario>) q.getResultList();
		} catch (Exception e) {
			System.out.println("Error al listar Usuarios");
		}
		return lista;
	}

	@Transactional
	@Override
	public void eliminar(int idUsuario) {
		// TODO Auto-generated method stub
		Usuario usuario = new Usuario();
		try {
			usuario = em.getReference(Usuario.class, idUsuario);
			em.remove(usuario);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}

	@Transactional
	@Override
	public void modificar(Usuario usuario) {
		// TODO Auto-generated method stub
		try {
			em.merge(usuario);
		} catch (Exception e) {
			System.out.println("Error al actualizar una usuario: " + e);
		}
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Usuario> login(String nombre,String contrasena) {
		List<Usuario> lista = new ArrayList<Usuario>();
		try {
			Query query = em.createQuery("FROM Usuario u WHERE u.nombreUsuario = ?1 and u.contrasenaUsuario = ?2");
			query.setParameter(1, nombre);
			query.setParameter(2, contrasena);			
			lista = (List<Usuario>) query.getResultList();
			
		} catch (Exception e) {
			throw e;
		}
		return lista;
	}
}
