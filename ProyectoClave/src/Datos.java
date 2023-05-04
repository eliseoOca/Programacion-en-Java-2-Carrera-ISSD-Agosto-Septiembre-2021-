import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;

public class Datos extends JDialog implements ActionListener

{
	JLabel l1,l2,l3,l4;
	JButton b1;
	
	Datos(String u, String c)//para tomar los datos para la tercera ventana 
	{
		setLayout(null);
		
		l1 = new JLabel("Usuario: ");
		l1.setBounds(30,30,100,40);
		add(l1);
		
		l2 = new JLabel("-------");
		l2.setBounds(130,30,150,40);
		add(l2);
		
		
		l3 = new JLabel("Clave: ");
		l3.setBounds(30,80,100,40);
		add(l3);
		
		l4 = new JLabel("-------");
		l4.setBounds(130,80,150,40);
		add(l4);
		
		b1 = new JButton("Cerrar la Ventana");
		b1.addActionListener(this);
		b1.setBounds(30,150,230,40);
		add(b1);
		
		
		l2.setText(u);//esto es para depositar los datos en la variable usuario de la tercera ventana
		l4.setText(c);//esto es para depositar los datos en la variable clave de la tercera ventana
		
		
	}
	
	
	
	
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			dispose();//cierra la venetana pero no el programa 
		}
	}
}
