//Escreva um algoritmo que leia 20 números do usuário e exiba quantos números são pares.   

import java.util.Scanner; 	
public class Questao36 {  
    public static void main(String[] args) { 
        Scanner in = new Scanner(System.in); 
        int i, numero, quantidade; 
        quantidade = 0; 
        for (i=1; i<=20; i++){ 
            System.out.println("Digite um número: "); 
            numero = in.nextInt(); 
            if (numero % 2 == 0){ 
                quantidade++; 
            } 
        }     
        System.out.println("Quantidade de números digitados que são pares: " + quantidade); 
    } 
} 
