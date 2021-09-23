package pe.edu.upc.Controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entities.MarcaEntities;
import pe.edu.upc.service.IMarcaService;

@Named // #1
@RequestScoped // #2
public class MarcaController {
	@Inject // #3
	private IMarcaService mService;

	private MarcaEntities marcaCenter;
	List<MarcaEntities> listaMarca;

	@PostConstruct // #6
	private void init() { // #5
		marcaCenter = new MarcaEntities();
		listaMarca = new ArrayList<MarcaEntities>();
		this.list();
	}

	public String newMarca() { // #7
		this.setMarcaCenter(new MarcaEntities());
		return "marca.xhtml";
	}

	public void insert() { // #8
		mService.save(marcaCenter);
		cleanMarca();
	}
	
	public void delete(MarcaEntities marca) {
		mService.delete(marca.getIdMarca());
		list();
	}
	
	public void cleanMarca() {
		this.init();
	}
	
	public void update() { // #8
		mService.save(marcaCenter);
		cleanMarca();
	}

	public void list() { // #9
		listaMarca = mService.list();
	}

	
	// Getters and Setters #4 except el service

	public MarcaEntities getMarcaCenter() {
		return marcaCenter;
	}

	public void setMarcaCenter(MarcaEntities marcaCenter) {
		this.marcaCenter = marcaCenter;
	}

	public List<MarcaEntities> getListaMarca() {
		return listaMarca;
	}

	public void setListaMarca(List<MarcaEntities> listaMarca) {
		this.listaMarca = listaMarca;
	}

	
}
