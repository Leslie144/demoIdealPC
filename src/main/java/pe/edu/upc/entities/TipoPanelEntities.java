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
	private int idTipoPanel;

	@Column(name = "nTipoPanel", length = 100, nullable = false)
	private String nTipoPanel;

	public TipoPanelEntities() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TipoPanelEntities(int idTipoPanel, String nTipoPanel) {
		super();
		this.idTipoPanel = idTipoPanel;
		this.nTipoPanel = nTipoPanel;
	}

	// Getters and setters
	public int getIdTipoPanel() {
		return idTipoPanel;
	}

	public void setIdTipoPanel(int idTipoPanel) {
		this.idTipoPanel = idTipoPanel;
	}

	public String getnTipoPanel() {
		return nTipoPanel;
	}

	public void setnTipoPanel(String nTipoPanel) {
		this.nTipoPanel = nTipoPanel;
	}

}
