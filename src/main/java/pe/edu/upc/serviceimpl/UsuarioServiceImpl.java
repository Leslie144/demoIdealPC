package pe.edu.upc.serviceimpl;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IUsuarioDao;
import pe.edu.upc.entities.Usuario;
import pe.edu.upc.service.IUsuarioService;

@Named
@RequestScoped
public class UsuarioServiceImpl implements IUsuarioService {
	@Inject
	private IUsuarioDao uDao;
	
	
	@Override
	public void insert(Usuario u) {
		// TODO Auto-generated method stub
		uDao.insert(u);
	}

	@Override
	public List<Usuario> list() {
		// TODO Auto-generated method stub
		return uDao.list();
	}

	@Override
	public void eliminar(int idUsuario) {
		// TODO Auto-generated method stub
		uDao.eliminar(idUsuario);

	}

	@Override
	public void modificar(Usuario usuario) {
		// TODO Auto-generated method stub
		uDao.modificar(usuario);
	}
	
	@Override
	public Usuario login(Usuario usuario) {
		List<Usuario> listusu = uDao.login(usuario.getNombreUsuario(),usuario.getContrasenaUsuario());
		if(listusu.isEmpty()) return null;
		else return listusu.get(0);
	}

}
