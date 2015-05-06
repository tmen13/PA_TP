package estados;

import logica.Jogo;
import logica.Mercadoria;

public class aguardaReabastecer extends Estado {

	public aguardaReabastecer(Jogo jogo) {
		super(jogo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Estado defineNomeJogador(String nome) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Estado comecaJogo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Estado desistir() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Estado mover(int x, int y) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Estado comprar(Mercadoria tipo, int preco) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Estado vender(Mercadoria tipo, int preco) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Estado upgradeCargo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Estado upgradeForca() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Estado lutar(int forca) {
		// TODO Auto-generated method stub
		return null;
	}

}
