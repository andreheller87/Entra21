
/**
 * 15.	Construa um algoritmo que leia do usuário o salário e exiba uma mensagem 
 * de acordo com as seguintes condições: se o salário for até R$ 645, escreva a mensagem 
 * “Até 1 salário mínimo; se o salário for acima de R$ 645 e até R$ 1935, escreva a mensagem 
 * “Até 3 salários mínimos”; se for acima de R$ 1935 e abaixo de R$ 3225, escreva a mensagem 
 * “Até 5 salários mínimos”; se for acima de R$ 3225, escreva a mensagem “Acima de 5 salários mínimos”.  
 */
import java.util.Scanner;
public class Quest15
{
    
   
        public static void main (String args[]){
            Scanner in = new Scanner(System.in);
            
            double sal;
            
            
            
            System.out.println("Digite seu salario: ");
            sal = in.nextDouble();
            
            
            if(sal<=645){
                 System.out.println("Até 1 salário mínimo");
            }else if(sal>645 && sal<=1935){
                System.out.println("Até 3 salários mínimos");
            }else if(sal>1935 && sal<=3225){
                 System.out.println("Até 5 salários mínimos");
            }else if(sal>3225){
                System.out.println("Acima de 5 salários mínimos");
            }
            
}

   
}
