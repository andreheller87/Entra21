/*
   20.	Escreva um algoritmo que calcule a soma dos números de 1 a 15. Utilize o comando de repetição Repita (Do...While).  
   */

public class Quest20

{
   

        public static void main (String[] args){
          
            int i =1;
            int soma =0;
            
            do{
                 soma +=i; 
                 i++;
            }while(i<=15);
            
            System.out.println("A soma dos numero de 1 a 15 é" + soma);
            
}

}