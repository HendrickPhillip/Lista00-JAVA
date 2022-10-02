package br.edu.hendrick.main_24;
public class Main_24 {

    public static void main(String[] args) {
        Apolice apolice1 = new Apolice();
        apolice1.calcularPremioApolice();
        apolice1.oferecerDesconto("Pernambuco");
        System.out.println(apolice1);
        Apolice apolice2 = new Apolice("Maria", 36, 1600);
        apolice2.calcularPremioApolice();
        apolice2.oferecerDesconto("Piaui");
        System.out.println(apolice2);
    }
}
