/** 22.Escreva um algoritmo que leia o nome e a idade de 10 pessoas e exiba: o nome e a idade da pessoa mais nova.  */

import java.util.Scanner;
    public class Quest22{
        public static void main (String args[]){
            Scanner in = new Scanner(System.in);
            
            String nome;
            String nomeMenor ="";
            int idade;
            int idadeMenor = 200;
            
            for(int i = 1; i<=10;i++){
                System.out.print("Digite o nome: ");
                nome = in.nextLine();
                
                System.out.print("Digite a idade: ");
                idade = in.nextInt();
                if(idade<idadeMenor){
                    idadeMenor=idade;
                    nomeMenor=nome;
                }
                
            }
            
            System.out.print("Nome: "+ nomeMenor);
            System.out.print("Idade: "+idadeMenor);
            
            
            
        }
}