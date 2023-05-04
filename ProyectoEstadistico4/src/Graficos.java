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

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Graficos extends JFrame {

	private JPanel contentPane;
	private JTextField t1;
	private JTextField t2;
	private JTextField t3;
	private JTextField t4;
	private JTextField t5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Graficos frame = new Graficos();
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
	public Graficos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 682, 569);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Partido 1");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 11, 98, 32);
		contentPane.add(lblNewLabel);
		
		t1 = new JTextField();
		t1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		t1.setHorizontalAlignment(SwingConstants.CENTER);
		t1.setBounds(118, 11, 98, 32);
		contentPane.add(t1);
		t1.setColumns(10);
		
		JLabel lblPartido = new JLabel("Partido 2");
		lblPartido.setHorizontalAlignment(SwingConstants.CENTER);
		lblPartido.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPartido.setBounds(10, 54, 98, 32);
		contentPane.add(lblPartido);
		
		t2 = new JTextField();
		t2.setHorizontalAlignment(SwingConstants.CENTER);
		t2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		t2.setColumns(10);
		t2.setBounds(118, 54, 98, 32);
		contentPane.add(t2);
		
		JLabel lblPartido_1 = new JLabel("Partido 3");
		lblPartido_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblPartido_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPartido_1.setBounds(10, 97, 98, 32);
		contentPane.add(lblPartido_1);
		
		t3 = new JTextField();
		t3.setHorizontalAlignment(SwingConstants.CENTER);
		t3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		t3.setColumns(10);
		t3.setBounds(118, 97, 98, 32);
		contentPane.add(t3);
		
		JLabel lblPartido_2 = new JLabel("Partido 4");
		lblPartido_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblPartido_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPartido_2.setBounds(10, 140, 98, 32);
		contentPane.add(lblPartido_2);
		
		t4 = new JTextField();
		t4.setHorizontalAlignment(SwingConstants.CENTER);
		t4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		t4.setColumns(10);
		t4.setBounds(118, 140, 98, 32);
		contentPane.add(t4);
		
		JLabel lblPartido_3 = new JLabel("Partido 5");
		lblPartido_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblPartido_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPartido_3.setBounds(10, 183, 98, 32);
		contentPane.add(lblPartido_3);
		
		t5 = new JTextField();
		t5.setHorizontalAlignment(SwingConstants.CENTER);
		t5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		t5.setColumns(10);
		t5.setBounds(118, 183, 98, 32);
		contentPane.add(t5);
		
		JButton btnNewButton = new JButton("Grafico de Tarta");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				bandera = 1;//si bandera este en 1 muestra un dibujo o grafico 
				repaint();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBounds(10, 226, 147, 32);
		contentPane.add(btnNewButton);
		
		JButton btnGraficoDeBarra = new JButton("Grafico de Barra");
		btnGraficoDeBarra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				bandera =2;
				repaint();
			}
		});
		btnGraficoDeBarra.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnGraficoDeBarra.setBounds(158, 226, 147, 32);
		contentPane.add(btnGraficoDeBarra);
		
		JButton btnNewButton_2 = new JButton("Grafico de Tarta 3D");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				bandera=3;
				repaint();
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_2.setBounds(315, 226, 163, 32);
		contentPane.add(btnNewButton_2);
		
		JButton btnGraficoDeBarra_1 = new JButton("Grafico de Barra V");
		btnGraficoDeBarra_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				bandera = 4;
				repaint();
			}
		});
		btnGraficoDeBarra_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnGraficoDeBarra_1.setBounds(481, 226, 163, 32);
		contentPane.add(btnGraficoDeBarra_1);
	}
	
	int v1,v2,v3,v4,v5;
	 public void tomarDatos() 
	 {
		 String dato1=t1.getText();//transformar los datos
		 String dato2=t2.getText();
		 String dato3=t3.getText();
		 String dato4=t4.getText();
		 String dato5=t5.getText();
		 
		 v1 = Integer.parseInt(dato1);//tomar los datos transformados 
		 v2 = Integer.parseInt(dato2);
		 v3 = Integer.parseInt(dato3);
		 v4 = Integer.parseInt(dato4);
		 v5 = Integer.parseInt(dato5);
	 }
	 
	 public void indicacion(Graphics g ) 
	 {
		// indicacion
			
			int espaciado=35;
			
			g.setColor(Color.red);
			g.fillRect(450, 370, 40, 23);
			g.setColor(Color.magenta);
			g.drawString("Partido 1", 500, 385);
			g.setColor(Color.black);
			g.drawRect(450, 370, 40, 25);//para ponerle un marco
			
			g.setColor(Color.yellow);
			g.fillRect(450, 370 + espaciado, 40, 23);
			g.setColor(Color.magenta);
			g.drawString("Partido 2", 500, 385 + espaciado);
			g.setColor(Color.black);
			g.drawRect(450, 370 + espaciado, 40, 23);
			
			g.setColor(Color.green);
			g.fillRect(450, 370 + espaciado * 2, 40, 23);
			g.setColor(Color.magenta);
			g.drawString("Partido 3", 500, 385 + espaciado * 2);
			g.setColor(Color.black);
			g.drawRect(450, 370 + espaciado * 2, 40, 23);
			
			
			g.setColor(Color.blue);
			g.fillRect(450, 370 + espaciado * 3, 40, 23);
			g.setColor(Color.magenta);
			g.drawString("Partido 4", 500, 385 + espaciado * 3);
			g.setColor(Color.black);
			g.drawRect(450, 370 + espaciado * 3, 40, 23);
			
			
			g.setColor(Color.orange);
			g.fillRect(450, 370 + espaciado * 4, 40, 23);
			g.setColor(Color.magenta);
			g.drawString("Partido 5", 500, 385 + espaciado * 4);
			g.setColor(Color.black);
			g.drawRect(450, 370 + espaciado * 4, 40, 25);
			
	 }
	 
	 int mayor()
	 {
		 tomarDatos();//para el grafico de barras
		 int m = v1;
		 
		 if(v2>m) m=v2;
		 if(v3>m) m=v3;
		 if(v4>m) m=v4;
		 if(v5>m) m=v5;
		
		 
		 
		 
		 return m;
	 }
	 
	 
	 
	 
	 
	 int bandera=0;
	public void paint(Graphics g)
	{
		super.paint(g);
		
		
		
		
		if(bandera==1)//esto sirve para usar con banderas mirar arriba 
		{
			// dibujar torta
			tomarDatos();
		int suma = v1+v2+v3+v4+v5;
		//suma ----->360
		// v1 ------> x
		// x= v1 *360/suma;
		int a1=v1*360/suma;
		int a2=v2*360/suma;
		int a3=v3*360/suma;
		int a4=v4*360/suma;
		int a5=v5*360/suma;
		
		//g.fillArc(X, Y, Rx, Ry, angulo Inicial, angulo Final);//arco lleno
		
		g.setColor(Color.red);
		g.fillArc(200, 360, 190, 190, 0, a1);
		
		g.setColor(Color.yellow);
		g.fillArc(200, 360, 190, 190, a1, a2);
		
		g.setColor(Color.green);
		g.fillArc(200, 360, 190, 190,a1 + a2, a3);
		
		g.setColor(Color.blue);
		g.fillArc(200, 360, 190, 190, a1+a2+a3, a4);
		
		g.setColor(Color.orange);
		g.fillArc(200, 360, 190, 190, a1+a2+a3+a4, 360 - (a1+a2+a3+a4));
			
		g.setColor(Color.black);
   //.g.drawOval(x(izq),y(der),Rx,Ry)
		g.drawOval(200, 360, 190, 190);
		
		indicacion(g);
		
		
		}
		if(bandera==2)//esto sirve para usar con banderas mirar arriba 
		{
			// dibujar Barra horizontales
			
			int margen = 100;
			tomarDatos();
			g.setColor(Color.black);
			g.drawRect(margen, 300, 450, 250);
			
			int m = mayor();
			setTitle("Mayor = " + m);
			
			//mayor -----> 500px
			// v1 -----> x
			// x = v1 * 500/ mayor;(ancho de la barra)
			
			int maximo=450;// tamaño maximo del area a graficar
			
			int a1= v1 * maximo /m;
			int a2= v2 * maximo /m;
			int a3= v3 * maximo /m;
			int a4= v4 * maximo /m;
			int a5= v5 * maximo /m;
			
			int espaciado = 50;
			
			
			g.setColor(Color.red);
			g.fill3DRect(margen, 300, a1, 30,true);
			g.setColor(Color.black);
			g.drawRect(margen, 300, a1, 30);
			
			g.setColor(Color.yellow);
			g.fill3DRect(margen, 300 + espaciado, a2, 30,true);
			g.setColor(Color.black);
			g.drawRect(margen, 300 + espaciado, a2, 30);
			
			g.setColor(Color.GREEN);
			g.fill3DRect(margen, 300 + espaciado * 2, a3, 30,true);
			g.setColor(Color.black);
			g.drawRect(margen, 300 + espaciado * 2, a3, 30);
			
			g.setColor(Color.BLUE);
			g.fill3DRect(margen, 300 + espaciado * 3, a4, 30,true);
			g.setColor(Color.black);
			g.drawRect(margen, 300 + espaciado * 3, a4, 30);
			
			g.setColor(Color.ORANGE);
			g.fill3DRect(margen, 300 + espaciado * 4 , a5, 30,true);
			g.setColor(Color.black);
			g.drawRect(margen, 300 + espaciado * 4 , a5, 30);
			
			//indicacion
			
			g.setColor(Color.magenta);
			g.drawString("Partido 1", 40, 320 + espaciado * 0);
			g.drawString("Partido 2", 40, 320 + espaciado * 1);
			g.drawString("Partido 3", 40, 320 + espaciado * 2);
			g.drawString("Partido 4", 40, 320 + espaciado * 3);
			g.drawString("Partido 5", 40, 320 + espaciado * 4);
			
			
			//impresion de valores
			g.drawString(" " + v1 + " votos", margen+a1+5, 320 + espaciado * 0);
			g.drawString(" " + v2 + " votos", margen+a2+5, 320 + espaciado * 1);
			g.drawString(" " + v3 + " votos", margen+a3+5, 320 + espaciado * 2);
			g.drawString(" " + v4 + " votos", margen+a4+5, 320 + espaciado * 3);
			g.drawString(" " + v5 + " votos", margen+a5+5, 320 + espaciado * 4);
			
			
			
		}
		if(bandera==3)//esto sirve para usar con banderas mirar arriba 
		{
			// dibujar Barra 3d
			
			tomarDatos();
			int suma = v1+v2+v3+v4+v5;
			//suma ----->360
			// v1 ------> x
			// x= v1 *360/suma;
			int a1=v1*360/suma;
			int a2=v2*360/suma;
			int a3=v3*360/suma;
			int a4=v4*360/suma;
			int a5=v5*360/suma;
			
			int y = 0;//esto para hacer 3d
			
			//g.fillArc(X, Y, Rx, Ry, angulo Inicial, angulo Final);//arco lleno
			for(int i = 1 ; i<=20; i ++)
			{
				
			g.setColor(Color.red);
			g.fillArc(150, 400-y, 250, 130, 0, a1);
			
			g.setColor(Color.yellow);
			g.fillArc(150, 400-y, 250, 130, a1, a2);
			
			g.setColor(Color.green);
			g.fillArc(150, 400-y, 250, 130,a1 + a2, a3);
			
			g.setColor(Color.blue);
			g.fillArc(150, 400-y, 250, 130, a1+a2+a3, a4);
			
			g.setColor(Color.orange);
			g.fillArc(150, 400-y, 250, 130, a1+a2+a3+a4, 360 - (a1+a2+a3+a4));
			
			g.setColor(Color.black);
			   //.g.drawOval(x(izq),y(der),Rx,Ry)
			g.drawOval(150, 400-y, 250, 130);
			
			
			y = y +2;
			}
			
			indicacion(g);
			
		}
		if(bandera==4)//esto sirve para usar con banderas mirar arriba 
		{
			// dibujar Barra verticales
			

			int altura = 250;
			tomarDatos();
			g.setColor(Color.black);
			g.drawRect(100, 300, 450, 250);
			
			int base = 300+250;// pixel de la base del rectangulo
			int m = mayor();
			
			//mayor -----> 250 px
			// v1 -----> x
			// x = v1 * 230/ mayor;(altura de la barra)
			
			int a1= v1 * 250/m;
			int a2= v2 * 250/m;
			int a3= v3 * 250/m;
			int a4= v4 * 250/m;
			int a5= v5 * 250/m;
			
			int espaciado = 100;
			
			
			g.setColor(Color.red);
			g.fill3DRect(100, base-a1,50, a1,true);
			g.setColor(Color.black);
			g.drawRect(100, base-a1,50, a1);
			
			g.setColor(Color.yellow);
			g.fill3DRect(100+ espaciado*1, base-a2,50, a2,true);
			g.setColor(Color.black);
			g.drawRect(100 + espaciado*1, base-a2,50, a2);
			
			g.setColor(Color.green);
			g.fill3DRect(100+ espaciado*2, base-a3,50, a3,true);
			g.setColor(Color.black);
			g.drawRect(100 + espaciado*2, base-a3,50, a3);
			
			g.setColor(Color.blue);
			g.fill3DRect(100+ espaciado*3, base-a4,50, a4,true);
			g.setColor(Color.black);
			g.drawRect(100 + espaciado*3, base-a4,50, a4);
			
			g.setColor(Color.orange);
			g.fill3DRect(100+ espaciado*4, base-a5,50, a5,true);
			g.setColor(Color.black);
			g.drawRect(100 + espaciado*4, base-a5,50, a5);
			
			
			//indicacion
			
			g.setColor(Color.magenta);
			g.drawString("Partido 1", 40, 320 + espaciado * 0);
		}
			
	}
}
