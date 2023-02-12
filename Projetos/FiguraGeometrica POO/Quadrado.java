
public class Quadrado implements FiguraGeometrica {
	//atributo
	private int lado; 
	
	//construtor
		public Quadrado(int lado) {
			this.lado = lado;
			}
		
	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}

	@Override
	public double calcularArea() {
		return Math.pow(lado,2);
		
	}

	
		
	}
	
	

