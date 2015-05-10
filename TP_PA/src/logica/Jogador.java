package logica;

public class Jogador {
	String nome;
	int pontuacao = 0;
	int capital = 10;
	Nave nave;
		
	public Jogador() {
		super();
		nave = new Nave();
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getPontuacao() {
		return pontuacao;
	}
	public void setPontuacao(int pontuacao) {
		this.pontuacao = pontuacao;
	}
	public int getCapital() {
		return capital;
	}
	public void setCapital(int capital) {
		this.capital = capital;
	}
	public Nave getNave() {
		return nave;
	}
}
