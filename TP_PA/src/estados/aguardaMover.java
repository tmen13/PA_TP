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
	public Estado mover(Carta c) {
		getJogo().getCartas().get(getJogo().getIndiceCartaNave()).setNave(null);
		getJogo().getCartas().get(getJogo().getIndiceCartaNave()+1).setNave(getJogo().getJogador().getNave());
		getJogo().procuraNave();
		getJogo().getJogador().setCapital(getJogo().getJogador().getCapital()-1);
		if(c instanceof Planeta){
			Planeta aux = (Planeta)c;
			if(aux.isPirata())
				return new aguardaCombate(getJogo(),this);
			else
				return new aguardaExploracao(getJogo());
			}		
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
		return this;
	}

}
