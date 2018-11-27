package daw.umjomps.gabriel.tarlles.modelo;

public class Sala {
	private int codsala;
	private int capacidade;
	private Curso curso;
	public int getCodsala() {
		return codsala;
	}
	public void setCodsala(int codsala) {
		this.codsala = codsala;
	}
	public int getCapacidade() {
		return capacidade;
	}
	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}
	public Curso getCurso() {
		return curso;
	}
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	@Override
	public String toString() {
		return String.format("Sala [codsala=%s, capacidade=%s, curso=%s]", codsala, capacidade, curso);
	}
}
