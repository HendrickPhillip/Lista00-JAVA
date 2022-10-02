package br.edu.hendrick.main_25;
public class Dimensoes {
    public  static  double  distanciaPontos ( Distancia3D  p1 , Distancia3D  p2 ){
        double distancia = 0, yPart = 0, xPart = 0, zPart = 0;
        xPart = Math . pow (( p2 . getX () - p1 . getX ()), 2 );
        yPart = Math . pow (( p2 . getY () - p1 . getY ()), 2 );
        zPart = Math . pow (( p2 . getZ () - p1.getZ ( ) ), 2 );
        distancia = Math.sqrt( xPart + yPart + zPart );
        return distancia ;
    }
}
