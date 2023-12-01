// Crie um algoritmo que lê dois números inteiros, X e Y,
// e mostre o resultado da multiplicação de x por y. */
import java.util.Scanner;
public class Quest03
{
   public static void main(String []args){
       Scanner in = new Scanner(System.in);
       
       System.out.println("Digite um numero inteiro");
       int x = in.nextInt();
        System.out.println("Digite outro numero inteiro");
       int y = in.nextInt();
       
       System.out.printf("A multiplicação de %d com %d = %d",x,y, (x*y));
   }
}
