package pe.edu.upc.dao;

import java.util.List;
import java.util.Optional;

import pe.edu.upc.entities.Usuario;

public interface IUsuarioDao {
	public void insert(Usuario u);

	public List<Usuario> list();

	public void eliminar(int idUsuario);

	public void modificar(Usuario usuario);
	
	String getPassworHashedByUserName(String username) throws Exception;

	Optional<Usuario> findUserByUsername(Usuario user) throws Exception;
}
