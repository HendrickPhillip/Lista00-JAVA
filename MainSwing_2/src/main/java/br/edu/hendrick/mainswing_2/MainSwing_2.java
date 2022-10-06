package br.edu.hendrick.mainswing_2;

import javax.swing.JFrame;

public class MainSwing_2 {

    public static void main(String[] args) {

        GUI agui = new GUI();
        agui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Testando valores
        System.out.println(agui.getAb().getAdivinhe().getGerador().getNum());
    }
}
