package br.edu.hendrick.jokenpo;
import java.util.Scanner;
public class JoKenPo {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in); 
        Jogador j1 = new Jogador();
        Computador c1 = new Computador();
        
        System.out.println("---JoKenPo----");
        System.out.println("(0)Pedra");
        System.out.println("(1)Papel");
        System.out.println("(2)Tesoura");
        System.out.println("Escolha: "); j1.setEscolha(ler.nextInt());
        System.out.println("");       
        
        if(j1.jogo() == c1.jogo()){
            System.out.println("EMPATE");
        } else 
            if (j1.jogo() == 0 && c1.jogo() == 2){
                System.out.println("Jogador Ganhou");
            }
            else {
                System.out.println("Computador ganhou");
            }
    }
}
