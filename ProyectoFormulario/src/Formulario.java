import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Formulario extends JFrame implements ActionListener
{
	JLabel label1,label2;
	JButton b1,b2;
	int bandera;
	
	
	Formulario()
	{
		setLayout(null);
		
		bandera= 0;//texto normal (azul sobre cyan)
		//Font f1= new  Font("Tipo",calidad, tamaño)
		//calidad: 0,1,2,3
		//0 texto plano
		//1 Texto en Negrita(Bolt)
		//2 Texto en Italic(Inclinada)
		//3 Texto Negrita + Italic
		Font f1= new  Font("Serif",3,15);
		
		Font f2= new  Font("Serif",1,15);
		
		label1 = new JLabel("Alumno : Eduardo Mansilla",JLabel.CENTER);
		//clumna.fila.ancho.alto
		label1.setBounds(70,80,250,40);
		label1.setBackground(Color.cyan);//color de fondo
		label1.setOpaque(true);
		label1.setForeground(Color.blue);//color de texto
		label1.setFont(f1);
		add(label1);
		
		label2 = new JLabel("Carrera : Desarrollo de Software",JLabel.CENTER);
		//clumna.fila.ancho.alto
		label2.setBounds(70,150,250,40);//la fila se calcula sumando la fila y el alto de la label1
		label2.setBackground(Color.cyan);//color de fondo
		label2.setOpaque(true);
		label2.setForeground(Color.blue);//color de texto
		label2.setFont(f1);
		add(label2);
		
		b1= new JButton("Invertir Color");
		b1.setBounds(70,230,250,40);
		add(b1);
		b1.addActionListener(this);
		b1.setFont(f2);
		
		b2= new JButton("Finalizar");
		b2.setBounds(70,300,250,40);
		add(b2);
		b2.addActionListener(this);
		b2.setFont(f2);
		
		
		
		
		
		
	}
	
	
	
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)//tomar la fuente con getSource
		{
			if(bandera==0)
				
			{//texto invertido(cyan sobre azul)
				label1.setBackground(Color.blue);
				label1.setForeground(Color.cyan);
			
				label2.setBackground(Color.blue);
				label2.setForeground(Color.cyan);
				bandera=1;
			}
			else
				{
				//texto normal (azul sobre cyan)
				label1.setBackground(Color.cyan);
				label1.setForeground(Color.blue);
			
				label2.setBackground(Color.cyan);
				label2.setForeground(Color.blue);
				bandera= 0;
				
				}
		}
		
		if(e.getSource()==b2)//tomar la fuente con getSource
		{
			System.exit(0);//para salir del programa
			
		}
		
	}

	public static void main(String[] args) {
		Formulario f= new Formulario();
		//con respecto a la pantalla. marg izquierdo/extremo superior/ancho/alto
		f.setBounds(200,150,400,500);
		f.setTitle("**Formulario**");
		f.setVisible(true);
		

	}

	
	
	
	
	
	
}
