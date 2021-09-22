package pe.edu.upc.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TAMANO_MB")
public class TamanoMBEntities {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Cid_tamano_mb;
	
	@Column(name = "Ntamano_mb", length = 100, nullable = false)
	private String Ntamano_mb;

	public TamanoMBEntities() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TamanoMBEntities(int cid_tamano_mb, String ntamano_mb) {
		super();
		Cid_tamano_mb = cid_tamano_mb;
		Ntamano_mb = ntamano_mb;
	}

	//Getters and setters
	public int getCid_tamano_mb() {
		return Cid_tamano_mb;
	}

	public void setCid_tamano_mb(int cid_tamano_mb) {
		Cid_tamano_mb = cid_tamano_mb;
	}

	public String getNtamano_mb() {
		return Ntamano_mb;
	}

	public void setNtamano_mb(String ntamano_mb) {
		Ntamano_mb = ntamano_mb;
	}
}