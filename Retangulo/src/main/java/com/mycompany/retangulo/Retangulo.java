package com.mycompany.retangulo;
import java.util.Scanner;

public class Retangulo {

    public static void main(String[] args) { 
    Scanner ler = new Scanner(System.in);
    int altura, largura; 
    
    System.out.printf("Informe a altura:\n"); altura = ler.nextInt();
    System.out.printf("Informe a largura:\n"); largura = ler.nextInt();
    System.out.println("A área é igual a: " + altura * largura);

    }
}
