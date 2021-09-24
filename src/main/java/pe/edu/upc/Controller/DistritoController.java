package pe.edu.upc.Controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entities.DistritoEntities;
import pe.edu.upc.service.IDistritoService;

@Named // #1
@RequestScoped // #2
public class DistritoController {
	@Inject // #3
	private IDistritoService dService;

	private DistritoEntities distrito;
	List<DistritoEntities> listaDistrito;

	@PostConstruct // #6
	public void init() { // #5
		distrito = new DistritoEntities();
		listaDistrito = new ArrayList<DistritoEntities>();
		this.list();
	}

	public String newDistrito() { // #7
		this.setDistrito(new DistritoEntities());
		return "distrito.xhtml";
	}

	public void insert() { // #8
		dService.save(distrito);
		cleanDistrito();
	}
	
	public void delete(DistritoEntities distrito) {
		dService.delete(distrito.getIdDistrito());
		list();
	}

	public void list() { // #9
		listaDistrito = dService.list();
	}
	
	public void cleanDistrito() {
		this.init();
	}
	
	public void update() { // #8
		dService.save(distrito);
		cleanDistrito();
	}

	// Getters and Setters #4 except el service

	public IDistritoService getdService() {
		return dService;
	}

	public void setdService(IDistritoService dService) {
		this.dService = dService;
	}

	public DistritoEntities getDistrito() {
		return distrito;
	}

	public void setDistrito(DistritoEntities distrito) {
		this.distrito = distrito;
	}

	
}
