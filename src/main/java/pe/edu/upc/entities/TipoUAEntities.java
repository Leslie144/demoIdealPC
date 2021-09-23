package pe.edu.upc.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TIPO_UA")
public class TipoUAEntities {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idTipoua;
	
	@Column(name = "nTipoua", length = 100, nullable = false)
	private String nTipoua;

	public TipoUAEntities() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TipoUAEntities(int idTipoua, String nTipoua) {
		super();
		this.idTipoua = idTipoua;
		this.nTipoua = nTipoua;
	}

	public int getIdTipoua() {
		return idTipoua;
	}

	public void setIdTipoua(int idTipoua) {
		this.idTipoua = idTipoua;
	}

	public String getnTipoua() {
		return nTipoua;
	}

	public void setnTipoua(String nTipoua) {
		this.nTipoua = nTipoua;
	}

	
}
