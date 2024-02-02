package Estoque;

import java.util.ArrayList;
import java.util.Scanner;

class ControleDeEstoque {
    private ArrayList<Produto> listaProdutos = new ArrayList<>();

    public void adicionarProduto(Scanner scanner) {
        System.out.println("Digite o nome do produto:");
        String nome = scanner.nextLine();

        System.out.println("Digite o valor do produto:");
        Float valor = scanner.nextFloat();

        System.out.println("Digite a data de fabricação (dd/MM/yyyy):");
        String dataFabricacao = scanner.next();

        System.out.println("Digite a data de validade (dd/MM/yyyy):");
        String validade = scanner.next();

        System.out.println("Digite a quantidade:");
        int quantidade = scanner.nextInt();

        System.out.println("Digite o armazenamento:");
        String armazenamento = scanner.next();

        Produto produto = new Produto(nome, valor, dataFabricacao, validade, quantidade, armazenamento);
        listaProdutos.add(produto);

        System.out.println("Produto adicionado com sucesso!\n");
    }

    public void deletarProduto(Scanner scanner) {
        System.out.println("Digite o nome do produto a ser deletado:");
        String nome = scanner.nextLine();

        for (Produto produto : listaProdutos) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                listaProdutos.remove(produto);
                System.out.println("Produto removido com sucesso!\n");
                return;
            }
        }

        System.out.println("Produto não encontrado.\n");
    }

    public void verListaProdutos() {
        if (listaProdutos.isEmpty()) {
            System.out.println("Lista de produtos vazia.\n");
        } else {
            System.out.println("Lista de produtos:");
            for (Produto produto : listaProdutos) {
                System.out.println(produto);
            }
        }
    }
}