package pe.edu.upc.service;

import java.util.List;
import java.util.Optional;

import pe.edu.upc.entities.Usuario;

public interface IUsuarioService {
	public void insert(Usuario u);

	public List<Usuario> list();

	public void eliminar(int idUsuario);

	public void modificar(Usuario usuario);
	
	Optional<Usuario> authentication(Usuario us) throws Exception;

}
