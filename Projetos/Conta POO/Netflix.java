
public class Netflix {
	private String idiomaPreferencial;
	private String resolucaoTela;
	
	public void entrar() {
		buscarPreferenciasDoUsuario();
		identificarResolucao();
		
	}
	private void buscarPreferenciasDoUsuario() {
		idiomaPreferencial = "PT-BR";
		carregarAudioFilme();
		
	}
	private void identificarResolucao() {
		resolucaoTela = "Full HD";
	}
	
	public void assistirFilme(String nomeFilme) {
		System.out.println("Iniciando o filme: " + nomeFilme);
		System.out.println("Carregando o filme na resolução: " + resolucaoTela);
		carregarAudioFilme();
	}
	
	private void carregarAudioFilme () {
		if (idiomaPreferencial == "PT-BR" || idiomaPreferencial == "ENG-USA") { 
			System.out.println("Carregando o áudio em: " + idiomaPreferencial);
		}else { 
			System.out.println("Carregando o áudio em ENG-USA");
		}
			
	}
}
