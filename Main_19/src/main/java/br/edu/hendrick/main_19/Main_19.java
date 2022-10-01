package br.edu.hendrick.main_19;
public class Main_19 {

    public static void main(String[] args) {
         Agenda a = new Agenda();
        a.armazenaPessoa("Pessoa 1", 1, 1.80);
        a.armazenaPessoa("Pessoa 2", 2, 1.70);
        a.armazenaPessoa("Pessoa 3", 3, 1.60);
        a.imprimeAgenda();
        System.out.println("\n");
        a.removePessoa("Pessoa 1");
        a.imprimeAgenda();
        System.out.println("Buscando Pessoa 2: ");
        System.out.println(a.buscaPessoa("Pessoa 2"));
        System.out.println("Buscando Pessoa 3");
        System.out.println(a.buscaPessoa("Pessoa 3"));
        System.out.println("Buscando a segunda pessoa da Agenda");
        System.out.println(a.imprimePessoa(1));
    }
}

