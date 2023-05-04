import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Alquiler  extends JFrame implements ActionListener
{

	JLabel l1,l2,l3;
	JComboBox c1;
	JButton b1,b2;
	JTextField t1;
	JRadioButton r1,r2;
	ButtonGroup g1;
	
	
	
	Alquiler()
	{
		setLayout(null);
		
		l1 = new JLabel("Seleccione el tipo de Vehiculo: ");
		l1.setBounds(30,30,200,40);
		add(l1);
		
		
		c1 = new JComboBox();
		c1.setBounds(210,30,120,40);
		c1.addItem("Sedan ($800)");
		c1.addItem("Coupe ($1500)");
		c1.addItem("Pick up ($1000)");
		c1.addItem("4 X 4 ($2000)");
		add(c1);
		
		
		l2 = new JLabel("Ingrese la cantidad de dias: ");
		l2.setBounds(30,90,200,40);
		add(l2);
		
		
		t1 = new JTextField("1");
		t1.setBounds(210,90, 40, 40);
		add(t1);
		
		g1 = new ButtonGroup();
		
		
		r1 = new JRadioButton("Adiciona Seguro (%10) del alquiler");//esto va en el parcial
		r1.setBounds(30,140,250,30);
		add(r1);
		g1.add(r1);
		
		r2 = new JRadioButton("Sin Seguro");//esto va en el parcial
		r2.setBounds(30,170,200,30);
		add(r2);
		g1.add(r2);
		
		b1 = new JButton("Calcular Importe");
		b1.setBounds(30,220,150,40);
		b1.addActionListener(this);
		add(b1);
		
		Font f1 = new Font("Serif",1,25);
		
		l3 = new JLabel("$ 0,00",JLabel.CENTER);//ESTO VA EN EL PARCIAL
		l3.setBounds(190,220,140,40);
		l3.setBackground(Color.yellow);
		l3.setOpaque(true);
		l3.setFont(f1);
		add(l3);
		
		b2 = new JButton("Ver Factura");
		b2.setBounds(30,270,300,40);
		b2.addActionListener(this);
		add(b2);
		
	}
	
	
	
	
	
	
	
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			String tipo = c1.getSelectedItem().toString();//SIRVE PARA TOMAR LOS DATOS
			int item = c1.getSelectedIndex();//rescata los 4 items
				String dato=t1.getText();							//sirve para cuando se pone el valor en las casillas.ver video 11 1.36.59
			
			if(dato.equals(""))
			{
				JOptionPane.showMessageDialog(null, "Falto ingresar la cantidad de dias");//para ventanas de dialogo
			}
			
			else
			{
				float precio=0;
				int cantidad = Integer.parseInt(dato);
				
				if(item==0) precio = 800;
				else
					if(item==1) precio = 1500;
					else
						if(item==2) precio = 1000;
						else
							if(item==3) precio = 2000;
					
				float total = precio * cantidad;
				
				if(r1.isSelected())//ESTO VA EN EL PARCIAL
				
				total = total *1.10f;
				
				DecimalFormat f1 = new DecimalFormat("0.00");
				
				l3.setText("$" + f1.format(total));//sirve para el parcial
			}
		}
		
		if(e.getSource()==b2)
		{
			Factura f = new Factura("uno","1","adicion seguro","0.00");
			f.setBounds(350,300,300,400);
			f.setVisible(true);
		}
		
	}
	public static void main(String[] args) 
	{
		Alquiler a = new Alquiler();
		a.setBounds(300,200,380,400);
		a.setTitle("     Alquiler de Vehiculo");
		a.setVisible(true);

	}

}
