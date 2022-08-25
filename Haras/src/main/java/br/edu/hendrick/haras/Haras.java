/*Faça um programa em java
para calcular quantas ferraduras são necessárias
para equipar todos os cavalos comprados para um haras.
A informação de cavalos comprados deve ser informada pelo usuário.
*/

package br.edu.hendrick.haras;
import java.util.Scanner;

public class Haras {
    public static void main(String[] args) { 
        Cavalo c1 = new Cavalo();
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Quantos cavalos?");c1.setCavalos(ler.nextInt());
        System.out.println("Quantidade de Ferraduras: " + c1.quantidade());
    }
}
