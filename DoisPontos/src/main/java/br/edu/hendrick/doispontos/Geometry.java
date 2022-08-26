/*Implemente um programa em Java que leia as coordenadas de dois pontos
e calcule a distância entre eles. Lembre-se que a distância entre dois pontos
é dada pela seguinte equação:d =√(x2 - x1)² + (y2 - y1)². Utilize as funções
sqrt e pow da classe Math para calcular a raiz quadrada e elevar
os números as suas devidas potências
*/

package br.edu.hendrick.doispontos;
public class Geometry {
    public static double distanciaEntrePontos(Ponto2D p1, Ponto2D p2){
        double distancia = 0, yPart = 0, xPart = 0;
        xPart = Math.pow((p2.getX()- p1.getX()), 2);
        yPart = Math.pow((p2.getY()- p1.getY()), 2);
        distancia = Math.sqrt(xPart + yPart);
        return distancia;
    }
    
}
