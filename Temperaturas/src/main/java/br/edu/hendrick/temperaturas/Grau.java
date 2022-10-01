package br.edu.hendrick.temperaturas;
public class Grau {
        private float valor;

    public Grau(){
        super();
        this.valor = 0;
    }

    public Grau(float x){
        super();
        this.valor = x;
    }

    @Override
    public String toString(){
        return "Temperatura: "+getValor();
    }

    public float getValor(){
        return this.valor;
    }
    public void setValor(float x){
        this.valor = x;
    }
}
