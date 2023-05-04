import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;

public class Cisterna extends JFrame {

	private JPanel contentPane;
	private JButton b1;
	private JButton b2;
	private JButton b3;
	private JButton b4;
	private JButton b5;
	private JButton b6;
	private JButton b7;
	private JLabel lb2;
	private JLabel lb1;
	private JLabel lb3;
	int bandera=0;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cisterna frame = new Cisterna();
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
	public Cisterna() {
		setTitle("-Cisterna-");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 710, 392);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		b1 = new JButton("Departamento 1");
		b1.setBackground(Color.ORANGE);
		b1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{	
				bandera=1;
				lb1.setText("Depto 1");
				
			}
		});
		b1.setBounds(10, 24, 139, 32);
		contentPane.add(b1);
		
		b2 = new JButton("Departamento 2");
		b2.setBackground(Color.ORANGE);
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{ bandera=2;
				lb1.setText("Depto 2");
			}
			
			
		});
		b2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		b2.setBounds(10, 67, 139, 32);
		contentPane.add(b2);
		
		b3 = new JButton("Departamento 3");
		b3.setBackground(Color.ORANGE);
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{	bandera=3;
				lb1.setText("Depto 3");
			}
		});
		b3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		b3.setBounds(10, 110, 139, 32);
		contentPane.add(b3);
		
		lb1 = new JLabel("---");
		lb1.setForeground(Color.ORANGE);
		lb1.setOpaque(true);
		lb1.setBackground(Color.GRAY);
		lb1.setHorizontalAlignment(SwingConstants.CENTER);
		lb1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lb1.setBounds(275, 43, 83, 56);
		contentPane.add(lb1);
		
		b4 = new JButton("Inicializacion");
		b4.setBackground(Color.ORANGE);
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				bandera=0;
				lb2.setText("---");
				lb1.setText("---");
				lb3.setText("0");
				
			}
		});
		b4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		b4.setBounds(230, 110, 168, 32);
		contentPane.add(b4);
		
		b5 = new JButton("Comenzar");
		b5.setBackground(Color.ORANGE);
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				
				if(bandera==1)
				{
					lb2.setText("Correcto");
				}
					else
						if(bandera==2)
					{
					   lb2.setText("Correcto");
					}
						else
					if(bandera==3)
					{
						lb2.setText("Correcto");
					
							}
					else {
						lb2.setText("INCorrecto");
					}
			      
				
					
					
					
					
						
				
				
		
		}	
		
			
		});
		b5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		b5.setBounds(485, 24, 139, 32);
		contentPane.add(b5);
		
		b6 = new JButton("Salir");
		b6.setBackground(Color.ORANGE);
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				System.exit(0);
			}
		});
		b6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		b6.setBounds(485, 110, 139, 32);
		contentPane.add(b6);
		
		lb2 = new JLabel("---");
		lb2.setForeground(Color.ORANGE);
		lb2.setOpaque(true);
		lb2.setBackground(Color.GRAY);
		lb2.setHorizontalAlignment(SwingConstants.CENTER);
		lb2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lb2.setBounds(485, 67, 139, 32);
		contentPane.add(lb2);
		
		lb3 = new JLabel("0");
		lb3.setForeground(Color.ORANGE);
		lb3.setOpaque(true);
		lb3.setBackground(Color.GRAY);
		lb3.setHorizontalAlignment(SwingConstants.CENTER);
		lb3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lb3.setBounds(500, 177, 106, 49);
		contentPane.add(lb3);
		
		b7 = new JButton("<<<");
		b7.setBackground(Color.ORANGE);
		b7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{	cont=cont -10;
			lb3.setText("" + cont);
				y = y - 24;
				
				if(y < 99) {
					y = 99;
					}
				if(cont<100)
				{
					lb3.setText(""+cont);
				}
				repaint();
			}
		});
		b7.setFont(new Font("Tahoma", Font.PLAIN, 15));
		b7.setBounds(456, 237, 90, 32);
		contentPane.add(b7);
		
		JButton b8 = new JButton(">>>");
		b8.setBackground(Color.ORANGE);
		b8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{   cont=cont +10;
			lb3.setText("" + cont);
				y = y + 25;
				if(y > 390) {
					y = 390;
				}
				if(cont>100)
				{
					lb3.setText(""+cont);
				}
				repaint();
			
			}
		});
		b8.setFont(new Font("Tahoma", Font.PLAIN, 15));
		b8.setBounds(556, 237, 90, 32);
		contentPane.add(b8);
	}
	int y=100;
	int cont=0;
	public void paint(Graphics g)
	{
		super.paint(g);
		g.setColor(Color.black);
		g.drawRect(100,270,260,30);
		
		g.setColor(Color.red);//margen derecho
		g.fillRect(y,270,10,30);
		
		
		g.drawString("100", 350, 265);
		g.drawString("90", 325, 265);
		g.drawString("80", 300, 265);
		g.drawString("70", 275, 265);
		g.drawString("60", 250, 265);
		g.drawString("50", 225, 265);
		g.drawString("40", 200, 265);
		g.drawString("30", 175, 265);
		g.drawString("20", 150, 265);
		g.drawString("10", 125, 265);
		g.drawString("0", 100, 265);
		
		//g.fillRect(y, 100, 10, 50);
	}
}
