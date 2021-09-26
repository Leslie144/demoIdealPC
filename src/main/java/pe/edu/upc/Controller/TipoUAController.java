package pe.edu.upc.Controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entities.TipoUAEntities;
import pe.edu.upc.service.ITipoUAService;

@Named // #1
@RequestScoped // #2
public class TipoUAController {
	@Inject // #3
	private ITipoUAService tuaService;
	
	private TipoUAEntities tipouaCenter;
	List<TipoUAEntities> listaTipoUA;

	private String mensaje = "error";

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
	@PostConstruct // #6
	public void init() { // #5
		tipouaCenter = new TipoUAEntities();
		listaTipoUA = new ArrayList<TipoUAEntities>();
	}

	public String newTipoUA() { // #7
		this.setTipouaCenter(new TipoUAEntities());
		return "tipoua.xhtml";
	}

	public void insert() { // #8
		tuaService.insert(tipouaCenter);
	}

	public void list() { // #9
		listaTipoUA = tuaService.list();
	}

	public void delete(TipoUAEntities tipotua) {
		tuaService.delete(tipotua.getIdTipoUA());
		list();
	}

	public void cleanTipoUA() {
		this.init();
	}
	
	// modificar
	public void update() {
		try {
			tuaService.update(tipouaCenter);
			this.list();
		} catch (Exception e) {
			// TODO: handle exception
			e.getMessage();
		}
	}

	public String updatePre(TipoUAEntities tipoUA) { // #8
		this.setTipouaCenter(tipoUA);
		return"tipoUAMod.xhtml";
	}
	
	
	// Getters and Setters #4 except el service
	public TipoUAEntities getTipouaCenter() {
		return tipouaCenter;
	}

	public void setTipouaCenter(TipoUAEntities tipouaCenter) {
		this.tipouaCenter = tipouaCenter;
	}

	public List<TipoUAEntities> getListaTipoUA() {
		return listaTipoUA;
	}

	public void setListaTipoUA(List<TipoUAEntities> listaTipoUA) {
		this.listaTipoUA = listaTipoUA;
	}

	
	
	

}
