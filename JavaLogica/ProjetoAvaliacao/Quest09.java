//Crie um algoritmo que solicite o nome, o endereço e o telefone do usuário e depois mostra os dados digitados em uma única linha.*/

import java.util.Scanner;
    public class Quest09{
        public static void main (String args[]){
            Scanner in = new Scanner(System.in);
            
            String nome;
            String endereco;
            String telefone;
            
            
            System.out.println("Digite o nome: ");
            nome = in.nextLine();
            System.out.println("Digite o endereço: ");
            endereco = in.nextLine();
            System.out.println("Digite o telefone: ");
            telefone = in.nextLine();
            
            System.out.printf("nome: %s endereço: %s telefone: %s",nome, endereco, telefone);
            
            
}
}