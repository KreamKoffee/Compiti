package ufficio_postale;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;

public class Finestra extends JFrame{
	JPanel p, p1 ,p2;
	JLabel lblNome, lblCognome, lblTel, lblNum;
	JTextField txtNome, txtCognome, txtTel, txtNum;
	JButton btnAdd, btnServi;
	JScrollPane scroll;
	JTextArea txt;
	ufficio c = new ufficio(10);
	
	Finestra(){
		p = new JPanel();
		p1 = new JPanel();
		p2 = new JPanel();
		p.setLayout(new BorderLayout());
		lblNome = new JLabel("Nome");
		lblCognome = new JLabel("Cognome");
		txtNome = new JTextField(10);
		txtCognome = new JTextField(10);
		lblTel = new JLabel("Telefono");
		txtTel = new JTextField(10);
		lblNum = new JLabel("Numero");
		txtNum = new JTextField(10);
		
		btnAdd = new JButton("Add");
		btnServi = new JButton("Servi");
		
		txt = new JTextArea(20, 10);
		scroll = new JScrollPane(txt);
		
		p1.add(lblNome);
		p1.add(txtNome);
		p1.add(lblCognome);
		p1.add(txtCognome);
		p1.add(lblTel);
		p1.add(txtTel);
		p1.add(lblNum);
		p1.add(txtNum);
		
		p.add(p1, BorderLayout.NORTH);
		p.add(txt, BorderLayout.CENTER);
		p.add(scroll);
		p2.add(btnAdd);
		p2.add(btnServi);
		p.add(p2, BorderLayout.SOUTH);
		btnAdd.addActionListener(e->add());
		btnServi.addActionListener(e->scegli());
		
		this.getContentPane().add(p);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	void add() {
		String nome = txtNome.getText();
		String cognome = txtCognome.getText();
		String tel = txtTel.getText();
		int num = txtNum.getText();
		cliente a = new cliente(nome, cognome, tel, num);
		if (c.enque(a)) {
			txt.setText(c.toS());
		}else {
			JOptionPane.showMessageDialog(null, "Pila Piena!!","Errore",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	void scegli() {
		if(pila.undo()) {
			txt.setText(pila.toS());
		}else {
			JOptionPane.showMessageDialog(null, "Pila Vuota!!","Errore",JOptionPane.ERROR_MESSAGE);
		}
	}
}
