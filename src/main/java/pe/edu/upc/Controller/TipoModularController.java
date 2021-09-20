package pe.edu.upc.Controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entities.TipoModularEntities;
import pe.edu.upc.service.ITipoModularService;

@Named
@RequestScoped
public class TipoModularController {

	@Inject
	private ITipoModularService tmService;

	private TipoModularEntities tipomodularCenter;
	List<TipoModularEntities> listaTipoModulares;

	@PostConstruct
	public void init() {
		tipomodularCenter = new TipoModularEntities();
		listaTipoModulares = new ArrayList<TipoModularEntities>();
	}

	public String newtipoModular() {
		this.setTipoModularCenter(new TipoModularEntities());
		return "tipomodular.xhtml";
	}

	public void insert() {
		tmService.insert(tipomodularCenter);
	}

	public void list() {
		listaTipoModulares = tmService.list();
	}
	// Getters and Setters
	public void setTipoModularCenter(TipoModularEntities tipoModularCenter) {
		// TODO Auto-generated method stub
		this.tipomodularCenter = tipoModularCenter;
	}

	public List<TipoModularEntities> getListaTipoModulares() {
		return listaTipoModulares;

	}

	public void setListaTipoModulares(List<TipoModularEntities> listaTipoModulares) {
		this.listaTipoModulares = listaTipoModulares;
	}
}
