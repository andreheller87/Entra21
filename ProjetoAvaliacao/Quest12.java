/**12.Escreva um algoritmo que leia uma letra que represente o sexo de uma pessoa (M para Masculino e F para feminino). Se for masculino, mostra a mensagem “Seja bem-vindo, Senhor!”, se for feminino, mostra a mensagem “Seja bem-vinda, Senhora!”. */
/** “Seja bem-vindo, Senhor!” */
/** “Seja bem-vinda, Senhora!” */

import java.util.Scanner;
    public class Quest12{
        public static void main (String args[]){
            Scanner in = new Scanner(System.in);
            char sexo;
            
            System.out.print("Digite o sexo: (M/F)");
            sexo = in.next().charAt(0);
            
            if (sexo=='M'||sexo=='m'){
                
            
            System.out.print("Seja bem-vindo, Senhor!");
        }else if (sexo=='F'||sexo=='f') {
            System.out.print("Seja bem-vinda, Senhora!");
            
            
        }
            
    }}            
            
            
