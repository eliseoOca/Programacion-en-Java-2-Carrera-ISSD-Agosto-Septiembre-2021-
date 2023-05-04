import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.BevelBorder;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;

public class ExamenFinal extends JFrame {
	
	private JPanel contentPane;
	private JLabel lbl1;
	int valor=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ExamenFinal frame = new ExamenFinal();
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
	public ExamenFinal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 582, 534);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lbl1_1 = new JLabel("0");
		lbl1_1.setBackground(Color.ORANGE);
		lbl1_1.setOpaque(true);
		lbl1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lbl1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lbl1_1.setBounds(40, 182, 109, 94);
		contentPane.add(lbl1_1);
		
		JButton btnNewButton = new JButton("+");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String dato1=lbl1_1.getText();//esto es para mover el rectangulo
				int n = Integer.parseInt(dato1);
				
				if (n<100)
				{
					n=n+10;
					lbl1_1.setText(String.valueOf(n));
					x1=x1+25;
					repaint();
					if(n<=40)
					{
						lbl1_1.setForeground(Color.green);
						lbl2_1.setForeground(Color.green);
						lbl2_1.setText("Bajo");
					}
					if(n>50 && n<=80)
					{
						lbl1_1.setForeground(Color.yellow);
						lbl2_1.setForeground(Color.yellow);
						lbl2_1.setText("Medio");
					}
					else
					if(n>90)
					{
						lbl1_1.setForeground(Color.red);
						lbl2_1.setForeground(Color.red);
						lbl2_1.setText("Alto");
					}
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBounds(159, 182, 55, 44);
		contentPane.add(btnNewButton);
		
		JButton bton2 = new JButton("-");
		bton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String dato1=lbl1_1.getText();//esto es para mover el rectangulo
				int n = Integer.parseInt(dato1);
				
				if (n>0)
				{
					n=n-10;
					lbl1_1.setText(String.valueOf(n));
					x1=x1-25;
					repaint();
					if(n>=90)
					{
						lbl1_1.setForeground(Color.red);
						lbl2_1.setForeground(Color.red);
						lbl2_1.setText("Alto");
					}
					if(n<=80 && n>=50)
					{
						lbl1_1.setForeground(Color.yellow);
						lbl2_1.setForeground(Color.yellow);
						lbl2_1.setText("Medio");
					}
					else
					if(n<=40 && n>0)
					{
						lbl1_1.setForeground(Color.green);
						lbl2_1.setForeground(Color.green);
						lbl2_1.setText("Bajo");
					}
				}
			}
		});
		bton2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		bton2.setBounds(159, 232, 55, 44);
		contentPane.add(bton2);
		
		lbl2_1 = new JLabel("----");
		lbl2_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lbl2_1.setOpaque(true);
		lbl2_1.setBackground(Color.ORANGE);
		lbl2_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lbl2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lbl2_1.setBounds(40, 356, 166, 44);
		contentPane.add(lbl2_1);
		
		lbl6 = new JLabel("----");
		lbl6.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lbl6.setOpaque(true);
		lbl6.setHorizontalAlignment(SwingConstants.CENTER);
		lbl6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lbl6.setBackground(Color.YELLOW);
		lbl6.setBounds(279, 356, 166, 44);
		contentPane.add(lbl6);
		
		lbl3 = new JLabel("Desactivado");
		lbl3.setHorizontalAlignment(SwingConstants.CENTER);
		lbl3.setBounds(424, 106, 132, 30);
		contentPane.add(lbl3);
		
		lbl4 = new JLabel("Desactivado");
		lbl4.setHorizontalAlignment(SwingConstants.CENTER);
		lbl4.setBounds(424, 163, 132, 30);
		contentPane.add(lbl4);
		
		lbl5 = new JLabel("Desactivado");
		lbl5.setHorizontalAlignment(SwingConstants.CENTER);
		lbl5.setBounds(424, 218, 132, 30);
		contentPane.add(lbl5);
		
		JLabel lblNewLabel_3 = new JLabel("%");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_3.setBounds(216, 182, 46, 94);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Control de Bombas");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(279, 23, 277, 50);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Estado");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setBounds(279, 313, 166, 32);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Nivel");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setBounds(40, 316, 166, 29);
		contentPane.add(lblNewLabel_6);
		
		r1 = new JRadioButton("Bomba 1");
		r1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				if (r1.isSelected()) {
					 lbl6.setText("Normal");
					 lbl3.setText("Activado");
				}
				
				else {
					lbl3.setText("Desativado");
				}
				 
				 
			}
		});
		r1.setHorizontalAlignment(SwingConstants.CENTER);
		r1.setBounds(336, 106, 109, 23);
		contentPane.add(r1);
		
		r2 = new JRadioButton("Bomba 2");
		r2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				if(r2.isSelected())
				{
					lbl4.setText("Activado");
					lbl6.setText("Precaucion!!!!!");
					JOptionPane.showMessageDialog(null,"TURBINA 2 ACTIVADA " + " " + lbl6.getText() + " . " + " Con la presion del: " + lbl1_1.getText() + "%" );
				}
				
				else {
					lbl4.setText("Desactivado");
				}
				
			}
		});
		r2.setHorizontalAlignment(SwingConstants.CENTER);
		r2.setBounds(336, 163, 109, 23);
		contentPane.add(r2);
		
		r3 = new JRadioButton("Bomba 3");
		r3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				if(r3.isSelected()) {
					
					lbl5.setText("Activado");
					lbl6.setText("Peligro!!!!!");
					JOptionPane.showMessageDialog(null,"TURBINA 3 ACTIVADA " + " " + lbl6.getText() + " . " + " Con la presion del: " + lbl1_1.getText() + "%" );
				}
				else {
					lbl5.setText("Desactivado");
				}
			}
		});
		r3.setHorizontalAlignment(SwingConstants.CENTER);
		r3.setBounds(336, 218, 109, 23);
		contentPane.add(r3);
	}
	
	int x1=0;
	private JLabel lbl2_1;
	private JLabel lbl1_1;
	private JLabel lbl3;
	private JLabel lbl4;
	private JLabel lbl5;
	private JLabel lbl6;
	int bandera=0;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JRadioButton r1;
	private JRadioButton r2;
	private JRadioButton r3;
	public void paint(Graphics g)
	{ 
		super.paint(g);
		
		g.setColor(Color.black);
		g.drawRect(30,120,252,60);
	
		g.setColor(Color.gray);//margen izquierdo
		g.fillRect(30+x1,120,4,60);
	
	
	}
}
