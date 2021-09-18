package pe.edu.upc.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "DISTRITO")
public class DistritoEntities {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Cid_distrito;
	
	@Column(name = "Nnombre_distrito", length = 120, nullable = false)
	private String Nnombre_distrito;

	public DistritoEntities() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DistritoEntities(int cid_distrito, String nnombre_distrito) {
		super();
		Cid_distrito = cid_distrito;
		Nnombre_distrito = nnombre_distrito;
	}

	
	//Getters and setters
	public int getCid_distrito() {
		return Cid_distrito;
	}

	public void setCid_distrito(int cid_distrito) {
		Cid_distrito = cid_distrito;
	}

	public String getNnombre_distrito() {
		return Nnombre_distrito;
	}

	public void setNnombre_distrito(String nnombre_distrito) {
		Nnombre_distrito = nnombre_distrito;
	}
	
	
}
