package br.edu.hendrick.losango;
public class Area {
    private int diagonalMaior;
    private int diagonalMenor;
    private int A;

    public int getDiagonalMaior() {
        return diagonalMaior;
    }

    public void setDiagonalMaior(int diagonalMaior) {
        this.diagonalMaior = diagonalMaior;
    }

    public int getDiagonalMenor() {
        return diagonalMenor;
    }

    public void setDiagonalMenor(int diagonalMenor) {
        this.diagonalMenor = diagonalMenor;
    }
    
    public int result(){
        return A = (diagonalMaior * diagonalMenor)/2;
    }
}
