import java.util.Scanner;
public class Produto
{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String nomeCli;
        String telefone;
        String cidade  ;
        String bairro;
        String rua;
        String numero;
        String prod1 = "Caneta";
        String prod2 = "Pasta Acrilica";
        String prod3 = "Apontador";
        double valProd1;
        double valProd2 = 28.0;
        double valProd3;
        
        
        
        System.out.println("Digite nome do Cliente:");
        nomeCli = in.next();
       
        System.out.println("Digite o cidade-Estado do cliente:");
       cidade =in.next();
       
       System.out.println("Digite o bairro do cliente:");
       bairro =in.next();
       
        System.out.println("Digite o rua do cliente:");
       rua =in.next();
       
        System.out.println("Digite o numero da casa do cliente:");
       numero =in.next();
       
       
        System.out.println("Digite o telefone do cliente");
        telefone = in.next();
        
         System.out.println("Digite o valor do produto caneta:");
        valProd1 = in.nextDouble();
        
         System.out.println("Digite o valor do produto Apontador:");
        valProd3 = in.nextDouble();
        
        
        double valTotProd1 = valProd1 * 380;
        double valTotProd2 = valProd2 * 210;
        double valTotProd3 = valProd3 * 108;

        valTotProd2 = valTotProd2 + (valTotProd2* 0.11);
        
        System.out.println("====================");
        System.out.println("Cliente:        | " + nomeCli);
        System.out.println("Endeço:         | "   +cidade + ", " + bairro + ", " + rua + ", n°" + numero);
        System.out.println("telefone:       | " + telefone);
        System.out.println("Caneta:         | " + valTotProd1);
        System.out.println("Pasta Acrilica: | " +  valTotProd2);
        System.out.println("Apontador:      | " + valTotProd3);
        System.out.println("Total:          | " + (valTotProd1 + valTotProd2 + valTotProd3));
          
        System.out.println("====================");
    }
        
    

}