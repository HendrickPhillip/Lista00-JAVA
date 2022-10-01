package br.edu.hendrick.temperaturas;
import java.util.Scanner;
public class TUI {
  private float txtTemperatura;
    private final Scanner scanner; 
    private Grau Celsius;
    private Conversor converter;

    public TUI(){
        this.scanner = new Scanner(System.in);
    }

    public void printTUI(){
        System.out.println("Digite a temperatura em Celsius(C): ");
        setTxtTemperatura(scanner.nextFloat());
    }

    public void solve(){
        this.Celsius = new Grau(txtTemperatura);
        this.converter = new Conversor();
        converter.Conversoes(Celsius);
    }

    public void tui(){
        printTUI();
        solve();
    }

    public void setTxtTemperatura(float v1){
        this.txtTemperatura = v1;
    }
    public float getTxtTemperatura(){
        return this.txtTemperatura;
    }

    public void setCelsius(Grau celsius){
        this.Celsius = celsius;
    }
    public Grau getSenha(){
        return this.Celsius;
    }  
}
