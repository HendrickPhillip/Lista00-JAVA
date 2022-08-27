package br.edu.hendrick.pesoplanetas;
import java.util.Scanner;
public class PesoPlanetas {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Planetas p1 = new Planetas();
        
        System.out.println("---PLANETAS---");
        System.out.println("");
        System.out.println("Seu Peso: "); p1.setPeso(ler.nextDouble());              
        System.out.println("(1)Mercurio");
        System.out.println("(2)Venus");
        System.out.println("(3)Marte");
        System.out.println("(4)Jupiter");
        System.out.println("(5)Saturno");
        System.out.println("(6)Urano");
        System.out.println("Opção: "); p1.setOp(ler.nextInt());
        System.out.println(p1.escolha());
        
    }
}
