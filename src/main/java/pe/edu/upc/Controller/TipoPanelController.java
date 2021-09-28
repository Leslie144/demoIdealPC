package pe.edu.upc.Controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entities.TipoPanelEntities;
import pe.edu.upc.service.ITipoPanelService;

@Named // #1
@RequestScoped // #2
public class TipoPanelController {
	@Inject // #3
	private ITipoPanelService tpService;

	private TipoPanelEntities tipopanelCenter;
	List<TipoPanelEntities> listaTipoPanel;

	@PostConstruct // #6
	public void init() { // #5
		tipopanelCenter = new TipoPanelEntities();
		listaTipoPanel = new ArrayList<TipoPanelEntities>();
		this.list();
	}

	public String newTipoPanel() { // #7
		this.setTipopanelCenter(new TipoPanelEntities());
		return "tipoPanel.xhtml";
	}

	public void insert() { // #8
		tpService.insert(tipopanelCenter);
	}

	public void list() { // #9
		listaTipoPanel = tpService.list();
	}

	public void delete(TipoPanelEntities tipopanel) {
		tpService.delete(tipopanel.getIdTipoPanel());
		this.list();
	}

	public void cleanTipoPanel() {
		this.init();
	}

	public void update() { // #8
		tpService.update(tipopanelCenter);
		cleanTipoPanel();
	}

	public String updatePre(TipoPanelEntities tp) { // #8
		this.setTipopanelCenter(tp);
		return "tipoPanelMod.xhtml";
	}

	// Getters and Setters #4 except el service

	public TipoPanelEntities getTipopanelCenter() {
		return tipopanelCenter;
	}

	public void setTipopanelCenter(TipoPanelEntities tipopanelCenter) {
		this.tipopanelCenter = tipopanelCenter;
	}

	public List<TipoPanelEntities> getListaTipoPanel() {
		return listaTipoPanel;
	}

	public void setListaTipoPanel(List<TipoPanelEntities> listaTipoPanel) {
		this.listaTipoPanel = listaTipoPanel;
	}

}