package pe.edu.upc.Controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entities.DistritoEntities;
import pe.edu.upc.service.IDistritoService;

@Named // #1
@RequestScoped // #2
public class DistritoController implements Serializable {
	private static final long serialVersionUID = 1L;
	@Inject // #3
	private IDistritoService dService;
	private DistritoEntities distritoCenter;
	List<DistritoEntities> listaDistrito;

	@PostConstruct // #6
	public void init() { // #5
		this.listaDistrito = new ArrayList<DistritoEntities>();
		this.distritoCenter = new DistritoEntities();
		this.list();
	}

	public String newDistrito() { // #7
		this.setDistritoCenter(new DistritoEntities());
		return "distrito.xhtml";
	}

	public void insert() { // #8
		try {
			dService.insert(distritoCenter);
			this.list();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public void eliminar(DistritoEntities dist) {
		try {
			dService.eliminar(dist.getIdDistrito());
			list();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public void list() { // #9
		try {
			listaDistrito = dService.list();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public void clean() {
		this.init();
	}

	public void findByName() {
		try {
			if (distritoCenter.getNombreDistrito().isEmpty()) {
				this.list();
			} else {
				listaDistrito = this.dService.finByNameDistrito(this.getDistritoCenter());
			}
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public void modificar() {
		try {
			dService.modificar(this.distritoCenter);
			this.list();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public String Modifpre(DistritoEntities spec) {
		this.setDistritoCenter(spec);
		return "distritomod.xhtml";
	}

	public DistritoEntities getDistritoCenter() {
		return distritoCenter;
	}

	public void setDistritoCenter(DistritoEntities distritoCenter) {
		this.distritoCenter = distritoCenter;
	}

	public List<DistritoEntities> getListaDistrito() {
		return listaDistrito;
	}

	public void setListaDistrito(List<DistritoEntities> listaDistrito) {
		this.listaDistrito = listaDistrito;
	}

}
