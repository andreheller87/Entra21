
import java.util.Scanner;
public class Calc
{
   public static void main(String args[]){
       Scanner in = new Scanner(System.in);
       int n1;
       int n2;
       int soma;
       int mult;
       
       System.out.println("Digite o numero um: ");
       n1 = in.nextInt();
       System.out.println("Digite o numero dois: ");
       n2 = in.nextInt();
       
       soma = n1 + n2;
       mult = n1* n2;
       System.out.println("O resultado da soma é: " + soma);
       if(soma%2 == 0){
           System.out.println("A soma dos dois numeros é Par");
       }else{
           System.out.println("A soma dos dois numeros é Impar");
       }
       
       
       
       
       
       
       
       
       
       in.close();
       
       
   }
}
