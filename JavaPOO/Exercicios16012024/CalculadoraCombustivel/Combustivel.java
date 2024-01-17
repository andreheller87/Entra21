package Exercicios16012024.CalculadoraCombustivel;

import java.util.Scanner;

public class Combustivel {
	static double gasolina = 5.50;  
	static double diesel = 4.20;    
	static double alcool = 4.80;  
	static double gnv = 3.00;
	

		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			boolean cont = true;
			int Key = 0;
			
			System.out.println("-------------------- \n Bem vindo no posto tal \n Estamos localizados Rua: Acesso \n Entre em contados (47)99999999");
			System.out.println("Opçãoes: \n 1 - Gasolina \n 2 - Alcool \n 3 - Disel \n 4 - GNV");
		    Key = sc.nextInt();
		    
		    System.out.println("Digite quantidade de combustivel:");
			int quantidade = sc.nextInt();
			Double Valor= 0.0;
			switch (Key) {
			case 1: 
				Valor = gasolina * quantidade;
				break;
            case 2: 
            	Valor = alcool * quantidade;
				break;
            case 3: 
            	Valor = diesel * quantidade;
	         break;
            case 4: 
            	Valor = gnv * quantidade;
	       break;
			}
			
				System.out.println("Valor total de combustivel: " + Valor);
				
				
			}
				
			
			

			
		}

	


