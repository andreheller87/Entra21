
/**
Crie um algoritmo que lê um valor real em dólar, e converte o valor para reais. Considere que a cotação é US$   
 */
import java.util.Scanner;
public class Quest07
{
   public static void main(String []args){
       Scanner in = new Scanner(System.in);
       
       System.out.println("Digite um valor em dólar");
       double dolar = in.nextDouble();
       
       
       double real = dolar * 4.88 ;
       
       
       System.out.printf("O valor em reais é: R$%.2f reais " , real);
   }
}