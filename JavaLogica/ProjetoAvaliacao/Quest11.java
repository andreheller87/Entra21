
/**
 *11.	Crie um algoritmo que leia dois valores (x e y) e informe se eles são iguais.   
 */
import java.util.Scanner;
public class Quest11
{
    public static void main(String []args){
        
    Scanner in = new Scanner(System.in);
       int x;
      int y;
       
       System.out.println("Digite um numero");
        x = in.nextInt();
        
        System.out.println("Digite outro numero");
        y = in.nextInt();
       
      
       if(x == y){
            System.out.printf("O numero %d é igual do numero %d ",x,y);
       
       }else{
           System.out.printf("O numero %d é diferente do numero %d ",x,y);
       }
       
      
   }
}
