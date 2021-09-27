package pe.edu.upc.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tipoModular")
public class TipoModularEntities  {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idTipoModular;

	@Column(name = "nTipoModular", length = 100, nullable = false)
	private String nTipoModular;

	public TipoModularEntities() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TipoModularEntities(int idTipoModular, String nTipoModular) {
		super();
		this.idTipoModular = idTipoModular;
		this.nTipoModular = nTipoModular;
	}

	// Getters and setters
	public int getidTipoModular() {
		return idTipoModular;
	}

	public void setidTipoModular(int idTipoModular) {
		this.idTipoModular = idTipoModular;
	}

	public String getnTipoModular() {
		return nTipoModular;
	}

	public void setnTipoModular(String nTipoModular) {
		this.nTipoModular = nTipoModular;
	}
}
