package VeiculosExProfessor;

public class Onibus extends Veiculo {
private int assentos;

public Onibus() {
	
}
public Onibus(int assentos) {
	super();
	this.assentos = assentos;
}

public int getAssentos() {
	return assentos;
}

public void setAssentos(int assentos) {
	this.assentos = assentos;
}

@Override
public void exibirDados() {
	System.out.println("A placa do onibus é: " + getPlaca()+ ", e o ano de fabricação é: " + getAno()+", e a quantidade de assentos é: " + getAssentos());
}

	
}
