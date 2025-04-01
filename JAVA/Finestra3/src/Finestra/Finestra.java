package Finestra;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;

public class Finestra extends JFrame{
	private JPanel p;
	private JLabel lbl;
	private JButton btn;
	
	Finestra(){
		p = new JPanel();
		p.setLayout(new GridLayout(1,1,10,10));
		lbl = new JLabel("");
		btn = new JButton("Saluta");
		btn.addActionListener(e->saluta());
		p.add(btn);
		p.add(lbl);
		this.getContentPane().add(p);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	void saluta() {
		lbl.setText("Ciao!");
		this.pack();
	}
}
