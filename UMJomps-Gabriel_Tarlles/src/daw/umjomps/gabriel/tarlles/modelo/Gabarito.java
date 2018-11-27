package daw.umjomps.gabriel.tarlles.modelo;

public class Gabarito {
	private int numeroquestao;
	private char resposta;
	public int getNumeroquestao() {
		return numeroquestao;
	}
	public void setNumeroquestao(int numeroquestao) {
		this.numeroquestao = numeroquestao;
	}
	public char getResposta() {
		return resposta;
	}
	public void setResposta(char resposta) {
		this.resposta = resposta;
	}
	@Override
	public String toString() {
		return String.format("Gabarito [numeroquestao=%s, resposta=%s]", numeroquestao, resposta);
	}
}
