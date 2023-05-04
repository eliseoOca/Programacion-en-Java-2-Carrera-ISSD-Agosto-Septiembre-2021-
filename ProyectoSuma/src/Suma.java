import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Suma extends JFrame implements ActionListener 
{
	
	JLabel l1,l2,l3;
	JTextField  t1,t2;//habilita una ventana que te permite cargar datos
	JButton b1, b2;
	
	
	
	Suma()
	{
		setLayout(null);
		
		Font f1= new Font("Serif",1,20);
		
		l1 = new JLabel("Primero Valor:");
		//clumna.fila.ancho.alto
		l1.setBounds(30,40,200,40);
		add(l1);
		
		t1= new JTextField();
		t1.setBounds(120,40,100,40);
		add(t1);
		
		l2 = new JLabel("Segundo valor:");
		//clumna.fila.ancho.alto
		l2.setBounds(30,90,200,40);
		add(l2);
		
		t2= new JTextField();
		t2.setBounds(120,90,100,40);
		add(t2);
		
		b1=new JButton("Sumar");
		b1.setBounds(30,150,190,40);
		b1.addActionListener(this);
		add(b1);
		b1.setFont(f1);
		
		l3 = new JLabel("0",JLabel.CENTER);
		//clumna.fila.ancho.alto
		l3.setBounds(30,200,190,40);
		add(l3);
		l3.setFont(f1);
		l3.setBackground(Color.yellow);
		l3.setForeground(Color.red);//le da color a la Letra de la label
		l3.setOpaque(true);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			String dato1 = t1.getText(); 
			String dato2 = t2.getText();//para tomar los datos 1
			
			
			int n1 = Integer.parseInt(dato1);// pasar a int los datos 2
			int n2 = Integer.parseInt(dato2);
			
			int suma=n1+n2;
			
			String resultado = String.valueOf(suma);//transformar el resutado en un string  3
			
			l3.setText(resultado);// despositar resultado 4
		}
	}
	
	
	

	public static void main(String[] args) 
	{
		
		Suma s= new Suma();
		//con respecto a la pantalla. marg izquierdo/extremo superior/ancho/alto
		s.setBounds(300,150,300,400);
		s.setTitle("**Suma**");
		s.setVisible(true);
	}

}
