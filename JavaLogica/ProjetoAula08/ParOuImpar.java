import java.util.Scanner;



public class ParOuImpar
{
   public static void main(String [] args){
       Scanner ler = new Scanner(System.in);
       
       int a;
       
       System.out.printf("Digite um numero: ");
       a =ler.nextInt();
       
       
        System.out.printf("\nResultados:\n ");
        
        
        for(int i =1;i<= a; i++){
            if(i %2 ==0){
                System.out.printf("\nNumero: %d = par",i);
            }else{
                 System.out.printf("\nNumero: %d = impar",i);
            }
            
        }
       
       
   }
}
