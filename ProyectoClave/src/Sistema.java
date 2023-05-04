import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Sistema extends JFrame implements ActionListener

{	

	JLabel l1;
	JButton b1;
	
	
	Sistema()
	{
		setLayout(null);
		
		Font f1 = new Font ("Serif",1,35);
		Font f2= new Font("Serif",1,25);
		
		l1=new JLabel("Sistema de Gestion",JLabel.CENTER);
		l1.setBounds(40,50,300,60);
		l1.setForeground(Color.blue);
		l1.setFont(f1);
		add(l1);
		
		b1 = new JButton("Ingresar al Sistema");
		b1.setBounds(50,170,280,40);
		b1.addActionListener(this);
		b1.setFont(f2);
		b1.setForeground(Color.blue);
		add(b1);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			Dialogo  d1 = new Dialogo();
			d1.setBounds(350,250,350,350);
			d1.setTitle("**login**");
			//d1.setModal(true);//sirve para los cuadros por las cuales se abren otra ventana
			d1.setResizable(false);//no permite agrandar el tamaño de la ventana con el cursor
			d1.setVisible(true);//para hacer visible
		}
	}
	public static void main(String[] args) 
	{
		Sistema s1 = new Sistema();
	s1.setBounds(300,200,400,350);
	s1.setTitle("Sistema");
	s1.setVisible(true);
	}
}

	
		
	

