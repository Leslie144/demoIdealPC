package pe.edu.upc.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Tienda")
public class Tienda {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idTienda;
	
	@ManyToOne
	@JoinColumn(name = "idDistrito",  nullable = false)
	private DistritoEntities idDistrito;
	
	@Column(name = "direccionTienda", length = 45, nullable = false)
	private int direccionTienda;
	
	@Column(name = "nombreTienda", length = 45, nullable = false)
	private int nombreTienda;
	
	@Column(name = "telefonoTienda", length = 45, nullable = false)
	private int telefonoTienda;
	
	@Column(name = "webTienda", length = 45, nullable = false)
	private int webTienda;
	
	@Column(name = "fechaRegistrotienda", length = 45, nullable = false)
	private int fechaRegistrotienda;
	
	public Tienda() {
		super();
	}
	public Tienda( int idTienda,DistritoEntities idDistrito,int direccionTienda,int nombreTienda,int telefonoTienda,int webTienda,int fechaRegistrotienda) {
		super();
		this.idTienda=idTienda;
		this.idDistrito=idDistrito;
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
	public DistritoEntities getIdDistrito() {
		return idDistrito;
	}
	public void setIdDistrito(DistritoEntities idDistrito) {
		this.idDistrito = idDistrito;
	}
	public int getDireccionTienda() {
		return direccionTienda;
	}
	public void setDireccionTienda(int direccionTienda) {
		this.direccionTienda = direccionTienda;
	}
	public int getNombreTienda() {
		return nombreTienda;
	}
	public void setNombreTienda(int nombreTienda) {
		this.nombreTienda = nombreTienda;
	}
	public int getTelefonoTienda() {
		return telefonoTienda;
	}
	public void setTelefonoTienda(int telefonoTienda) {
		this.telefonoTienda = telefonoTienda;
	}
	public int getWebTienda() {
		return webTienda;
	}
	public void setWebTienda(int webTienda) {
		this.webTienda = webTienda;
	}
	public int getFechaRegistrotienda() {
		return fechaRegistrotienda;
	}
	public void setFechaRegistrotienda(int fechaRegistrotienda) {
		this.fechaRegistrotienda = fechaRegistrotienda;
	}
	
	
	
}
