package pe.edu.upc.Controller;

import java.io.Serializable;
import java.util.Optional;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entities.Usuario;
import pe.edu.upc.serviceimpl.UsuarioServiceImpl;

@Named
@ViewScoped
public class LoginController implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
 
	@Inject
	private UsuarioServiceImpl uS;
	
	private Usuario user;
	
	@PostConstruct
	public void init() {
		this.user = new Usuario();
	}
	
	public String authentication() {
		String redirect = null;
		
		try {
			Optional<Usuario> userFound = this.uS.authentication(user);
			if(userFound.isPresent() && userFound.get().getEstadoUsuario().equalsIgnoreCase("A")) {
			FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("user", userFound.get());
			redirect = "/panel?faces-redirect=true";
			}else {
				FacesContext.getCurrentInstance().addMessage(null,
						new FacesMessage(FacesMessage.SEVERITY_WARN, "Aviso", "Credenciales incorrectas"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return redirect;
	}

	public Usuario getUser() {
		return user;
	}

	public void setUser(Usuario user) {
		this.user = user;
	}
}
