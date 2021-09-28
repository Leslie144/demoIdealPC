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
	List<TipoModularEntities> listaTipoModular;

	@PostConstruct
	private void init() {
		tipomodularCenter = new TipoModularEntities();
		listaTipoModular = new ArrayList<TipoModularEntities>();
		this.list();
	}

	public String newTipoModular() {
		this.setTipoModularCenter(new TipoModularEntities());
		return "TipoModular.xhtml";
	}

	public void insert() {
		tmService.insert(tipomodularCenter);
		cleanTipoModular();
	}

	public void eliminar(TipoModularEntities tipomodular) {
		tmService.eliminar(tipomodular.getidTipoModular());
		this.list();
	}

	public void cleanTipoModular() {
		this.init();
	}

	public void list() {
		listaTipoModular = tmService.list();
	}

	public String Modifpre(TipoModularEntities tm) {
		this.setTipoModularCenter(tm);
		return "TipoModularmod.xhtml";
	}

	public void modificar() {
		try {
			tmService.modificar(this.tipomodularCenter);
			this.list();
		} catch (Exception e) {

		}
	}

	public TipoModularEntities getTipoModularCenter() {
		return tipomodularCenter;
	}

	// Getters and Setters
	public void setTipoModularCenter(TipoModularEntities tipoModularCenter) {
		// TODO Auto-generated method stub
		this.tipomodularCenter = tipoModularCenter;
	}

	public List<TipoModularEntities> getListaTipoModular() {
		return listaTipoModular;

	}

	public void setListaTipoModular(List<TipoModularEntities> listaTipoModular) {
		this.listaTipoModular = listaTipoModular;
	}
}
