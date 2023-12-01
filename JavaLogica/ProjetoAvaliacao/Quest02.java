/** 2.	Crie um algoritmo que leia um número inteiro e mostre seu sucessor e antecessor. */

import java.util.Scanner;
    public class Quest02{
        public static void main (String args[]){
            Scanner in = new Scanner(System.in);
            
            int num1;
           
            
            
            System.out.println("Digite um número: ");
            num1 = in.nextInt();
            int antecessor = num1 -1;
            int sucessor = num1 +1;
            
            System.out.println("O número antecessor é: " +antecessor);
            System.out.println("O número sucessor é: " +sucessor);
            
}
}