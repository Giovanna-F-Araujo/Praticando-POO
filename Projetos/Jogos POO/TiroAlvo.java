
public class TiroAlvo implements Jogo {

	
	@Override
	public void fechar() {
		System.out.println("Salvar o progresso do jogo no servidor");
		System.out.println("Salvar a partida");
		System.out.println("Salvar o jogo");
		
		
	}

	@Override
	public void jogar() {
		System.out.println("Carregando o jogo ");
		System.out.println("Se concetando ao servidor: ");
		System.out.println("Carregando partida ");
	}

}
