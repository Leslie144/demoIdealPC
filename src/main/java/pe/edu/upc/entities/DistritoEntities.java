package pe.edu.upc.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "distrito")
public class DistritoEntities {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idDistrito;
	
	@Column(name = "nNombre_Distrito", length = 120, nullable = false)
	private String nNombre_Distrito;

	public DistritoEntities() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DistritoEntities(int idDistrito, String nNombre_Distrito) {
		super();
		this.idDistrito = idDistrito;
		this.nNombre_Distrito = nNombre_Distrito;
	}

	public int getIdDistrito() {
		return idDistrito;
	}
	//Getters and setters

	public void setIdDistrito(int idDistrito) {
		this.idDistrito = idDistrito;
	}

	public String getnNombre_Distrito() {
		return nNombre_Distrito;
	}

	public void setnNombre_Distrito(String nNombre_Distrito) {
		this.nNombre_Distrito = nNombre_Distrito;
	}

	
	
	
}
