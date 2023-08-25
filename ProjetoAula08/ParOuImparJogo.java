import java.util.Scanner;
import java.util.Random;

public class ParOuImparJogo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("++++++++++++++++++++");
        System.out.println("Jogo Par ou Ímpar!");
         System.out.println("++++++++++++++++++++");
          System.out.println();
        System.out.print("Digite seu nome: ");
        String nomeUsuario = scanner.nextLine();
        
        int vitoriasUsuario = 0;
        int vitoriasComputador = 0;
        
        while (true) {
            int numeroUsuario;
            
            do {
                System.out.print("\nDigite um número entre 0 e 5: ");
                numeroUsuario = scanner.nextInt();
            } while (numeroUsuario < 0 || numeroUsuario > 5);
            
            int numeroComputador = random.nextInt(6); 
            
            System.out.println(nomeUsuario + " escolheu " + numeroUsuario);
            System.out.println("Computador escolheu " + numeroComputador);
            
            int soma = numeroUsuario + numeroComputador;
            
            System.out.println("A soma dos números é: " + soma);
            
            if (soma % 2 == 0) {
                System.out.println("A soma é PAR!");
                if (soma == 0) {
                    System.out.println("É um empate!");
                } else {
                    System.out.println(nomeUsuario + " venceu!");
                    vitoriasUsuario++;
                }
            } else {
                System.out.println("A soma é ÍMPAR!");
                System.out.println("Computador venceu!");
                vitoriasComputador++;
            }
            System.out.println();
            System.out.println("Placar:");
            System.out.println(nomeUsuario + ": " + vitoriasUsuario + " vitórias");
            System.out.println("Computador: " + vitoriasComputador + " vitórias");
            System.out.println();
            System.out.print("Deseja jogar novamente? (S/N): ");
            String jogarNovamente = scanner.next();
            
            if (!jogarNovamente.equalsIgnoreCase("S")) {
                System.out.println("Obrigado por jogar!");
                break;
            }
        }
        
        scanner.close();
    }
}
