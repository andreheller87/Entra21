
/**
 * Escreva um algoritmo que simule o funcionamento de um caixa de supermercado. O seu algoritmo deve receber do 
 * a informação de quantos produtos o cliente comprou e, para cada 
 * produto, deverá ler o seu preço. Ao final, deverá informar quanto o cliente deve pagar pelas compras.  
 */

import java.util.Scanner; 
public class Questao41 { 
    public static void main(String[] args) { 
	        Scanner in = new Scanner(System.in); 
        int i, qtdProdutos; 
        double precoProduto, precoTotal; 
        precoTotal = 0; 
        System.out.print("Digite a quantidade de produtos: "); 
        qtdProdutos = in.nextInt(); 
	        for (i=1; i<= qtdProdutos; i++){ 
	            System.out.print("Digite o preço do produto "+ i +  ": "); 
	            precoProduto = in.nextDouble(); 
            precoTotal += precoProduto; 
	        }    
	        System.out.print("O preço total é: "+ precoTotal); 
	    } 
	} 
