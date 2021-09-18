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
	private int Cid_marca;

	@Column(name = "Nmarca", length = 100, nullable = false)
	private String Nmarca;

	@Column(name = "Turl_marca", length = 300, nullable = false)
	private String Turl_marca;

	public MarcaEntities() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MarcaEntities(int cid_marca, String nmarca, String turl_marca) {
		super();
		Cid_marca = cid_marca;
		Nmarca = nmarca;
		Turl_marca = turl_marca;
	}

	// Getters and setters
	public int getCid_marca() {
		return Cid_marca;
	}

	public void setCid_marca(int cid_marca) {
		Cid_marca = cid_marca;
	}

	public String getNmarca() {
		return Nmarca;
	}

	public void setNmarca(String nmarca) {
		Nmarca = nmarca;
	}

	public String getTurl_marca() {
		return Turl_marca;
	}

	public void setTurl_marca(String turl_marca) {
		Turl_marca = turl_marca;
	}
}
