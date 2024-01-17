package AvaliacaoPOOEntra21;
/*4.	Implemente uma classe chamada “Carro” com atributos para armazenar 
 * a marca, o modelo e a velocidade atual do carro.
 *  Adicione métodos para acelerar, frear e exibir a velocidade atual. */
public class Carro {

	private String marca;
	private String modelo;
	private int velocidade;
	
	
	
	
	public Carro(String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
		this.velocidade = 0;
	}
	
	public Carro() {
	
	}
	
	public void acelerar() {
		if(velocidade <= 260) {
			velocidade += 10;
		}
	}
	
	public void freiar() {
		velocidade =0;
		System.out.println("Carro freiado.");
		
	}
	
	
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getVelocidade() {
		return velocidade;
	}
	

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	
	@Override
	public String toString() {
		return "Carro " + marca + ", modelo " + modelo + " está com a velocidade a: " + velocidade + "";
	}
	
	
}
