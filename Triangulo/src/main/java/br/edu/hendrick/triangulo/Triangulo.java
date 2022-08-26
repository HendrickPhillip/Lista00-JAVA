/*Implemente um programa em Java que leia as medidas dos lados
de um triângulo e escreva se ele é equilátero, isósceles ou escaleno.
Sendo que:  
Triângulo Equilátero: possui os 3 lados iguais.  
Triângulo Isósceles: possui 2 lados iguais.  
Triângulo Escaleno: possui 3 lados diferentes.
*/

package br.edu.hendrick.triangulo;
import java.util.Scanner;
public class Triangulo {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Lados L1 = new Lados();
        
        System.out.println("---Dimencoes do triangulo---");
        System.out.println("Lado A:"); L1.setLadoA(ler.nextInt());
        System.out.println("Lado B:"); L1.setLadoB(ler.nextInt());
        System.out.println("Lado C:"); L1.setLadoC(ler.nextInt());
        System.out.println("Triangulo");
        System.out.println(" " + L1.calculo());
        
    }
}
