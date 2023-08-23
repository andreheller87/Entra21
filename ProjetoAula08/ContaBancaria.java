
import java.util.Scanner;
import java.io.IOException;


public class ContaBancaria
{
    public static void main(String [] args)  throws IOException {
      
        Scanner ler = new Scanner(System.in);
        double saldo =300;
        char info;
        double valor = 0;
        
        while(true){
             System.out.printf("\n================");
            
             System.out.printf("\nSaldo = %.2f" ,saldo);
             System.out.printf("\n================");

            System.out.printf("\nVocê deseja Sacar ou Depositar (S/D");
            info = (char)System.in.read();
            
            if((info == 'S' || info == 's') && saldo>0){
                 System.out.printf("\nInforme o valor para sacar");
                 valor = ler.nextDouble();
                 saldo -= valor;
            }else if((info == 'S' || info == 's') && saldo<=0){
                 System.out.printf("\nSaldo insuficiente");
            }
            
            
             if(info == 'D' || info == 'd'){
                System.out.printf("\nInforme o valor para depositar");
            valor = ler.nextDouble();
            saldo += valor;
            }
            
            System.out.printf("\n================");
            
             System.out.printf("\nSaldo = %.2f" ,saldo);
             System.out.printf("\n================");
            
            
        }
      
         
       
    }
    
    
}
