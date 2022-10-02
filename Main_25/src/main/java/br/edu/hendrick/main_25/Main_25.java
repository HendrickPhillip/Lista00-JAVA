package br.edu.hendrick.main_25;
public class Main_25 {

    public static void main(String[] args) {
         Distancia3D p1 = new Distancia3D(), p2 = new Distancia3D(2, 3, 4);
        System.out.println("Dados os pontos 1: "+p1+ " e o ponto 2: "+p2);
        System.out.println("Distancia entre  os pontos: "+Dimensoes.distanciaPontos(p1, p2));
    }
}
