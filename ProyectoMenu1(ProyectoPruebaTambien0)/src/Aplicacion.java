import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;

public class Aplicacion extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField valor;
	private JTextField horas;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JLabel l1;
	private JRadioButton r1;
	private JRadioButton r2;
	private JComboBox cb1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Aplicacion dialog = new Aplicacion();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Aplicacion() {
		setTitle("Sueldo a Cobrar");
		setBounds(100, 100, 485, 449);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblNewLabel = new JLabel("Ingrese Nombre:");
			lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setBounds(28, 45, 139, 31);
			contentPanel.add(lblNewLabel);
		}
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField.setBounds(193, 45, 216, 31);
		contentPanel.add(textField);
		textField.setColumns(10);
		
		JLabel lblSueldoPorHora = new JLabel("Sueldo por Hora:");
		lblSueldoPorHora.setHorizontalAlignment(SwingConstants.CENTER);
		lblSueldoPorHora.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblSueldoPorHora.setBounds(28, 87, 139, 31);
		contentPanel.add(lblSueldoPorHora);
		
		valor = new JTextField();
		valor.setFont(new Font("Tahoma", Font.PLAIN, 15));
		valor.setColumns(10);
		valor.setBounds(193, 87, 114, 31);
		contentPanel.add(valor);
		
		JLabel lblCantidadDeHoras = new JLabel("Horas Trabajadas:");
		lblCantidadDeHoras.setHorizontalAlignment(SwingConstants.CENTER);
		lblCantidadDeHoras.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCantidadDeHoras.setBounds(28, 129, 139, 31);
		contentPanel.add(lblCantidadDeHoras);
		
		horas = new JTextField();
		horas.setFont(new Font("Tahoma", Font.PLAIN, 15));
		horas.setColumns(10);
		horas.setBounds(193, 129, 57, 31);
		contentPanel.add(horas);
		
		r1 = new JRadioButton("Presenta Asignaciones Familiar");
		buttonGroup.add(r1);
		r1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		r1.setBounds(28, 182, 240, 23);
		contentPanel.add(r1);
		
		r2 = new JRadioButton("No Presenta Asignaciones Familiar");
		r2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		buttonGroup.add(r2);
		r2.setSelected(true);
		r2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		r2.setBounds(28, 224, 245, 23);
		contentPanel.add(r2);
		
		cb1 = new JComboBox();
		cb1.setModel(new DefaultComboBoxModel(new String[] {"Descuento Obra Socila", "Sin descuento por Obra Social"}));
		cb1.setBounds(274, 184, 185, 22);
		contentPanel.add(cb1);
		
		JButton b1 = new JButton("Calcular Salario");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String dato1 = valor.getText(); /* transformacion paso 1*/          /*ver video jueves 7.10 hora 1;26(esto sirve para calcular las horas)*/
				String dato2 = horas.getText();/* transformacion paso 1*/ 
				
				if(dato1.equals("") || dato2.equals(""))
				{
					JOptionPane.showMessageDialog(null, "Debe ingrsar los dos valores del sueldo por hora y cantidad");/* esto sirve para sacar un cartel cuando no se ingresan valores*/ 
				}
				else
				{
				float sueldo = Float.parseFloat(dato1);/* llamada al valor (sueldo hora) *//* transformacion paso 2*/ 
				int cantidad= Integer.parseInt(dato2);/* llamada al horas (horas trabajadas) *//* transformacion paso 2*/ 
				
				float sueldoNeto= sueldo * cantidad;
				
				float incremento= 0;
				
				if(r1.isSelected())                 /*aca seleciona el button "presenta asignaciones familiar" */
					incremento= sueldoNeto * 20/100;
				
				float descuento = 0;
				
				int posicion = cb1.getSelectedIndex();/*aca elije la pisicion de "descuento obra social"  */
				
				if(posicion == 0)
					descuento = sueldoNeto *10/100;
				
				sueldoNeto = sueldoNeto + incremento - descuento;
				
				DecimalFormat f = new DecimalFormat("0.00");/*aca deposita el sueldo en la l1 de color amarillo*/
				l1.setText("$" + f.format(sueldoNeto));
				}	
			}
		});
		b1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		b1.setBounds(22, 254, 145, 46);
		contentPanel.add(b1);
		
		l1 = new JLabel("0,00");
		l1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		l1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		l1.setOpaque(true);
		l1.setBackground(Color.YELLOW);
		l1.setHorizontalAlignment(SwingConstants.CENTER);
		l1.setBounds(274, 254, 185, 46);
		contentPanel.add(l1);
		
		JButton b2 = new JButton("Retornar al Programa Principal");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				dispose();
			}
		});
		b2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		b2.setBounds(22, 322, 437, 46);
		contentPanel.add(b2);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
		}
	}
}
