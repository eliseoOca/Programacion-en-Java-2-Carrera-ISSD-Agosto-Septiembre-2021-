import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Multiplicacion extends JFrame implements	ActionListener
{

	JLabel l1,l2,l3,l4,l5,l6,l7;
	JButton b1,b2,b3,b4,b5,b6;
	
	
	
	Multiplicacion()
	{
		setLayout(null);
		
		Font f1= new Font("Serif",3,40);
		Font f2= new Font("Serif",1,30);
		Font f3= new Font("Serif",1,15);
		
		l1= new JLabel("Primer Numero");
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
		b3.setBounds(30,290,230,40);
		b3.addActionListener(this);
		b3.setFont(f3);
		add(b3);
		
		
		
		l4= new JLabel("Segundo Numero");
		l4.setBounds(300,30,120,40);
		add(l4);
		
		
		l5= new JLabel("0",JLabel.CENTER);
		l5.setBounds(370,100,70,70);
		l5.setBackground(Color.black);
		l5.setForeground(Color.green);
		l5.setOpaque(true);
		l5.setFont(f1);
		add(l5);
		
		b4 = new JButton("+");
		
		b4.setBounds(300,70,60,60);
		b4.addActionListener(this);
		b4.setFont(f1);
		add(b4);
		
		b5 = new JButton("-");
		b5.setBounds(300,140,60,60);
		b5.addActionListener(this);
		b5.setFont(f1);
		add(b5);
		
		
		b6 = new JButton("Multplicar");
		b6.setBounds(30,230,230,40);
		b6.addActionListener(this);
		b6.setFont(f3);
		add(b6);
		
		
		l6= new JLabel("0",JLabel.CENTER);
		l6.setBounds(270,230,170,100);
		l6.setBackground(Color.black);
		l6.setForeground(Color.green);
		l6.setOpaque(true);
		l6.setFont(f1);
		add(l6);
		
		l7= new JLabel("X");
		l7.setBounds(230,110,50,50);
		l7.setForeground(Color.red);
		l7.setFont(f1);
		add(l7);
		
		
		
		
		
		
	
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
			
			int n = Integer.parseInt(dato);//dato tipo int
			
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
		
		
		if(e.getSource()==b4)
		{
			String dato = l5.getText(); //transfor de dato texto a 
			
			int n = Integer.parseInt(dato);//dato tipo int
			
			if(n<100)
			{
				n=n+10;
				
				l5.setText(String.valueOf(n));
			}
		}
		
		
		if(e.getSource()==b5)
		{
			String dato = l6.getText(); //transfor de dato texto a 
			
			int n = Integer.parseInt(dato);//dato tipo int
			
			if(n>0)
			{
				n=n-10;
				
				l6.setText(String.valueOf(n));
			}
		}
		
		if(e.getSource()==b6)
		{
			String dato1 = l2.getText(); //transfor de dato texto a 
			
			int n1 = Integer.parseInt(dato1);
			
			String dato2 = l5.getText(); //transfor de dato texto a 
			
			int n2 = Integer.parseInt(dato2);
			
			int m = n1*n2;
			l6.setText(String.valueOf(m));//imprime las operaciones
		}
		
	}
	
	
	public static void main(String[] args)
	{
		Multiplicacion m= new Multiplicacion();
		m.setBounds(300,200,500,400);
		m.setTitle("Multiplicacion de dos numeros");
		m.setVisible(true);

	}

}
