package FigurasGeometricas;

public class Circulo extends Figura {

	private double raio;
	
    public Circulo(String cor,double raio) {
		super(cor);
		this.raio = raio;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}
	

	@Override
	public String toString() {
		return "Circulo [raio=" + raio + ", getRaio()=" + getRaio() + ", area()=" + area() + "]";
	}

	@Override
	public Double area() {
		
		return Math.PI * Math.pow(raio, 2);
	}

}
