package estados;

import logica.Carta;
import logica.Jogo;
import logica.Mercadoria;

public class aguardaExploracao extends Estado{

	public aguardaExploracao(Jogo jogo) {
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
		return this;
	}

	@Override
	public Estado reabastecer() {
		return this;	
	}

	@Override
	public Estado explora() {
		for(int i = 0; i< getJogo().getCartas().size();i++){
			if(getJogo().getCartas().get(i)==getJogo().getCartaComNave()){
				getJogo().getCartas().get(i+1).setVisivel(true);
			}
		}
		return new aguardaReabastecer(getJogo());
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
