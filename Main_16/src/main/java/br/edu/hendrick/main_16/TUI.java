package br.edu.hendrick.main_16;
import java.util.Scanner;
public class TUI {
    private Scanner scanner;
    public Pessoas pessoas[];
    public Calculo cal;

    public TUI(){
        this.scanner = new Scanner(System.in);
        this.cal = new Calculo();
    }

    public void printTUI(){
    }

    public void solve(){
        pessoas = new Pessoas[4];
        cal.Calculo(pessoas);
    }

    public void tui(){
        printTUI();
        solve();
    }

    public Scanner getScanner(){
        return this.scanner;
    }
    public void setScanner(Scanner scanner){
        this.scanner = scanner;
    }
}
