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
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.BevelBorder;

public class RecuperatorioFinal extends JFrame {

	private JPanel contentPane;
	private JLabel lbl1;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RecuperatorioFinal frame = new RecuperatorioFinal();
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
	public RecuperatorioFinal() {
		setTitle("-Suministro de Agua-");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 684, 551);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lbl1 = new JLabel("0");
		lbl1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lbl1.setBackground(Color.ORANGE);
		lbl1.setOpaque(true);
		lbl1.setHorizontalAlignment(SwingConstants.CENTER);
		lbl1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lbl1.setBounds(155, 21, 117, 56);
		contentPane.add(lbl1);
		
		JLabel lblNewLabel_1 = new JLabel("Nivel del Tanque");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(26, 27, 119, 56);
		contentPane.add(lblNewLabel_1);
		
		JButton btn1 = new JButton("<");
		btn1.setForeground(Color.ORANGE);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			
			{
				String dato1=lbl1.getText();//esto es para mover el rectangulo
				int n = Integer.parseInt(dato1);
				
				if (n>0)
				{
					n=n-1000;
					lbl1.setText(String.valueOf(n));
					x1=x1-25;
					repaint();
					
				}
			}
		});
		btn1.setBounds(42, 307, 76, 43);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton(">");
		btn2.setForeground(Color.ORANGE);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				String dato1=lbl1.getText();
				int n = Integer.parseInt(dato1);
				
				if (n<10000)
				{
					n=n+1000;
					lbl1.setText(String.valueOf(n));
					x1=x1+25;
					repaint();
					
					
				}
				
			}
		});
		btn2.setBounds(180, 307, 76, 43);
		contentPane.add(btn2);
		
		JButton btnNewButton_2 = new JButton("Datos Seleccionados");
		btnNewButton_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		btnNewButton_2.setBackground(Color.CYAN);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				JOptionPane.showMessageDialog(null,"Destino: " + " >>>" + lbl2.getText() + " .| " + " Nivel de Tanque Selecionado: " + "  >>>" + lbl1.getText() + " .| " + " Estado:  " + " >>> " + lbl3.getText()  );
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_2.setBounds(26, 384, 246, 56);
		contentPane.add(btnNewButton_2);
		
		JButton btn3 = new JButton("Barrio A");
		btn3.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		btn3.setBackground(Color.CYAN);
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
			 bandera=1;
			 lbl2.setText("Barrio A");
			}
		});
		btn3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn3.setBounds(324, 21, 133, 56);
		contentPane.add(btn3);
		
		JButton btn4 = new JButton("Barrio B");
		btn4.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		btn4.setBackground(Color.CYAN);
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				bandera=3;
				 lbl2.setText("Barrio B");
			}
		});
		btn4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn4.setBounds(324, 113, 133, 56);
		contentPane.add(btn4);
		
		JButton btn5 = new JButton("Barrio C");
		btn5.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		btn5.setBackground(Color.CYAN);
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				bandera=4;
				lbl2.setText("Barrio C");
			}
		});
		btn5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn5.setBounds(324, 199, 133, 56);
		contentPane.add(btn5);
		
		JButton btn6 = new JButton("Suministrar");
		btn6.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		btn6.setBackground(Color.CYAN);
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String dato1=lbl1.getText();
				int n = Integer.parseInt(dato1);
				if(n<=5000 && bandera==1) {
					
					 lbl2.setText("Barrio A");
					 lbl3.setText("Correcto");
					 }
				if(n>5000 && bandera==1) {
					
					 lbl2.setText("Barrio A");
					 lbl3.setText("Incorrecto");
					 }
				if(n>5000 && n<=8000 && bandera==3) {
					
					 lbl2.setText("Barrio B");
					 lbl3.setText("Correcto");
					 }
				if(n>8000 && bandera==3) {
					
					 lbl2.setText("Barrio B");
					 lbl3.setText("Incorrecto");
					 }
				if(bandera==4) {
					
					 lbl2.setText("Barrio C");
					 lbl3.setText("Correcto");
					 }
			}
		});
		btn6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn6.setBounds(324, 294, 153, 56);
		contentPane.add(btn6);
		
		lbl2 = new JLabel("0");
		lbl2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lbl2.setOpaque(true);
		lbl2.setHorizontalAlignment(SwingConstants.CENTER);
		lbl2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lbl2.setBackground(Color.ORANGE);
		lbl2.setBounds(487, 113, 139, 56);
		contentPane.add(lbl2);
		
		lbl3 = new JLabel("0");
		lbl3.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lbl3.setOpaque(true);
		lbl3.setHorizontalAlignment(SwingConstants.CENTER);
		lbl3.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lbl3.setBackground(Color.ORANGE);
		lbl3.setBounds(487, 294, 139, 56);
		contentPane.add(lbl3);
		
		JLabel lblNewLabel_1_1 = new JLabel("Destino");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_1.setBounds(485, 48, 119, 56);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Estado");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_2.setBounds(487, 224, 119, 56);
		contentPane.add(lblNewLabel_1_2);
		
		JButton btnNewButton_2_1 = new JButton("Inicializar");
		btnNewButton_2_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		btnNewButton_2_1.setBackground(Color.CYAN);
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				lbl1.setText("0");
				lbl2.setText("0");
				lbl3.setText("0");
				x1=0;
				repaint();
			}
		});
		btnNewButton_2_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_2_1.setBounds(324, 384, 280, 56);
		contentPane.add(btnNewButton_2_1);
		
		JLabel lblk = new JLabel("0");
		lblk.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblk.setBounds(20, 185, 26, 14);
		contentPane.add(lblk);
		
		JLabel lblk_1 = new JLabel("2000");
		lblk_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblk_1.setBounds(71, 185, 38, 14);
		contentPane.add(lblk_1);
		
		JLabel lblk_3 = new JLabel("4000");
		lblk_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblk_3.setBounds(119, 185, 38, 14);
		contentPane.add(lblk_3);
		
		JLabel lblK_1 = new JLabel("6000");
		lblK_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblK_1.setBounds(170, 185, 37, 14);
		contentPane.add(lblK_1);
		
		JLabel lblk_4 = new JLabel("8000");
		lblk_4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblk_4.setBounds(217, 185, 39, 14);
		contentPane.add(lblk_4);
		
		JLabel lblK_3_1 = new JLabel("10000");
		lblK_3_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblK_3_1.setBounds(253, 185, 47, 14);
		contentPane.add(lblK_3_1);
	}
	int bandera=0;
	int x1=0;
	private JLabel lbl3;
	private JLabel lbl2;
	public void paint(Graphics g)
	{ 
		super.paint(g);
	
		g.setColor(Color.black);//grafico 
		g.drawRect(30,230,252,60);
		
		g.setColor(Color.gray);//margen izquierdo
		g.fillRect(30+x1,230,4,60);
		
		g.setColor(Color.black);//izquierda
		g.drawRect(20,40,280,480);
		
		g.setColor(Color.black);//derecha
		g.drawRect(320,40,320,480);
	}
}
