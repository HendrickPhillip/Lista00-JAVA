package br.edu.hendrick.main_21;
public class Main_21 {

    public static void main(String[] args) {
        Controle controle = new Controle();
        controle.aumentarVolume();
        controle.statusTv();
        controle.aumentarCanal();
        controle.statusTv();
        controle.diminuirVolume();
        controle.statusTv();
        controle.diminuirCanal();
        controle.statusTv();
    }
}
