import java.util.Scanner;

public class CalculoMediaAlunos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numAlunos = 4;
        int numDisciplinas = 5;
        String nome;
        for (int i = 1; i <= numAlunos; i++) {
            System.out.println("\nDigite o nome do aluno:");
            nome = scan.nextLine();
 
            double nota = 0.0;
            double soma = 0.0;
            double mediaTotalDiscplina =0.0;
            double mediaDaDisciplina = 0.0;
            double somaTotalDiscplinas =0.0;

            for (int disciplina = 1; disciplina <= numDisciplinas; disciplina++) {
                
                for(int j=1;j<=3;j++){
                System.out.print("Digite a " + j +"ª nota da disciplina " +disciplina + ": ");
                nota = scan.nextDouble();
                soma += nota;
                  
            }
            mediaDaDisciplina = soma / 3;
            System.out.printf("Media da disciplina %d: %.2f \n",disciplina , mediaDaDisciplina );
             somaTotalDiscplinas += mediaDaDisciplina; 
             mediaDaDisciplina =0.0;
             soma =0.0;
             System.out.println();
            }
            mediaTotalDiscplina = somaTotalDiscplinas /5;
            
            System.out.println("=====================================================");
            System.out.printf("Média do Aluno %s: %.2f%n",nome, mediaTotalDiscplina);

            if (mediaTotalDiscplina >= 7.0) {
                System.out.println("Status do Aluno " + nome + ": Aprovado");
            } else {
                System.out.println("Status do Aluno " + nome + ": Reprovado");
            }
            System.out.println("=====================================================");
        }

        scan.close();
    }
}