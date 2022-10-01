package br.edu.hendrick.main_17;

import java.util.Scanner;

public class Contador {
    private final Scanner scanner = new Scanner(System.in);
    private String  txtnome;
    private float txtsalario, totalSalario;
    private int contador;

    public void PopularPrintar(Funcionarios[] func){
        setTotalSalario(0);
        setContador(0);
        for(int n=0; n<func.length; n++){
            scanner.nextLine();
            System.out.println("Digite o nome do funcionario: ");
            txtnome = scanner.nextLine();
            System.out.println("Digite o salario do funcionario: ");
            txtsalario = scanner.nextFloat();
            func[n] = new Funcionarios(txtnome, txtsalario);
            contador += 1;
            totalSalario += txtsalario;
        }
         for (Funcionarios func1 : func) {
             System.out.println(func1);
         }
        System.out.println("Media "+getTotalSalario()/getContador());
    }

    public String getTxtNome(){
        return txtnome;
    }
    public void setTxtNome(String x){
        this.txtnome = x;
    }
    public float getTxtSalario(){
        return txtsalario;
    }
    public void setTxtSalario(float x){
        this.txtsalario = x;
    }
    public int getContador(){
        return this.contador;
    }
    public void setContador(int x){
        this.contador = x;
    }
    public float getTotalSalario(){
        return this.totalSalario;
    }
    public void setTotalSalario(float x){
        this.totalSalario = x;
    }
}
