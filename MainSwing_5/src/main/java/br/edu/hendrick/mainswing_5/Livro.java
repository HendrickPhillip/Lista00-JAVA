package br.edu.hendrick.mainswing_5;

public class Livro {
    private String titulo;
    private int nPag;

    public Livro(String titulo, int nPag) {
        this.titulo = titulo;
        this.nPag = nPag;
    }

    public Livro(){}

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getnPag() {
        return nPag;
    }

    public void setnPag(int nPag) {
        this.nPag = nPag;
    }

    @Override
    public String toString() {
        return "Titulo: "+ getTitulo() +" NPag: " + getnPag();
    }  
}
