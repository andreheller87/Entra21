import java.util.Scanner;

public class Bhaskara {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite os numeros a, b e c : ");
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();

        double delta =( b * b)-4*a*c;
          System.out.println("Delta " + delta);
       if (delta > 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("As raízes são: " + x1 + " e " + x2);
        } else if (delta == 0) {
            double x = -b / (2 * a);

            System.out.println("A única raiz da equação é: " + x);
        } else{
            System.out.println("Não possui raiz");
        }

    }
}