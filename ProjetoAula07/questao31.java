import java.util.Scanner;
public class questao31
{
    public static void main(String []args){

        Scanner in = new Scanner(System.in);
        int  numero,soma;
        double media;
        
        soma=0;

        
        for(int j=1; j<=5;j++){
             System.out.println("Digite um numero");
             numero = in.nextInt();
             soma = soma + numero;
        }

        media = soma / 5;
        
        System.out.println("A soma do numero digitado é: " + soma);
        System.out.println("A media do numero digitado é: " + media);
        in.close();

    }
}