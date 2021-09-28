package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entities.Usuario;

public interface IUsuarioDao {
	public void insert(Usuario u);

	public List<Usuario> list();

	public void eliminar(int idUsuario);

	public void modificar(Usuario usuario);
	
	public List<Usuario> login(String nombre,String contrasena);
}
