//Escreva um algoritmo que leia o ano de nascimento de uma pessoa e apresente uma linha do tempo, mostrando cada ano 
//de vida da pessoa e quantos anos ela tinha em cada ano até o ano atual.  

import java.util.Scanner; 
public class Questao38 { 
    public static void main(String[] args) { 
        Scanner in = new Scanner(System.in); 
        
        int i, anoNascimento, anoAtual, idade; 
        
        System.out.println("Digite o ano do seu nascimento: "); 
        anoNascimento = in.nextInt(); 
        System.out.println("Digite o ano atual: "); 
        anoAtual = in.nextInt(); 
        System.out.println("Linha do Tempo:"); 
        System.out.println("Ano - Idade"); 
        
        for (i=anoNascimento, idade = 0; i<=anoAtual; i++, idade++){ 
            System.out.println(i + " - "+ idade);    
        }     
    } 
} 
