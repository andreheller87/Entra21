
/**
 * 14.	Crie um algoritmo que, dada uma temperatura em graus célsius, exiba uma mensagem informando o 
 * tipo do clima, de acordo com as seguintes condições: se a temperatura estiver até 18 graus, 
 * o clima é frio; se a temperatura estiver entre 19 e 23 graus, o clima é agradável; se a temperatura estiver 
 * entre 24 e 35 graus, o clima é quente; se a temperatura estiver acima de 35 graus, o clima é muito quente.   
 */
import java.util.Scanner;
    public class Quest14{
        public static void main (String args[]){
            Scanner in = new Scanner(System.in);
            
            double temp;
            
            
            
            System.out.println("Digite a temperatura: ");
            temp = in.nextDouble();
            
            
            if(temp<=18){
                 System.out.println("Clima: é frio ");
            }else if(temp>18 && temp<=23){
                System.out.println("Clima: agradável ");
            }else if(temp>23 && temp<=35){
                 System.out.println("Clima: quente ");
            }else if(temp>35){
                System.out.println("Clima: muito quente ");
            }
            
}
}