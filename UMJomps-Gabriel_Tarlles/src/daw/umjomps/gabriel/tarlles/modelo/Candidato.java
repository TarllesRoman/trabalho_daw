package daw.umjomps.gabriel.tarlles.modelo;

import java.util.Calendar;

public class Candidato {
	private String numinscricao;
	private String CPF;
	private String nome;
	private Calendar datanascimento;
	private String rua;
	private int numero;
	private String complemento;
	private String bairro;
	private String cidade;
	private String estado;
	private String CEP;
	private String telefone;
	private Nota nota;
	private String respostaprova;
	private int totalpontos;
	public String getNuminscricao() {
		return numinscricao;
	}
	public void setNuminscricao(String numinscricao) {
		this.numinscricao = numinscricao;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Calendar getDatanascimento() {
		return datanascimento;
	}
	public void setDatanascimento(Calendar datanascimento) {
		this.datanascimento = datanascimento;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getCEP() {
		return CEP;
	}
	public void setCEP(String cEP) {
		CEP = cEP;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public Nota getNota() {
		return nota;
	}
	public void setNota(Nota nota) {
		this.nota = nota;
	}
	public String getRespostaprova() {
		return respostaprova;
	}
	public void setRespostaprova(String respostaprova) {
		this.respostaprova = respostaprova;
	}
	public int getTotalpontos() {
		return totalpontos;
	}
	public void setTotalpontos(int totalpontos) {
		this.totalpontos = totalpontos;
	}
	@Override
	public String toString() {
		return String.format(
				"Candidato [numinscricao=%s, CPF=%s, nome=%s, datanascimento=%s, rua=%s, numero=%s, complemento=%s, bairro=%s, cidade=%s, estado=%s, CEP=%s, telefone=%s, nota=%s, respostaprova=%s, totalpontos=%s]",
				numinscricao, CPF, nome, datanascimento, rua, numero, complemento, bairro, cidade, estado, CEP,
				telefone, nota, respostaprova, totalpontos);
	}
}
