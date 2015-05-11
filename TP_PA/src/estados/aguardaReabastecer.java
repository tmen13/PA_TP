package estados;

import logica.Jogo;
import logica.Mercadoria;
import logica.Planeta;

public class aguardaReabastecer extends Estado {

	public aguardaReabastecer(Jogo jogo) {
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
		Planeta aux;
		for(int i = 0; i< getJogo().getCartas().size();i++){
			if(getJogo().getCartas().get(i).isVisivel()){
				if(getJogo().getCartas().get(i) instanceof Planeta){
					aux = (Planeta) getJogo().getCartas().get(i);						
					if(aux.getCubos().isEmpty()){
						System.out.print("esta vazio");
					}
				}
			}
		}
		return new aguardaVenda(getJogo());
	}

	@Override
	public Estado explora() {
		return this;
	}

}
