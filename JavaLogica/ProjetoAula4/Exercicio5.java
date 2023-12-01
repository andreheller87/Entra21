import java.util.Scanner;
public class Exercicio5
{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        double salFunc = 2800.0;
        String nomFunc;
        double vendas;
        double comissao = 0;
        
        System.out.println("Digite o nome do funcionario:");
        nomFunc = in.next();
        System.out.println("Digite o valor de venda do funcionario:");
        vendas = in.nextDouble();
        
        if(vendas >= 10000){
           comissao = vendas * 0.20;
        }else if(vendas >= 5000){
            comissao = vendas * 0.12;
        }
        
        System.out.println("====================");
        System.out.println("Funcionario: " + nomFunc);
        System.out.println("Comissâo: " + comissao);
        
    
        in.close();
    }
   
}