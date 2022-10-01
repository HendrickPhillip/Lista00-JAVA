package br.edu.hendrick.temperaturas;
public class Conversor {
     private Grau grau;

    public void Conversoes(Grau grau){
        System.out.println("Temperatura em:\nCelcius: "+grau.getValor());
        System.out.println("Kelvin: "+(grau.getValor()+273.15));
        System.out.println("Réaumur: "+(grau.getValor()*0.8));
        System.out.println("Rankine: "+(grau.getValor()+459.67));
        System.out.println("Fahrenheit: "+(grau.getValor()*1.8+32.0));
    }

    public Grau getTemeperatura(){
        return this.grau;
    }
    public void setTentativas(Grau x){
        this.grau = x;
    }
}
