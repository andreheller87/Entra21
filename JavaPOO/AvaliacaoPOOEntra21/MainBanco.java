package AvaliacaoPOOEntra21;



public class MainBanco{
    public static void main (String[]args){
        ContaBancaria c1 = new ContaBancaria(1001, "Carlos");

        System.out.println(c1.toString());

        c1.depositar(50);
        System.out.println(c1.toString());

        c1.sacar(100);
        System.out.println(c1.toString());

        c1.sacar(30);
        System.out.println(c1.toString());
    }
}