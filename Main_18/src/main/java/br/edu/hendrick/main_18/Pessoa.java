package br.edu.hendrick.main_18;
public class Pessoa {
  private String nome;
    private int diaN, mesN, anoN, idade;
    private double altura;

    public Pessoa(String nome, int dia, int mes, int ano, double altura){
        this.nome = nome;
        this.diaN = dia;
        this.mesN = mes;
        this.anoN = ano;
        this.altura = altura;
    }

    @Override
    public String toString(){
        return "Nome: "+getNome()+"\nData de Nascimento \n"+"Dia:"+getDiaN()+
        " Mes:"+getMesN()+" Ano:"+getAnoN()+
        "\nAltura: "+getAltura()+"\nIdade: "+getIdade();
    }

    public int getDiaN(){
        return this.diaN;
    }
    public void setDiaN(int diaN){
        this.diaN = diaN;
    }
    public int getMesN(){
        return this.mesN;
    }
    public void setMesN(int mesN){
        this.mesN = mesN;
    }
    public int getAnoN(){
        return this.anoN;
    }
    public void setAnoN(int anoN){
        this.anoN = anoN;
    }
    public double getAltura(){
        return this.altura;
    }
    public void setAltura(double altura){
        this.altura = altura;
    }
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public int getIdade(){
        return this.idade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
}
