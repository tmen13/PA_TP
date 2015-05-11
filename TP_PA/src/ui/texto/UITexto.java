package ui.texto;

import java.util.Scanner;

import logica.Jogo;

public class UITexto {
	
	private Jogo jogo;
    public UITexto(Jogo jogo) {
        this.jogo = jogo;
    }
    
	public void printMenu(){
		boolean verifica = true;
		Scanner sc= new Scanner(System.in);

		System.out.println("Milky Way Express GameBoard");
		System.out.println("Introduza o nome de jogador");
		String nome = sc.nextLine();
		jogo.defineNomeJogador(nome);
		jogo.comecarJogo();

		while(verifica){
			System.out.println(jogo.getEstado());
			System.out.println("Selecione uma das seguintes opcoes:");
			System.out.println("1-Novo Jogo (desistir)");
			System.out.println("2-Explorar");
			System.out.println("3-Reabastecer Mercado");
			System.out.println("4-Vender Mercadorias");
			System.out.println("5-Comprar Mercadorias");
			System.out.println("6-Melhorar armas da nave");
			System.out.println("7-Aumentar capacidade da nave");
			System.out.println("8-Ver mapa");
			System.out.println("9-Mover");
			System.out.println("0-sair");
			int opcao=sc.nextInt();
			switch(opcao){
			case 1: //novo jogo
				System.out.println("Desistiu...");
				System.out.println("A sua Pontuação foi: " + jogo.getJogador().getPontuacao());
				System.out.println("Começando novo Jogo...");
				jogo.desistir();
				jogo.configuraJogo();
				jogo.comecarJogo();
				break;
			case 2: //explorar
				jogo.explora();
				mostraTabuleiro(jogo);
				break;
			case 3: //reabastecer mercado
				jogo.reabastecer();
				break;
			case 4: //vender mercadorias
				if(jogo.getJogador().getNave().getMercadorias().isEmpty())
					jogo.naoVende();
				System.out.println("selecione a mercadoria que quer vender:");
				System.out.println("0-");
				break;
			case 5: //comrpar mercadorias
				jogo.naoCompra();
				break;
			case 6: //melhorar armas

				break;
			case 7: //aumentar capacidade nave

				break;
			case 8: 
				mostraTabuleiro(jogo);
				break;
			case 9: //mover
				jogo.mover();
				break;
			case 0: //sair
				verifica=false;
				break;   
			default: //novo jogo
				System.out.println("Erro: OPCAO INCORRETA!");
				break;
			}
		}		
		sc.close();
	}
	public static void mostraTabuleiro(Jogo j){		
		for(int i = 0; i< j.getCartas().size();i++){
			if(j.getCartas().get(i).isVisivel()){
				System.out.println(j.getCartas().get(i).toString());
				if(j.getCartas().get(i).getNave()!=null)
					System.out.println(j.getCartas().get(i).getNave().toString());
				System.out.println(" -------------------------- \n");
			} else {
				System.out.println(" (por descobrir) \n");
			}
		}
	}
}
