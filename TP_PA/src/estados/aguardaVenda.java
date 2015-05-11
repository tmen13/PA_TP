package estados;

import logica.Jogo;
import logica.Mercadoria;

public class aguardaVenda extends Estado {

	public aguardaVenda(Jogo jogo) {
		super(jogo);
	}

	@Override
	public Estado defineNomeJogador(String nome) {
		return this;
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
		return new aguardaCompra(getJogo());
	}

	@Override
	public Estado vender(Mercadoria tipo, int preco) {
		return this;
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
	public Estado lutar(int forca) {
		return this;
	}

	@Override
	public Estado reabastecer() {
		return this;
	}

	@Override
	public Estado explora() {
		// TODO Auto-generated method stub
		return this;
	}

}
