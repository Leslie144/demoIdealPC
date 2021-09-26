package pe.edu.upc.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tamanoMb")
public class TamanoMBEntities {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cIdTamanoMB;
	
	@Column(name = "nTamanoMB", length = 100, nullable = false)
	private String nTamanoMB;

	public TamanoMBEntities() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TamanoMBEntities(int cIdTamanoMB, String nTamanoMB) {
		super();
		this.cIdTamanoMB = cIdTamanoMB;
		this.nTamanoMB = nTamanoMB;
	}

	//Getters and setters

	public int getcIdTamanoMB() {
		return cIdTamanoMB;
	}

	public void setcIdTamanoMB(int cIdTamanoMB) {
		this.cIdTamanoMB = cIdTamanoMB;
	}

	public String getnTamanoMB() {
		return nTamanoMB;
	}

	public void setnTamanoMB(String nTamanoMB) {
		this.nTamanoMB = nTamanoMB;
	}

	
	
}