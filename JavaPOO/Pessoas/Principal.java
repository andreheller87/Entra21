package Pessoas;

public class Principal {

	public static void main(String[] args) {
		Fisica pessoa1 = new Fisica("Petrunio");
	System.out.println("Nome Da Pessoa 1: " + pessoa1.getNome());
	System.out.println("Nome Da Pessoa 1: " + pessoa1.getxCPF());
	
	Juridica pessoa2 = new Juridica();
	System.out.println("Nome Da Pessoa 2: " + pessoa2.getNome());
	System.out.println("Nome Da Pessoa 2: " + pessoa2.getxCNPJ());
	
	
	}

}
