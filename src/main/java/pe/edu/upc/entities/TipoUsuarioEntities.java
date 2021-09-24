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
	private int idTipousuario;

	@Column(name = "nTipousuario", length = 50, nullable = false)
	private String nTipousuario;

	public TipoUsuarioEntities() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TipoUsuarioEntities(int idTipousuario, String nTipousuario) {
		super();
		this.idTipousuario = idTipousuario;
		this.nTipousuario = nTipousuario;
	}
	//Getters and setters

	public int getIdTipousuario() {
		return idTipousuario;
	}

	public void setIdTipousuario(int idTipousuario) {
		this.idTipousuario = idTipousuario;
	}

	public String getnTipousuario() {
		return nTipousuario;
	}

	public void setnTipousuario(String nTipousuario) {
		this.nTipousuario = nTipousuario;
	}

	
	
}
