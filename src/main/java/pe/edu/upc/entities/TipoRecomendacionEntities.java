package pe.edu.upc.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TIPO_RECOMENDACION")
public class TipoRecomendacionEntities {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idtipoRecomendacion;

	@Column(name = "treComendacion", length = 100, nullable = false)
	private String treComendacion;

	public TipoRecomendacionEntities() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TipoRecomendacionEntities(int idtipoRecomendacion, String treComendacion) {
		super();
		this.idtipoRecomendacion = idtipoRecomendacion;
		this.treComendacion = treComendacion;
	}

	public int getIdtipoRecomendacion() {
		return idtipoRecomendacion;
	}

	public void setIdtipoRecomendacion(int idtipoRecomendacion) {
		this.idtipoRecomendacion = idtipoRecomendacion;
	}

	public String getTreComendacion() {
		return treComendacion;
	}

	public void setTreComendacion(String treComendacion) {
		this.treComendacion = treComendacion;
	}

	
}
