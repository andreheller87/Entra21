import java.util.Scanner;
public class Exercicio7
{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        double num;
while(true){
        System.out.println("Digite um numero:");
        num = in.nextDouble();

        System.out.println("====================");
        
        if(num == 0){
            System.out.println("numero:"+ num + "numero neutro");
        }else{
            if((num%2) == 0 && num>0 ){
                System.out.println("numero:"+ num + " E Par e positivo");
            }else if((num%2) == 0 && num<0){
                System.out.println("numero:"+ num + " E Par e negativo");
            }else if((num%2) == 1 && num>0){
                System.out.println("numero:"+ num + " E impar e positivo");
            }else {
                System.out.println("numero:"+ num + " E impar e negativo");
            }
        }
        System.out.println("====================");
    }
        
    }

}