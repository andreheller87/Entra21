package Exercicios16012024.PetShop;

import java.util.Scanner;

public class Pet {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	      
	        double precoTosa = 30.0;
	        double precoBanho = 25.0;
	        double precoVacina = 50.0;

	        System.out.print("Tabela Preços: \n Tosa: 30 \n Banho: 30 \n Vacina: 30 \n");
	        System.out.println("Escolha a operação:");
	        System.out.println("1 - Tosa");
	        System.out.println("2 - Banho");
	        System.out.println("3 - Vacina");
	        System.out.println("4 - Tosa + Banho");
	        System.out.println("5 - Tosa + Vacina");
	        System.out.println("6 - Banho + Vacina");
	        System.out.println("7 - Tosa + Banho + Vacina");

	        int operacao = scanner.nextInt();

	       
	        
	        double precoFinal = 0.0;

	        switch (operacao) {
	            case 1:
	                precoFinal =  precoTosa;
	                break;
	            case 2:
	                precoFinal =  precoBanho;
	                break;
	            case 3:
	                precoFinal =  precoVacina;
	                break;
	            case 4:
	                precoFinal =  precoTosa + precoBanho;
	                break;
	            case 5:
	                precoFinal = precoTosa + precoVacina;
	                break;
	            case 6:
	                precoFinal = precoBanho + precoVacina;
	                break;
	            case 7:
	                precoFinal =  precoTosa + precoBanho + precoVacina;
	                break;
	            default:
	                System.out.println("Operação inválida.");
	                break;
	        }

	        
	        System.out.println("Preço final: R$ " + precoFinal);

	        scanner.close();
	    }
	}

