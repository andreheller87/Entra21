import java.util.Scanner;
public class Main2{
    public static void main(String args[]){
        Scanner ler = new Scanner(System.in);
        Telefone t1 = new Telefone(); 
        
        
        System.out.print("Informe o DDD: ");
        t1.setDDD(ler.nextInt());
        
        System.out.print("Digite a primeira parte do número: ");
        t1.setPriNum(ler.nextInt());
        
        System.out.print("Digite a segunda parte do número: ");
        t1.setSegNum(ler.nextInt());
        
        System.out.print("Visualizando o Telefone completo: ");
        
        System.out.print(t1);
}
}