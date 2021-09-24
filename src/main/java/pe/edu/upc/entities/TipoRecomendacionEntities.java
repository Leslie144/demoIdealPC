package pe.edu.upc.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tipoRecomendacion")
public class TipoRecomendacionEntities {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idTipoRecomendacion;

	@Column(name = "tRecomendacion", length = 100, nullable = false)
	private String tRecomendacion;

	public TipoRecomendacionEntities() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TipoRecomendacionEntities(int idTipoRecomendacion, String tRecomendacion) {
		super();
		this.idTipoRecomendacion = idTipoRecomendacion;
		this.tRecomendacion = tRecomendacion;
	}

	// Getters and setters

	public int getIdTipoRecomendacion() {
		return idTipoRecomendacion;
	}

	public void setIdTipoRecomendacion(int idTipoRecomendacion) {
		this.idTipoRecomendacion = idTipoRecomendacion;
	}

	public String gettRecomendacion() {
		return tRecomendacion;
	}

	public void settRecomendacion(String tRecomendacion) {
		this.tRecomendacion = tRecomendacion;
	}

	

	
	
}
