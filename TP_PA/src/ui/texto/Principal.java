package ui.texto;

import logica.*;

public class Principal {

	public static void main(String[] args) {
        UITexto uiTexto = new UITexto(new Jogo());
        uiTexto.printMenu();        
	}
}
