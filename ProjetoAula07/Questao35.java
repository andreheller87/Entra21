
//Escreva um algoritmo que leia 20 números do usuário e exiba quantos números são maiores do que 8.   

import java.util.Scanner;
public class Questao35 {  	 
    public static void main(String[] args) { 
        Scanner in = new Scanner(System.in); 
        
        int i, numero, quantidade=0; 
        
        
        for (i=1; i<=20; i++){ 
            System.out.println("Digite um número: "); 
            numero = in.nextInt(); 
            if (numero > 8){ 
                quantidade++; 
            } 
        }     
        System.out.println("Quantidade de números digitados maiores que 8: "+quantidade); 
    } 
} 

