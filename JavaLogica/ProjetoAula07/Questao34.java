import java.util.Scanner;
public class Questao34
{
    public static void main(String []args){
        //Escreva um algoritmo que leia o nome e a idade de 10 pessoas e exiba: o nome e a idade da pessoa mais nova.  
        Scanner in = new Scanner(System.in);
        String nome, nomeMenor = "";
        int idade, idadeMenor = 130;
        
        
        
        for(int i=1;i<=10;i++){
            System.out.println("Digite o nome :");
            nome = in.next() + in.nextLine();
            System.out.println("Digite a idade :");
            idade = in.nextInt();
            
            
            if(idade<idadeMenor){
                idadeMenor = idade;
                nomeMenor = nome;
            }
            
        }
        System.out.println("Nome:" + nomeMenor);
         System.out.println("Idade:" + idadeMenor);
        

        in.close();
        
    }
}
