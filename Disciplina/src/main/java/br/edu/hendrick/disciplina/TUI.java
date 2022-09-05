package br.edu.hendrick.disciplina;
import java.util.Scanner;

public class TUI {
    private float notas;
    private Scanner scanner;
    private Provas p1, p2, p3;;

    public TUI(){
        this.scanner = new Scanner(System.in);
    }

    public void printTUI(){
        System.out.println("Digite a primeira nota");
        notas = scanner.nextFloat();
        setP1(new Provas(notas));
        System.out.println("Digite a segunda nota");
        notas = scanner.nextFloat();
        setP2(new Provas(notas));
    }

    public void solve(){
        if(((p1.getNota()+p2.getNota())/2 >= 5) && (p1.getNota() > 3 && p2.getNota() > 3)){
            System.out.println("Nota 1: " + p1.getNota());
            System.out.println("Nota 2: "+ p2.getNota());
            System.out.println("Media: "+ (p1.getNota()+p2.getNota())/2);
            System.out.println("Aprovado!");
        }else{
            System.out.println("Digite o valor da terceira nota: ");
            notas = scanner.nextFloat();
            setP3(new Provas(notas));
            if(p1.getNota() > p2.getNota()){
                if(((p1.getNota()+p3.getNota())/2 > 5) && (p1.getNota() > 3 && p3.getNota() > 3)){
                    System.out.println("Maior nota: "+p1.getNota());
                    System.out.println("Nota 3: "+p3.getNota());
                    System.out.println("Media: "+(p1.getNota()+p3.getNota())/2);
                    System.out.println("Aprovado!");
                }else{
                    System.out.println("Maior nota: "+p1.getNota());
                    System.out.println("Nota 3: "+p3.getNota());                 
                    System.out.println("Media: "+(p1.getNota()+p3.getNota())/2);
                    System.out.println("Reprovado!");
                }
            }else{
                if(((p2.getNota()+p3.getNota())/2 > 5) && (p2.getNota() > 3 && p3.getNota() > 3)){
                    System.out.println("Maior nota: "+p2.getNota());
                    System.out.println("Nota 3: "+p3.getNota());
                    System.out.println("Media: "+(p2.getNota()+p3.getNota())/2);
                    System.out.println("Aprovado!");
                }else{
                    System.out.println("Maior nota: "+p2.getNota());
                    System.out.println("Nota 3: "+p3.getNota());
                    System.out.println("Media: "+(p2.getNota()+p3.getNota())/2);
                    System.out.println("Reprovado!");
                }
            }
        }
    }

    public void tui(){
        printTUI();
        solve();
    }

    public void setP1(Provas nota){
        this.p1 = nota;
    }
    public Provas P1(){
        return p1;
    }

    public void setP2(Provas nota){
        this.p2 = nota;
    }
    public Provas P2(){
        return p2;
    }
    public void setP3(Provas nota){
        this.p3 = nota;
    }
    public Provas P3(){
        return p3;
    }
}
