package br.edu.hendrick.mainswing_4;

public class Montante {

    private double valor;
    private double taxa;
    private int tempo;

    public Montante() {
    }

    public double calcularMontante() {
        double total = getValor();
        for (int i = 0; i < getTempo(); i++) {
            total = total + (total *(getTaxa()/100));
        }
        return total;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }

    public int getTempo() {
        return tempo;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }
}
