package pe.edu.upc.entities;

import javax.persistence.Entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Usuario")
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idUsuario;

	@Column(name = "tipoUsuario", nullable = false)
	private int tipoUsuario;
	
	@Column(name = "nombreUsuario", length = 60, nullable = false)
	private String nombreUsuario;
	
	@Column(name = "correoUsuario", length = 100, nullable = false)
	private String correoUsuario;
	
	@Column(name = "estadoUsuario", length = 60, nullable = false)
	private String estadoUsuario;
	
	@Column(name = "telefonoUsuario", length = 60, nullable = false)
	private String telefonoUsuario;
	
	@Column(name = "contraseñaUsuario", length = 60, nullable = false)
	private String contraseñaUsuario;
	
	@Column(name = "disTrito", length = 45, nullable = false)
	private int disTrito;
	
	@Column(name = "fechaRegistro", length = 60, nullable = false)
	private Date fechaRegistro;
	
	@Column(name = "imagenUsuario", length = 300, nullable = false)
	private String imagenUsuario;

	public Usuario() {
		super();
	}

	public Usuario(int idUsuario, int tipoUsuario,int disTrito ,String nombreUsuario, String correoUsuario, String estadoUsuario,String telefonoUsuario, String contraseñaUsuario,Date fechaRegistro, String imagenUsuario) {
		super();
		this.idUsuario=idUsuario;
		this.tipoUsuario=tipoUsuario;
		this.nombreUsuario=nombreUsuario;
		this.correoUsuario=correoUsuario;
		this.estadoUsuario=estadoUsuario;
		this.telefonoUsuario=telefonoUsuario;
		this.contraseñaUsuario=contraseñaUsuario;
		this.disTrito=disTrito;
		this.fechaRegistro=fechaRegistro;
		this.imagenUsuario=imagenUsuario;
		
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public int getTipoUsuario() {
		return tipoUsuario;
	}

	public void setTipoUsuario(int tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getCorreoUsuario() {
		return correoUsuario;
	}

	public void setCorreoUsuario(String correoUsuario) {
		this.correoUsuario = correoUsuario;
	}

	public String getEstadoUsuario() {
		return estadoUsuario;
	}

	public void setEstadoUsuario(String estadoUsuario) {
		this.estadoUsuario = estadoUsuario;
	}

	public String getTelefonoUsuario() {
		return telefonoUsuario;
	}

	public void setTelefonoUsuario(String telefonoUsuario) {
		this.telefonoUsuario = telefonoUsuario;
	}

	public String getContraseñaUsuario() {
		return contraseñaUsuario;
	}

	public void setContraseñaUsuario(String contraseñaUsuario) {
		this.contraseñaUsuario = contraseñaUsuario;
	}

	public int getDisTrito() {
		return disTrito;
	}

	public void setDisTrito(int disTrito) {
		this.disTrito = disTrito;
	}

	public Date getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	public String getImagenUsuario() {
		return imagenUsuario;
	}

	public void setImagenUsuario(String imagenUsuario) {
		this.imagenUsuario = imagenUsuario;
	}

	

	
	
	

}
