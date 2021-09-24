package pe.edu.upc.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tipoUa")
public class TipoUAEntities {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idTipoUA;

	@Column(name = "nTipoUA", length = 100, nullable = false)
	private String nTipoUA;

	public TipoUAEntities() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TipoUAEntities(int idTipoUA, String nTipoUA) {
		super();
		this.idTipoUA = idTipoUA;
		this.nTipoUA = nTipoUA;
	}

	// Getters and setters
	public int getIdTipoUA() {
		return idTipoUA;
	}

	public void setIdTipoUA(int idTipoUA) {
		this.idTipoUA = idTipoUA;
	}

	public String getnTipoUA() {
		return nTipoUA;
	}

	public void setnTipoUA(String nTipoUA) {
		this.nTipoUA = nTipoUA;
	}


	
}
