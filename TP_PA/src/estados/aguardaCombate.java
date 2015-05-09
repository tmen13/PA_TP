package estados;

import logica.Jogo;
import logica.Mercadoria;

public class aguardaCombate extends Estado {
	Estado ultimoEstado;
	public aguardaCombate(Jogo jogo, Estado ultimoEstado) {
		super(jogo);
		this.ultimoEstado= ultimoEstado;
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
		return ultimoEstado;
	}

}
