package Pessoas;

public class Juridica extends Pessoa {
private String xCNPJ;

public Juridica() {
	super();
}

public Juridica(String nome) {
	super(nome);
}

public String getxCNPJ() {
	return xCNPJ;
}

public void setxCNPJ(String xCNPJ) {
	this.xCNPJ = xCNPJ;
}
public String getNome() {
	return super.getNome();
}

}
