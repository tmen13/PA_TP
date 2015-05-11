package estados;
import logica.*;

public abstract class Estado {
	private Jogo jogo;
	
	public Estado(Jogo jogo){
		this.jogo = jogo;
	}
	
	public Jogo getJogo(){
		return jogo;
	}
	abstract public Estado defineNomeJogador(String nome);
	abstract public Estado comecaJogo();
	abstract public Estado desistir();
	abstract public Estado explora();
	abstract public Estado reabastecer();
	abstract public Estado mover(Carta c);
	abstract public Estado comprar(Mercadoria tipo, int preco);
	abstract public Estado vender(Mercadoria tipo, int preco);
	abstract public Estado naoVende();
	abstract public Estado naoCompra();
	abstract public Estado upgradeCargo();
	abstract public Estado upgradeForca();
	abstract public Estado lutar();
}
