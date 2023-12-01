import java.util.Scanner;
import java.io.IOException;


public class Exemplo4
{
   public static void main(String [] args) throws IOException {
       Scanner ler = new Scanner(System.in);
       
       char sexo;
       double h, psIdeal;
       
       System.out.printf("Informe o sexo (M/F)......: \n");
       sexo =(char)System.in.read();
      
       System.out.printf("\nInforme a altura(em metro):\n ");
       h =ler.nextDouble();
       
       
        System.out.printf("\nResultado:\n ");
        
        if((sexo == 'M') || (sexo =='m')){
          psIdeal = (72.7* h) - 58;
        }else  psIdeal = (62.1* h) - 44.7;
        
        System.out.printf("\nPeso Ideal = %.2f Kgs\n ", psIdeal);
         
         
       
       
       
   }
}
