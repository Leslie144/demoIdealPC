package pe.edu.upc.Controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entities.DistritoEntities;
import pe.edu.upc.entities.MarcaEntities;
import pe.edu.upc.service.IMarcaService;

@Named // #1
@RequestScoped // #2
public class MarcaController {
	@Inject // #3
	private IMarcaService mService;

	private MarcaEntities marca;
	List<MarcaEntities> listaMarca;

	@PostConstruct // #6
	private void init() { // #5
		marca = new MarcaEntities();
		listaMarca = new ArrayList<MarcaEntities>();
		this.list();
	}

	public String newMarca() { // #7
		this.setMarcaCenter(new MarcaEntities());
		return "marca.xhtml";
	}

	public void insert() { // #8
		mService.insert(marca);
		cleanMarca();
	}
	
	public void delete(DistritoEntities distrito) {
		mService.delete(distrito.getCid_distrito());
		list();
	}
	
	public void cleanMarca() {
		this.init();
	}
	
	public void update() { // #8
		mService.update(this.marca);
		this.list();
	}

	public void list() { // #9
		listaMarca = mService.list();
	}

	// Getters and Setters #4 except el service
	public MarcaEntities getMarcaCenter() {
		return marca;
	}

	public void setMarcaCenter(MarcaEntities marcaCenter) {
		this.marca = marcaCenter;
	}

	public List<MarcaEntities> getListaMarca() {
		return listaMarca;
	}

	public void setListaMarca(List<MarcaEntities> listaMarca) {
		this.listaMarca = listaMarca;
	}
}
