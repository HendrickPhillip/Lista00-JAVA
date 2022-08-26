package br.edu.hendrick.jokenpo;
public class Jogador {
    private int jogada;
    private int escolha;

    public int getEscolha() {
        return escolha;
    }

    public void setEscolha(int escolha) {
        this.escolha = escolha;
    }

    public int jogo(){
        switch(escolha){
            case 0 -> {
                System.out.println("Jogador escolheu Pedra");
                return jogada; 
            }
            
            case 1 -> {
                System.out.println("Jogador escolheu Papel");
                return jogada;  
            }
               
            case 2 -> {
                System.out.println("Jogador escolheu Tesoura");
                return jogada;      
            }
                
        }           
        return jogada; 
    }
    
    
}
