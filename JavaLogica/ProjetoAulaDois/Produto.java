import java.util.Scanner;

public class Produto{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String nomeProd; //nome do produto
        double valUnit; 
        int quant;
       
        System.out.println("Digite o nome do Produto: ");
        nomeProd = in.next();
        System.out.println("Qual o valor unitário do produto? ");
        valUnit = in.nextDouble();
        System.out.println("Qual a quantidade do produto? ");
        quant = in.nextInt();
        
        double valTot = valUnit * quant;
        
        System.out.println("O valor total do produto foi: R$" + valTot);
        
         double acrescimo = valTot + (valTot * 0.07);
       
         System.out.println("O valor total do produto com acréscimo de 7%: R$" + acrescimo);
     
    }
   
}
