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
	private int Cid_tipo_recomendacion;

	@Column(name = "Trecomendacion", length = 100, nullable = false)
	private String Trecomendacion;

	public TipoRecomendacionEntities() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TipoRecomendacionEntities(int cid_tipo_recomendacion, String trecomendacion) {
		super();
		Cid_tipo_recomendacion = cid_tipo_recomendacion;
		Trecomendacion = trecomendacion;
	}

	// Getters and setters
	public int getCid_tipo_recomendacion() {
		return Cid_tipo_recomendacion;
	}

	public void setCid_tipo_recomendacion(int cid_tipo_recomendacion) {
		Cid_tipo_recomendacion = cid_tipo_recomendacion;
	}

	public String getTrecomendacion() {
		return Trecomendacion;
	}

	public void setTrecomendacion(String trecomendacion) {
		Trecomendacion = trecomendacion;
	}
}
