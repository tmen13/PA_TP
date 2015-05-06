package logica;

import java.util.ArrayList;

public abstract class Planeta {
	String nome;
	ArrayList<Cubo> cubos;
	int precoComida, precoAgua, precoMed, precoIlegal;
	
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
}
