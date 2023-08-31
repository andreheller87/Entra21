/** 19.Escreva um algoritmo que calcule a soma dos números de 1 a 15. Utilize o comando de repetição Enquanto (While).*/


    public class Quest19{
        public static void main (String args[]){
            
            
            int i=1;
            int soma=0;

            
            while (i<=15){
                soma +=i;
                i++;
            }
            System.out.print(soma);
            
}
}