// Crie um algoritmo que leia uma idade de uma pessoa e calcule quantos dias essa pessoa já viveu +-.  
//

import java.util.Scanner;
public class Quest04
{
   public static void main(String []args){
       Scanner in = new Scanner(System.in);
       
       System.out.println("Digite sua idade");
       int idade = in.nextInt();
       int dias = idade * 365;
       
       System.out.printf("Essa pessoa viveu: %d",dias);
   }
}
