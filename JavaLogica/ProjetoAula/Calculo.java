
import java.util.Scanner;

public class Calculo{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);  
        double x;
        double y;
        double n1;
        double n2;
        double n3;
        double n4;
        double soma, multi,div,sub , media;

        System.out.println("Digite o valor de x: ");
        x = in.nextDouble();
        System.out.println("Digite o valor de y: ");
        y = in.nextDouble();
        
        
         System.out.println("Digite a nota1: ");
        n1 = in.nextDouble();
        System.out.println("Digite a nota2: ");
        n2 = in.nextDouble();
          System.out.println("Digite a nota3: ");
        n3 = in.nextDouble();
        System.out.println("Digite a nota4: ");
        n4 = in.nextDouble();

        soma = x + y;
        multi = x * y;
        sub = x - y;
        div = x / y;
        media = (n1 + n2 + n3 + n4)/4;

        System.out.println("O resultado da soma é: " + soma);
        System.out.println("O resultado da multiplicação é: " + multi);
        System.out.println("O resultado da subtração é: " +  sub);
        System.out.println("O resultado da divição é: " + div);
        System.out.println("A media é: " + media);

        in.close();

    }
}
