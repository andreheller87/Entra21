
import java.util.Scanner;
public class Switch
{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int teste;
        
        System.out.println("Digite o mês em número inteiro");
        teste = in.nextInt();
        
        switch(teste){
                case 1:
                 System.out.println("Janeiro");
                 break;
                 case 2:
                 System.out.println("Fevereiro");
                 break;

                 case 3:
                 System.out.println("Março");
                 break;
                 
                 case 4:
                 System.out.println("Abril");
                 break;
                                  
                 default:
                      System.out.println("Digite SOMENTE números entre 1 e 4");
                      break;
                 
                 

        }
        
    }
   
}
}