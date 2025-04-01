package Pila_undo;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;

public class Finestra extends JFrame{
	JPanel p, p1 ,p2;
	JLabel lblNome, lblAzione;
	JTextField txtNome, txtAzione;
	JButton btnAdd, btnUndo;
	JScrollPane scroll;
	JTextArea txt;
	Pila pila = new Pila(10);
	
	Finestra(){
		p = new JPanel();
		p1 = new JPanel();
		p2 = new JPanel();
		p.setLayout(new BorderLayout());
		lblNome = new JLabel("Nome");
		lblAzione = new JLabel("Azione");
		txtNome = new JTextField(10);
		txtAzione = new JTextField(10);
		btnAdd = new JButton("Add");
		btnUndo = new JButton("Undo");
		txt = new JTextArea(20, 10);
		scroll = new JScrollPane(txt);
		
		p1.add(lblNome);
		p1.add(txtNome);
		p1.add(lblAzione);
		p1.add(txtAzione);
		p.add(p1, BorderLayout.NORTH);
		p.add(scroll);
		p2.add(btnAdd);
		p2.add(btnUndo);
		p.add(p2, BorderLayout.SOUTH);
		btnAdd.addActionListener(e->add());
		btnUndo.addActionListener(e->undo());
		this.getContentPane().add(p);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	void add() {
		String nome = txtNome.getText();
		String azione = txtAzione.getText();
		Azione a = new Azione(nome, azione);
		if (pila.push(a)) {
			txt.setText(pila.toS());
		}else {
			JOptionPane.showMessageDialog(null, "Pila Piena!!","Errore",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	void undo() {
		if(pila.undo()) {
			txt.setText(pila.toS());
		}else {
			JOptionPane.showMessageDialog(null, "Pila Vuota!!","Errore",JOptionPane.ERROR_MESSAGE);
		}
	}
}
