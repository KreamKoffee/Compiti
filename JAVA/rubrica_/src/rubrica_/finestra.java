package rubrica_;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;


public class finestra extends JFrame{
	private JPanel p;
	private JLabel lbl_nome, lbl_tel;
	private JTextField txt_nome, txt_tel;
	private JButton btn_inserisci, btn_cerca;
	private rubrica r = new rubrica();
	
	finestra(){
		p = new JPanel();
		p.setLayout(new GridLayout(3,2,10,10));
		
		lbl_nome = new JLabel("Nome: ");
		txt_nome = new JTextField();
		p.add(lbl_nome);
		p.add(txt_nome);
		
		lbl_tel = new JLabel("Telefono: ");
		txt_tel = new JTextField();
		p.add(lbl_tel);
		p.add(txt_tel);
		
		btn_inserisci = new JButton("Inserisci");
		btn_cerca = new JButton("Cerca");
		p.add(btn_inserisci);
		p.add(btn_cerca);
		
		btn_inserisci.addActionListener(e->addContatto());
		btn_cerca.addActionListener(e->cerca());
		
		this.getContentPane().add(p);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	void addContatto() {
		String n, t;
		
		n = txt_nome.getText();
		t = txt_tel.getText();
		
		Contatto c = new Contatto(n, t);
		if(r.addContatto(c) == false) {
			JOptionPane.showMessageDialog(null, "Rubrica piena", "ERRORE", JOptionPane.ERROR_MESSAGE);
		}
		
		txt_nome.setText("");
		txt_tel.setText("");
	}
	
	void cerca() {
		String n;
		n = txt_nome.getText();
		txt_tel.setText(r.ricerca(n));
		
	}
}
