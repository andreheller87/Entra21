import java.util.Scanner;
public class Situacao
{
   public static void main(String args[]){
       Scanner in = new Scanner(System.in);
       double nota1, nota2, nota3, nota4, media;
       int freq;
       
       System.out.println("Digite a primeira nota: ");
       nota1 = in.nextDouble();
       System.out.println("Digite a segunda nota: ");
       nota2 = in.nextDouble();
       System.out.println("Digite a terceira nota: ");
       nota3 = in.nextDouble();
       System.out.println("Digite a quarta nota: ");
       nota4 = in.nextDouble();
       System.out.println("Digite a frequencia: ");
       freq = in.nextInt();
       
       media = (nota1 + nota2 + nota3 + nota4) / 4;
       
       System.out.println("***********************");
       
       if(media>=7 && media<=10 && freq>=75 && freq<=100){
           System.out.println("Aluno Aprovado");
       } else if(media>=4 && media<7 && freq>=75 && freq<=100){
            System.out.println("Aluno Recuperação");
       }else if(media>=0 && media<4 || freq<75){
           System.out.println("Aluno Reprovado");
       }else{
           System.out.println("Media ou frequência invalida ");
       }
      
       System.out.println("Média do aluno:      " + media);
       System.out.println("Frequência do aluno: " + freq+"%");
       System.out.println("***********************");
       
       in.close();
   }
}
