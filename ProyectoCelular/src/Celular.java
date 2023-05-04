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

public class Celular extends JFrame implements ActionListener 
{
	JLabel l1,l2,l3,l4;
	JComboBox c1;
	JCheckBox ch1,ch2;
	JButton b1,b2,b3;
	JTextField t1;
	JRadioButton r1,r2,r3,r4,r5,r6;
	ButtonGroup g1,g2;
	
	Celular()
	{
		
		setLayout(null);
		
		Font f1= new Font("Serif",1,15);
		Font f2= new Font("Serif",1,25);
		
		l1 = new JLabel("Seleccione la Marca: ");
		l1.setBounds(120,20,200,40);
		add(l1);
		
		c1 = new JComboBox();
		c1.setBounds(240,20,140,40);
		c1.addItem("IPHONE (U$D 250)");
		c1.addItem("SAMSUNG (U$D 200)");
		c1.addItem("MOTOROLA (U$D 180)");
		add(c1);
		
		l2 = new JLabel("Seleccione tipo: ");
		l2.setBounds(20,70,200,40);
		add(l2);
		
		g1 = new ButtonGroup();
		
		r1 = new JRadioButton("Gamma Baja");
		r1.setBounds(110,75,110,30);
		add(r1);
		g1.add(r1);
		
		r2 = new JRadioButton("Gamma Media");
		r2.setBounds(220,75,110,30);
		add(r2);
		g1.add(r2);
		
		r3 = new JRadioButton("Gamma Alta");
		r3.setBounds(330,75,110,30);
		add(r3);
		g1.add(r3);
		
		
		g2 = new ButtonGroup();
		
		l3 = new JLabel("Memoria: ");
		l3.setBounds(20,90,200,40);
		add(l3);
		
		r4 = new JRadioButton("8GB");
		r4.setBounds(20,130,80,30);
		add(r4);
		g2.add(r4);
		
		
		r5 = new JRadioButton("16GB");
		r5.setBounds(20,160,80,30);
		add(r5);
		g2.add(r5);
		
		r6 = new JRadioButton("32GB");
		r6.setBounds(20,190,80,30);
		add(r6);
		g2.add(r6);
		
		ch1 = new JCheckBox("Vidrio Tamplado");
		ch1.setBounds(140,145,120,30);
		add(ch1);
		
		ch2 = new JCheckBox("Funda Protectora");
		ch2.setBounds(260,145,130,30);
		add(ch2);
		
		
		b1 = new JButton("Calcular Importe");
		b1.setBounds(140,195,150,40);
		b1.addActionListener(this);
		add(b1);
		
		b2 = new JButton("Ver Dialogo");
		b2.setBounds(140,245,150,40);
		b2.addActionListener(this);
		add(b2);
		
		b3 = new JButton("Salir");
		b3.setBounds(300,245,150,40);
		b3.addActionListener(this);
		add(b3);
		
		l4 = new JLabel(" U$D 0,00",JLabel.CENTER);
		l4.setBounds(300,195,150,40);
		l4.setBackground(Color.gray);
		l4.setOpaque(true);
		l4.setForeground(Color.orange);
		l4.setFont(f2);
		add(l4);
		
		t1 = new JTextField("1");
		t1.setBounds(210,110, 30, 30);
		add(t1);
	}
	
	
	public void actionPerformed(ActionEvent e)
	{
		
		if(e.getSource()==b1)
		{
			String tipo = c1.getSelectedItem().toString();
			int item = c1.getSelectedIndex();
				String dato=t1.getText();					
			
			if(dato.equals(""))
			{
				JOptionPane.showMessageDialog(null, "Pulsar 1 para que funcione le programa");
			}
			
			else
			{
				float precio=0;
				int cantidad = Integer.parseInt(dato);
				
				if(item==0) precio = 250-1;
				else
					if(item==1) precio = 200-1;
					else
						if(item==2) precio = 180-1;
						
							
					
				float total = precio + cantidad;
				
				if(r2.isSelected())
					
					total = total *1.10f;
				if(r3.isSelected())
					
					total = total *1.30f;
				if(r4.isSelected())
					
					total = total + 30;
				if(r5.isSelected())
					
					total = total + 60 ;
				if(r6.isSelected())
					
					total = total + 90;
				if(ch1.isSelected())
					
					total = total + 3;
				if(ch2.isSelected())
					
					total = total + 5;
				DecimalFormat f1 = new DecimalFormat("0.00");
				
				l4.setText("U$D" + f1.format(total));
	
			}
		}
		
		if(e.getSource()==b3)
		{JOptionPane.showMessageDialog(null, "Gracias por Utilizar nuestro servicio");
			System.exit(0);
		}
		if(e.getSource()==b2)
		{
			JOptionPane.showMessageDialog(null,"Gracias por tu compra tu Compra fue de: " + l4.getText()   );
		}
		}
		
	

	public static void main(String[] args)
	
	{
		Celular l1= new Celular();
		l1.setTitle("<<<<<<<<<<<<<<<<<<<<<Venta de Celular>>>>>>>>>>>>>>>>>>>>>");
		l1.setBounds(300,200,500,400);
		l1.setVisible(true);

	}

}
