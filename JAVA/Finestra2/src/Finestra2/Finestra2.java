package Finestra2;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;

public class Finestra2 extends JFrame{
	private JPanel p;
	private JTextArea txt;
	private JButton btn;
	private JLabel lbl;
	
	Finestra2(){
		p = new JPanel();
		p.setLayout(new GridLayout(1,1,10,10));
		lbl = new JLabel();
		txt = new JTextArea();
		btn = new JButton();
		
		p.add(txt);
		p.add(btn);
		p.add(lbl);
		
		this.getContentPane().add(p);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
