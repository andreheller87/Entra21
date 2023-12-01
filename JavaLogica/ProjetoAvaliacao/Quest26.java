
/**

 */
import java.util.Scanner;
public class Quest26
{
 


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite a quantidade de animais na loja: ");
        int quantAnimais = scan.nextInt();

        int contGatos = 0;
        int contCachorros = 0;

        for (int i = 1; i <= quantAnimais; i++) {
            System.out.print("Digite o tipo do animal (1 para gato, 2 para cachorro): ");
            int tipoAnimal = scan.nextInt();

            switch (tipoAnimal) {
                case 1:
                    contGatos++;
                    break;
                case 2:
                    contCachorros++;
                    break;
                default:
                    System.out.println("Tipo de animal inválido. Use 1 para gato ou 2 para cachorro.");
                    i--; 
                    break;
            }
        }

        System.out.println("Quantidade de gatos na loja: " + contGatos);
        System.out.println("Quantidade de cachorros na loja: " + contCachorros);

        scan.close();
    }
}


