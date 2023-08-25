
import java.util.Scanner;

      
       
public class VogalExeplo
{
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        char cont = 'S';
        
        while(cont == 'S' || cont == 's'){
        System.out.println("Digite uma letra");    
        char ch =in.next().charAt(0);
        
        switch(ch){

                case'a': case'e': case'i':case'o':case'u':case'A': case'E': case'I':case'O':case'U':

                System.out.println("Vogal");
                break;

            default:
                System.out.println("Consoante");
                
                 
        }
         System.out.println("********************"); 
        System.out.println("Deseja continuar S/N");    
                  cont =in.next().charAt(0);

    }
         
         
    }
}