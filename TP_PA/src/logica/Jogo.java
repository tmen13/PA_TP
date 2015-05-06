package logica;

import java.util.ArrayList;

public class Jogo {
	Jogador jogador;
	ArrayList<Carta> cartas;
	ArrayList<Cubo> reserva;
	int capital = 30;
	
	public Jogo() {
		super();
	}

	public Jogador getJogador() {
		return jogador;
	}

	public void setJogador(Jogador jogador) {
		this.jogador = jogador;
	}

	public int getCapital() {
		return capital;
	}

	public void setCapital(int capital) {
		this.capital = capital;
	}
	
	
}
