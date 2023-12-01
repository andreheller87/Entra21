import java.util.Scanner;

public class LojaPalhas
{
    public static void main(String []args){
        Scanner in = new Scanner(System.in); 

        String nomProd;
        double valor;
        double valorDesc = 10;
       
        double parcComDesc;
        int qntPrest = 5;

        System.out.println("Digite nome doProduto:");
        nomProd= in.next();

        System.out.println("Digite o valor do produto:");
        valor = in.nextDouble();

       
        
        parcComDesc = valor/5;
        parcComDesc = parcComDesc - (parcComDesc* 0.10);
        
          System.out.println("============================");
          
           System.out.println("Produto: " + nomProd);
           System.out.println("Valor: " + valor);
            System.out.println("Valor desconto: " + valorDesc+ "%");
           System.out.println("Valor das parcelas: " + parcComDesc);
         

           System.out.println("============================");
    }
}
