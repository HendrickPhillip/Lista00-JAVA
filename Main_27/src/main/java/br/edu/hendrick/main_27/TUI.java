package br.edu.hendrick.main_27;
import java.util.Scanner;

public class TUI {
    private String txtNome;
    private int txtIdade;
    private String txtCPF;
    private String txtTitulo;
    private String txtAutor;
    private int txtQpags;
    private int txtIdLivro;
    private final Scanner leitor;
    private Pessoa pessoa;
    private Livro livro;
    private Emprestimo emprestimo;

    public TUI() {
        leitor = new Scanner(System.in);
    }

    public String getTxtNome() {
        return txtNome;
    }

    public void setTxtNome(String txtNome) {
        this.txtNome = txtNome;
    }

    public int getTxtIdade() {
        return txtIdade;
    }

    public void setTxtIdade(int txtIdade) {
        this.txtIdade = txtIdade;
    }

    public String getTxtCPF() {
        return txtCPF;
    }

    public void setTxtCPF(String txtCPF) {
        this.txtCPF = txtCPF;
    }

    public String getTxtTitulo() {
        return txtTitulo;
    }

    public void setTxtTitulo(String txtTitulo) {
        this.txtTitulo = txtTitulo;
    }

    public String getTxtAutor() {
        return txtAutor;
    }

    public void setTxtAutor(String txtAutor) {
        this.txtAutor = txtAutor;
    }

    public int getTxtQpags() {
        return txtQpags;
    }

    public void setTxtQpags(int txtQpags) {
        this.txtQpags = txtQpags;
    }

    public int getTxtIdLivro() {
        return txtIdLivro;
    }

    public void setTxtIdLivro(int txtIdLivro) {
        this.txtIdLivro = txtIdLivro;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public Emprestimo getEmprestimo() {
        return emprestimo;
    }

    public void setEmprestimo(Emprestimo emprestimo) {
        this.emprestimo = emprestimo;
    }

    public void printTUI() {
        System.out.println("Nome: ");
        setTxtNome(leitor.nextLine());
        System.out.println("CPF: ");
        setTxtCPF(leitor.nextLine());
        System.out.println("Idade: ");
        setTxtIdade(leitor.nextInt());
        setPessoa(new Pessoa(getTxtNome(), getTxtIdade(), getTxtCPF()));
        System.out.println("Id do livro: ");
        setTxtIdLivro(leitor.nextInt());
        leitor.nextLine();
        System.out.println("Titulo do livro: ");
        setTxtTitulo(leitor.nextLine());
        System.out.println("Autor: ");
        setTxtAutor(leitor.nextLine());
        System.out.println("N??mero de p??ginas: ");
        setTxtQpags(leitor.nextInt());
        setLivro(new Livro(getTxtTitulo(), getTxtAutor(), getTxtQpags(),
                getTxtIdLivro()));
        setEmprestimo(new Emprestimo(getPessoa(), getLivro()));

    }

    public void printResult() {
        System.out.println(emprestimo.dadosDoEmprestimo());
    }

    public void tui() {
        printTUI();
        printResult();
    }
}
