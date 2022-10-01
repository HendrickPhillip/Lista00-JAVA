package br.edu.hendrick.main_17;
public class Funcionarios {
    private float salario;
    private String nome;

    public Funcionarios(){
        super();
        this.nome = "Ze";
        this.salario = 1212;
    }

    public Funcionarios(String ze, float salario){
        super();
        this.nome = ze;
        this.salario = salario;
    }

    @Override
    public String toString(){
        return "Nome: ["+getNome()+"]   Salario: ["+getSalario()+"]";
    }

    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public float getSalario(){
        return this.salario;
    }
    public void setSalario(float salario){
        this.salario = salario;
    }
}
