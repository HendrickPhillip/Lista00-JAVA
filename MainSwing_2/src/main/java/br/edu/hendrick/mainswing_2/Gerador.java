package br.edu.hendrick.mainswing_2;

import java.util.Random;

public class Gerador {
    private int num;

    public Gerador() {
    }

    public int getNum() {
        return num;
    }

    public void setNum() {
        Random r = new Random();
        this.num = r.nextInt(1000 - 1) + 1;
    }
}
