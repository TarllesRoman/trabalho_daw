package daw.umjomps.gabriel.tarlles.modelo;

public class Nota {
	private long id;
	private Candidato candidato;
	private int acertos;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Candidato getCandidato() {
		return candidato;
	}
	public void setCandidato(Candidato candidato) {
		this.candidato = candidato;
	}
	public int getAcertos() {
		return acertos;
	}
	public void setAcertos(int acertos) {
		this.acertos = acertos;
	}
	@Override
	public String toString() {
		return String.format("Nota [id=%s, candidato=%s, acertos=%s]", id, candidato, acertos);
	}
}
