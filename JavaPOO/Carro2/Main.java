package Carro2;

public class Main {

	public static void main(String[] args) {
	
		
		fazerCarroAndando(new Carro());
		fazerCarroAndando(new Gol());
		fazerCarroAndando(new Palio());

	}

	private static void fazerCarroAndando(Carro carro) {
		carro.andando();
		
	}

}
