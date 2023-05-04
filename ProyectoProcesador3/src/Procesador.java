import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class Procesador extends JFrame {

	private JPanel contentPane;
	private JLabel label2;
	private JLabel label1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Procesador frame = new Procesador();
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
	public Procesador() {
		setTitle("      Procesador de Texto");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 590, 489);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 127, 80));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Hoja");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(42, 21, 70, 25);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Margen Superior");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(153, 21, 119, 23);
		contentPane.add(lblNewLabel_1);
		
		label1 = new JLabel("0");
		label1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		label1.setOpaque(true);
		label1.setForeground(Color.ORANGE);
		label1.setBackground(Color.GRAY);
		label1.setHorizontalAlignment(SwingConstants.CENTER);
		label1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label1.setBounds(153, 55, 50, 61);
		contentPane.add(label1);
		
		JButton btnNewButton = new JButton("+");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				String dato1=label1.getText();//esto es para mover el rectangulo
				int n = Integer.parseInt(dato1);
				
				if (n<20)
				{
					n=n+1;
					label1.setText(String.valueOf(n));
					y1=y1+3;
					repaint();
				}
			}
		});
		btnNewButton.setForeground(new Color(46, 139, 87));
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBounds(213, 55, 51, 25);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("-");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			
			{
				
				String dato1=label1.getText();//esto es para mover el rectangulo
				int n = Integer.parseInt(dato1);
				
				if (n>0)
				{
					n=n-1;
					label1.setText(String.valueOf(n));
					y1=y1-3;
					repaint();
				}
				
			}
		});
		btnNewButton_1.setForeground(new Color(46, 139, 87));
		btnNewButton_1.setBackground(Color.BLACK);
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_1.setBounds(213, 91, 51, 25);
		contentPane.add(btnNewButton_1);
		
		label2 = new JLabel("0");
		label2.setOpaque(true);
		label2.setHorizontalAlignment(SwingConstants.CENTER);
		label2.setForeground(Color.ORANGE);
		label2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		label2.setBackground(Color.GRAY);
		label2.setBounds(153, 204, 50, 61);
		contentPane.add(label2);
		
		JLabel lblNewLabel_1_1 = new JLabel("Margen Inferior");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_1.setBounds(153, 170, 119, 23);
		contentPane.add(lblNewLabel_1_1);
		
		JButton btnNewButton_2 = new JButton("+");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String dato1=label2.getText();//esto es para mover el rectangulo
				int n = Integer.parseInt(dato1);
				
				if (n<20)
				{
					n=n+1;
					label2.setText(String.valueOf(n));
					y2=y2-3;
					repaint();
				}
			}
		});
		btnNewButton_2.setForeground(new Color(46, 139, 87));
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_2.setBackground(Color.BLACK);
		btnNewButton_2.setBounds(213, 204, 51, 25);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_1_1 = new JButton("-");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				
				String dato1=label2.getText();//esto es para mover el rectangulo
				int n = Integer.parseInt(dato1);
				
				if (n>0)
				{
					n=n-1;
					label2.setText(String.valueOf(n));
					y2=y2+3;
					repaint();
				}
			}
			
			
		});
		btnNewButton_1_1.setForeground(new Color(46, 139, 87));
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_1_1.setBackground(Color.BLACK);
		btnNewButton_1_1.setBounds(213, 240, 51, 25);
		contentPane.add(btnNewButton_1_1);
		
		label3 = new JLabel("0");
		label3.setOpaque(true);
		label3.setHorizontalAlignment(SwingConstants.CENTER);
		label3.setForeground(Color.ORANGE);
		label3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label3.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		label3.setBackground(Color.GRAY);
		label3.setBounds(24, 335, 50, 61);
		contentPane.add(label3);
		
		nn = new JLabel("Margen Izquierdo");
		nn.setHorizontalAlignment(SwingConstants.CENTER);
		nn.setFont(new Font("Tahoma", Font.PLAIN, 15));
		nn.setBounds(24, 301, 119, 23);
		contentPane.add(nn);
		
		JButton btnNewButton_3 = new JButton("+");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String dato1=label3.getText();//esto es para mover el rectangulo
				int n = Integer.parseInt(dato1);
				
				if (n<20)
				{
					n=n+1;
					label3.setText(String.valueOf(n));
					x1=x1+3;
					repaint();
				}
			}
		});
		btnNewButton_3.setForeground(new Color(46, 139, 87));
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_3.setBackground(Color.BLACK);
		btnNewButton_3.setBounds(84, 335, 51, 25);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_1_2 = new JButton("-");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String dato1=label3.getText();//esto es para mover el rectangulo
				int n = Integer.parseInt(dato1);
				
				if (n>0)
				{
					n=n-1;
					label3.setText(String.valueOf(n));
					x1=x1-3;
					repaint();
				}
			}
		});
		btnNewButton_1_2.setForeground(new Color(46, 139, 87));
		btnNewButton_1_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_1_2.setBackground(Color.BLACK);
		btnNewButton_1_2.setBounds(84, 371, 51, 25);
		contentPane.add(btnNewButton_1_2);
		
		label4 = new JLabel("0");
		label4.setOpaque(true);
		label4.setHorizontalAlignment(SwingConstants.CENTER);
		label4.setForeground(Color.ORANGE);
		label4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label4.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		label4.setBackground(Color.GRAY);
		label4.setBounds(153, 335, 50, 61);
		contentPane.add(label4);
		
		vv = new JLabel("Margen Derecho");
		vv.setHorizontalAlignment(SwingConstants.CENTER);
		vv.setFont(new Font("Tahoma", Font.PLAIN, 15));
		vv.setBounds(153, 301, 119, 23);
		contentPane.add(vv);
		
		JButton btnNewButton_4 = new JButton("+");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String dato1=label4.getText();//esto es para mover el rectangulo
				int n = Integer.parseInt(dato1);
				
				if (n<20)
				{
					n=n+1;
					label4.setText(String.valueOf(n));
					x2=x2-3;
					repaint();
				}
			}
		});
		btnNewButton_4.setForeground(new Color(46, 139, 87));
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_4.setBackground(Color.BLACK);
		btnNewButton_4.setBounds(213, 335, 51, 25);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_1_3 = new JButton("-");
		btnNewButton_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String dato1=label4.getText();//esto es para mover el rectangulo
				int n = Integer.parseInt(dato1);
				
				if (n>0)
				{
					n=n-1;
					label4.setText(String.valueOf(n));
					x2=x2+3;
					repaint();
				}
			}
		});
		btnNewButton_1_3.setForeground(new Color(46, 139, 87));
		btnNewButton_1_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_1_3.setBackground(Color.BLACK);
		btnNewButton_1_3.setBounds(213, 371, 51, 25);
		contentPane.add(btnNewButton_1_3);
		
		JLabel lblNewLabel_2 = new JLabel("Orientacion de Pagina");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(299, 21, 212, 23);
		contentPane.add(lblNewLabel_2);
		
		comboBox = new JComboBox();
		comboBox.setForeground(Color.ORANGE);
		comboBox.setBackground(new Color(128, 128, 128));
		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e)
			{
				repaint();
			}
		});
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 20));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Horizontal", "Vertical"}));
		comboBox.setBounds(299, 55, 212, 38);
		contentPane.add(comboBox);
		
		JButton btnNewButton_5 = new JButton("Inicializar");
		btnNewButton_5.setForeground(new Color(46, 139, 87));
		btnNewButton_5.setBackground(Color.BLACK);
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				label1.setText("0");
				label2.setText("0");
				label3.setText("0");
				label4.setText("0");
				x1=0;
				x2=0;
				y1=0;
				y2=0;
				comboBox.setSelectedIndex(0);
				repaint();
			}
		});
		btnNewButton_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_5.setBounds(299, 335, 119, 62);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_5_1 = new JButton("Finalizar");
		btnNewButton_5_1.setForeground(new Color(46, 139, 87));
		btnNewButton_5_1.setBackground(Color.BLACK);
		btnNewButton_5_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				System.exit(0);
			}
		});
		btnNewButton_5_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_5_1.setBounds(425, 335, 119, 61);
		contentPane.add(btnNewButton_5_1);
	}
	int y1=0;
	int y2=0;
	int x1=0;
	int x2=0;
	private JLabel nn;
	private JLabel vv;
	private JLabel label4;
	private JLabel label3;
	private JComboBox comboBox;
	public void paint(Graphics g)
	{
		super.paint(g);
		
		g.setColor(Color.black);//rectangulo lleno es para hacer la sombra dela hoja
		g.fillRect(55,95,80,215);
		
		g.setColor(Color.orange);// hoja
		g.fillRect(45,85,80,215);
		
		g.setColor(Color.gray);//margen izquierdo
		g.fillRect(45+x1,85,4,215);
		
		g.setColor(Color.gray);//margen derecho
		g.fillRect(45+x2+80-4,85,4,215);
		
		g.setColor(Color.gray);//margen superior
		g.fillRect(45,85+y1,80,4);
		
		g.setColor(Color.gray);//margen inferior
		g.fillRect(45,85+215-4+y2,80,4);
		
		g.setColor(Color.black);
		g.drawRect(45,85,80,215);
		
		
		String h = comboBox.getSelectedItem().toString();//esto rescata los valores del comboBox(horizontal,vertical)
		if (h.equals("Horizontal"))
		{
		//Hoja horizontal
			
		g.setColor(Color.black);//esto le da sombra a la hoja
		g.fillRect(325,185,195,110);
			
		g.setColor(Color.orange);//esto le da color a la hoja
		g.fillRect(315,175,195,110);
			
		g.setColor(Color.black);
		g.drawRect(315,175,195,110);
		
		}
		else
		{
		//Hoja vertical
		g.setColor(Color.black);
		g.fillRect(365,155,110,195);
		
		g.setColor(Color.orange);
		g.fillRect(355,145,110,195);
			
		g.setColor(Color.black);
		g.drawRect(355,145,110,195);
		}
	}
}
