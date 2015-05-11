package estados;

import logica.Carta;
import logica.Jogo;
import logica.Mercadoria;

public class aguardaCombate extends Estado {
	Estado ultimoEstado;
	public aguardaCombate(Jogo jogo, Estado ultimoEstado) {
		super(jogo);
		this.ultimoEstado = ultimoEstado;
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
		int forca = getJogo().dadoPreto();
		if(getJogo().getJogador().getNave().getForca() >= forca)
			return ultimoEstado;
		else{
			int dif = forca - getJogo().getJogador().getNave().getForca();
			getJogo().getJogador().setCapital(getJogo().getJogador().getCapital()-dif);
		}
		return ultimoEstado;
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
		return this;
	}

}
