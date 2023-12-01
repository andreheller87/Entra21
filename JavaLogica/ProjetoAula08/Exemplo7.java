
import java.util.Scanner;

public class Exemplo7
{
    public static void main(String [] args)  {
      
        Scanner ler = new Scanner(System.in);
        
        int i,n,f;
        System.out.println("Informe o número para o fatorial:");
          n = ler.nextInt();
        
      
          System.out.println();
           System.out.println("Resultado");
            System.out.println(n + "! = ");
            
            f=1;
            for(i=n;i>=1;i--){
                if(i !=1)
            System.out.println(i + " * ");
            else System.out.print(i + " = ");
         
            f= f * i;
            
        }
         System.out.println(f);
       
    }
    
    
}
