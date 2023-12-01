import java.util.Scanner;

public class Pagamento{

    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String nome;
        double salBase= 3800.0;
        double prov;
        double desc;
        double abono =salBase * 0.04;
        double insalubre =salBase * 0.08;
        double inss =salBase * 0.09;
        double valRef =salBase * 0.08;
        double valTransp =salBase * 0.06;
        double salLiq;

        System.out.println("Digite o nome do funcionario");
        nome = in.next();

        prov =   abono +   insalubre;
        desc =  inss + valRef +  valTransp;
        salLiq = salBase + prov - desc;

        System.out.println("Nome do funcionario: " + nome );
        System.out.println("********Proventos********");
        System.out.println("Abono:" + abono);
        System.out.println("Insalubridade:" + insalubre);
        System.out.println();
        System.out.println("********Descontos********");
        System.out.println("Inss:" + inss);
        System.out.println("Vale Refeição:" + valRef);
        System.out.println("Vale Transporte:" + valTransp);

        System.out.println("O salario do Liquido é: R$" + salLiq);

        
        
    }
    
    
}
