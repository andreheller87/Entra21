import java.util.Scanner;
public class Exeplo2Switch
{
   public static void main(String []args){
       Scanner in = new Scanner(System.in);
      
       
       System.out.println("Digite uma letra entre a e d");
       
       String letra = in.nextLine();
       
       switch(letra){
           case"a":
           System.out.println("Abacat");
           break;
             case"b":
           System.out.println("Buriti");
           break;
             case"c":
           System.out.println("Caju");
           break;
             case"d":
           System.out.println("Damasco");
           break;
           default:
            System.out.println("Letra inválida");
       }
       
       
       
       
       
       
       
       in.close();
   }
}
