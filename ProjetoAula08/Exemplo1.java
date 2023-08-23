import java.util.Scanner;



public class Exemplo1
{
   public static void main(String [] args){
       Scanner ler = new Scanner(System.in);
       
       int a,b;
       
       System.out.printf("informe o primeiro valor: ");
       a =ler.nextInt();
       
       System.out.printf("informe o segundo valor: ");
       b =ler.nextInt();
       
       
        System.out.printf("\nResultados:\n ");
        
         System.out.printf("%d + %d = %3d\n",a,b,(a+b));
         System.out.printf("%d - %d = %3d\n",a,b,(a-b));
         System.out.printf("%d * %d = %3d\n",a,b,(a*b));
         System.out.printf("%d / %d = %3d(Divisão inteira)\n",a,b,(a/b));
         System.out.printf("%d / %d = %6.2f(Divisão exata)",a,b,((double)a/b));
       
       
       
   }
}
