package br.edu.hendrick.salario;
public class Calculo {
    private double salorioMinimo;
    private double salorioGanho;
    private double quantidadeSalario;

    public double getSalorioMinimo() {
        return salorioMinimo;
    }

    public void setSalorioMinimo(double salorioMinimo) {
        this.salorioMinimo = salorioMinimo;
    }

    public double getSalorioGanho() {
        return salorioGanho;
    }

    public void setSalorioGanho(double salorioGanho) {
        this.salorioGanho = salorioGanho;
    }
    
    public double result(){
        return quantidadeSalario = salorioGanho / salorioMinimo; 
    }
}
