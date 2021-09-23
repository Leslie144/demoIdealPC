package pe.edu.upc.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
 
@Entity
@Table(name = "tipoPanel")
public class TipoPanelEntities {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Cid_tipo_panel;

	@Column(name = "Ntipo_panel", length = 100, nullable = false)
	private String Ntipo_panel;

	public TipoPanelEntities() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TipoPanelEntities(int cid_tipo_panel, String ntipo_panel) {
		super();
		Cid_tipo_panel = cid_tipo_panel;
		Ntipo_panel = ntipo_panel;
	}

	// Getters and setters
	public int getCid_tipo_panel() {
		return Cid_tipo_panel;
	}

	public void setCid_tipo_panel(int cid_tipo_panel) {
		Cid_tipo_panel = cid_tipo_panel;
	}

	public String getNtipo_panel() {
		return Ntipo_panel;
	}

	public void setNtipo_panel(String ntipo_panel) {
		Ntipo_panel = ntipo_panel;
	}
}
