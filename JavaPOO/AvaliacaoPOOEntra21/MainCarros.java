package AvaliacaoPOOEntra21;

public class MainCarros {

	public static void main(String[] args) {
	   
		Carro gol = new Carro("Volkswagen","gol");
		System.out.println(gol.toString());
		
		
		gol.acelerar();
		gol.acelerar();
		gol.acelerar();
		gol.acelerar();
		System.out.println(gol.toString());
		
		
		gol.freiar();
		
		System.out.println(gol.toString());
		
		

	}

}
