package logica;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import estados.*;

public class Jogo {
	private Jogador jogador;
	private ArrayList<Carta> cartas = new ArrayList<Carta>();
	private ArrayList<Cubo> reserva = new ArrayList<Cubo>();
	private ArrayList<String> coresDado = new ArrayList<String>();
	private int capital = 30;
	private Estado estado;

	public ArrayList<Cubo> getReserva() {
		return reserva;
	}

	public Jogo() {
		super();
		coresDado.add("branco");
		coresDado.add("branco");
		coresDado.add("vermelho");
		coresDado.add("amarelo");
		coresDado.add("preto");
		coresDado.add("azul");
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

	public Carta getCarta(int pos){
		return cartas.get(pos);		
	}

	public boolean configuraJogo(){
		criaTabuleiro();
		criaCubos();

		return true;
	}

	public int dadoPreto(){
		Random rd = new Random();
		return rd.nextInt(7-1)+1;
	}

	public String dadoColorido(){
		Random rd = new Random();		
		return coresDado.get(rd.nextInt(coresDado.size()-0)+0);	
	}

	private void criaCubos() {
		reserva.clear();
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
		cartas.clear();
		cartas.add(new BuracoNegro());
		cartas.add(new BuracoNegro());

		for(int i = 0;i<12;i++)
			cartas.add(new Vazia());

		cartas.add(new Planeta("Gethen", 3, 1, 2, false,this));
		cartas.add(new Planeta("Kiber", 1, 3, 2, false,this));
		cartas.add(new Planeta("Reverie", 2, 1, 3, false,this));
		cartas.add(new Planeta("Tiamat", 2, 3, 1, false,this));
		cartas.add(new Planeta("Lamarckia", 3, 2, 1, false,this));
		cartas.add(new Planeta("Arrakis", 1, 2, 3, false,this));

		cartas.add(new Planeta("Whirl", 3, 0, 0, true,this));
		cartas.add(new Planeta("Striterax", 0, 0, 3, true,this));
		cartas.add(new Planeta("Aspeta", 0, 3, 0, true,this));

		Collections.shuffle(cartas);
		cartas.add(0, new BuracoNegro());
		cartas.add(cartas.size(), new BuracoNegro());
		getCarta(0).setNave(jogador.getNave());
	}

	//fun�oes para os estados
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

	public Estado explora(){
		return new aguardaReabastecer(this);    	
	}
}