package Form1;

import java.awt.*;
import javax.swing.*;

public class Form1 extends JFrame{
    JPanel p;
    JLabel lbl_prezzo;
    JLabel lbl_quantita;
    JLabel lbl_importoParziale;
    JTextField txt_prezzo;
    JTextField txt_quantita;
    JTextField txt_importoParziale;
    JButton btn_mediaPrezzo;
    JButton btn_mediaQuantita;
    JButton btn_totVendite;
    JButton btn_aggiungi;
    JLabel blank;

    Form1(){
        super("Form1");
        p = new JPanel();
        p.setLayout(new GridLayout(4,3,10,10));

        blank = new JLabel();
        lbl_prezzo = new JLabel("Prezzo");
        lbl_quantita = new JLabel("Quantità");
        lbl_importoParziale = new JLabel("Importo Parziale");

        txt_prezzo = new JTextField(15);
        txt_quantita = new JTextField(15);
        txt_importoParziale = new JTextField(15);

        btn_aggiungi = new JButton("Aggiungi");
        btn_mediaPrezzo = new JButton("Media Prezzo");
        btn_mediaQuantita = new JButton("Media Quantità");
        btn_totVendite = new JButton("Tot Vendite");

        p.add(lbl_prezzo);
        p.add(lbl_quantita);
        p.add(lbl_importoParziale);

        p.add(txt_prezzo);
        p.add(txt_quantita);
        p.add(txt_importoParziale);

        p.add(btn_mediaPrezzo);
        p.add(btn_mediaQuantita);
        p.add(btn_totVendite);
        p.add(blank);
        p.add(btn_aggiungi);

        this.getContentPane().add(p);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
