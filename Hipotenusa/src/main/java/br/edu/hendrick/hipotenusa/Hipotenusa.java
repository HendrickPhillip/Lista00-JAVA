/*Faça um programa em java que receba o valor dos catetos a e b de um triângulo,
calcule e mostre o valor da hipotenusa. Fórmula (h = )
*/


package br.edu.hendrick.hipotenusa;

import java.util.Scanner;

public class Hipotenusa {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Calculo c1 = new Calculo();
    
        System.out.println("Valor ladoB: "); c1.setLadoB(ler.nextDouble());
        System.out.println("Valor ladoC: "); c1.setLadoC(ler.nextDouble());
        System.out.println("Valor da Hipotenusa: "+ c1.result());
        
    }
}
