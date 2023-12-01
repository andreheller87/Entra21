package Veiculos;

public class Carro extends Veiculo{

	private String marca;
	
	

	public Carro() {
		super();
		this.ligado = false;
		
	}

	public Carro(String marca, String modelo, boolean ligado) {
		super(modelo);
		this.marca = marca;
		this.ligado = false;
	}
	
	

	public int getVelocidade() {
		return velocidade;
	}

	
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	
}
