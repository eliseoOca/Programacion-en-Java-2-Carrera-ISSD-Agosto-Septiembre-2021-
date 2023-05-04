import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Delivery extends JFrame implements ActionListener

{
	JLabel l1,l2,l3;//sirve para los titulos
	JTextField t1;//Precio base
	JButton b1,b2;
	JCheckBox ch1,ch2,ch3,ch4,ch5;//colocar los agregados
	
	Delivery()
	{
		setLayout(null);
		
		Font f1= new Font("Serif",1,25);
		Font f2= new Font("Serif",1,15);
		
		l1 = new JLabel("Igrese el Precio base de la Pizza: ");
		
		l1.setBounds(30,30,200,40);
		add(l1);
		
		t1 = new JTextField();
		t1.setBounds(230,30,100,40);
		add(t1);
		
		l2 = new JLabel("Seleccione los agregados ");
		
		l2.setBounds(60,80,200,40);
		add(l2);
		
		ch1 = new JCheckBox("Morrones ($20)");
		ch1.setBounds(60,120,150,30);
		add(ch1);
		
		ch2 = new JCheckBox("Palmitos ($50)");
		ch2.setBounds(60,150,150,30);
		add(ch2);
		
		ch3 = new JCheckBox("RoqueFort ($30)");
		ch3.setBounds(60,180,150,30);
		add(ch3);
		
		ch4 = new JCheckBox("Rucula ($40)");
		ch4.setBounds(60,210,150,30);
		add(ch4);
		
		
		ch5 = new JCheckBox("Anana ($50)");
		ch5.setBounds(60,120,150,30);
		add(ch5);
		
		b1 = new JButton("Calcular Precio");
		b1.setBounds(30,290,150,40);
		b1.addActionListener(this);
		b1.setFont(f2);
		add(b1);
		
		l3 = new JLabel(" $ 0,00",JLabel.CENTER);//lo pone en el centro
		l3.setBounds(190,290,150,40);
		l3.setBackground(Color.black);//color de textos
		l3.setOpaque(true);//para opacar 
		l3.setForeground(Color.green);//color de texto
		l3.setFont(f1);
		add(l3);
		
		b2 = new JButton("Finalizar el Programa");
		b2.setBounds(30,340,310,40);
		b2.addActionListener(this);
		b2.setFont(f2);
		add(b2);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			String valor = t1.getText();
			if (valor.equals(""))
				JOptionPane.showMessageDialog(null, "Por Favor ingrese un Precio");
			else
			{
				float precio =0;
				precio = Float.parseFloat(valor);//transformar precios
					
				String agregados = "";
				
				if(ch1.isSelected())
					{
					precio = precio + 20;//ejemplo para parcial
					
					agregados = agregados + "Morrones ";
					
					}
				
						if(ch2.isSelected())
						{
							precio = precio + 60;//ejemplo para parcial
						
							agregados = agregados + "Palmitos ";
						
						}
				
							if(ch3.isSelected())
							{
								precio = precio + 30;//ejemplo para parcial
							
								agregados = agregados + "Roquefort ";
							
							}
				
								if(ch4.isSelected())
								{
									precio = precio + 40;//ejemplo para parcial
								
								
									agregados = agregados + "Rucula ";
								
								}
				
									if(ch5.isSelected())
									{
										precio = precio + 50;//ejemplo para parcial
									
									
										agregados = agregados + "Anana ";
									
									
									
									}
									
					DecimalFormat f1 = new DecimalFormat("0.00");
				l3.setText("$ " + f1.format(precio));//concatenar signo pesos
				
				if(!agregados.equals(""))//ejemplo para parcial
				JOptionPane.showMessageDialog(null, "Delivery de Pizza\n Agregados a la pizza base:\n " + agregados + "" + "\n Precio Final:  " + l3.getText());
				else
					JOptionPane.showMessageDialog(null, "Delivery de Pizza\n sin agregados  \n Precio final: " + l3.getText());
			
			}
			
		}
		if(e.getSource()==b2)
		{JOptionPane.showMessageDialog(null, "Gracias por Utilizar nuestro servicio");
			System.exit(0);
			
		}
		
	}
	
	
	public static void main(String[] args)
	{
		Delivery d1= new Delivery();
		d1.setTitle("Venta de Pizzas");
		d1.setBounds(300,200,400,500);
		d1.setVisible(true);

	}

}
