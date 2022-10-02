package br.edu.hendrick.main_26;
public class Main_26 {

    public static void main(String[] args) {
         Fibonacci fibonacci = new Fibonacci();
        int sequenciaDesejada = 9;
        for (int x=0; x<sequenciaDesejada; x++){
            System.out.println(fibonacci.fibonacci(x));}

    }
}