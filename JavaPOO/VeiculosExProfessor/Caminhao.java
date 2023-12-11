package VeiculosExProfessor;

public class Caminhao extends Veiculo{

	private int eixos;

	public Caminhao() {
		
	}
	
	public Caminhao(String placa, int ano) {
		super(placa, ano);
		
	}
	public Caminhao(String placa, int ano, int eixos) {
		super(placa, ano);
		this.eixos = eixos;
	}

	public int getEixos() {
		return eixos;
	}
	public void setEixos(int eixos) {
		this.eixos = eixos;
	}
	
	@Override
	public void exibirDados() {
		System.out.println("A placa do caminhão é: " + getPlaca()+ ", e o ano de fabricação é: " + getAno()+", e a quantidade de eixos é: " + getEixos());
	}
	
	
}
