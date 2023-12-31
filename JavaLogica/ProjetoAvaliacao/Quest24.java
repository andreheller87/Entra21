/*
   9.	Escreva um algoritmo que leia 9 números do usuário e exiba quantos números são pares.   
   */

import java.util.Scanner;

public class Quest24 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int contPares = 0;

        for (int i = 1; i <= 9; i++) {
            System.out.print("Digite o " + i + "º número: ");
            int numero = scan.nextInt();

            if (numero % 2 == 0) {
                contPares++;
            }
        }

        System.out.println();
        System.out.println("Total de números pares: " + contPares);

        scan.close();
    }
}
