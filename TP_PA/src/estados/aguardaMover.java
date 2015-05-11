package estados;

import logica.*;

public class aguardaMover extends Estado{

	public aguardaMover(Jogo jogo) {
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
	public Estado mover(int x, int y) {
		if(getJogo().getPlaneta().isPirata())
			return new aguardaCombate(getJogo(),this);
		return new aguardaExploracao(getJogo());
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
