import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;

public class Prueba extends JFrame {

	private JPanel contentPane;
	private JTextField t1;
	private JTextField t2;
	private JTextField t3;
	private JLabel resultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Prueba frame = new Prueba();
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
	public Prueba() {
		setTitle("Primer Trabajo con el Windows Builder");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 451, 347);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Primer Programa");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(125, 11, 216, 42);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Ingrese Producto");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(28, 76, 157, 25);
		contentPane.add(lblNewLabel_1);
		
		t1 = new JTextField();
		t1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		t1.setBounds(207, 64, 208, 33);
		contentPane.add(t1);
		t1.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Ingrese Precio");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(28, 120, 157, 25);
		contentPane.add(lblNewLabel_1_1);
		
		t2 = new JTextField();
		t2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		t2.setColumns(10);
		t2.setBounds(207, 120, 103, 24);
		contentPane.add(t2);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Ingrese Cantidad");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1_1.setBounds(28, 171, 157, 25);
		contentPane.add(lblNewLabel_1_1_1);
		
		t3 = new JTextField();
		t3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		t3.setColumns(10);
		t3.setBounds(207, 171, 103, 24);
		contentPane.add(t3);
		
		JButton btnNewButton = new JButton("Calcular Importe");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String dat2= t2.getText();
				String dat3= t3.getText();
				
				float precio = Float.parseFloat(dat2);
				int cantidad = Integer.parseInt(dat3);
				
				float total = precio * cantidad;
				
				DecimalFormat f = new DecimalFormat("0.00");
				
				resultado.setText("$" + f.format(total));
				
				
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBounds(28, 208, 157, 44);
		contentPane.add(btnNewButton);
		
		resultado = new JLabel("$ 0,00");
		resultado.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		resultado.setOpaque(true);
		resultado.setBackground(Color.MAGENTA);
		resultado.setFont(new Font("Tahoma", Font.PLAIN, 15));
		resultado.setHorizontalAlignment(SwingConstants.CENTER);
		resultado.setBounds(207, 206, 208, 46);
		contentPane.add(resultado);
		
		JButton btnNewButton_1 = new JButton("Salir del Programa");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				System.exit(0);
			}
			
		});
		btnNewButton_1.setBounds(207, 261, 208, 36);
		contentPane.add(btnNewButton_1);
	}
}
