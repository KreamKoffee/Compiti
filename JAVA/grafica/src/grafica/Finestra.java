package grafica;

import java.awt.*;
import javax.swing.*;

public class Finestra extends JFrame{
	
	JPanel p;
	JLabel lblCognome, lblNome;
	JTextField TxtCasella, TxtCasella1;
	JButton BtnInvia;
	
	Finestra(){
		
		p = new JPanel();
		lblNome = new JLabel("Nome: ");
		lblNome.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
		
		
		TxtCasella = new JTextField();
		
		
		lblCognome = new JLabel("Cognome: ");
		lblCognome.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
		
		
		TxtCasella1 = new JTextField();
		
		
		
		p.add(lblNome);
		p.add(TxtCasella);
		p.add(lblCognome);
		p.add(TxtCasella1);
		
		this.getContentPane().add(p);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
