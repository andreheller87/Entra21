/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projectcalc;

/**
 *
 * @author André Heller
 */
public class Calculadora {

    private double mais;
    private double menos;
    private double multi;
    private double divisao;
    private double numero1;
    private double numero2;

    public void setMais(double mais) {
        this.mais = mais;
    }

    public double getMais() {
        return mais;
    }

    public double getMenos() {
        return menos;
    }

    public void setMenos(double menos) {
        this.menos = menos;
    }

    public double getMulti() {
        return multi;
    }

    public void setMulti(double multi) {
        this.multi = multi;
    }

    public double getDivisao() {
        return divisao;
    }

    public void setDivisao(double divisao) {
        this.divisao = divisao;
    }

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }
    
    public double calcularSoma() {
        mais = numero1 + numero2;
        return mais;
    }
    
     public double calcularSub() {
        menos = numero1 - numero2;
        return menos;
    }
     
       public double calcularMult() {
        multi = numero1 * numero2;
        return multi;
    }
       
        public double calcularDiv() {
        divisao = numero1 / numero2;
        return divisao;    }

}


