
/**
 *13.	Crie um algoritmo que receba do usuário um número qualquer e verifique se esse é múltiplo de 5.   
 */
import java.util.Scanner;
public class Quest13
{
    public static void main(String []args){
        
    Scanner in = new Scanner(System.in);
       int x;
      
       
       System.out.println("Digite um numero");
        x = in.nextInt();
        
       
       
      
       if(x%5 == 0){
            System.out.printf("O numero %d é multiplo de 5 ",x);
       
       }else{
           System.out.printf("O numero %d não é multiplo de 5 ",x);
       }
       
      
   }
}

   

