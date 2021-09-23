package pe.edu.upc.Controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entities.TipoRecomendacionEntities;
import pe.edu.upc.service.ITipoRecomendacionService;

@Named // #1
@RequestScoped // #2
public class TipoRecomendacionController {
	@Inject // #3
	private ITipoRecomendacionService trService;

	private TipoRecomendacionEntities tiporecomendacionCenter;
	List<TipoRecomendacionEntities> listaTipoRecomendacion;

	private String mensaje = "error";

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
	@PostConstruct // #6
	public void init() { // #5
		tiporecomendacionCenter = new TipoRecomendacionEntities();
		listaTipoRecomendacion = new ArrayList<TipoRecomendacionEntities>();
	}

	public String newTipoRecomendacion() { // #7
		this.setTiporecomendacionCenter(new TipoRecomendacionEntities());
		return "tiporecomendacion.xhtml";
	}

	public void insert() { // #8
		trService.insert(tiporecomendacionCenter);
	}

	public void list() { // #9
		listaTipoRecomendacion = trService.list();
	}

	public void delete(TipoRecomendacionEntities tiporecomendacion) {
		trService.delete(tiporecomendacion.getCid_tipo_recomendacion());
		list();
	}

	// modificar
	public void update() {
		try {
			trService.update(tiporecomendacionCenter);
			this.list();
		} catch (Exception e) {
			// TODO: handle exception
			e.getMessage();
		}
	}
	
	public String UpdatePre(TipoRecomendacionEntities tipo_recomendacion) {
		this.setTiporecomendacionCenter(tipo_recomendacion);
		return "tiporecomendacionMod.xhtml";
	}
	

	// Getters and Setters #4 except el service
	public TipoRecomendacionEntities getTiporecomendacionCenter() {
		return tiporecomendacionCenter;
	}

	public void setTiporecomendacionCenter(TipoRecomendacionEntities tiporecomendacionCenter) {
		this.tiporecomendacionCenter = tiporecomendacionCenter;
	}

	public List<TipoRecomendacionEntities> getListaTipoRecomendacion() {
		return listaTipoRecomendacion;
	}

	public void setListaTipoRecomendacion(List<TipoRecomendacionEntities> listaTipoRecomendacion) {
		this.listaTipoRecomendacion = listaTipoRecomendacion;
	}
}
