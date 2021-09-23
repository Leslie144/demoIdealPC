package pe.edu.upc.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tipoUsuario")
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
	public int getcidTipoUsuario() {
		return Cid_tipo_usuario;
	}

	public void setcidTipoUsuario(int cid_tipo_usuario) {
		Cid_tipo_usuario = cid_tipo_usuario;
	}

	public String getnTipoUsuario() {
		return Ntipo_usuario;
	}

	public void setnTipoUsuario(String ntipo_usuario) {
		Ntipo_usuario = ntipo_usuario;
	}
}
