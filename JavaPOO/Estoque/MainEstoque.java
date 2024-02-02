package Estoque;

import java.util.ArrayList;
import java.util.Scanner;

public class MainEstoque {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ControleDeEstoque controleEstoque = new ControleDeEstoque();

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Adicionar um produto");
            System.out.println("2. Deletar um produto");
            System.out.println("3. Ver a lista de produtos");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");

            int escolha = scanner.nextInt();
            scanner.nextLine();

            switch (escolha) {
                case 1:
                    controleEstoque.adicionarProduto(scanner);
                    break;
                case 2:
                    controleEstoque.deletarProduto(scanner);
                    break;
                case 3:
                    controleEstoque.verListaProdutos();
                    break;
                case 4:
                    System.out.println("Saindo do programa. Até mais!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }
}