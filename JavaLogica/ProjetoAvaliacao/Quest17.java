
/**
17.	Escreva um algoritmo que leia dois números e apresente um menu com 4 opções: 1)
 Somar os números; 2) Subtrair os números; 3) Multiplicar os números; 4) Dividir os números. 
 Leia a opção do usuário e execute a operação e apresente o resultado. 
Caso a opção digitada seja inválida, apresente a mensagem de “Opção inválida” para o usuário.  
 */
import java.util.Scanner;
public class Quest17
{
    

    
   
        public static void main (String args[]){
            Scanner in = new Scanner(System.in);
            
            double num1;
            double num2;
            int opcao = 0;
            double resul;
            
            
            
            System.out.println("Digite um numero: ");
            num1 = in.nextDouble();
            
            System.out.println("Digite outro numero numero: ");
            num2 = in.nextDouble();
            
            System.out.println("=====================");
            System.out.println("1 para Soma");
            System.out.println("2 para Subtrair");
            System.out.println("3 para Multiplicar");
            System.out.println("4 para Dividir");
            System.out.println("=====================");
            
            
            opcao = in.nextInt();
            
            switch(opcao){
                case 1: 
                  resul =  num1 + num2;
                  System.out.printf("Soma = %.2f",resul);
                    break;
                    case 2: 
                  resul =  num1 - num2;
                  System.out.printf("Subtração = %.2f",resul);
                    break;
                    case 3: 
                  resul =  num1* num2;
                  System.out.printf("Multiplicação = %.2f",resul);
                    break;
                    case 4: 
                  resul =  num1 / num2;
                  System.out.printf("Divisão = %.2f",resul);
                    break;
                 
            }
            
            
            
}

   
}

