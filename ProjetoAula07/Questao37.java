
//Escreva um algoritmo que leia um número qualquer do usuário e escreva os ímpares existentes entre
// 1 e o número informado pelo usuário.  

import java.util.Scanner; 

public class Questao37 { 	 
    public static void main(String[] args) { 
        Scanner in = new Scanner(System.in); 
        int i, numero; 
        
        System.out.println("Digite um número: "); 
        numero = in.nextInt(); 
        
        System.out.println("Os números ímpares entre 1 e "+ numero+ " são: "); 
        for (i=1; i<=numero; i = i + 2){ 
            System.out.println(i);    
        }     
    } 
} 
