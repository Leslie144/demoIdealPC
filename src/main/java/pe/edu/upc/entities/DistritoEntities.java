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
	private int idDistrito;
	
	@Column(name = "Nnombre_distrito", length = 120, nullable = false)
	private String nombreDistrito;

	public DistritoEntities() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DistritoEntities(int idDistrito, String nombreDistrito) {
		super();
		this.idDistrito = idDistrito;
		this.nombreDistrito = nombreDistrito;
	}

	public int getIdDistrito() {
		return idDistrito;
	}

	public void setIdDistrito(int idDistrito) {
		this.idDistrito = idDistrito;
	}

	public String getNombreDistrito() {
		return nombreDistrito;
	}

	public void setNombreDistrito(String nombreDistrito) {
		this.nombreDistrito = nombreDistrito;
	}

	
	
	
	
}
