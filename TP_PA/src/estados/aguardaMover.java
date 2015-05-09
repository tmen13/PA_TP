package estados;

import logica.Jogo;
import logica.Mercadoria;
import logica.NaoPirata;

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
		//if(getJogo().getCarta() instanceof NaoPirata)
		return new aguardaExploracao(getJogo());
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
	public Estado lutar(int forca, Estado e) {
		// TODO Auto-generated method stub
		return null;
	}

}
