package Exercicios16012024.CalculadoraMediaAluno;

import java.util.Scanner;

public class MediaAluno {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean cont = true;
		
		while (cont) {
			Aluno aluno = new Aluno();
			
			System.out.println("Digite o nome do aluno");
			String nome = sc.next();
			aluno.setNome(nome);
			for (int i = 1; i <= 4; i++) {
				System.out.println("Digite uma nota");
				Double nota = sc.nextDouble();
				aluno.addNota(nota);
			}
			System.out.println(aluno);
			
			System.out.println("Digitar outro aluno? S ou N");
			char c = sc.next().charAt(0);
			if(c == 'N' || c == 'n') {
				cont = false;
			}
			
		}
		

		
	}

}
