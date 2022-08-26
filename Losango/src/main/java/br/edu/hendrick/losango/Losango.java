package br.edu.hendrick.losango;

import java.util.Scanner;

public class Losango {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Area a1 = new Area();
        
        System.out.println("-----Losango-----");
        System.out.println("Diagonal Maior: "); a1.setDiagonalMaior(ler.nextInt());
        System.out.println("Diagonal Menor: "); a1.setDiagonalMenor(ler.nextInt());
        System.out.println("Area do losango: " + a1.result());
    }
}
