package br.edu.hendrick.jokenpo;
public class Computador {
    private int randonEscolha;
    private int jogada;
    
    public static int randInt(int min,int max){
        java.util.Random rand = new java.util.Random();
        min = 0;
        max = 2;        
        int randonEscolha = rand.nextInt((min - max )+ 1)+ min;        
        return randonEscolha;
}
    public int jogo(){    
        switch(randonEscolha){
            case 0 -> {
                System.out.println("Computador escolheu Pedra");
                return jogada; 
            }

            case 1 -> {
                System.out.println("Computador escolheu Papel");
                return jogada;  
            }

            case 2 -> {
                System.out.println("Computador escolheu Tesoura");
                return jogada;  
            }       
        } 
    return jogada;    
    }   
}    
 
