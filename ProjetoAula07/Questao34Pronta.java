import java.util.Scanner; 
public class Questao34Pronta { 	 
    public static void main(String[] args) { 
        Scanner in = new Scanner(System.in); 
        int i, idade, idadeMaisNova; 
        String nome, nomeMaisNova; 
        System.out.println("Digite o nome:"); 
        nome = in.next() + in.nextLine(); 
        System.out.println("Digite a idade: "); 
        idade = in.nextInt(); 
        idadeMaisNova = idade; 
        nomeMaisNova = nome; 
        for (i=1; i<=9; i++){ 
            System.out.println("Digite o nome:"); 
            nome = in.next() + in.nextLine(); 
            System.out.println("Digite a idade: "); 
            idade = in.nextInt(); 
            if (idade < idadeMaisNova){ 
                nomeMaisNova = nome; 
                idadeMaisNova = idade; 
            } 
        } 
        System.out.println("Pessoa Mais Nova - Nome: "+ nomeMaisNova+ " Idade: "+ idadeMaisNova); 
    } 
} 
