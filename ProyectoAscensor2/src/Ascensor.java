import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.border.BevelBorder;

public class Ascensor extends JFrame {

	private JPanel contentPane;
	private JLabel label1;
	private JLabel label2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ascensor frame = new Ascensor();
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
	public Ascensor() {
		setTitle("Ascensor");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 475, 421);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("1");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String dato1=label1.getText();/* aca convertimos la label1 que es el numero uno en el desing*/
				int piso = Integer.parseInt(dato1);
				
				if(piso > 1)
				{
					label1.setText("1");
					label2.setText("BAJA");
				}
				else
					label2.setText("MISMO PISO");
				
				y = 329;
				repaint();//esto es para configurar el ascensor para subir y bajar
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnNewButton.setBounds(22, 297, 62, 62);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("2");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String dato1=label1.getText();/* aca convertimos la label1 que es el numero uno en el desing*/
				int piso = Integer.parseInt(dato1);
				
				if(piso < 2)
				{
					label1.setText("2");
					label2.setText("SUBE");
				}
				else
					if (piso > 2)
					{
						label1.setText("2");
						label2.setText("BAJA");
					}
					else
						label2.setText("MISMO PISO");
				
				y = 255;////esto es para configurar el ascensor para subir y bajar
				repaint();
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnNewButton_1.setBounds(22, 222, 62, 64);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("3");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String dato1=label1.getText();/* aca convertimos la label1 que es el numero uno en el desing*/
				int piso = Integer.parseInt(dato1);
				
				if(piso < 3)
				{
					label1.setText("3");
					label2.setText("SUBE");
				}
				else
					if (piso > 3)
					{
						label1.setText("3");
						label2.setText("BAJA");
					}
					else
						label2.setText("MISMO PISO");
				
				y = 180;////esto es para configurar el ascensor para subir y bajar
				repaint();
				
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnNewButton_2.setBounds(22, 147, 62, 64);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("4");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				
				String dato1=label1.getText();/* aca convertimos la label1 que es el numero uno en el desing*/
				int piso = Integer.parseInt(dato1);
				
				if(piso < 4)
				{
					label1.setText("4");
					label2.setText("SUBE");
				}
				else
					label2.setText("MISMO PISO");
				
				
				y = 105;////esto es para configurar el ascensor para subir y bajar
				repaint();
				
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnNewButton_3.setBounds(22, 74, 62, 62);
		contentPane.add(btnNewButton_3);
		
		JLabel lblNewLabel = new JLabel("Nro. de Piso");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(243, 95, 118, 43);
		contentPane.add(lblNewLabel);
		
		label1 = new JLabel("1");
		label1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		label1.setOpaque(true);
		label1.setForeground(Color.GREEN);
		label1.setBackground(SystemColor.desktop);
		label1.setHorizontalAlignment(SwingConstants.CENTER);
		label1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		label1.setBounds(371, 95, 62, 43);
		contentPane.add(label1);
		
		JLabel lblDireccion = new JLabel("Direccion");
		lblDireccion.setHorizontalAlignment(SwingConstants.CENTER);
		lblDireccion.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblDireccion.setBounds(114, 243, 164, 43);
		contentPane.add(lblDireccion);
		
		label2 = new JLabel("-----");
		label2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		label2.setOpaque(true);
		label2.setHorizontalAlignment(SwingConstants.CENTER);
		label2.setForeground(Color.GREEN);
		label2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label2.setBackground(Color.BLACK);
		label2.setBounds(283, 241, 150, 43);
		contentPane.add(label2);
	}
	int y = 329; //piso 1 valor 
	
	public void paint(Graphics g)//todo esto es para el ascensor
	{
		super.paint(g);
		
		//ASCENSOR EN ROJO
		g.setColor(Color.red);
		g.fillRect(100,y,40,62);
		
		
		//rectangulo de desplazamiento
		g.setColor(Color.black);
		g.drawRect(100,105,40,285);
	}
	
}
