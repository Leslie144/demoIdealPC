package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entities.TipoPanelEntities;

public interface ITipoPanelDao {
	public void insert(TipoPanelEntities vc);

	public List<TipoPanelEntities> list();

	public void delete(int idTipoPanel);

	public void update(TipoPanelEntities tipopanel);
}
