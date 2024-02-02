package Exercicios17012024;

import java.util.Scanner;

public class Exprorob {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	Calculos calc;
	calc = new Calculos();
	
	float valor1,valor2,resultado = 0;
	int opcao;
	
	do {
		System.out.println("------------------");
		System.out.println("Escolha o cálculo:");
		System.out.println("1 - Cálculo 01");
		System.out.println("2 - Cálculo 02");
		System.out.println("3 - Cálculo 03");
		System.out.println("4 - Sair");
		System.out.println("------------------");
		System.out.println("Opção: ");
		opcao = sc.nextInt();
		
		if(opcao != 4) {
			System.out.println("\nDigite o 1º valor: ");
			valor1 = sc.nextFloat();
			System.out.println("\nDigite o 2º valor: ");
			valor2 = sc.nextFloat();
			
			switch (opcao) {
			case 1:
				resultado = calc.calculo01(valor1, valor2);
				break;
			case 2:
				calc.setNum1(valor1);
				calc.setNum1(valor2);
				resultado = calc.calculo02();
				break;
			case 3:
				calc.setNum1(valor1);
				calc.setNum1(valor2);
				calc.calculo03();
				resultado = calc.getTotal();
				break;
			
			}
			System.out.println("\n\n==========================");
			System.out.println("Resultado: " + resultado);
			System.out.println("\n\n==========================");
			
		}
		}while(opcao != 4);
		
	
	
	}
	

}