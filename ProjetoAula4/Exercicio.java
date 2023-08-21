
import java.util.Scanner;
public class Exercicio
{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String nome= "André";
        String sobrenome = "Heller";
        int num1;
        int num2;

        System.out.println("Digite um numero inteiro:");
        num1 = in.nextInt();      

        System.out.println("Digite mais um numero:");
        num2 = in.nextInt(); 
        
        int sucessor =  num1 +1;
        int antecessor = num2 -1;
        int potencia = 3;
        
        int mult =  num1 * (int)Math.pow(num2,potencia);
        
        System.out.println("==============");
        System.out.println(nome);
        System.out.println(sobrenome);
        System.out.println("O sucessor do numero:" + num1 + " é: " + sucessor);
        System.out.println("O antecessor do numero:" + num1 + " é: " + antecessor);
        System.out.println("Primeiro numero multiplicado pelo segundo numero na terceira potencia é:" );
         System.out.println(mult);
        

        in.close();
    }
}
