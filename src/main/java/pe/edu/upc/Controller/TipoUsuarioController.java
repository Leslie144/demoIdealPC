package pe.edu.upc.Controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entities.TipoUsuarioEntities;
import pe.edu.upc.service.ITipoUsuarioService;

@Named // #1
@RequestScoped // #2
public class TipoUsuarioController {
	@Inject // #3
	private ITipoUsuarioService tuService;
	private TipoUsuarioEntities tipousuarioCenter;
	List<TipoUsuarioEntities> listaTipoUsuarios;
	private String mensaje = "error";

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	@PostConstruct // #6
	public void init() { // #5
		tipousuarioCenter = new TipoUsuarioEntities();
		listaTipoUsuarios = new ArrayList<TipoUsuarioEntities>();
		this.list();
	}

	public String newTipoUsuario() { // #7
		this.setTipousuarioCenter(new TipoUsuarioEntities());
		return "tipoUsuario.xhtml";
	}

	public void insert() { // #8
		tuService.insert(tipousuarioCenter);
	}

	public void list() { // #9
		listaTipoUsuarios = tuService.list();
	}

	public void eliminar(TipoUsuarioEntities vc) {
		try {
			tuService.eliminar(vc.getIdTipousuario());
			list();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public void modificar() {
		try {
			tuService.modificar(this.tipousuarioCenter);
			this.list();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public String Modifpre(TipoUsuarioEntities tm) {
		this.setTipousuarioCenter(tm);
		return "TipoUsuariorMod.xhtml";

	}

	// Getters and Setters #4 except el service

	public TipoUsuarioEntities getTipousuarioCenter() {
		return tipousuarioCenter;
	}

	public void setTipousuarioCenter(TipoUsuarioEntities tipousuarioCenter) {
		this.tipousuarioCenter = tipousuarioCenter;
	}

	public List<TipoUsuarioEntities> getListaTipoUsuarios() {
		return listaTipoUsuarios;
	}

	public void setListaTipoUsuarios(List<TipoUsuarioEntities> listaTipoUsuarios) {
		this.listaTipoUsuarios = listaTipoUsuarios;
	}

}
