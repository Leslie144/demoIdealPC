package pe.edu.upc.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "marca")
public class MarcaEntities {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idMarca;

	@Column(name = "nMarca", length = 100, nullable = false)
	private String nMarca;

	@Column(name = "urlMarca", length = 300, nullable = false)
	private String urlMarca;

	public MarcaEntities() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MarcaEntities(int idMarca, String nMarca, String urlMarca) {
		super();
		this.idMarca = idMarca;
		this.nMarca = nMarca;
		this.urlMarca = urlMarca;
	}

	// Getters and setters

	public int getIdMarca() {
		return idMarca;
	}

	public void setIdMarca(int idMarca) {
		this.idMarca = idMarca;
	}

	public String getnMarca() {
		return nMarca;
	}

	public void setnMarca(String nMarca) {
		this.nMarca = nMarca;
	}

	public String getUrlMarca() {
		return urlMarca;
	}

	public void setUrlMarca(String urlMarca) {
		this.urlMarca = urlMarca;
	}


	
}
