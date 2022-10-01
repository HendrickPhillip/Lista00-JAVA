package br.edu.hendrick.senha;
public class Jogo {
    private int jogador;
    
    
    public Jogo(){
        super();
        this.jogador = 100;
        
    }
    public Jogo(int jogador){
        super();
        this.jogador = jogador;        
    }
    @Override
    public String toString(){
        return ""+this.jogador;
    }

    public int getJogador() {
        return jogador;
    }

    public void setJogador(int jogador) {
        this.jogador = jogador;
    }
    
    
}
