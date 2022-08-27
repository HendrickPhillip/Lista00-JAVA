package br.edu.hendrick.pesoplanetas;
public class Planetas {
    private double peso;
    private double pesoPlaneta;
    private int op;
    
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getOp() {
        return op;
    }

    public void setOp(int op) {
        this.op = op;
    }
    
    
    public int escolha(){
        if (op == 1){
            System.out.println("Peso em Mercurio: " + mercurio());
        } else 
            if (op == 2){
            System.out.println("Peso em Venus: " + venus());
        } else 
            if (op == 3){
            System.out.println("Peso em Marte: " + marte());
        } else
            if (op == 4){
            System.out.println("Peso em Jupiter: " + jupiter());
        } else
            if (op == 5){
            System.out.println("Peso em Saturno: " + saturno());
        } else 
            if (op == 6){    
            System.out.println("Peso em Urano: " + urano());
        }
        return op;
    }
    
    public double mercurio(){
        return pesoPlaneta = (peso/10) * 0.37;
    }
    public double venus(){
        return pesoPlaneta = (peso/10) * 0.88;
    }
    public double marte(){
        return pesoPlaneta = (peso/10) * 0.38;
    }
    public double jupiter(){
        return pesoPlaneta = (peso/10) * 2.64;
    }
    public double saturno(){
        return pesoPlaneta = (peso/10) * 1.15;
    }
    public double urano(){
        return pesoPlaneta = (peso/10) * 1.17;
    }
}
