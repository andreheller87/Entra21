package VeiculosExProfessor;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
	
		ArrayList<Veiculo> veiculos = new ArrayList<>();
		
		veiculos.add(new Veiculo("XPO-0987",2010));
		veiculos.add(new Veiculo("ABC-0978",2012));
		veiculos.add(new Veiculo("CDF-5685",2014));
		veiculos.add(new Caminhao("GTJ-9862",2014,5));
		veiculos.add(new Caminhao("GAO-3265",2007,7));
		
		ArrayList<Caminhao> caminhoes = new ArrayList<>();
	
	
		caminhoes.add(new Caminhao("GTJ-9862",2014,5));
		caminhoes.add(new Caminhao("GAO-3265",2007,7));
		
		for (Veiculo veiculo : veiculos) {
	  		veiculo.exibirDados();
    }
		
		System.out.println("\n---------------------------------------------------------------\n");
      for (Caminhao caminhao : caminhoes) {
    	  		caminhao.exibirDados();
        }
		
	}

}
