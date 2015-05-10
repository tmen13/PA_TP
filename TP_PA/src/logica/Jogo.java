package logica;

import java.util.ArrayList;

import estados.Estado;

public class Jogo {
	Jogador jogador;
	ArrayList<Carta> cartas;
	ArrayList<Cubo> reserva;
	int capital = 30;
	Estado estado;
	
	public ArrayList<Cubo> getReserva() {
		return reserva;
	}

	public Jogo() {
		super();
	}

	public Estado getE() {
		return estado;
	}

	public void setE(Estado e) {
		this.estado = e;
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
	
	public Planeta getPlaneta(){
		return null;
	}
	
	public Carta getCarta(){
		return null;
		
	}
	
}
