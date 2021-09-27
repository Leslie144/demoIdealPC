package pe.edu.upc.entities;

import java.util.Objects;

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
	
	@Column(name = "nombreDistrito", length = 120, nullable = false)
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
	//Getters and setters

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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idDistrito;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DistritoEntities other = (DistritoEntities) obj;
		return idDistrito == other.idDistrito && Objects.equals(nombreDistrito, other.nombreDistrito);
	}

	
	
	
	
}
