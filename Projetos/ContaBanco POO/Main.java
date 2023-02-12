
public class Main {

	public static void main(String[] args) {
		//pegar a infomação = getNomevariavel
		//modificar
		
		
		Pessoa pessoa = new Pessoa ();	
		pessoa.setNome("Luis");
		pessoa.setAltura(1.8);
		pessoa.setIdade(25);
		
		System.out.println("O nome do usuário é: " + pessoa.getNome());
		System.out.println("A idade que o usuário inseriu é: " + pessoa.getIdade());
		System.out.println("A altura do usuário: " + pessoa.getAltura());
		
		
		Conta conta = new Conta();
		System.out.println("O saldo em conta é: " + conta.getSaldo());
		conta.depositar(200);
		System.out.println("O saldo em conta é: " + conta.getSaldo());
	}

}
