package br.edu.hendrick.main_23;
public class LampadaTeste {
    public void teste(){
        Lampada l1 = new Lampada(), l2 = new Lampada("Florescente", "HID", "LED", 110, 50, 45);
        System.out.println(l1);System.out.println(l2);
        if(l1.getPotencia() > l2.getPotencia()){
            System.out.println("Lampada Florescente = "+l1.getPotencia());
            System.out.println("tem mais potencia que a lampada HID = "+l2.getPotencia());
        }else{
            System.out.println("Lampada HID = "+l2.getPotencia());
            System.out.println("tem mais potencia que a lampada Florescente = "+l1.getPotencia());
        }

        if(l1.getPreco() > l2.getPreco()){
            System.out.println("Lampada Florescente = "+l1.getPreco());
            System.out.println("é mais cara que a lampada HID = "+l2.getPreco());
        }else{
            System.out.println("Lampada HID = "+l2.getPreco());
            System.out.println("é mais cara que a lampada Florescente = "+l1.getPreco());
        }
    }
}
