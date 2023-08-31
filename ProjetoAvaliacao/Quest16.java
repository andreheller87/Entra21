/** 16.Escreva um algoritmo que leia um número inteiro (de 1 a 7) representando o dia da semana e informe o nome do dia correspondente.*/
import java.util.Scanner;
    public class Quest16{
        public static void main (String args[]){
            Scanner in = new Scanner(System.in);
            int opcao;
            
            
            System.out.println("Digite um número inteiro de 1 a 7: ");
            opcao = in.nextInt();
            
            
            switch (opcao){
                case 1: 
                    System.out.println("Segunda");
                    break;
                case 2:
                    System.out.println("Terça");
                    break;
                case 3: 
                    System.out.println("Quarta");
                    break;
                    case 4:
                    System.out.println("Quinta");
                    break;
                case 5:
                    System.out.println("Sexta");
                    break;
                case 6:
                    System.out.println("Sábado");
                    break;
                case 7:
                    System.out.println("Domingo");
                    break;
            
                
                
                
               
            }
            
            
            
            
            
}
}

