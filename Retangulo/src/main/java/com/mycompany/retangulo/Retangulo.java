/*Uma imobiliária vende apenas terrenos retangulares.
Faça um programa em java para ler as dimensões de um terreno
e depois exibir a área do terreno. (lado x altura)
*/

package com.mycompany.retangulo;
import java.util.Scanner;

public class Retangulo {

    public static void main(String[] args) { 
    Calculo c1 = new Calculo();    
    Scanner ler = new Scanner(System.in);
    
    
    System.out.printf("Informe a altura:\n"); c1.setAltura(ler.nextInt());
    System.out.printf("Informe a largura:\n"); c1.setLargura(ler.nextInt());
    System.out.println("A área é igual a: " + c1.area());

    }
}
