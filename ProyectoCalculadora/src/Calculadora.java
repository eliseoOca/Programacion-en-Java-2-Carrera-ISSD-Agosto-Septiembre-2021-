import java.awt.Color;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Calculadora extends JFrame implements ActionListener
{
	JLabel l1,l2,l3;
	JTextField t1,t2;
	JComboBox cb1;
	JButton b1,b2;
	
	Calculadora()
	{
		setLayout(null);
		
		l1=new JLabel("Primer valor");
		l1.setBounds(50,60,150,40);
		//columna.fila.ancho.alto//
		add(l1);
		
		t1= new JTextField("");
		t1.setBounds(150,60,100,40);
		//COLUMNA.FILA.ANCHO.ALTO//
		add(t1);
		
		l2=new JLabel("Segund valor");
		l2.setBounds(50,110,150,40);
		//sumar fila + alto//
		add(l2);
		
		t2= new JTextField("");
		t2.setBounds(150,110,100,40);
		//COLUMNA.FILA.ANCHO.ALTO//
		add(t2);
		cb1= new JComboBox();
		cb1.setBounds(50,170,200,40);
		//se suma fila + alto//
		cb1.addItem("Selecione la Operacion");
		cb1.addItem("Suma");
		cb1.addItem("Resta");
		cb1.addItem("Multiplicacion");
		cb1.addItem("Division");
		add(cb1);
		
		b1= new JButton("Operar");
		b1.setBounds(50,230,200,40);
		b1.addActionListener(this);
		add(b1);
		
		b2= new JButton("Salir del Programa");
		b2.setBounds(50,350,200,40);
		b2.addActionListener(this);
		add(b2);
		
		l3=new JLabel("0",JLabel.CENTER);
		l3.setBounds(50,290,200,40);
		//columna.fila.ancho.alto//
		l3.setBackground(Color.cyan);
		l3.setForeground(Color.blue);
		l3.setOpaque(true);
		add(l3);
		
	}
	
	
	
	
	
	
	public void actionPerformed(ActionEvent e)
	{
		
		if(e.getSource()==b1)
		{
			String v1= t1.getText();
			int n1= Integer.parseInt(v1);
			
			String v2= t2.getText();
			int n2= Integer.parseInt(v2);
			
			String operacion= cb1.getSelectedItem().toString();
			
			if(operacion.equals("Suma"))
			{
				int suma=n1 + n2;
				l3.setText(String.valueOf(suma));
				
			}
			if(operacion.equals("Resta"))
			{
				int resta=n1 - n2;
				l3.setText(String.valueOf(resta));
				
			}
			
			if(operacion.equals("Multiplicacion"))
			{
				int multi=n1 * n2;
				l3.setText(String.valueOf(multi));
				
			}
			
			if(operacion.equals("Division"))
			{
				float div =(float)n1 / n2;
				l3.setText(String.valueOf(div));
				
			}
		}
		
		if(e.getSource()==b2)
		{
			System.exit(0);
		}
		
	}

	public static void main(String[] args) {
		Calculadora c1= new Calculadora();
		c1.setBounds(200,200,340,450);
		//margen izq.margen super.ancho.alto//
		c1.setTitle("Calculadora Elemental");
		c1.setVisible(true);
		

	}

}
