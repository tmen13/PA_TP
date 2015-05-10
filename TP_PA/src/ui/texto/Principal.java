package ui.texto;

import java.util.Scanner;

import logica.*;
 
public class Principal {

 public static void main(String[] args) {
  // TODO Auto-generated method stub
  
  Jogo j = new Jogo();
  
  boolean verifica = true;
  Scanner sc= new Scanner(System.in);
  
  System.out.println("Milky Way Express GameBoard");
  System.out.println("Introduza o nome de jogador");
  String nome = sc.nextLine();
  j.defineNomeJogador(nome);
  j.comecarJogo();
  
  while(verifica){
   System.out.println(j.getEstado());
   mostraTabuleiro(j);
   System.out.println("Selecione uma das seguintes opcoes:");
   int opcao=sc.nextInt();
   System.out.println("1-Novo Jogo (desistir)");
   //System.out.println("2-Explorar");
   //System.out.println("3-Reabastecer Mercado");
   System.out.println("4-Vender Mercadorias");
   System.out.println("5-Comprar Mercadorias");
   System.out.println("6-Melhorar armas da nave");
   System.out.println("7-Aumentar capacidade da nave");
   //System.out.println("8-Lançar dado Cor");
   //System.out.println("9-Lançar dado normal");
   System.out.println("10-Mover");
   System.out.println("0-sair");
   switch(opcao){
   case 1: //novo jogo
    System.out.println("Desistiu...");
    System.out.println("A sua Pontuação foi: "+j.getJogador().getPontuacao());
    System.out.println("Começando novo Jogo...");
    j.desistir();
    j.comecarJogo();
    break;
   case 2: //explorar
    
    break;
   case 3: //reabastecer mercado
       
    break;
   case 4: //vender mercadorias
    System.out.println("selecione a mercadoria que quer vender:");
    System.out.println("0-");
    //j.vender();
    break;
   case 5: //comrpar mercadorias
    
    break;
   case 6: //melhorar armas
    
    break;
   case 7: //aumentar capacidade nave
    
    break;
   case 8: //lançar dado cor
    
    break;
   case 9: //lançar dado normal
    
    break;
   case 10: //mover
    
    break;
   case 0: //sair
    verifica=false;
    break;   
   default: //novo jogo
    System.out.println("Erro: OPCAO INCORRETA!");
    break;
 
    
   }
  }

 }
 public static void mostraTabuleiro(Jogo j){
  for(int i = 0; i< j.getCartas().size();i++){
   j.getCartas().get(i).toString();
   
  }
 }

}
