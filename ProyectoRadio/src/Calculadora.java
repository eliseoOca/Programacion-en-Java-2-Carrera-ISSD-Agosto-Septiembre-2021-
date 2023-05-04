import java.awt.Color;
import java.awt.Font;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Calculadora extends JFrame implements ActionListener
{
	JTextField t1,t2;
	JLabel l1,l2,l3;
	JRadioButton r1,r2,r3,r4;
	JButton b1,b2;
	ButtonGroup g1;
	
	
	Calculadora()
	{
		setLayout(null);
		Font f1 = new Font("Serif",1,20);
		
		
		l1= new JLabel("Primer Numero");
		l1.setBounds(70,30,150,40);
		add(l1);
		
		t1=new JTextField();
		t1.setBounds(210,30,100,40);
		add(t1);
		
		l2= new JLabel("Segundo Numero");
		l2.setBounds(70,80,150,40);
		add(l2);
		
		t2=new JTextField();
		t2.setBounds(210,80,100,40);
		add(t2);
		
		g1 = new ButtonGroup();//adicionar todas las radios crea un grupo de botones
		
		r1= new JRadioButton("Sumar");
		r1.setBounds(70,130,100,40);
		g1.add(r1);
		add(r1);
		
		r2= new JRadioButton("Restar");
		r2.setBounds(70,170,100,40);
		g1.add(r2);
		add(r2);
		
		r3= new JRadioButton("Multiplicar");
		r3.setBounds(70,210,100,40);
		g1.add(r3);
		add(r3);
		
		r4= new JRadioButton("Dividir");
		r4.setBounds(70,250,100,40);
		g1.add(r4);
		add(r4);
		
		b1 = new JButton("Operar");
		b1.setBounds(40,300,150,40);
		b1.addActionListener(this);
		b1.setFont(f1);
		add(b1);
		
		l3= new JLabel("0,00",JLabel.CENTER);
		l3.setBounds(200,300,150,40);
		l3.setBackground(Color.red);
		l3.setOpaque(true);
		l3.setForeground(Color.yellow);
		l3.setFont(f1);
		add(l3);
		
		b2 = new JButton("Fin del Programa");
		b2.setBounds(40,350,310,40);
		b2.addActionListener(this);
		b2.setFont(f1);
		add(b2);
		
		
		
		
	}
	
	public void actionPerformed(ActionEvent e )
	{
		if(e.getSource()==b1)//para salir del programa.paso1
		{
		String dato1 = t1.getText();
		String dato2 = t2.getText();
		
		if(!dato1.equals("")&& !dato2.equals(""))
		{
			float n1 = Float.parseFloat(dato1);
			float n2 = Float.parseFloat(dato2);
			
			float resultado=0;
			
			if(r1.isSelected())
				resultado= n1+n2;
			else
				if(r2.isSelected())
					resultado= n1-n2;
				else
					if(r3.isSelected())
						resultado= n1*n2;
					else
						if(r4.isSelected())
						{
							resultado=0;
							if(n2==0)
								JOptionPane.showMessageDialog(null, "!no se puede dividir por cero¡");//ventanas
								else
									resultado= n1/n2;
						}
						else 
							JOptionPane.showMessageDialog(null, "!Falta seleccionar una operacion¡");//ventanas
			
			//l3.setText(String.valueOf(resultado));
			
			DecimalFormat f1= new DecimalFormat("0.000");
			
			l3.setText(f1.format(resultado));
			}
			else
			{
				JOptionPane.showMessageDialog(null, "!Fata colocar algun dato¡");//ventanas
			}
		}
		
		if(e.getSource()==b2)//para salir del programa .paso 2
		{
			System.exit(0);
		}
		
	}

	public static void main(String[] args) 
	{ Calculadora c1= new Calculadora();
	c1.setBounds(300,200,400,500);
	c1.setTitle("Calculadora");
	c1.setVisible(true);
		

	}
	
	

}
