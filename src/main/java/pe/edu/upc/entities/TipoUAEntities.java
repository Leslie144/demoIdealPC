package pe.edu.upc.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tipoUa")
public class TipoUAEntities {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Cid_tipo_ua;
	
	@Column(name = "Ntipo_ua", length = 100, nullable = false)
	private String Ntipo_ua;

	public TipoUAEntities() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TipoUAEntities(int cid_tipo_ua, String ntipo_ua) {
		super();
		Cid_tipo_ua = cid_tipo_ua;
		Ntipo_ua = ntipo_ua;
	}

	//Getters and setters
	public int getCid_tipo_ua() {
		return Cid_tipo_ua;
	}

	public void setCid_tipo_ua(int cid_tipo_ua) {
		Cid_tipo_ua = cid_tipo_ua;
	}

	public String getNtipo_ua() {
		return Ntipo_ua;
	}

	public void setNtipo_ua(String ntipo_ua) {
		Ntipo_ua = ntipo_ua;
	}
}
