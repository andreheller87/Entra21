/** 6. Crie um algoritmo que lê o salário de um funcionário, reajusta o salário em 7% e mostra o resultado.  */

import java.util.Scanner;
    public class Quest06{
        public static void main (String args[]){
            Scanner in = new Scanner(System.in);
            double sal;
            
            System.out.print("Digite o salário do funcionário");
            sal = in.nextDouble();
            sal = sal +(sal*0.07);
            System.out.print("O salário do funcionário é: " +sal);
            
            
            
            
}
}