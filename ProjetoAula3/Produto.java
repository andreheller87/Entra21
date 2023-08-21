import java.util.Scanner;

public class Produto{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String codProd;
        String nomProd;
        double valProd;
        int quantProd;
        double valTotal;
        
        System.out.println("Digite o código do produto: ");
        codProd = in.next();
        System.out.println("Digite o nome produto: ");
        
        nomProd =in.next();
        System.out.println("Digite valor do produto: ");
        valProd = in.nextDouble();
        System.out.println("Digite a quantidade do produto: ");
        quantProd = in.nextInt();
        
        valTotal = quantProd * valProd;
        
        System.out.println();
        System.out.println("******Cadastro******");
        System.out.println("Código:      |" + codProd);
        System.out.println("Nome:        |" + nomProd);
        System.out.println("Valor:       |" + valProd);
        System.out.println("Quantidade:  |" + quantProd);
        System.out.println("Valor Total: |" + valTotal);
        System.out.println("********************");
        
        in.close();
        }
        
        
    
  
}

