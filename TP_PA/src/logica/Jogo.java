package logica;

import java.util.ArrayList;
import java.util.Collections;

import estados.*;

public class Jogo {
	Jogador jogador;
	ArrayList<Carta> cartas = new ArrayList<Carta>();
	ArrayList<Cubo> reserva = new ArrayList<Cubo>();
	int capital = 30;
	Estado estado;
	
	public ArrayList<Cubo> getReserva() {
		return reserva;
	}

	public Jogo() {
		super();
		jogador = new Jogador();
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
	
	public void configuraJogo(){
		criaTabuleiro();
		criaCubos();
	}
	
    private void criaCubos() {
		for(int i = 0;i<10;i++)
			reserva.add(new Comida());
		
		for(int i = 0;i<10;i++)
			reserva.add(new Agua());
		
		for(int i = 0;i<10;i++)
			reserva.add(new Medicamento());
		
		for(int i = 0;i<6;i++)
			reserva.add(new Ilegal());
		
		for(int i = 0;i<6;i++)
			reserva.add(new Branco());
	}

	private void criaTabuleiro() {		
		cartas.add(new BuracoNegro());
		cartas.add(new BuracoNegro());
		
		for(int i = 0;i<12;i++)
			cartas.add(new Vazia());

		cartas.add(new Planeta("Gethen", 3, 1, 2, false));
		cartas.add(new Planeta("Kiber", 1, 3, 2, false));
		cartas.add(new Planeta("Reverie", 2, 1, 3, false));
		cartas.add(new Planeta("Tiamat", 2, 3, 1, false));
		cartas.add(new Planeta("Lamarckia", 3, 2, 1, false));
		cartas.add(new Planeta("Arrakis", 1, 2, 3, false));
		
		cartas.add(new Planeta("Whirl", 3, 0, 0, true));
		cartas.add(new Planeta("Striterax", 0, 0, 3, true));
		cartas.add(new Planeta("Aspeta", 0, 3, 0, true));
		
		Collections.shuffle(cartas);
		cartas.add(0, new BuracoNegro());
		cartas.add(cartas.size(), new BuracoNegro());		
	}

	//funçoes para os estados
	public void desistir() {
        setEstado(getEstado().desistir());
    }
    
    public void defineNomeJogador(String nome) {
    	getJogador().setNome(nome);
        setEstado(getEstado().defineNomeJogador(nome));
    }

    public void comecarJogo() {
        setEstado(getEstado().comecaJogo());
    }	
}