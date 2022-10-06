package br.edu.hendrick.mainswing_2;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class AdvinheButtons {
    
    private Adivinhe Adivinhe;
    private JButton button;
    private JTextField textField;
    private JLabel label;

    public AdvinheButtons(JLabel label, JTextField textField) {
        this.label = label;
        setAdivinhe(new Adivinhe());
        this.textField = textField;

    }

    public void actionPerformed(ActionEvent e) {
        String text = getTextField().getText();
        String textButton = (((JButton) e.getSource()).getText());

        if ("enviar".equals(textButton)) {
            getAdivinhe().setNum(Integer.parseInt(text));
            getLabel().setText(getAdivinhe().situacao());
            switch (getAdivinhe().getSitcor()) {
                case 1 -> {
                    getLabel().setBackground(Color.green);
                    getTextField().setEditable(false);
                }
                case 2 -> getLabel().setBackground(Color.red);
                case 3 -> getLabel().setBackground(Color.blue);
                default -> {
                }

            }
        } else if ("reiniciar".equals(textButton)) {
            setAdivinhe(new Adivinhe());
            getLabel().setText("Eu tenho um número entre 1 e 1000,"
                + "você pode adivinhá-lo? Entre com seu chute.");
            getLabel().setBackground(Color.GRAY);
            getTextField().setEditable(true);
            getTextField().setText("0");
            //apresentando o valor apenas para teste
            System.out.println(getAdivinhe().getGerador().getNum());
        }
    }

    public JButton getButton() {
        return button;
    }

    public void setButton(JButton button) {
        this.button = button;
    }

    public JTextField getTextField() {
        return textField;
    }

    public void setTextField(JTextField textField) {
        this.textField = textField;
    }

    public JLabel getLabel() {
        return label;
    }

    public void setLabel(JLabel label) {
        this.label = label;
    }

    public Adivinhe getAdivinhe() {
        return Adivinhe;
    }

    public void setAdivinhe(Adivinhe Adivinhe) {
        this.Adivinhe = Adivinhe;
    }
   
}
