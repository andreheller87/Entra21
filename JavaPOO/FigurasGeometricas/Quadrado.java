package FigurasGeometricas;

public class Quadrado extends Retangulo{
	
	private double lado;
	
	
	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}
	
	public Quadrado() {
		
	}

	public Quadrado(String cor ,double lado) {
		super(cor,lado,lado);
		this.lado = lado;
	}

	public Quadrado(String cor, double lado1, double lado2) {
		super(cor, lado1, lado2);
		
	}

	@Override
	public Double area() {
		
		return this.getLado()* this.getLado();
	}

	@Override
	public String toString() {
		return "Quadrado [lado=" + lado + ", area()=" + area() + "]";
	}

	
	
	
	
	

}
