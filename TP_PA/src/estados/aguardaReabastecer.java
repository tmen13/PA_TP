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
		return this;
	}

	@Override
	public Estado desistir() {
		return new aguardaInicio(getJogo());
	}

	@Override
	public Estado mover(int x, int y) {
		return this;
	}

	@Override
	public Estado comprar(Mercadoria tipo, int preco) {
		return this;
	}

	@Override
	public Estado vender(Mercadoria tipo, int preco) {
		return new aguardaVenda(getJogo());
	}

	@Override
	public Estado upgradeCargo() {
		return this;
	}

	@Override
	public Estado upgradeForca() {
		return this;
	}

	@Override
	public Estado lutar(int forca, Estado e) {
		// TODO Auto-generated method stub
		return null;
	}

}
