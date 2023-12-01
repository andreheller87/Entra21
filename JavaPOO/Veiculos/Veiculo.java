package Veiculos;

public abstract class Veiculo {
	
	protected String modelo;
	protected boolean ligado;
	protected int velocidade = 0;
	
	
	

	protected Veiculo() {
		
		modelo = "Sem modelo";
		
	}
	protected Veiculo(String modelo) {
		
		this.modelo = modelo;
		
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public boolean isLigado() {
		return ligado;
	}
	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}
	public int getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	
	public void acelerar() {
		if(ligado) {
		setVelocidade(velocidade += 10);	
		}
	}
	
	public void freiar() {
		if(ligado) {
			setVelocidade(0);
		
		}
	}
	public void ligar() {
		if(!ligado) {
			setLigado(true);
		
		}
	}
	
	
	public void desligar() {
		if(ligado && getVelocidade() == 0) {
			setLigado(false);
		
		}
	}
	
	

	}


