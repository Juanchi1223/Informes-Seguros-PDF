package ui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;

public class AgregarPasajero extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textFieldApellido;
	private JTextField textEdad;
	private JTextField textFieldDoc;
	private JTextField textNombres;
	private JTextField textCelular;
	private JTextField textOcupacion;
	private JTextField textTelefono;
	private JTextField textCalle;
	private JTextField textNumero;
	private JTextField textPiso;
	private JTextField textDepto;
	private JTextField textLocalidad;
	private JTextField textPartido;
	private JTextField textProvincia;
	private JTextField textLicConducir;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			AgregarPasajero dialog = new AgregarPasajero();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public AgregarPasajero() {
		setTitle("Tripulante de v. Asegurado");
		setBounds(100, 100, 627, 618);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblVehiculoPerte = new JLabel("Vehiculo al que pertenece:");
		lblVehiculoPerte.setBounds(10, 11, 153, 14);
		contentPanel.add(lblVehiculoPerte);
		
		JComboBox comboBoxVehiculo = new JComboBox();
		comboBoxVehiculo.setBounds(162, 7, 129, 22);
		contentPanel.add(comboBoxVehiculo);
		
		JLabel lblPersona = new JLabel("Identificar persona:");
		lblPersona.setBounds(10, 36, 141, 14);
		contentPanel.add(lblPersona);
		
		JComboBox comboBoxTipoPer = new JComboBox();
		comboBoxTipoPer.setBounds(144, 32, 111, 22);
		contentPanel.add(comboBoxTipoPer);
		
		JLabel lblApellido = new JLabel("Apellido:");
		lblApellido.setBounds(10, 61, 62, 14);
		contentPanel.add(lblApellido);
		
		textFieldApellido = new JTextField();
		textFieldApellido.setBounds(67, 58, 209, 20);
		contentPanel.add(textFieldApellido);
		textFieldApellido.setColumns(10);
		
		JLabel lblEdad = new JLabel("Edad:");
		lblEdad.setBounds(286, 61, 46, 14);
		contentPanel.add(lblEdad);
		
		textEdad = new JTextField();
		textEdad.setBounds(330, 58, 46, 20);
		contentPanel.add(textEdad);
		textEdad.setColumns(10);
		
		JLabel lblDocumento = new JLabel("Documento:");
		lblDocumento.setBounds(386, 61, 73, 14);
		contentPanel.add(lblDocumento);
		
		textFieldDoc = new JTextField();
		textFieldDoc.setBounds(462, 58, 141, 20);
		contentPanel.add(textFieldDoc);
		textFieldDoc.setColumns(10);
		
		JLabel lblNombre = new JLabel("Nombres:");
		lblNombre.setBounds(10, 89, 65, 14);
		contentPanel.add(lblNombre);
		
		textNombres = new JTextField();
		textNombres.setBounds(67, 86, 207, 20);
		contentPanel.add(textNombres);
		textNombres.setColumns(10);
		
		JLabel lblCelular = new JLabel("Celular:");
		lblCelular.setBounds(286, 89, 46, 14);
		contentPanel.add(lblCelular);
		
		textCelular = new JTextField();
		textCelular.setBounds(340, 86, 141, 20);
		contentPanel.add(textCelular);
		textCelular.setColumns(10);
		
		JLabel lblOcupacion = new JLabel("Ocupacion:");
		lblOcupacion.setBounds(10, 117, 65, 14);
		contentPanel.add(lblOcupacion);
		
		textOcupacion = new JTextField();
		textOcupacion.setBounds(77, 114, 199, 20);
		contentPanel.add(textOcupacion);
		textOcupacion.setColumns(10);
		
		JLabel lblTel = new JLabel("Telefono particular:");
		lblTel.setBounds(286, 117, 111, 14);
		contentPanel.add(lblTel);
		
		textTelefono = new JTextField();
		textTelefono.setBounds(407, 114, 196, 20);
		contentPanel.add(textTelefono);
		textTelefono.setColumns(10);
		
		JLabel lblCalle = new JLabel("Calle:");
		lblCalle.setBounds(26, 142, 46, 14);
		contentPanel.add(lblCalle);
		
		textCalle = new JTextField();
		textCalle.setBounds(67, 139, 209, 20);
		contentPanel.add(textCalle);
		textCalle.setColumns(10);
		
		JLabel lblNumero = new JLabel("Numero:");
		lblNumero.setBounds(286, 142, 62, 14);
		contentPanel.add(lblNumero);
		
		textNumero = new JTextField();
		textNumero.setBounds(341, 139, 62, 20);
		contentPanel.add(textNumero);
		textNumero.setColumns(10);
		
		JLabel lblPiso = new JLabel("Piso:");
		lblPiso.setBounds(407, 142, 34, 14);
		contentPanel.add(lblPiso);
		
		textPiso = new JTextField();
		textPiso.setBounds(444, 139, 46, 20);
		contentPanel.add(textPiso);
		textPiso.setColumns(10);
		
		JLabel lblDepto = new JLabel("Depto");
		lblDepto.setBounds(500, 142, 46, 14);
		contentPanel.add(lblDepto);
		
		textDepto = new JTextField();
		textDepto.setBounds(547, 139, 54, 20);
		contentPanel.add(textDepto);
		textDepto.setColumns(10);
		
		JLabel lblLocalidad = new JLabel("Localidad:");
		lblLocalidad.setBounds(10, 167, 62, 14);
		contentPanel.add(lblLocalidad);
		
		textLocalidad = new JTextField();
		textLocalidad.setBounds(71, 164, 129, 20);
		contentPanel.add(textLocalidad);
		textLocalidad.setColumns(10);
		
		JLabel lblPartido = new JLabel("Partido:");
		lblPartido.setBounds(206, 167, 46, 14);
		contentPanel.add(lblPartido);
		
		textPartido = new JTextField();
		textPartido.setBounds(262, 164, 135, 20);
		contentPanel.add(textPartido);
		textPartido.setColumns(10);
		
		JLabel lblProvincia = new JLabel("Provincia");
		lblProvincia.setBounds(400, 167, 59, 14);
		contentPanel.add(lblProvincia);
		
		textProvincia = new JTextField();
		textProvincia.setBounds(466, 164, 135, 20);
		contentPanel.add(textProvincia);
		textProvincia.setColumns(10);
		
		JLabel lblLicenciaDeConducir = new JLabel("Licencia de Conducir");
		lblLicenciaDeConducir.setBounds(10, 192, 123, 14);
		contentPanel.add(lblLicenciaDeConducir);
		
		textLicConducir = new JTextField();
		textLicConducir.setBounds(126, 189, 86, 20);
		contentPanel.add(textLicConducir);
		textLicConducir.setColumns(10);
		
		JLabel lblEmisora = new JLabel("Autoriadda emisora");
		lblEmisora.setBounds(216, 192, 116, 14);
		contentPanel.add(lblEmisora);
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
