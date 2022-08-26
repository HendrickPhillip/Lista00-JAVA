package br.edu.hendrick.salario;

import java.util.Scanner;

public class Salario {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Calculo c1 = new Calculo();
                
        System.out.println("Salario minimo: "); c1.setSalorioMinimo(ler.nextDouble());
        System.out.println("Salario ganho: "); c1.setSalorioGanho(ler.nextDouble());
        System.out.println("Quantos salarios minimos: " + c1.result());
    }
}
