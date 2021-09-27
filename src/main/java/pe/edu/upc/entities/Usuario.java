package pe.edu.upc.entities;

import javax.persistence.Entity;

import java.util.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Usuario")
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idUsuario;
	
	
	@Column(name = "nombreUsuario", length = 60, nullable = false)
	private String nombreUsuario;
	
	@Column(name = "correoUsuario", length = 100, nullable = false)
	private String correoUsuario;
	
	@Column(name = "estadoUsuario", length = 60, nullable = false)
	private String estadoUsuario;
	
	@Column(name = "telefonoUsuario", length = 60, nullable = false)
	private String telefonoUsuario;
	
	@Column(name = "contrasenaUsuario", length = 60, nullable = false)
	private String contrasenaUsuario;
	
	@Column(name = "disTrito", length = 45, nullable = false)
	private String disTrito;
	
	@Column(name = "fechaRegistro", length = 60, nullable = false)
	private Date fechaRegistro;
	
	@Column(name = "imagenUsuario", length = 300, nullable = true)
	private String imagenUsuario;
	
	@ManyToOne
	@JoinColumn(name = "idTipousuario", nullable = false)
	private TipoUsuarioEntities tipoUsuario;

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
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

	public String getContrasenaUsuario() {
		return contrasenaUsuario;
	}

	public void setContrasenaUsuario(String contrasenaUsuario) {
		this.contrasenaUsuario = contrasenaUsuario;
	}

	public String getDisTrito() {
		return disTrito;
	}

	public void setDisTrito(String disTrito) {
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

	public TipoUsuarioEntities getTipoUsuario() {
		return tipoUsuario;
	}

	public void setTipoUsuario(TipoUsuarioEntities tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}
	
	

	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Usuario(int idUsuario, String nombreUsuario, String correoUsuario, String estadoUsuario,
			String telefonoUsuario, String contrasenaUsuario, String disTrito, Date fechaRegistro, String imagenUsuario,
			TipoUsuarioEntities tipoUsuario) {
		super();
		this.idUsuario = idUsuario;
		this.nombreUsuario = nombreUsuario;
		this.correoUsuario = correoUsuario;
		this.estadoUsuario = estadoUsuario;
		this.telefonoUsuario = telefonoUsuario;
		this.contrasenaUsuario = contrasenaUsuario;
		this.disTrito = disTrito;
		this.fechaRegistro = fechaRegistro;
		this.imagenUsuario = imagenUsuario;
		this.tipoUsuario = tipoUsuario;
	}

	@Override
	public int hashCode() {
		return Objects.hash(contrasenaUsuario, correoUsuario, disTrito, estadoUsuario, fechaRegistro, idUsuario,
				imagenUsuario, nombreUsuario, telefonoUsuario, tipoUsuario);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return Objects.equals(contrasenaUsuario, other.contrasenaUsuario)
				&& Objects.equals(correoUsuario, other.correoUsuario) && Objects.equals(disTrito, other.disTrito)
				&& Objects.equals(estadoUsuario, other.estadoUsuario)
				&& Objects.equals(fechaRegistro, other.fechaRegistro) && idUsuario == other.idUsuario
				&& Objects.equals(imagenUsuario, other.imagenUsuario)
				&& Objects.equals(nombreUsuario, other.nombreUsuario)
				&& Objects.equals(telefonoUsuario, other.telefonoUsuario)
				&& Objects.equals(tipoUsuario, other.tipoUsuario);
	}

	
	

}
