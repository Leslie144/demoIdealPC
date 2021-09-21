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
		tuaService.delete(tipotua.getCid_tipo_ua());
		list();
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
