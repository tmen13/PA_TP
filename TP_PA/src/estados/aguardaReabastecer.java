package estados;

import logica.*;

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
		for(int i = getJogo().getCartas().size()-1; i >= 0 ;i--){
			if(getJogo().getCartas().get(i).isVisivel()){
				if(getJogo().getCartas().get(i) instanceof Planeta){
					aux = (Planeta) getJogo().getCartas().get(i);	
					if(!aux.isPirata()){
						if(!aux.getCubos().isEmpty()){
							if(aux.getCubos().get(0) instanceof Branco)
								aux.getCubos().remove(0);
							if(aux.getCubos().get(1) instanceof Branco)
								aux.getCubos().remove(1);

						} else {
							for(int q = 0;q<1;q++){
								String dado = getJogo().dadoColorido();
								switch (dado) {
								case "preto":
									return new aguardaCombate(getJogo(), this);
								case "branco":
									aux.getCubos().add(q, new Branco());
									break;
								case "amarelo":
									aux.getCubos().add(q, new Comida());
									break;
								case "vermelho":
									aux.getCubos().add(q, new Medicamento());
									break;
								case "azul":
									aux.getCubos().add(q, new Agua());
									break;
								}
							}
						}
					} else {
						Cubo ill = new Ilegal();
						aux.getCubos().add(0, ill);
						getJogo().getReserva().remove(ill);
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
