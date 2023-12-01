import java.util.Scanner;



public class Exemplo2
{
   public static void main(String [] args){
       Scanner ler = new Scanner(System.in);
       
       int idade;
       String nome;
       
       System.out.printf("Informe a sua idade: \n");
       idade =ler.nextInt();
       
       ler.nextLine();
       
       System.out.printf("\nInforme o seu nome:\n ");
       nome =ler.nextLine();
       
       
        System.out.printf("\nResultados:\n ");
        
         System.out.printf("%s tem %d anos.\n",nome,idade);
         
       
       
       
   }
}
