package daw.umjomps.gabriel.tarlles.modelo;

public class Login {
	private String CPF;
	private String senha;
	private String perfil;
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
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
		return String.format("Login [CPF=%s, senha=%s, perfil=%s]", CPF, senha, perfil);
	}
}
