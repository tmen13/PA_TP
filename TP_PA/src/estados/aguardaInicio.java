package estados;

import logica.Jogo;
import logica.Mercadoria;

public class aguardaInicio extends Estado {

	public aguardaInicio(Jogo jogo) {
		super(jogo);
	}

	@Override
	public Estado defineNomeJogador(String nome) {
		getJogo().getJogador().setNome(nome);
		return this;
	}

	@Override
	public Estado comecaJogo() {
		return new aguardaExploracao(getJogo());
	}

	@Override
	public Estado desistir() {
		return this;
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
	public Estado lutar(int forca, Estado e) {
		return this;
	}

}
