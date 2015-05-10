package logica;

import java.util.ArrayList;

import estados.*;

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
		setEstado(new aguardaInicio(this));
	}

	public Estado getEstado() {
		return estado;
	}

	private void setEstado(Estado estado) {
		this.estado = estado;
	}

	public Jogador getJogador() {
		return jogador;
	}

	public void setJogador(Jogador jogador) {
		this.jogador = jogador;
	}

	public ArrayList<Carta> getCartas() {
		return cartas;
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
	
    public void desistir() {
        setEstado(getEstado().desistir());
    }
    
    public void defineNomeJogador(String nome) {
        setEstado(getEstado().defineNomeJogador(nome));
    }

    public void comecarJogo() {
        setEstado(getEstado().comecaJogo());
    }
	
}
