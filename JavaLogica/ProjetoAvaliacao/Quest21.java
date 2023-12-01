/** 21.Escreva um algoritmo que calcule a soma dos números de 1 a 15. Utilize o comando de repetição Para (For).*/

public class Quest21{
        public static void main (String args[]){
            
            
            int soma=0;
            
            for(int i = 1;i<=15;i++){
                soma += i;
            }
            
            
            
            System.out.print(soma);
        }
}