package pe.edu.upc.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MARCA")
public class MarcaEntities {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idMarca;

	@Column(name = "nombreMarca", length = 100, nullable = false)
	private String nombreMarca;

	@Column(name = "turlMarca", length = 300, nullable = false)
	private String turlMarca;

	public MarcaEntities() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MarcaEntities(int idMarca, String nombreMarca, String turlMarca) {
		super();
		this.idMarca = idMarca;
		this.nombreMarca =nombreMarca;
		this.turlMarca = turlMarca;
	}

	public int getIdMarca() {
		return idMarca;
	}

	public void setIdMarca(int idMarca) {
		this.idMarca = idMarca;
	}

	public String getNombreMarca() {
		return nombreMarca;
	}

	public void setNombreMarca(String nombreMarca) {
		this.nombreMarca = nombreMarca;
	}

	public String getTurlMarca() {
		return turlMarca;
	}

	public void setTurlMarca(String turlMarca) {
		this.turlMarca = turlMarca;
	}

	
}
