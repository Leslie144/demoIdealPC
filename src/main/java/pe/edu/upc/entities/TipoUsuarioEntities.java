package pe.edu.upc.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TIPO_USUARIO")
public class TipoUsuarioEntities {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Cid_tipo_usuario;

	@Column(name = "Ntipo_usuario", length = 50, nullable = false)
	private String Ntipo_usuario;

	public TipoUsuarioEntities() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TipoUsuarioEntities(int cid_tipo_usuario, String ntipo_usuario) {
		super();
		Cid_tipo_usuario = cid_tipo_usuario;
		Ntipo_usuario = ntipo_usuario;
	}
	
	//Getters and setters
	public int getCid_tipo_usuario() {
		return Cid_tipo_usuario;
	}

	public void setCid_tipo_usuario(int cid_tipo_usuario) {
		Cid_tipo_usuario = cid_tipo_usuario;
	}

	public String getNtipo_usuario() {
		return Ntipo_usuario;
	}

	public void setNtipo_usuario(String ntipo_usuario) {
		Ntipo_usuario = ntipo_usuario;
	}
}
