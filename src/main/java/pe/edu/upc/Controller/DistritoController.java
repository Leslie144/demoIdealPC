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

	private DistritoEntities distritoCenter;
	List<DistritoEntities> listaDistrito;

	@PostConstruct // #6
	public void init() { // #5
		distritoCenter = new DistritoEntities();
		listaDistrito = new ArrayList<DistritoEntities>();
	}

	public String newDistrito() { // #7
		this.setDistritoCenter(new DistritoEntities());
		return "distrito.xhtml";
	}

	public void insert() { // #8
		dService.insert(distritoCenter);
	}

	public void list() { // #9
		listaDistrito = dService.list();
	}

	// Getters and Setters #4 except el service
	public IDistritoService getdService() {
		return dService;
	}

	public void setdService(IDistritoService dService) {
		this.dService = dService;
	}

	public DistritoEntities getDistritoCenter() {
		return distritoCenter;
	}

	public void setDistritoCenter(DistritoEntities distritoCenter) {
		this.distritoCenter = distritoCenter;
	}
}
