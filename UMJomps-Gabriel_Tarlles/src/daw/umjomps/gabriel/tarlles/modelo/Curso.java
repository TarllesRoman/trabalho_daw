package daw.umjomps.gabriel.tarlles.modelo;

import java.util.List;

public class Curso {
	private String codcurso;
	private String nome;
	private String siglacurso;
	private int numvagas;
	private int totalinscritos;
	private List<Candidato> candidatos;
	private List<Sala> salas;
	public String getCodcurso() {
		return codcurso;
	}
	public void setCodcurso(String codcurso) {
		this.codcurso = codcurso;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSiglacurso() {
		return siglacurso;
	}
	public void setSiglacurso(String siglacurso) {
		this.siglacurso = siglacurso;
	}
	public int getNumvagas() {
		return numvagas;
	}
	public void setNumvagas(int numvagas) {
		this.numvagas = numvagas;
	}
	public int getTotalinscritos() {
		return totalinscritos;
	}
	public void setTotalinscritos(int totalinscritos) {
		this.totalinscritos = totalinscritos;
	}
	public List<Candidato> getCandidatos() {
		return candidatos;
	}
	public void setCandidatos(List<Candidato> candidatos) {
		this.candidatos = candidatos;
	}
	public List<Sala> getSalas() {
		return salas;
	}
	public void setSalas(List<Sala> salas) {
		this.salas = salas;
	}
	@Override
	public String toString() {
		return String.format(
				"Curso [codcurso=%s, nome=%s, siglacurso=%s, numvagas=%s, totalinscritos=%s, candidatos=%s, salas=%s]",
				codcurso, nome, siglacurso, numvagas, totalinscritos, candidatos, salas);
	}
}
