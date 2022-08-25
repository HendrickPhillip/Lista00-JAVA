package br.edu.hendrick.haras;
public class Cavalo {
    
    private int cavalos;
    private int ferraduras = 4;
    
    public int getCavalos() {
        return this.cavalos;
    }
    
    public int setCavalos(int cavalo) {
        this.cavalos = cavalo;
        return cavalos;
    }
    
    /*public int getFerraduras() {
        return this.ferraduras;
    }
    
    public int setFerraduras(int ferradura) {
        this.ferraduras = ferradura;
        return ferraduras;
    }
    */
    
    public double quantidade() {
        return cavalos * ferraduras;
    }
    
}
