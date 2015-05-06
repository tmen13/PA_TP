package logica;

public abstract class Carta {
	int posX, posY;
	Nave nave;
	public int getPosX() {
		return posX;
	}
	public void setPosX(int posX) {
		this.posX = posX;
	}
	public int getPosY() {
		return posY;
	}
	public void setPosY(int posY) {
		this.posY = posY;
	}
	public Nave getNave() {
		return nave;
	}
	public void setNave(Nave nave) {
		this.nave = nave;
	}
}
