package br.edu.hendrick.calculadoraswing;
 import javax.swing.JFrame;
public class CalculadoraSwing {
    public static void main(String[] args) {
        CalculadoraInterface calculadora = new CalculadoraInterface();
        calculadora.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
