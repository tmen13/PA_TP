package estados;

import logica.Carta;
import logica.Jogo;
import logica.Mercadoria;

public class aguardaCompra extends Estado{

	public aguardaCompra(Jogo jogo) {
		super(jogo);
		// TODO Auto-generated constructor stub
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
		return new aguardaMover(getJogo());
	}

	@Override
	public Estado comprar(Mercadoria tipo, int preco) {
		return this;
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
	public Estado lutar() {
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

	@Override
	public Estado naoVende() {
		// TODO Auto-generated method stub
		return this;
	}

	@Override
	public Estado naoCompra() {
		// TODO Auto-generated method stub
		return new aguardaMover(getJogo());
	}

}
