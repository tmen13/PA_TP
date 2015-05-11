package logica;

import java.util.ArrayList;


public class Nave implements Constantes {
	 int capacidade = 2;
	 int forca = 3;
	 ArrayList<Mercadoria> mercadorias = new ArrayList<Mercadoria>();
	 
	 public void addMerc(Mercadoria merc){
		 mercadorias.add(merc);
	 }
	 
	 public ArrayList<Mercadoria> getMercadorias() {
		return mercadorias;
	}

	public void removeMerc(Mercadoria merc){
		 mercadorias.remove(merc);
	 }
	 	 
	public Nave() {
		super();
		mercadorias.clear();
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
	
	public String toString(){
		StringBuilder str = new StringBuilder();
		str.append("NAVE \n");
		str.append("Capacidade: " + capacidade + "\n");
		str.append("Força: " + forca + "\n");
		if(mercadorias.isEmpty())
			str.append("\n(sem mercadoria)\n");
		else {
			for(Mercadoria m : mercadorias){
				m.getClass().toString();
			}
		}
		return str.toString();
	}
}
