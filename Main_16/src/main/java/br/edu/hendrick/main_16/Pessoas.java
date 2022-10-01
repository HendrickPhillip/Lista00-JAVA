package br.edu.hendrick.main_16;
public class Pessoas {
    private int genero;
    private double altura;

    public Pessoas(){
        this.genero = 1;
        this.altura = 1.65;
    }
    public Pessoas(int genero, double altura){
        this.genero = genero;
        this.altura = altura;
    }

    @Override
    public String toString(){
        return switch (getGenero()) {
            case 1 -> "Genero: Masculino  Altura: "+getAltura();
            case 2 -> "Genero: Feminino   Altura: "+getAltura();
            default -> "Sem genero";
        };
    }

    public int getGenero(){
        return this.genero;
    }
    public void setGenero(int genero){
        this.genero = genero;
    }
    public double getAltura(){
        return this.altura;
    }
    public void setGenero(double altura){
        this.altura = altura;
    }
}
