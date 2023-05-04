import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class SelectorNumerico extends JFrame implements	ActionListener
{
	JLabel l1,l2;
	JButton b1,b2,b3;
	
	SelectorNumerico()
	{
		setLayout(null);
		
		Font f1= new Font("Serif",3,40);
		Font f2= new Font("Serif",1,30);
		Font f3= new Font("Serif",1,15);
		
		l1= new JLabel("Indice de Nivel");
		l1.setBounds(70,30,120,40);
		add(l1);
		
		
		l2= new JLabel("0",JLabel.CENTER);
		l2.setBounds(50,100,70,70);
		l2.setBackground(Color.black);
		l2.setForeground(Color.green);
		l2.setOpaque(true);
		l2.setFont(f1);
		add(l2);
		
		b1 = new JButton("+");
		
		b1.setBounds(130,70,60,60);
		b1.addActionListener(this);
		b1.setFont(f1);
		add(b1);
		
		b2 = new JButton("-");
		b2.setBounds(130,140,60,60);
		b2.addActionListener(this);
		b2.setFont(f1);
		add(b2);
		
		b3 = new JButton("Salir del Programa");
		b3.setBounds(30,230,180,60);
		b3.addActionListener(this);
		b3.setFont(f3);
		add(b3);
		
		
	}
	
	
	
	
	
	
	
	
	public void actionPerformed(ActionEvent e)
	{
		
		if(e.getSource()==b3)//sirve para salir.
		{
			System.exit(0);
		}
		
		
		if(e.getSource()==b1)
		{
			String dato = l2.getText(); //transfor de dato texto a 
			int n = Integer.parseInt(dato);
			//dato tipo int
			
			if(n<100)
			{
				n=n+10;
				
				l2.setText(String.valueOf(n));
			}
		}
		
		
		
	
		if(e.getSource()==b2)
		{
			String dato = l2.getText(); //transfor de dato texto a 
			
			int n = Integer.parseInt(dato);//dato tipo int
			
			if(n>0)
			{
				n=n-10;
				
				l2.setText(String.valueOf(n));
		}
		}
		
		
		
	}

	public static void main(String[] args)
	{
		SelectorNumerico s= new SelectorNumerico();
		s.setBounds(300,200,300,400);
		s.setTitle("Selector Numerico");
		s.setVisible(true);
		

	}

}
