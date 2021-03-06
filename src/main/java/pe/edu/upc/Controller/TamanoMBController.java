package pe.edu.upc.Controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entities.TamanoMBEntities;
import pe.edu.upc.service.ITamanoMBService;

@Named // #1
@RequestScoped // #2
public class TamanoMBController {
	@Inject // #3
	private ITamanoMBService tmbService;

	private TamanoMBEntities tamanombCenter;
	List<TamanoMBEntities> listaTamanoMB;

	@PostConstruct // #6
	public void init() { // #5
		tamanombCenter = new TamanoMBEntities();
		listaTamanoMB = new ArrayList<TamanoMBEntities>();
		this.list();
	}

	public String newTamanoMB() { // #7
		this.setTamanombCenter(new TamanoMBEntities());
		return "tamanoMB.xhtml";
	}

	public void insert() { // #8
		tmbService.insert(tamanombCenter);
	}

	public void list() { // #9
		listaTamanoMB = tmbService.list();
	}

	public void delete(TamanoMBEntities tamanomb) {
		tmbService.delete(tamanomb.getcIdTamanoMB());
		list();
	}

	public void cleanTamanoMB() {
		this.init();
	}

	public void update() { // #8
		tmbService.update(tamanombCenter);
		cleanTamanoMB();
	}
	public String updatePre(TamanoMBEntities tmb) { // #8
		this.setTamanombCenter(tmb);
		return "tamanoMBMod.xhtml";
	}
	
	// Getters and Setters #4 except el service

	public TamanoMBEntities getTamanombCenter() {
		return tamanombCenter;
	}

	public void setTamanombCenter(TamanoMBEntities tamanombCenter) {
		this.tamanombCenter = tamanombCenter;
	}

	public List<TamanoMBEntities> getListaTamanoMB() {
		return listaTamanoMB;
	}

	public void setListaTamanoMB(List<TamanoMBEntities> listaTamanoMB) {
		this.listaTamanoMB = listaTamanoMB;
	}

}