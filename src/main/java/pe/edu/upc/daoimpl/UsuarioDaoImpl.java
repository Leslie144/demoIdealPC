package pe.edu.upc.daoimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
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

	@Override
	public String getPassworHashedByUserName(String username) throws Exception {
		// TODO Auto-generated method stub
		Usuario user = new Usuario();

		try {
			Query query = em.createQuery("FROM Usuario u WHERE u.nombreusuario = ?1");
			query.setParameter(1, username);

			@SuppressWarnings("unchecked")
			List<Usuario> lista = query.getResultList();
			if (!lista.isEmpty()) {
				user = lista.get(0);
			}
		} catch (Exception e) {
			throw e;
		}

		return user != null ? user.getContrasenaUsuario() : "";
	}

	@Override
	public Optional<Usuario> findUserByUsername(Usuario t) throws Exception {
		// TODO Auto-generated method stub
		Usuario user;
		TypedQuery<Usuario> query = em.createQuery("SELECT u FROM Usuario u WHERE u.idusuario = ?1", Usuario.class);
		//query.setParameter(1, t.getCustomer().getId());

		user = query.getSingleResult();

		
		return Optional.of(user);
	}

}
