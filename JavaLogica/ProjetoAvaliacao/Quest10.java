
/**
 10.	Crie um algoritmo que leia um número do usuário e informe se e o número é positivo ou negativo.   
 */
 import java.util.Scanner;
public class Quest10
{
  


   public static void main(String []args){
       Scanner in = new Scanner(System.in);
       int num;
       
       System.out.println("Digite um numero");
        num = in.nextInt();
       
      
       if(num>0){
            System.out.printf("O numero %d é positivo", num);
       }else if(num<0){
            System.out.printf("O numero %d é negativo", num);
       }else{
           System.out.printf("O numero 0 é neutro");
       }
       
      
   }
}



