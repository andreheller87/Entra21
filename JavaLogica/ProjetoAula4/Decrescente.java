import java.util.Scanner;
public class Decrescente
{
  
    public static void main(String []args)
    {
        Scanner in = new Scanner(System.in);
    int num1, num2, num3, val;
        
    System.out.println("Digite 1° numero:");
        num1 = in.nextInt();

        System.out.println("Digite 2° numero:");
        num2 = in.nextInt();
        System.out.println("Digite 3° numero:");
        num3 = in.nextInt();
        
        if(num1>=num2){
            val = num1;
            num1 = num2;
            num2 = val;
        } 
        
         val=0;
        if(num1>=num3){
            val = num1;
            num1 = num3;
            num3 = val;
        }
        val=0;
         if(num2>=num3){
            val = num2;
            num2 = num3;
            num3 = val;
        }
        
        
        
        System.out.println("Ordem decrescente: " + num3 +"," +num2 +"," + num1);
        
        
        
        
        
        
    }

   
}
