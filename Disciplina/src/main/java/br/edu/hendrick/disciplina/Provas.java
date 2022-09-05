package br.edu.hendrick.disciplina;
public class Provas {
   private float nota;

    public Provas(){
        super();
        this.nota = 5;
    }

    public Provas(float x){
        super();
        this.nota = x;
    }

    @Override
    public String toString(){
        return ""+this.nota;
    }

    public float getNota(){
        return this.nota;
    }
    public void setNota(float x){
        this.nota = x;
    } 
}
