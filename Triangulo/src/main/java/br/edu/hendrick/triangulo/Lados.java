package br.edu.hendrick.triangulo;
public class Lados {
    private int ladoA;
    private int ladoB;
    private int ladoC;
    private int triangulo;

    public int getLadoA() {
        return ladoA;
    }

    public void setLadoA(int ladoA) {
        this.ladoA = ladoA;
    }

    public int getLadoB() {
        return ladoB;
    }

    public void setLadoB(int ladoB) {
        this.ladoB = ladoB;
    }

    public int getLadoC() {
        return ladoC;
    }

    public void setLadoC(int ladoC) {
        this.ladoC = ladoC;
    }
    
    public int calculo(){
        if (ladoA == ladoB && ladoB == ladoC){
            System.out.println("Equilatero");
        } else 
            if (ladoA != ladoB && ladoB != ladoC){
                System.out.println("Escaleno");
            } else {
                System.out.println("Isosceles");
            }
        return triangulo;
    }
    
}
