package FigurasGeometricas;

public abstract class Figura {

	String cor;
	
	public Figura() {
		
	}

	public Figura(String cor) {
		super();
		this.cor = cor;
	}

	public void setCor(String cor) {
		this.cor= cor;
	}
	
	public String getCor() {
		return this.cor;
	}
	
	
	
	@Override
	public String toString() {
		return "Figura [cor=" + cor + "]";
	}

	public abstract Double area();

}
