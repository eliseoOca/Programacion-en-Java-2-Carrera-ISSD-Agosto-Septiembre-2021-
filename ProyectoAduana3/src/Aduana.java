import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Graphics;

import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class Aduana extends JFrame {

	private JPanel contentPane;
	private JLabel label1;
	private JComboBox comboBox;
	int revisados=0;
	int noRevisados=0;
	private JLabel label2;
	int n=0;
	int valor=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Aduana frame = new Aduana();
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
	public Aduana() {
		setForeground(new Color(255, 0, 0));
		setBackground(new Color(255, 0, 0));
		setTitle("Revision de Maletas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 520, 365);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(154, 205, 50));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cantidad de Bultos");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(44, 27, 148, 14);
		contentPane.add(lblNewLabel);
		
		label1 = new JLabel("0");
		label1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		label1.setOpaque(true);
		label1.setBackground(Color.YELLOW);
		label1.setHorizontalAlignment(SwingConstants.CENTER);
		label1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		label1.setBounds(54, 52, 60, 91);
		contentPane.add(label1);
		
		JButton btnNewButton = new JButton("+");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				String dato=label1.getText();//para selector numerico acrementar
				int n = Integer.parseInt(dato);
				
				if(n<10)
				{
					n++;
					label1.setText(String.valueOf(n));
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBounds(124, 52, 60, 38);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("-");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String dato=label1.getText();//selector numerico decremento
				int n = Integer.parseInt(dato);
				
				if(n>0)
				{
					n--;
					label1.setText(String.valueOf(n));
				}
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_1.setBounds(124, 105, 60, 38);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Sortear");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{    
				String dato = label1.getText();//para tomar el valor 
				 valor = Integer.parseInt(dato);//declare la variable valor arriba para dejarla de uso global
				
				if(valor!=0)
				{	
					
				
				 n=(int)(Math.random()*3)+1;//genera numero aleatorios//aca se declaro n arriba para uso global tambien
				setTitle (" Numero generado: " + n);//para imprimir los numero aleatorios
				if(n==1)
				{
					revisados++;//acomuladores
				}
				else
				{
					noRevisados++;
				}
				
				label2.setText("Revisados: " + revisados + " No Revisados: " + noRevisados);
				repaint();
				}
				else
					JOptionPane.showMessageDialog(null,"Debe indicar la cantidad de bultos");//muestra mensaje
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_2.setBounds(44, 190, 148, 38);
		contentPane.add(btnNewButton_2);
		
		comboBox = new JComboBox();
		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) 
			{
				repaint();
			}
		});
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 16));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Interior", "Exterior", ""}));
		comboBox.setBounds(270, 52, 158, 22);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel_1 = new JLabel("Procedencia");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(270, 21, 158, 22);
		contentPane.add(lblNewLabel_1);
		
		label2 = new JLabel("--------");
		label2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label2.setHorizontalAlignment(SwingConstants.CENTER);
		label2.setBounds(10, 243, 220, 29);
		contentPane.add(label2);
	}

	public void paint(Graphics g)
	{
		super.paint(g);
		g.setColor(Color.WHITE);//color del circulo
		g.fillOval(300,190,100,100);
		
		if(n==1 || valor>5)
		{
		g.setColor(Color.red);//esto es para cambiar de color el circulo cuando el valor es 1
		g.fillOval(300,190,100,100);
		}
		else
			if(n==2 || n==3)//esto es para cambiar de color el circulo cuando el valor es 2 y 3
		{
		g.setColor(Color.green);//
		g.fillOval(300,190,100,100);
		}
		g.setColor(Color.black);
		g.drawOval(300,190,100,100);//PARA HACER UN CIRCULO 
	}
	
	
}
