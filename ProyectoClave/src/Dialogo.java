import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Dialogo extends JDialog implements ActionListener
{
	JLabel l1,l2,l3;
	JTextField t1,t2;
	JButton b1,b2;
	
	Dialogo()
	{
		setLayout(null);
		
		l1= new JLabel("Usuario: ");
		l1.setBounds(40,30,150,30);
		add(l1);
		
		t1= new JTextField();
		t1.setBounds(130,30,150,40);
		add(t1);
		
		l2= new JLabel("Clave: ");
		l2.setBounds(40,80,150,30);
		add(l2);
		
		t2= new JTextField();
		t2.setBounds(130,80,150,40);
		add(t2);
	
		b1 = new JButton("Acceder al Sistema");
		b1.setBounds(40,150,240,40);
		b1.addActionListener(this);
		add(b1);
		
		Font f1 = new Font("Serif",1,25);
		
		l3= new JLabel("Ingrese los Datos",JLabel.CENTER);
		l3.setBounds(40,200,240,30);
		l3.setForeground(Color.BLUE);
		l3.setFont(f1);
		add(l3);
		
		b2 = new JButton("Ingresar");
		b2.setBounds(40,250,240,40);
		b2.addActionListener(this);
		b2.setVisible(false);//ejemplo para parcial
		add(b2);
	
	}
	
	
	
	
	public void actionPerformed(ActionEvent e)
	{
		
		if(e.getSource()==b1)
		{	
		String usuario = t1.getText();
		String clave = t2.getText();
		
		if(usuario.equals("") || clave.equals(""))
		{
			JOptionPane.showMessageDialog(null,"Falta ingresar algun dato");
		}
		else
		{
		
		if(usuario.equals("Eduardo") && clave.equals("123456"))
		{
			l3.setForeground(Color.blue);//ejemplo para parcial
			l3.setText("Acceso Permitido");
			b2.setVisible(true);
		}
		else
		{
			l3.setForeground(Color.red);//ejemplo para parcial
			l3.setText("¡¡Acceso Denegado!!");
			b2.setVisible(false);
				}
			}
		
		}
	
		if(e.getSource()==b2)
		{
			String usuario = t1.getText();
			String clave = t2.getText();
					
					
			Datos d2 = new Datos(usuario,clave);//llamo los datos de usuario y clave y se deposita en a u y c de Datos()
			d2.setBounds(500,250,300,250);
			d2.setTitle("Datos Ingresados");
			d2.setModal(true);
			d2.setVisible(true);
		}
	
	}//Fin del actionPerformed
	
	public String retornarUsuario()//ejemplo para el parcial
	{
		String usuario = t1.getText();
		return usuario;
	}
	public String retornarClave()//ejemplo para el parcial
	{
		String clave = t2.getText();
		return clave;
	}
}


