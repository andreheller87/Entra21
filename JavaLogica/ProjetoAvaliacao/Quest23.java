/*23.	Escreva um algoritmo que leia 20 números do usuário e exiba quantos números são maiores do que 8.     */

import java.util.Scanner;
public class Quest23
{
   public static void main(String []args){
       Scanner in = new Scanner(System.in);
       int maior =0;
       
       
       for(int i =1;i<=20;i++){
           
       System.out.println("Digite um numero inteiro");
       int x = in.nextInt();
        
       if(x>8){
           maior++;
       }
       
    }
    
    System.out.println("Tem " + maior + " numeros maiores que 8");
   }
}
