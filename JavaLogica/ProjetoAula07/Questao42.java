
/**
 * Escreva um algoritmo que simule um jogo de adivinhação com a pergunta 
 * “O que é, o que é? Quanto mais se tira, mais a gente tem?”.
 * O seu algoritmo deve encerrar apenas quando o usuário informar a resposta correta.  
 */

import java.util.Scanner; 

public class Questao42 {      
    public static void main(String[] args) { 
        Scanner in = new Scanner(System.in); 
        String resposta; 
        
        System.out.println("Responda a pergunta:"); 
        System.out.print("O que é, o que é? Quanto mais se tira, mais a gente tem? "); 
        resposta = in.next() + in.nextLine(); 
        
        while (resposta.equals("fotografia") != true){ 
            System.out.println("Você errou... tente novamente: "); 
            System.out.println("Responda a pergunta:"); 
            System.out.print("O que é, o que é? Quanto mais se tira, mais a gente tem? "); 
            resposta = in.next() + in.nextLine(); 
        } 
        System.out.println("Parabéns, você acertou! Até a próxima"); 
    } 
}
