import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Datos extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Datos dialog = new Datos();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Datos() {
		setTitle("      Datos del Programador");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblNewLabel = new JLabel("Nombre del Programador:Eliseo Oca\u00F1o");
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblNewLabel.setBounds(83, 33, 273, 25);
			contentPanel.add(lblNewLabel);
		}
		{
			JLabel lblMateriadesarrolloSoftware = new JLabel("Materia:Programacion 2 ");
			lblMateriadesarrolloSoftware.setHorizontalAlignment(SwingConstants.CENTER);
			lblMateriadesarrolloSoftware.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblMateriadesarrolloSoftware.setBounds(83, 68, 273, 25);
			contentPanel.add(lblMateriadesarrolloSoftware);
		}
		{
			JLabel lblNocarreraDesarrolloDe = new JLabel("NoCarrera: Desarrollo de Software");
			lblNocarreraDesarrolloDe.setHorizontalAlignment(SwingConstants.CENTER);
			lblNocarreraDesarrolloDe.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblNocarreraDesarrolloDe.setBounds(83, 104, 273, 25);
			contentPanel.add(lblNocarreraDesarrolloDe);
		}
		{
			JLabel lblVersion = new JLabel("Version:1.00");
			lblVersion.setHorizontalAlignment(SwingConstants.CENTER);
			lblVersion.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblVersion.setBounds(83, 140, 273, 25);
			contentPanel.add(lblVersion);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("Cerrar Ventana");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) 
					{
						dispose();
					}
				});
				okButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
		}
	}

}
