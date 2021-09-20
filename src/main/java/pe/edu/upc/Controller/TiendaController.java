package pe.edu.upc.Controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entities.DistritoEntities;
import pe.edu.upc.entities.Tienda;
import pe.edu.upc.service.IDistritoService;
import pe.edu.upc.service.ITiendaService;

@Named
@RequestScoped
public class TiendaController {
	@Inject
	private ITiendaService tService;
	@Inject
	private IDistritoService dService;
	private Tienda tienda;
	private DistritoEntities distrito;
	List<Tienda>listatiendas;
	List<DistritoEntities>listadistritos;
	
	@PostConstruct
	public void init() {
		this.tienda=new Tienda();
		this.distrito=new DistritoEntities();
		this.listatiendas=new ArrayList<Tienda>();
		this.listadistritos=new ArrayList<DistritoEntities>();
		this.listTienda();
		this.listDistritos();
	}
	
	public String newTienda() {
		this.setTienda(new Tienda());
		this.listTienda();
		return "tienda.xhtml";
	}
	public void listDistritos() {
		listadistritos=dService.list();
	}
	public void insertTienda() {
		tService.insert(tienda);
		this.listTienda();
	}
	public void listTienda() {
		listatiendas=tService.list();
	}

	public ITiendaService gettService() {
		return tService;
	}

	public void settService(ITiendaService tService) {
		this.tService = tService;
	}

	public IDistritoService getdService() {
		return dService;
	}

	public void setdService(IDistritoService dService) {
		this.dService = dService;
	}

	public Tienda getTienda() {
		return tienda;
	}

	public void setTienda(Tienda tienda) {
		this.tienda = tienda;
	}

	public DistritoEntities getDistrito() {
		return distrito;
	}

	public void setDistrito(DistritoEntities distrito) {
		this.distrito = distrito;
	}

	public List<Tienda> getListatiendas() {
		return listatiendas;
	}

	public void setListatiendas(List<Tienda> listatiendas) {
		this.listatiendas = listatiendas;
	}

	public List<DistritoEntities> getListadistritos() {
		return listadistritos;
	}

	public void setListadistritos(List<DistritoEntities> listadistritos) {
		this.listadistritos = listadistritos;
	}

}
