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
	
	@Column(name = "nNombreDistrito", length = 120, nullable = false)
	private String nNombreDistrito;

	
	public DistritoEntities() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DistritoEntities(int idDistrito, String nNombreDistrito) {
		super();
		this.idDistrito = idDistrito;
		this.nNombreDistrito = nNombreDistrito;
	}
	
	//Getters and setters


	public int getIdDistrito() {
		return idDistrito;
	}

	public void setIdDistrito(int idDistrito) {
		this.idDistrito = idDistrito;
	}

	public String getnNombreDistrito() {
		return nNombreDistrito;
	}

	public void setnNombreDistrito(String nNombreDistrito) {
		this.nNombreDistrito = nNombreDistrito;
	}

	
	

	
	
	
	
}
