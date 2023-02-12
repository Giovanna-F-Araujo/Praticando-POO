
public class Main {

	public static void main(String[] args) {
		Circulo circulo = new Circulo (2);
		Quadrado quadrado = new Quadrado(20);
		
		Contador calculador = new Contador ();
		System.out.println(calculador.somarArea(quadrado, circulo));
	}

}
