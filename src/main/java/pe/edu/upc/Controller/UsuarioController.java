package pe.edu.upc.Controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entities.TipoUsuarioEntities;
import pe.edu.upc.entities.Usuario;
import pe.edu.upc.service.ITipoUsuarioService;
import pe.edu.upc.service.IUsuarioService;

@Named
@RequestScoped
public class UsuarioController {
	@Inject
	private IUsuarioService uService;
	@Inject
	private ITipoUsuarioService tuService;
	private Usuario usuario;
	private TipoUsuarioEntities tipousuario;
	private String mensaje = "error";

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	List<Usuario> listausuarios;
	List<TipoUsuarioEntities> listatipousuarios;

	@PostConstruct
	public void init() {
		this.usuario = new Usuario();
		this.tipousuario = new TipoUsuarioEntities();
		this.listausuarios = new ArrayList<Usuario>();
		this.listatipousuarios = new ArrayList<TipoUsuarioEntities>();
		this.listTipoUsuario();
		this.listUsuario();
	}

	public String newUsuario() {
		this.setUsuario(new Usuario());
		return "usuario.xhtml";
	}

	public void listTipoUsuario() {
		listatipousuarios = tuService.list();
	}
	
	public void insertUsuario() {
		uService.insert(usuario);
		this.listUsuario();
	}
	public void listUsuario() {
		listausuarios = uService.list();
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public TipoUsuarioEntities getTipousuario() {
		return tipousuario;
	}

	public void setTipousuario(TipoUsuarioEntities tipousuario) {
		this.tipousuario = tipousuario;
	}

	public List<Usuario> getListausuarios() {
		return listausuarios;
	}

	public void setListausuarios(List<Usuario> listausuarios) {
		this.listausuarios = listausuarios;
	}

	public List<TipoUsuarioEntities> getListatipousuarios() {
		return listatipousuarios;
	}

	public void setListatipousuarios(List<TipoUsuarioEntities> listatipousuarios) {
		this.listatipousuarios = listatipousuarios;
	}


}
