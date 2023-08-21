import java.util.Scanner;
public class Exercicio6
{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        double real;
        double dolar;
        double euro;
        
        System.out.println("Digite o valor em Real:");
        real = in.nextDouble();
        
        dolar = real / 4.98;
        euro = real / 5.41;
        
        
        System.out.println("numero em Dolar $:" + dolar);
        System.out.println("numero em Euro: €" + euro);
        
    
        in.close();
    }
   
}