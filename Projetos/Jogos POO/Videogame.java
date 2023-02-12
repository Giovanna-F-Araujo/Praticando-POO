
public class Videogame {
	private Jogo jogo;
	private boolean estaLigado = true;
	
	public void ligar() {
		System.out.println("Ligar o videogame...");
		this.estaLigado = true;
	}
	public void jogar () {
		if (estaLigado = true) {
		System.out.println("Iniciando o jogo...");
		this.jogo = jogo;
		jogo.jogar();
		}else {
			System.out.println("O videogame está desligado !!!");
		}
	}
	public void fechar() {
		if (estaLigado = true) {
			System.out.println("Fechando o jogo...");
			boolean temJogoRodando = jogo != null;
			if(temJogoRodando) {
				jogo.fechar();
				jogo = null;
			}else {
				System.out.println("Não tem jogo para encerrar...");
			}
			
			}else {
				System.out.println("O videogame está desligado !!!");
			}
		
	
		}
	}

