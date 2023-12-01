import java.util.Scanner;

public class Cadastro{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String codAluno;
        String nomAluno;
        byte idadeAluno;
        double valMensal;
        
        System.out.println("Digite o código do aluno: ");
        codAluno = in.next();
        System.out.println("Digite o nome aluno: ");
        
        nomAluno = in.nextLine();in.next();
        System.out.println("Digite a idade aluno: ");
        idadeAluno = in.nextByte();
        System.out.println("Digite o valor da mensalidade: ");
        valMensal = in.nextDouble();
        
        System.out.println();
        System.out.println("******Cadastro******");
        System.out.println("Código:      |" + codAluno);
        System.out.println("Nome:        |" + nomAluno);
        System.out.println("Idade:       |" + idadeAluno);
        System.out.println("Valor mensal:|" + valMensal);
         System.out.println("********************");
        
        in.close();
        }
        
        
    
  
}
