package br.edu.hendrick.mainswing_4;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class GUI extends JFrame {
    
    private JLabel lTaxa, lTempo, lTotal, lValor;
    private JButton bCalcular;
    private JTextField tTaxa, tTempo, tValor;
    private MontanteButtons mH;

    public GUI() {
        super("calculador de montante");
        setLayout(null);
        setSize(300,200);
        configureLValor();
        configureTValor();
        configureLTaxa();
        configureTTaxa();
        configureLTempo();
        configureTTempo();
        configureLtotal();
        setmH(new MontanteButtons(getlTotal(),gettValor(),
                gettTaxa(),gettTempo()));

        configureBCalcular();
        setVisible(true);
    }

    private void configureLTaxa() {
        setlTaxa(new JLabel());
        getlTaxa().setText("Taxa:");
        getlTaxa().setBounds(10, 40, 100, 20);
        
        getContentPane().add(getlTaxa());
    }

    private void configureLTempo() {
        setlTempo(new JLabel());
        getlTempo().setText("Meses:");
        getlTempo().setBounds(10, 70, 100, 20);
        getContentPane().add(getlTempo());
    }

    private void configureLtotal() {
        setlTotal(new JLabel());
        getlTotal().setText("Valor final");
        getlTotal().setBounds(110, 100, 100, 20);
        getContentPane().add(getlTotal());
    }

    private void configureLValor() {
        setlValor(new JLabel());
        getlValor().setText("Valor inicial R$:");
        getlValor().setBounds(10,10,100,20);
        getContentPane().add(getlValor());
    }

    private void configureBCalcular() {
        setbCalcular(new JButton());
        getbCalcular().setText("Calcular");
        getbCalcular().setBounds(10,100,90,20);
        getbCalcular().addActionListener(getmH());
        getContentPane().add(getbCalcular());

    }

    private void configureTTaxa() {
        settTaxa(new JTextField("0"));
        gettTaxa().setBounds(110, 40, 100, 20);
        getContentPane().add(gettTaxa());
    }

    private void configureTTempo() {
        settTempo(new JTextField("0"));
        gettTempo().setBounds(110, 70, 100, 20);
        getContentPane().add(gettTempo());
    }

    private void configureTValor() {
        settValor(new JTextField("0"));
        gettValor().setBounds(110,10,100,20);
        getContentPane().add(gettValor());
    }

    public JLabel getlTaxa() {
        return lTaxa;
    }

    public void setlTaxa(JLabel lTaxa) {
        this.lTaxa = lTaxa;
    }

    public JLabel getlTempo() {
        return lTempo;
    }

    public void setlTempo(JLabel lTempo) {
        this.lTempo = lTempo;
    }

    public JLabel getlTotal() {
        return lTotal;
    }

    public void setlTotal(JLabel lTotal) {
        this.lTotal = lTotal;
    }

    public JLabel getlValor() {
        return lValor;
    }

    public void setlValor(JLabel lValor) {
        this.lValor = lValor;
    }

    public JButton getbCalcular() {
        return bCalcular;
    }

    public void setbCalcular(JButton bCalcular) {
        this.bCalcular = bCalcular;
    }

    public JTextField gettTaxa() {
        return tTaxa;
    }

    public void settTaxa(JTextField tTaxa) {
        this.tTaxa = tTaxa;
    }

    public JTextField gettTempo() {
        return tTempo;
    }

    public void settTempo(JTextField tTempo) {
        this.tTempo = tTempo;
    }

    public JTextField gettValor() {
        return tValor;
    }

    public void settValor(JTextField tValor) {
        this.tValor = tValor;
    }

    public MontanteButtons getmH() {
        return mH;
    }

    public void setmH(MontanteButtons mH) {
        this.mH = mH;
    }
}

