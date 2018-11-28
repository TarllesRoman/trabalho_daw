package daw.umjomps.gabriel.tarlles.beans;


import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import daw.umjomps.gabriel.tarlles.modelo.Login;
import daw.upa.tarlles.dao.DAO;

@ManagedBean
@SessionScoped
public class LoginBean {
	private Login usuario = new Login();
		
	public String efetuarLogin() {
		DAO<Login> dao = new DAO<>(Login.class);
		usuario = dao.login(usuario.getCPF(), usuario.getSenha());
		if(usuario != null) {
			return "index?faces-redirect=true";
		}else {
			usuario = new Login();
			return "login?faces-redirect=true";
		}
	}
	
	public String logout() {
		usuario = new Login();
		return "login?faces-redirect=true";
	}
	
	
	public Login getUsuario() {
		return usuario;
	}

	public void setUsuario(Login usuario) {
		this.usuario = usuario;
	}

	public boolean isLogado() {
		return usuario.getCPF() != null;
	}
}