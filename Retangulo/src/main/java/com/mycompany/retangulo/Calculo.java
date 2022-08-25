package com.mycompany.retangulo;
public class Calculo {

    private double altura;
    private double largura;
    
    public double getAltura() {
        return this.altura;
    }

    public double setAltura(double alt) {
        this.altura = alt;
        return altura;
    }

     public double getLargura() {
        return this.largura;
    }

    public double setLargura(double larg) {
        this.largura = larg;
        return largura;
    }

    public double area() {
        return altura * largura;
    }

    int setAltura() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
