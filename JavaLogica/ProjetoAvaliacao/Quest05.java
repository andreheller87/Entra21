/**Crie um algoritmo que lê dois números, X e Y, e mostra o resto da divisão entre eles.    
*/

import java.util.Scanner;
public class Quest05
{
   public static void main(String []args){
       Scanner in = new Scanner(System.in);
       
       System.out.println("Digite um numero");
       double x = in.nextDouble();
       
       System.out.println("Digite outro numero");
       double y = in.nextDouble();
       
       
       System.out.printf("O resto da divisão do numero %.2f pelo numero %.2f  = %.2f",x,y, (x%y));
   }
}
