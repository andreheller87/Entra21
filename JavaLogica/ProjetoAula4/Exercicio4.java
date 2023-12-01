import java.util.Scanner;
public class Exercicio4
{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        double x;
        double y;
        double rest;
        
        System.out.println("Digite um numero:");
        x = in.nextDouble();
        System.out.println("Digite outro numero:");
        y= in.nextDouble();
        
        rest = (x%y);
        
        System.out.print(rest);
        in.close();
    }
   
}
