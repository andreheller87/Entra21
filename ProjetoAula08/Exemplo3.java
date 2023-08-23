import java.util.Scanner;
import java.io.IOException;


public class Exemplo3
{
   public static void main(String [] args) throws IOException {
       Scanner ler = new Scanner(System.in);
       
        String nome;
       char sexo;
       
       
       int idade;
      
       System.out.printf("\nInforme um nome:\n ");
       nome =ler.nextLine();
       
       System.out.printf("Informe o sexo (M/F): \n");
       sexo =(char)System.in.read();
       
       
        System.out.printf("\nResultado:\n ");
        
        if((sexo == 'M') || (sexo =='m')){
            System.out.printf("Seja bem vindo Sr. \"%s\"\n",nome);
        }else System.out.printf("Seja bem vindo Sra. \"%s\"\n",nome);
        
        
         
         
       
       
       
   }
}
