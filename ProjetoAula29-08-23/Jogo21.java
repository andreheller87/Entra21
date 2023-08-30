import java.util.Scanner;
    public class Jogo21{
        public static void main (String args[]){
            Scanner in = new Scanner(System.in);
            
            int comp = (byte)(Math.random()*21+1);
            int carta1 = (byte)(Math.random()*10+1);
            int carta2 = (byte)(Math.random()*10+1);
            int novaCarta= (byte)(Math.random()*10+1);
            int soma = carta1 + carta2; 
            char escolha;
            
            System.out.println("===================");
            System.out.println("Cartas inicial");
            System.out.println("  ____  ____");
            System.out.println(" | * | | * |");
            System.out.println(" | " +carta1 + " | | " + carta2+ " |");
            System.out.println(" |   | |   |");
            System.out.println("  ----  ----");
            System.out.println("===================");
            System.out.println("A soma das sua cartas é: " +soma);
            do{
            System.out.println("Deseja mais uma carta? S/N");
                escolha = in.next().charAt(0); 
              
            
                
                
                
            switch(escolha){
                
                case 'S':
                    soma = soma + novaCarta;
                     System.out.println("===================");
            System.out.println("Nova Carta");
            System.out.println("  ____ ");
            System.out.println(" | * | ");
            System.out.println(" | " +novaCarta + " | ");
            System.out.println(" |   | ");
            System.out.println("  ----  ");
            System.out.println("===================");
                    if(soma >21){
                        System.out.println("Você perdeu!!");
                         System.out.println("A soma das sua cartas é: " +soma);
                        return;
                    }else{
                    System.out.println("A soma das sua cartas é: " +soma);
                }
                break;
                case 'N':
                    System.out.println("A soma das sua cartas é: " +soma);
                    System.out.println("A soma do computador  é: " +comp);
                    if(soma>= comp){
                         System.out.println("Você ganhou!!");
                    }else{
                         System.out.println("Você Perdeu!!");
                    }
                    return;
                 
            }
            
            
            
            
            
        
            
        }while(true);
        
       
        
    }

}