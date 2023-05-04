import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;
import javax.swing.ButtonGroup;

public class Modelo extends JFrame {

	private JPanel contentPane;
	private JLabel label1;
	private JTextField txtSeleccionDeLa;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Modelo frame = new Modelo();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Modelo() {
		setTitle("Control de Vapor de Turbinas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 721, 479);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		label1 = new JLabel("0");
		label1.setOpaque(true);
		label1.setForeground(Color.GREEN);
		label1.setBackground(Color.GRAY);
		label1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		label1.setHorizontalAlignment(SwingConstants.CENTER);
		label1.setBounds(119, 11, 73, 89);
		contentPane.add(label1);
		
		JButton btnNewButton = new JButton("Subir Tem.");
		btnNewButton.setBorder(UIManager.getBorder("Button.border"));
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBackground(Color.ORANGE);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String dato1=label1.getText();//esto es para mover el rectangulo
				int n = Integer.parseInt(dato1);
				
				if (n<100)
				{
					n=n+10;
					label1.setText(String.valueOf(n));
					y1=y1-25;
					repaint();
					if(n<40)
					{
						label1.setForeground(Color.green);
						label3.setForeground(Color.green);
						label3.setText("Correcto");
					}
					if(n>40 && n<80)
					{
						label1.setForeground(Color.yellow);
						label3.setForeground(Color.yellow);
						label3.setText("Precausion");
					}
					else
					if(n>=90)
					{
						label1.setForeground(Color.red);
						label3.setForeground(Color.red);
						label3.setText("Peligro");
					}
				}
			}
		});
		btnNewButton.setBounds(207, 11, 102, 33);
		contentPane.add(btnNewButton);
		
		JButton btnBajarTem = new JButton("Bajar Tem.");
		btnBajarTem.setForeground(Color.BLACK);
		btnBajarTem.setBackground(Color.ORANGE);
		btnBajarTem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{String dato1=label1.getText();//esto es para mover el rectangulo
			int n = Integer.parseInt(dato1);
			
			if (n>0)
			{
				n=n-10;
				label1.setText(String.valueOf(n));
				y1=y1+25;
				repaint();
				if(n>=90)
				{
					label1.setForeground(Color.red);
					label3.setForeground(Color.red);
					label3.setText("Peligro");
				}
				if(n<=80 && n>=50)
				{
					label1.setForeground(Color.yellow);
					label3.setForeground(Color.yellow);
					label3.setText("Precausion");
				}
				else
				if(n<=40 && n>0)
				{
					label1.setForeground(Color.green);
					label3.setForeground(Color.green);
					label3.setText("Correcto");
				}
			}
			}	
			});
		btnBajarTem.setBounds(207, 67, 102, 33);
		contentPane.add(btnBajarTem);
		
		txtSeleccionDeLa = new JTextField();
		txtSeleccionDeLa.setForeground(Color.BLACK);
		txtSeleccionDeLa.setBackground(Color.ORANGE);
		txtSeleccionDeLa.setHorizontalAlignment(SwingConstants.CENTER);
		txtSeleccionDeLa.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtSeleccionDeLa.setText("Seleccion de la Turbina");
		txtSeleccionDeLa.setBounds(45, 150, 264, 46);
		contentPane.add(txtSeleccionDeLa);
		txtSeleccionDeLa.setColumns(10);
		
		r1 = new JRadioButton("Turbina A");
		buttonGroup.add(r1);
		r1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				bandera = 1;//si bandera este en 1 muestra un dibujo o grafico 
				
				
			}
		});
		r1.setBounds(45, 220, 109, 23);
		contentPane.add(r1);
		
		r2 = new JRadioButton("Turbina B");
		r2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				bandera = 2;//si bandera este en 1 muestra un dibujo o grafico 
				
			}
		});
		buttonGroup.add(r2);
		r2.setBounds(45, 261, 109, 23);
		contentPane.add(r2);
		
		r3 = new JRadioButton("Turbina C");
		r3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				bandera = 3;//si bandera este en 1 muestra un dibujo o grafico 
				
			}
		});
		buttonGroup.add(r3);
		r3.setBounds(45, 301, 109, 23);
		contentPane.add(r3);
		
		label2 = new JLabel("---");
		label2.setOpaque(true);
		label2.setBackground(Color.ORANGE);
		label2.setForeground(Color.BLACK);
		label2.setFont(new Font("Tahoma", Font.PLAIN, 30));
		label2.setHorizontalAlignment(SwingConstants.CENTER);
		label2.setBounds(207, 224, 102, 100);
		contentPane.add(label2);
		
		b1 = new JButton("Comenzar");
		b1.setBackground(Color.GRAY);
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{ 
				
				
			if(bandera==1)
			{	
				label3.setForeground(Color.green);
				label2.setText("A");
				repaint();
			}
			else
			if(bandera==2)
			{
				label3.setForeground(Color.yellow);
				label2.setText("B");
				label3.setText("Precausion");
				repaint();
			}
			else
				if(bandera==3) 
				{   
					label3.setForeground(Color.red);
					label2.setText("C");
					label3.setText("Peligro");
					repaint();
				}
				
			}
		});
		b1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		b1.setBounds(45, 331, 147, 33);
		contentPane.add(b1);
		
		label3 = new JLabel("Correcto");
		label3.setOpaque(true);
		label3.setBackground(Color.GRAY);
		label3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label3.setHorizontalAlignment(SwingConstants.CENTER);
		label3.setBounds(207, 335, 102, 29);
		contentPane.add(label3);
		
		JButton b2 = new JButton("Inicializar");
		b2.setBackground(Color.GRAY);
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				label1.setText("0");
				label2.setText("---");
				label3.setForeground(Color.black);
				label3.setText("Precausion");
				label3.setText("Apagado");
				y1=0;
				bandera=0;
				repaint();
			}
		});
		b2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		b2.setBounds(468, 331, 147, 33);
		contentPane.add(b2);
		
	}
	
	int y1=0;
	int y2=0;
	private JRadioButton r1;
	private JRadioButton r2;
	private JRadioButton r3;
	private JLabel label2;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JLabel label3;
	
	int bandera=0;
	private JButton b1;
	public void paint(Graphics g)
	{
		super.paint(g);
		g.setColor(Color.black);
		g.drawRect(500,105,100,250);
		
		
		g.setColor(Color.green);//rectangulo lleno es para hacer la sombra dela hoja
		g.fillRect(500,256,101,100);
		
		g.setColor(Color.yellow);//rectangulo lleno es para hacer la sombra dela hoja
		g.fillRect(500,156,101,100);
		
		g.setColor(Color.red);//rectangulo lleno es para hacer la sombra dela hoja
		g.fillRect(500,106,101,50);
		
		g.setColor(Color.gray);//margen inferior
		g.fillRect(500,355+y1,100,4);
		
		
		
		
		g.drawString("%", 545, 99);
		g.drawString("100", 475, 117);
		g.drawString("90", 480, 141);
		g.drawString("80", 480, 165);
		g.drawString("70", 480, 189);
		g.drawString("60", 480, 213);
		g.drawString("50", 480, 237);
		g.drawString("40", 480, 261);
		g.drawString("30", 480, 285);
		g.drawString("20", 480, 309);
		g.drawString("10", 480, 333);
		g.drawString("0", 490, 357);
		
		Font f1 = new Font("Serif",1,15);
		g.setFont(f1);
		g.drawString("Porcentaje de Vapor", 480, 80);
		
		if(bandera==1)
		{
			g.setColor(Color.gray);//margen inferior
			g.fillRect(500,256+y1,101,5);
		}
		if(bandera==2)
		{
			g.setColor(Color.gray);//margen inferior
			g.fillRect(500,156+y1,101,5);
		}
		if(bandera==3)
		{
			g.setColor(Color.gray);//margen inferior
			g.fillRect(500,106+y1,101,5);
		}
		
		
		
		
	}
}
