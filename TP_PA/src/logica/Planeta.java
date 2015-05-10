package logica;

import java.util.ArrayList;

public class Planeta extends Carta {
	String nome;
	ArrayList<Cubo> cubos = new ArrayList<Cubo>();
	int precoComida, precoAgua, precoMed, precoIlegal = 3;
	boolean isPirata = false;	
	Jogo jogo;
	
	public Planeta(String nome, int precoComida, int precoAgua, int precoMed,
			boolean isPirata, Jogo j) {
		super();
		this.nome = nome;
		this.precoComida = precoComida;
		this.precoAgua = precoAgua;
		this.precoMed = precoMed;
		this.isPirata = isPirata;
		this.jogo = j;
		cubos.clear();
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getPrecoComida() {
		return precoComida;
	}
	public void setPrecoComida(int precoComida) {
		this.precoComida = precoComida;
	}
	public boolean isPirata() {
		return isPirata;
	}
	public void setPirata(boolean isPirata) {
		this.isPirata = isPirata;
	}
	public int getPrecoAgua() {
		return precoAgua;
	}
	public void setPrecoAgua(int precoAgua) {
		this.precoAgua = precoAgua;
	}
	public int getPrecoMed() {
		return precoMed;
	}
	public void setPrecoMed(int precoMed) {
		this.precoMed = precoMed;
	}
	public int getPrecoIlegal() {
		return precoIlegal;
	}
	public void setPrecoIlegal(int precoIlegal) {
		this.precoIlegal = precoIlegal;
	}
	
	 public void addMerc(Mercadoria merc){
		 cubos.add(merc);
	 }
	 
	 public void removeMerc(Mercadoria merc){
		 cubos.remove(merc);
		 jogo.getReserva().add(merc);
	 }
	
	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		if(!isPirata()){
			str.append("Nome: " + nome + "\n");
			str.append("Água: " + precoAgua + "\n");
			str.append("Comida: " + precoComida + "\n");
			str.append("Medicamento: " + precoMed + "\n");
			str.append("Ilegal: " + precoIlegal);
			if(cubos.isEmpty())
				str.append("\n(sem mercadoria)\n");
			else {
				for(Cubo m : cubos){
					m.getClass().toString();
				}
			}
		} else {
			str.append("Nome: " + nome + "\n");
			if(precoAgua != 0)
				str.append("Água: " + precoAgua + "\n");
			if(precoComida != 0)
				str.append("Comida: " + precoComida + "\n");
			if(precoMed != 0)
				str.append("Medicamento: " + precoMed);
			if(cubos.isEmpty())
				str.append("(sem mercadoria)\n");
			else {
				for(Cubo m : cubos){
					m.getClass().toString();
				}
			}
		}
		return str.toString();
	}
}
