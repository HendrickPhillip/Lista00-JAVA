package br.edu.hendrick.hipotenusa;
public class Calculo {
    private double ladoA;
    private double ladoB;
    private double ladoC;
    private double hipotenusa;

    public double getLadoA(double nextDouble) {
        return ladoA;
    }

    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    public double setLadoB(double ladoB) {
        this.ladoB = ladoB;
        return ladoB;
    }

    public double getLadoC() {
        return ladoC;
    }

    public double setLadoC(double ladoC) {
        this.ladoC = ladoC;
        return ladoC;
    }
    
    public double result(){        
        ladoA = (ladoB * ladoB) + (ladoC * ladoC);    
        return hipotenusa = Math.sqrt(ladoA);
    }
      
}
