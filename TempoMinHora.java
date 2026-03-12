package com.mycompany.tempominhora;
import java.util.Scanner;
public class TempoMinHora {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        
        double min;
        System.out.println("Digite o valor em minutos: ");
        min = scr.nextDouble();
        TempoMinHora.converterParaHoras(min);
    }
    static void converterParaHoras(double valor) {
        double emHoras = valor/60;
        System.out.println(valor + " minutos sendo convertido para horas é igual a: " + emHoras + " horas ");

    }
}

