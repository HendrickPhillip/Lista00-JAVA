package br.edu.hendrick.senha;
import java.util.Scanner;

public class TUI {
    private int numero;
    private Jogo j1, j2;
    private Scanner scanner;
    
    public TUI(){
        this.scanner = new Scanner(System.in);
    }
    public void printTUI(){
        System.out.println("Digite o numero (0/100): ");
        numero = scanner.nextInt();
        setJ1(new Jogo(numero));
        System.out.println("1°Tentativa \nAche o numero (0/100): ");
        numero = scanner.nextInt();
        setJ2(new Jogo(numero));
    }
     public void solve(){
         
     }
     
    public void tui(){
        printTUI();
        solve();
    }

    public Jogo getJ1() {
        return j1;
    }

    public void setJ1(Jogo j1) {
        this.j1 = j1;
    }

    public Jogo getJ2() {
        return j2;
    }

    public void setJ2(Jogo j2) {
        this.j2 = j2;
    }
    
}
