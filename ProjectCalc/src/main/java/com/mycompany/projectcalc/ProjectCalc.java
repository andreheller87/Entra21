/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.projectcalc;

import java.util.Scanner;

/**
 *
 * @author André Heller
 */
public class ProjectCalc {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();
        
        while (true) {
            
            System.out.println("======================");
            System.out.println("(1)Para somar");
            System.out.println("(2)Para subt");
            System.out.println("(3)Para mult");
            System.out.println("(4)Para div");
            System.out.println("(0)Para sair");
            System.out.println("======================");
              int opcao = in.nextInt();
              if(opcao == 0){
                  return;
              }
            
            System.out.println("Digite o primeiro numero");
            double n1 = in.nextDouble();
            System.out.println("Digite o segundo numero");
            double n2 = in.nextDouble();

            calculadora.setNumero1(n1);
            calculadora.setNumero2(n2);

          
            
              
              switch(opcao){
                  case 1:
                      System.out.println("A soma é: " + calculadora.calcularSoma());
                      break;
                       case 2:
                      System.out.println("A subtração é: " + calculadora.calcularSub());
                      break;
                       case 3:
                      System.out.println("A multiplicação é: " + calculadora.calcularMult());
                      break;
                       case 4:
                      System.out.println("A Divisão é: " + calculadora.calcularDiv());
                      break;
                       case 0:
                           return;
                       default: 
                           System.out.println("Opção invalida");
              }
        }
    }
}
