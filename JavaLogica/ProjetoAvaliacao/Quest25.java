
/*
 * 25.	Escreva um algoritmo que leia a quantidade de
 * funcionários em uma empresa e, para cada funcionário leia
 * seu nome e seu tempo de serviço (em meses). Se o funcionário
 * possuir mais de 12 meses na empresa, escreva a mensagem “<NOME>
 * tem direito a férias”. Caso contrário, escreva a mensagem “<NOME>
 * não tem direito a férias”. Ao final, exiba quantos funcionários
 * possuem direito a férias e quantos não possuem.   
   
   */
  import java.util.Scanner;
public class Quest25 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite a quantidade de funcionários: ");
        int quantFunc = scan.nextInt();

        int funcComDirAFerias = 0;
        int funcSemDirAFerias = 0;

        for (int i = 1; i <= quantFunc; i++) {
            System.out.print("Digite o nome do funcionário " + i + ": ");
            String nome = scan.next();

            System.out.print("Digite o tempo de serviço (em meses) do funcionário " + nome + ": ");
            int tempServ = scan.nextInt();

            if (tempServ > 12) {
                System.out.println(nome + " tem direito a férias.");
                funcComDirAFerias++;
            } else {
                System.out.println(nome + " não tem direito a férias.");
                funcSemDirAFerias++;
            }
        }
           System.out.println("*****************************************************"); 
        System.out.println("Funcionários com direito a férias: " + funcComDirAFerias);
        System.out.println("Funcionários sem direito a férias: " + funcSemDirAFerias);
        System.out.println("*****************************************************");
        scan.close();
    }
}
