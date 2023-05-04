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

public class Libreria extends JFrame implements ActionListener
{
	JLabel l1,l2,l3,l4;//titulos
	JTextField t1,t2,t3;//casillas
	JCheckBox ch1,ch2,ch3,ch4,ch5;//opciones
	JButton b1;
	
	Libreria()
	{
		setLayout(null);
		
		Font f1= new Font("Serif",1,15);
		Font f2= new Font("Serif",1,25);
		
		l1 = new JLabel("Nombre del Libro: ");
		//margen izquierdo/margen arriba abajo.
		l1.setBounds(100,20,200,40);
		l1.setFont(f1);
		add(l1);
		
		l2 = new JLabel("Precio del Libro: ");
		//margen izquierdo/margen arriba abajo.
		l2.setBounds(100,70,200,40);
		l2.setFont(f1);
		add(l2);
		
		l3 = new JLabel("Cantidad de compra: ");
		//margen izquierdo/margen arriba abajo.
		l3.setBounds(100,120,200,40);
		l3.setFont(f1);
		add(l3);
		
		l4 = new JLabel(" $ 0,00",JLabel.CENTER);//lo pone en el centro
		l4.setBounds(310,290,200,40);
		l4.setBackground(Color.black);//color de textos
		l4.setOpaque(true);//para opacar 
		l4.setForeground(Color.green);//color de texto
		l4.setFont(f2);
		add(l4);
		
		t1 = new JTextField();
		t1.setBounds(235,20,200,40);
		add(t1);
		
		t2 = new JTextField();
		t2.setBounds(235,70,100,40);
		add(t2);
		
		t3 = new JTextField();
		t3.setBounds(235,120,100,40);
		add(t3);
		
		ch1 = new JCheckBox("Ciencias Naturales 7%");
		ch1.setBounds(50,180,160,30);
		add(ch1);
		
		ch2 = new JCheckBox("Ciencias Exactas 5%");
		ch2.setBounds(225,180,150,30);
		add(ch2);
		
		ch3 = new JCheckBox("Ciencias Sociales 3%");
		ch3.setBounds(380,180,150,30);
		add(ch3);
		
		ch4 = new JCheckBox("No soy Socio");
		ch4.setBounds(120,230,150,30);
		add(ch4);
		
		
		ch5 = new JCheckBox("Soy socio 10% DES.");
		ch5.setBounds(340,230,150,30);
		add(ch5);
		
		
		b1 = new JButton("Calcular Precio");
		b1.setBounds(80,290,200,40);
		b1.addActionListener(this);
		b1.setFont(f2);
		add(b1);
		
		
	}

	
	
	public void actionPerformed(ActionEvent e)
	{ String pesos = t2.getText();
	String cantidad = t3.getText();
	String nombre =  t1.getText();
	
	//float total=0;	
		if(e.getSource()==b1)
		{
			//String pesos = t2.getText();
			//String cantidad = t3.getText();
			//String nombre =  t1.getText();
			
			if (pesos.equals(""))
				
				JOptionPane.showMessageDialog(null, "Por Favor ingrese un Precio");
			
			
			if(cantidad.equals(""))
			{
				JOptionPane.showMessageDialog(null, "Por Favor ingrese Cantidad de Libros");
			}
			
			
			if(nombre.equals(""))
				{
					JOptionPane.showMessageDialog(null, "Por Favor ingrese el Nombre del Libro");
				}
				
			
			else
			{
				float precio =0;
				precio =Float.parseFloat(pesos);//transformar precios
					
				
					if(ch1.isSelected())
					{
						String dato1 = t3.getText(); //transfor de dato texto a 
						float n1 = Float.parseFloat(dato1);
						
						precio = precio * 1.07f *n1;//ejemplo para parcial
						 
					
						
				
					}
						if(ch2.isSelected())
						{
							String dato1 = t3.getText(); //transfor de dato texto a 
							float n1 = Float.parseFloat(dato1);
							
							precio = precio * 1.05f *n1;//ejemplo para parcial
							;//ejemplo para parcial
							
							
							
					
					}
						if(ch3.isSelected())
						{
							String dato1 = t3.getText(); //transfor de dato texto a 
							float n1 = Float.parseFloat(dato1);
							
							precio = precio * 1.03f *n1;//ejemplo para parcial
							//ejemplo para parcial
						
							
							
					
						
						}
			
							if(ch4.isSelected())
							{
								
								//ejemplo para parcial
							
								JOptionPane.showMessageDialog(null,"Elegiste Opcion <No soy Socio> Todas las Categorias tenien RECARGOS");
								
							
							}
			
								if(ch5.isSelected())
								{
									String pes = t2.getText();
									int o = Integer.parseInt(pes);
									float descuento= o  / 10;
									precio = precio - descuento;
									String dato1 = t3.getText(); //transfor de dato texto a 
									float n1 = Float.parseFloat(dato1);
									
									precio = precio *  n1;//ejemplo para parcial
									JOptionPane.showMessageDialog(null,"Elegiste Opcion < soy Socio> Tienes %10 de descuento\n No es Necesario Seleccionar las Categorias");
									
									
								
								}
								String libro="";
							DecimalFormat f1 = new DecimalFormat("0.00");
							l4.setText("$ " + f1.format(precio));//concatenar signo pesos
							
							if(!libro.equals(""))//ejemplo para parcial
							JOptionPane.showMessageDialog(null, "Libreria Eliseo Ocaño\n Libro Comprado:\n " + t1.getText() + "" + "\n Precio Final:  " + l4.getText());
							else
								JOptionPane.showMessageDialog(null, "Libreria Eliseo Ocaño\n Sin Nombre  \n Precio final: " + l4.getText());
				}
			
			
			}
		}
		
	

	public static void main(String[] args) 
	
	{
		Libreria l1= new Libreria();
		l1.setTitle("Libreria Eliseo Ocaño");
		l1.setBounds(400,200,600,400);
		l1.setVisible(true);

	}

}
