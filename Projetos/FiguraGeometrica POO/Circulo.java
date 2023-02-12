
public class Circulo implements FiguraGeometrica{
	//Atributos
	
	private int raio ;
	
	public Circulo (int raio) {
		this.raio = raio;
	}
		
	

	public int getRaio() {
		return raio;
	}

	public void setRaio(int raio) {
		this.raio = raio;
	}



	@Override
	public double calcularArea() {
			return Math.PI * Math.pow(raio, 2);
		}
		
	
	}
	
	
	
	//metodos classe
	//get e set 

