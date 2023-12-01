import java.util.Scanner;

public class PiramideComFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número de linhas da pirâmide: ");
        int numLinhas = scanner.nextInt();
        
        for (int i = 1; i <= numLinhas; i++) {
            // Loop para imprimir espaços em branco à esquerda
            for (int j = 1; j <= numLinhas - i; j++) {
                System.out.print(" ");
            }
            
            // Loop para imprimir asteriscos
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            
            // Mova para a próxima linha
            System.out.println();
        }
        
        scanner.close();
    }
}
