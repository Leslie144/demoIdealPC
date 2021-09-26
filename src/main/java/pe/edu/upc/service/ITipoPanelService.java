package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entities.TipoPanelEntities;

public interface ITipoPanelService {
	public void insert(TipoPanelEntities vc);

	public List<TipoPanelEntities> list();
	
	public void delete (int idTipoPanel);
	
	public void update(TipoPanelEntities tipopanel);
}