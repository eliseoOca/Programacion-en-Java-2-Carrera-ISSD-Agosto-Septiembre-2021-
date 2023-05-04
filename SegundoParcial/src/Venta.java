import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Venta extends JFrame implements ActionListener 
{
	JLabel l1,l2,l3,l4;
	JComboBox c1;
	JCheckBox ch1,ch2;
	JButton b1,b2,b3;
	JTextField t1;
	JRadioButton r1,r2,r3,r4,r5,r6,r7,r8;
	ButtonGroup g1,g2,g3,g4;
	
	
	Venta()
	{
		setLayout(null);
		
		Font f1= new Font("Serif",1,15);
		Font f2= new Font("Serif",1,25);
		
	l1 = new JLabel("Tipo de Micro: ");
	l1.setBounds(140,20,200,40);
	add(l1);
	
	c1 = new JComboBox();
	c1.setBounds(240,20,100,40);
	c1.addItem("Intel (U$D 150)");
	c1.addItem("Atlon (U$D 80)");
	c1.addItem("Turion (U$D 120)");
	add(c1);
	//placa madre
	l2 = new JLabel("Placa Madre: ");
	l2.setBounds(30,70,200,40);
	add(l2);
	
	g1 = new ButtonGroup();
	
	r1 = new JRadioButton("Asus");
	r1.setBounds(110,75,60,30);
	add(r1);
	g1.add(r1);
	
	r2 = new JRadioButton("GigaByte");
	r2.setBounds(220,75,80,30);
	add(r2);
	g1.add(r2);
	
	r3 = new JRadioButton("Msi");
	r3.setBounds(320,75,80,30);
	add(r3);
	g1.add(r3);
	
	//memoria
	g2 = new ButtonGroup();
	
	l3 = new JLabel("Memoria: ");
	l3.setBounds(50,110,200,40);
	add(l3);
	
	r4 = new JRadioButton("2Mb");
	r4.setBounds(110,115,80,30);
	add(r4);
	g2.add(r4);
	
	
	r5 = new JRadioButton("4Mb");
	r5.setBounds(220,115,80,30);
	add(r5);
	g2.add(r5);
	
	r6 = new JRadioButton("8Mb");
	r6.setBounds(320,115,80,30);
	add(r6);
	g2.add(r6);
	
	g3 = new ButtonGroup();
	
	r7 = new JRadioButton("Monitor");
	r7.setBounds(140,145,80,30);
	add(r7);
	g3.add(r7);
	
	g4 = new ButtonGroup();
	
	r8 = new JRadioButton("Disco Fijo 1 TB");
	r8.setBounds(260,145,110,30);
	add(r8);
	g4.add(r8);
	
	b1 = new JButton("Calcular Importe");
	b1.setBounds(80,195,150,40);
	b1.addActionListener(this);
	add(b1);
	
	b2 = new JButton("Ver Dialogo");
	b2.setBounds(80,245,150,40);
	b2.addActionListener(this);
	add(b2);
	
	b3 = new JButton("Salir");
	b3.setBounds(240,245,150,40);
	b3.addActionListener(this);
	add(b3);
	
	l4 = new JLabel(" U$D 0,00",JLabel.CENTER);//lo pone en el centro
	l4.setBounds(240,195,150,40);
	l4.setBackground(Color.black);//color de textos
	l4.setOpaque(true);//para opacar 
	l4.setForeground(Color.green);//color de texto
	l4.setFont(f2);
	add(l4);
	
	
	
	
	
	
	}

	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{String tipo = c1.getSelectedItem().toString();
		int item = c1.getSelectedIndex();
		
		String dato = r1.getText();
		float n = Float.parseFloat(dato);
		
		
			float precio=0;
			float total = 0;
			float total2=0;
			float total3=0;
			float total4=0;
			float ultimo=0;
			if(item==0) precio = 150;
			else
				if(item==1) precio = 80;
				else
					if(item==2) precio = 120;
			
					else	
			if(r1.isSelected())//ESTO VA EN EL PARCIAL
			{
				n = precio + 75;
			}
			else
			
			if(r2.isSelected())//ESTO VA EN EL PARCIAL
			{
				total = precio + 320;
			}
			else
			if(r3.isSelected())//ESTO VA EN EL PARCIAL
			{
				total = precio + 100;
			} 
			else
			if(r4.isSelected())//ESTO VA EN EL PARCIAL
			{
				total2 = precio + 50;
			}
			else
			if(r5.isSelected())//ESTO VA EN EL PARCIAL
			{
				total2 = precio + 80;
			}
			else					
			if(r6.isSelected())//ESTO VA EN EL PARCIAL
			{
				total2 = precio + 130;
			}
			else
			if(r7.isSelected())//ESTO VA EN EL PARCIAL
			{
				total3 = precio + 250;
			}
			else
			if(r1.isSelected())//ESTO VA EN EL PARCIAL
			{
				total4 = precio + 80;
			}
			//ultimo = precio + total + total2 + total3 + total4 ;
			
			//DecimalFormat f1 = new DecimalFormat("0.00");
			
			//l4.setText("U$D " + f1.format(total));
			
		
		}
		}
		
	

	public static void main(String[] args) 
	{
		Venta l1= new Venta();
		l1.setTitle("<<<<<<<<<<<<<<<<<<<<<Venta de Celular>>>>>>>>>>>>>>>>>>>>>");
		l1.setBounds(300,200,500,400);
		l1.setVisible(true);

	}

}
