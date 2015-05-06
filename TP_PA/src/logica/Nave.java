package logica;

import java.util.ArrayList;


public class Nave implements Constantes {
	 int capacidade = 2;
	 int forca = 3;
	 ArrayList<Mercadoria> mercadorias;
	 
	 public void addMerc(Mercadoria merc){
		 mercadorias.add(merc);
	 }
	 	 
	public Nave() {
		super();
	}
	public int getCapacidade() {
		return capacidade;
	}
	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}
	public int getForca() {
		return forca;
	}
	public void setForca(int forca) {
		this.forca = forca;
	}	 
}
