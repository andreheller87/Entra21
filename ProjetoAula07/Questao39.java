
/**
 * Escreva um algoritmo que leia a quantidade de funcionários em uma empresa e,
 * para cada funcionário leia seu nome e seu tempo de serviço (em meses). Se o funcionário 
 * possuir mais de 12 meses na empresa, escreva a mensagem “<NOME> tem direito a férias”. 
 * Caso contrário, escreva a mensagem “<NOME> não tem direito a férias”. 
 * Ao final, exiba quantos funcionários possuem direito a férias e quantos não possuem.   
 */


import java.util.Scanner; 
 	public class Questao39 { 
    public static void main(String[] args) { 
	        Scanner in = new Scanner(System.in); 
	        int i, qtdFuncionarios, tempoServico; 
	        String nome; 
        System.out.print("Digite a quantidade de funcionários: "); 
	        qtdFuncionarios = in.nextInt(); 
	        for (i=1; i<= qtdFuncionarios; i++){ 
	            System.out.println("Digite o nome do funcionario: "); 
	            nome = in.next() + in.nextLine(); 
	            System.out.println("Digite o tempo de serviço em meses: "); 
	            tempoServico = in.nextInt(); 
            if (tempoServico >= 12){ 
	                System.out.println(nome+ " tem direito à férias"); 
 	            }else{ 
	                System.out.println(nome+ " NÃo tem direito à férias"); 
	            } 
	        }    
	    } 
 	} 
