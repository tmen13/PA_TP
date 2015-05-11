package estados;

import logica.Carta;
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
	public Estado mover(Carta c) {
		return this;
	}

	@Override
	public Estado comprar(Mercadoria tipo, int preco) {
		return new aguardaCompra(getJogo());
	}

	@Override
	public Estado vender(Mercadoria tipo, int preco) {
		return new aguardaCompra(getJogo());
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
	public Estado lutar() {
		return this;
	}

	@Override
	public Estado reabastecer() {
		return this;
	}

	@Override
	public Estado explora() {
		return this;
	}

	@Override
	public Estado naoVende() {
		return new aguardaCompra(getJogo());
	}

	@Override
	public Estado naoCompra() {
		return this;
	}

}
