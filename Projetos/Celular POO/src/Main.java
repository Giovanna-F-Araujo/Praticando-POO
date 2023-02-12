
public class Main {

	public static void main(String[] args) {
		//Iphone 12,tela de 6.1, 256GB
		//Galaxy Note 20 Ultra, tela de 6.9, 256GB
		//Xiaomi MI11 Pro, tela de 6.81, 128GB
		//<TipoVariável> Nome Variável = valor
		
		
		//Declarando um objeto do tipo celular 
		
		Celular celularA = new Celular ();
		celularA.nome = "Iphone";
		celularA.tamanhoTela = 6.1f;
		celularA.espacoArmazenamento = 256;
		celularA.sistemaOperacional = "IOS";
		
		Celular celularB = new Celular();
		celularB.nome = "Galaxy Note 20 Ultra";
		celularB.tamanhoTela = 6.9f;
		celularB.espacoArmazenamento = 256;
		celularB.sistemaOperacional = "Android";
		
		Celular celularC = new Celular();
		celularC.nome = "Xiaomi Mi 11 Pro";
		celularC.tamanhoTela = 6.81f;
		celularC.espacoArmazenamento = 128;
		celularC.sistemaOperacional = "Android";
		
		System.out.format("\n O Modelo %s, com tamanho de tela %.1f, terá o espaço de armazenamento %dGB e o sistema operacional %s", celularA.nome,celularA.tamanhoTela,celularA.espacoArmazenamento,celularA.sistemaOperacional);
		System.out.format("\n O Modelo %s, com tamanho de tela %.1f, terá o espaço de armazenamento %dGB e o sistema operacional %s", celularB.nome,celularB.tamanhoTela,celularB.espacoArmazenamento,celularB.sistemaOperacional);
		System.out.format("\n O Modelo %s, xomo tamanho de tela %.1f, terá o espaço de armazenamento %dGB e o sistema operacional %s", celularC.nome,celularC.tamanhoTela,celularC.espacoArmazenamento,celularC.sistemaOperacional); 
	}

}
