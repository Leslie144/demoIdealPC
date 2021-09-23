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
	@Inject
	private TipoUsuarioEntities tipousuarioCenter;
	List<TipoUsuarioEntities> listaTipoUsuarios;

	@PostConstruct // #6
	public void init() { // #5
		tipousuarioCenter = new TipoUsuarioEntities();
		listaTipoUsuarios = new ArrayList<TipoUsuarioEntities>();
	}

	public String newTipoUsuario() { // #7
		this.setTipousuarioCenter(new TipoUsuarioEntities());
		return "tipousuario.xhtml";
	}

	public void insert() { // #8
		tuService.insert(tipousuarioCenter);
	}

	public void list() { // #9
		listaTipoUsuarios = tuService.list();
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
