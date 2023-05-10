package ui.Peatones;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;

public class AgregarPeaton extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			AgregarPeaton dialog = new AgregarPeaton();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public AgregarPeaton() {
		setTitle("Agregar Nuevo Peaton");
		setBounds(100, 100, 685, 702);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setBounds(10, 26, 46, 14);
		contentPanel.add(lblApellido);
		
		textField = new JTextField();
		textField.setBounds(62, 23, 253, 20);
		contentPanel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Nombre");
		lblNewLabel.setBounds(10, 54, 59, 14);
		contentPanel.add(lblNewLabel);
		
		textField_1 = new JTextField();
		textField_1.setBounds(62, 51, 253, 20);
		contentPanel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Edad");
		lblNewLabel_1.setBounds(325, 26, 46, 14);
		contentPanel.add(lblNewLabel_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(365, 23, 59, 20);
		contentPanel.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Documento");
		lblNewLabel_2.setBounds(434, 26, 73, 14);
		contentPanel.add(lblNewLabel_2);
		
		textField_3 = new JTextField();
		textField_3.setBounds(505, 23, 138, 20);
		contentPanel.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblOcupacion = new JLabel("Ocupacion");
		lblOcupacion.setBounds(10, 81, 73, 14);
		contentPanel.add(lblOcupacion);
		
		textField_4 = new JTextField();
		textField_4.setBounds(72, 78, 243, 20);
		contentPanel.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblCalle = new JLabel("Calle");
		lblCalle.setBounds(23, 109, 46, 14);
		contentPanel.add(lblCalle);
		
		textField_5 = new JTextField();
		textField_5.setBounds(63, 106, 206, 20);
		contentPanel.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Celular");
		lblNewLabel_3.setBounds(365, 54, 46, 14);
		contentPanel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Tel Particular");
		lblNewLabel_4.setBounds(325, 81, 86, 14);
		contentPanel.add(lblNewLabel_4);
		
		textField_6 = new JTextField();
		textField_6.setBounds(418, 51, 225, 20);
		contentPanel.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(418, 78, 225, 20);
		contentPanel.add(textField_7);
		
		JLabel lblNewLabel_5 = new JLabel("Numero");
		lblNewLabel_5.setBounds(279, 109, 46, 14);
		contentPanel.add(lblNewLabel_5);
		
		textField_8 = new JTextField();
		textField_8.setBounds(329, 106, 86, 20);
		contentPanel.add(textField_8);
		textField_8.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Piso");
		lblNewLabel_6.setBounds(425, 109, 46, 14);
		contentPanel.add(lblNewLabel_6);
		
		textField_9 = new JTextField();
		textField_9.setBounds(467, 106, 46, 20);
		contentPanel.add(textField_9);
		textField_9.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Dept");
		lblNewLabel_7.setBounds(523, 109, 46, 14);
		contentPanel.add(lblNewLabel_7);
		
		textField_10 = new JTextField();
		textField_10.setBounds(569, 106, 73, 20);
		contentPanel.add(textField_10);
		textField_10.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("Localidad");
		lblNewLabel_8.setBounds(10, 134, 59, 14);
		contentPanel.add(lblNewLabel_8);
		
		textField_11 = new JTextField();
		textField_11.setBounds(73, 131, 159, 20);
		contentPanel.add(textField_11);
		textField_11.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("Partido");
		lblNewLabel_9.setBounds(242, 134, 46, 14);
		contentPanel.add(lblNewLabel_9);
		
		textField_12 = new JTextField();
		textField_12.setBounds(285, 131, 139, 20);
		contentPanel.add(textField_12);
		textField_12.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("Provincia");
		lblNewLabel_10.setBounds(434, 134, 73, 14);
		contentPanel.add(lblNewLabel_10);
		
		textField_13 = new JTextField();
		textField_13.setBounds(505, 131, 138, 20);
		contentPanel.add(textField_13);
		textField_13.setColumns(10);
		
		JLabel lblNewLabel_11 = new JLabel("Lesionado");
		lblNewLabel_11.setBounds(10, 159, 59, 14);
		contentPanel.add(lblNewLabel_11);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(72, 156, 86, 20);
		contentPanel.add(comboBox);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("ART");
		chckbxNewCheckBox.setBounds(164, 155, 52, 23);
		contentPanel.add(chckbxNewCheckBox);
		
		JLabel lblNewLabel_12 = new JLabel("Nombre");
		lblNewLabel_12.setBounds(222, 159, 46, 14);
		contentPanel.add(lblNewLabel_12);
		
		textField_14 = new JTextField();
		textField_14.setBounds(271, 156, 132, 20);
		contentPanel.add(textField_14);
		textField_14.setColumns(10);
		
		JLabel lblNewLabel_13 = new JLabel("Lugar de Atencion");
		lblNewLabel_13.setBounds(409, 159, 115, 14);
		contentPanel.add(lblNewLabel_13);
		
		textField_15 = new JTextField();
		textField_15.setBounds(515, 156, 128, 20);
		contentPanel.add(textField_15);
		textField_15.setColumns(10);
		
		JLabel lblNewLabel_14 = new JLabel("Abogado");
		lblNewLabel_14.setBounds(10, 184, 59, 14);
		contentPanel.add(lblNewLabel_14);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(72, 180, 86, 22);
		contentPanel.add(comboBox_1);
		
		JLabel lblNewLabel_15 = new JLabel("Nombre Dr:");
		lblNewLabel_15.setBounds(164, 184, 68, 14);
		contentPanel.add(lblNewLabel_15);
		
		textField_16 = new JTextField();
		textField_16.setBounds(242, 181, 148, 20);
		contentPanel.add(textField_16);
		textField_16.setColumns(10);
		
		JLabel lblNewLabel_16 = new JLabel("Apellido Dr:");
		lblNewLabel_16.setBounds(403, 184, 68, 14);
		contentPanel.add(lblNewLabel_16);
		
		textField_17 = new JTextField();
		textField_17.setBounds(477, 181, 166, 20);
		contentPanel.add(textField_17);
		textField_17.setColumns(10);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
