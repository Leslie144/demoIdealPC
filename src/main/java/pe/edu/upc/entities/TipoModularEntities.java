package pe.edu.upc.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TIPO_MODULAR")
public class TipoModularEntities {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int Cid_tipo_modular;
	
	@Column (name = "NTipo_modular",length=100,nullable=false)
	private String Ntipo_modular;
	
	public TipoModularEntities() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public TipoModularEntities(int cid_tipo_modular, String ntipo_modular) {
		super();
		Cid_tipo_modular = cid_tipo_modular;
		Ntipo_modular = ntipo_modular;
	}
	
	//Getters and setters
	public int getCid_tipo_modular() {
		return Cid_tipo_modular;
	}

	public void setCid_tipo_modular(int cid_tipo_modular) {
		Cid_tipo_modular = cid_tipo_modular;
	}

	public String getNtipo_modular() {
		return Ntipo_modular;
	}

	public void setNtipo_modular(String ntipo_modular) {
		Ntipo_modular = ntipo_modular;
	}
}
