package finestra;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;

public class finestra extends JFrame{
	private JPanel p,p1,p2,p3;
	private JRadioButton [] rad;
	private String [] stato= {"Italia", "Francia", "Svizzera", "Cambogia" };
	private String [] capitali= {"Roma", "Parigi", "Berna", "Phnom"};
	private String [] abitanti= {"480k", "600k", "230k", "890k"};
	private String [] superfice= {"302km2", "500km2", "200km2", "729km2"};
	private ButtonGroup group;
	private JLabel lblcap, lblab, lblsup;
	private JTextField txtcap, txtab, txtsup;
	
	finestra(){
		p1=new JPanel();
		p1.setLayout(new GridLayout(5,1,10,10));
		for(int i=0;i<5;i++) {
			rad[i]=new JRadioButton(stato[i]);
			rad[i].addActionListener(e->visDati(i));
			group.add(rad[i]);
			p1.add(rad[i]);
		}
		p2=new JPanel();
		p2.setLayout(new GridLayout(3,1,10,10));
		lblcap=new JLabel("Capitale");
		lblab=new JLabel("Abitanti (MIlioni)");
		lblsup=new JLabel("Superficie (km^2)");
		p2.add(lblcap);
		p2.add(lblab);
		p2.add(lblsup);	
		p3=new JPanel();
		p3.setLayout(new GridLayout(3,1,10,10));
		txtcap= new JTextField(10);
		txtab = new JTextField(10);
		txtsup = setEnabled(false);
		p3.add(txtcap);
		p3.add(txtab);
		p3.add(txtab);
		p=new JPanel();
		p.setLayout(new BorderLayout());
		p.add(p1, BorderLayout.WEST);
		p.add(p2, BorderLayout.CENTER);
		p.add(p3, BorderLayout.EAST);
		
	}
	
	void visDati(int n) {
		String cap=capitali[n];
		String nAbi=abitanti[n];
		String sup=superfice[n];
		
		
		
		
	}
	
}
