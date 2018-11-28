package daw.umjomps.gabriel.tarlles.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.UniqueConstraint;

import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.br.CPF;

@Entity
public class Login {
	@Id
	private long id;//Usar apenas enquanto é a unca classe
	
	@CPF
	private String cpf;
	@NotEmpty(message="O usuario deve possuir uma senha")
	private String senha;
	@NotEmpty(message="O usuario deve ter um perfil")
	private String perfil;
	
	public String getCPF() {
		return cpf;
	}
	public void setCPF(String cpf) {
		this.cpf = cpf;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getPerfil() {
		return perfil;
	}
	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}
	@Override
	public String toString() {
		return String.format("Login [CPF=%s, senha=%s, perfil=%s]", cpf, senha, perfil);
	}
}
