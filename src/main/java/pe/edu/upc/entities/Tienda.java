package pe.edu.upc.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="tienda")
public class Tienda {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idTienda;
	
	@ManyToOne
	@JoinColumn(name = "idDistrito",  nullable = false)
	private DistritoEntities distrito;
	
	@Column(name = "direccionTienda", length = 45, nullable = false)
	private String direccionTienda;
	
	@Column(name = "nombreTienda", length = 45, nullable = false)
	private String nombreTienda;
	
	@Column(name = "telefonoTienda",  nullable = false)
	private int telefonoTienda;
	
	@Column(name = "webTienda", length = 45, nullable = false)
	private String webTienda;
	
	private Date fechaRegistrotienda;
	
	public Tienda() {
		super();
	}
	public Tienda( int idTienda,DistritoEntities distrito,String direccionTienda,String nombreTienda,int telefonoTienda,String webTienda,Date fechaRegistrotienda) {
		super();
		this.idTienda=idTienda;
		this.distrito=distrito;
		this.direccionTienda=direccionTienda;
		this.nombreTienda=nombreTienda;
		this.telefonoTienda=telefonoTienda;
		this.webTienda=webTienda;
		this.fechaRegistrotienda=fechaRegistrotienda;
	}
	public int getIdTienda() {
		return idTienda;
	}
	public void setIdTienda(int idTienda) {
		this.idTienda = idTienda;
	}
	public DistritoEntities getDistrito() {
		return distrito;
	}
	public void setDistrito(DistritoEntities distrito) {
		this.distrito = distrito;
	}
	public String getDireccionTienda() {
		return direccionTienda;
	}
	public void setDireccionTienda(String direccionTienda) {
		this.direccionTienda = direccionTienda;
	}
	public String getNombreTienda() {
		return nombreTienda;
	}
	public void setNombreTienda(String nombreTienda) {
		this.nombreTienda = nombreTienda;
	}
	public int getTelefonoTienda() {
		return telefonoTienda;
	}
	public void setTelefonoTienda(int telefonoTienda) {
		this.telefonoTienda = telefonoTienda;
	}
	public String getWebTienda() {
		return webTienda;
	}
	public void setWebTienda(String webTienda) {
		this.webTienda = webTienda;
	}
	public Date getFechaRegistrotienda() {
		return fechaRegistrotienda;
	}
	public void setFechaRegistrotienda(Date fechaRegistrotienda) {
		this.fechaRegistrotienda = fechaRegistrotienda;
	}
	
	
	
	
	
}
