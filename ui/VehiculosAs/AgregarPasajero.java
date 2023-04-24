package ui.VehiculosAs;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.toedter.calendar.JCalendar;

import empresa.Peaton;
import empresa.Tripulantes;

import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JCheckBox;

public class AgregarPasajero extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textFieldApellido, textEdad, textFieldDoc, textNombres, textCelular, textOcupacion, textTelefono, textCalle, textNumero;
	private JTextField textPiso, textDepto, textLocalidad, textPartido, textProvincia, textLicConducir, textAutoridadEm;
	private JTextField textNombreLes, textLugarAtt, textDesAs, textNombreDr, textAppDr;
	private JComboBox comboBoxVehiculo, comboBoxTipoPer, comboBoxLesionado, comboBoxAlcholemia, comboBoxAbogado, comboBoxPropAs, comboBoxRelacion;
	private JCalendar calendarioVigenciaIni, calendarioVigenciaFin;
	private JCheckBox chckbxART;

	private Tripulantes persona;
	
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
		setResizable(false);
		setTitle("Tripulante de v. Asegurado");
		setBounds(100, 100, 627, 633);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblVehiculoPerte = new JLabel("Vehiculo al que pertenece:");
		lblVehiculoPerte.setBounds(10, 26, 153, 14);
		contentPanel.add(lblVehiculoPerte);
		
		comboBoxVehiculo = new JComboBox();
		comboBoxVehiculo.setBounds(162, 22, 129, 22);
		contentPanel.add(comboBoxVehiculo);
		
		JLabel lblPersona = new JLabel("Identificar persona:");
		lblPersona.setBounds(10, 51, 141, 14);
		contentPanel.add(lblPersona);
		
		comboBoxTipoPer = new JComboBox();
		comboBoxTipoPer.setBounds(144, 47, 111, 22);
		contentPanel.add(comboBoxTipoPer);
		
		JLabel lblApellido = new JLabel("Apellido:");
		lblApellido.setBounds(10, 76, 62, 14);
		contentPanel.add(lblApellido);
		
		textFieldApellido = new JTextField();
		textFieldApellido.setBounds(67, 73, 209, 20);
		contentPanel.add(textFieldApellido);
		textFieldApellido.setColumns(10);
		
		JLabel lblEdad = new JLabel("Edad:");
		lblEdad.setBounds(286, 76, 46, 14);
		contentPanel.add(lblEdad);
		
		textEdad = new JTextField();
		textEdad.setBounds(330, 73, 46, 20);
		contentPanel.add(textEdad);
		textEdad.setColumns(10);
		
		JLabel lblDocumento = new JLabel("Documento:");
		lblDocumento.setBounds(386, 76, 73, 14);
		contentPanel.add(lblDocumento);
		
		textFieldDoc = new JTextField();
		textFieldDoc.setBounds(462, 73, 141, 20);
		contentPanel.add(textFieldDoc);
		textFieldDoc.setColumns(10);
		
		JLabel lblNombre = new JLabel("Nombres:");
		lblNombre.setBounds(10, 104, 65, 14);
		contentPanel.add(lblNombre);
		
		textNombres = new JTextField();
		textNombres.setBounds(67, 101, 207, 20);
		contentPanel.add(textNombres);
		textNombres.setColumns(10);
		
		JLabel lblCelular = new JLabel("Celular:");
		lblCelular.setBounds(286, 104, 46, 14);
		contentPanel.add(lblCelular);
		
		textCelular = new JTextField();
		textCelular.setBounds(340, 101, 141, 20);
		contentPanel.add(textCelular);
		textCelular.setColumns(10);
		
		JLabel lblOcupacion = new JLabel("Ocupacion:");
		lblOcupacion.setBounds(10, 132, 65, 14);
		contentPanel.add(lblOcupacion);
		
		textOcupacion = new JTextField();
		textOcupacion.setBounds(77, 129, 199, 20);
		contentPanel.add(textOcupacion);
		textOcupacion.setColumns(10);
		
		JLabel lblTel = new JLabel("Telefono particular:");
		lblTel.setBounds(286, 132, 111, 14);
		contentPanel.add(lblTel);
		
		textTelefono = new JTextField();
		textTelefono.setBounds(407, 129, 196, 20);
		contentPanel.add(textTelefono);
		textTelefono.setColumns(10);
		
		JLabel lblCalle = new JLabel("Calle:");
		lblCalle.setBounds(26, 157, 46, 14);
		contentPanel.add(lblCalle);
		
		textCalle = new JTextField();
		textCalle.setBounds(67, 154, 209, 20);
		contentPanel.add(textCalle);
		textCalle.setColumns(10);
		
		JLabel lblNumero = new JLabel("Numero:");
		lblNumero.setBounds(286, 157, 62, 14);
		contentPanel.add(lblNumero);
		
		textNumero = new JTextField();
		textNumero.setBounds(341, 154, 62, 20);
		contentPanel.add(textNumero);
		textNumero.setColumns(10);
		
		JLabel lblPiso = new JLabel("Piso:");
		lblPiso.setBounds(407, 157, 34, 14);
		contentPanel.add(lblPiso);
		
		textPiso = new JTextField();
		textPiso.setBounds(444, 154, 46, 20);
		contentPanel.add(textPiso);
		textPiso.setColumns(10);
		
		JLabel lblDepto = new JLabel("Depto");
		lblDepto.setBounds(500, 157, 46, 14);
		contentPanel.add(lblDepto);
		
		textDepto = new JTextField();
		textDepto.setBounds(547, 154, 54, 20);
		contentPanel.add(textDepto);
		textDepto.setColumns(10);
		
		JLabel lblLocalidad = new JLabel("Localidad:");
		lblLocalidad.setBounds(10, 182, 62, 14);
		contentPanel.add(lblLocalidad);
		
		textLocalidad = new JTextField();
		textLocalidad.setBounds(71, 179, 129, 20);
		contentPanel.add(textLocalidad);
		textLocalidad.setColumns(10);
		
		JLabel lblPartido = new JLabel("Partido:");
		lblPartido.setBounds(206, 182, 46, 14);
		contentPanel.add(lblPartido);
		
		textPartido = new JTextField();
		textPartido.setBounds(262, 179, 135, 20);
		contentPanel.add(textPartido);
		textPartido.setColumns(10);
		
		JLabel lblProvincia = new JLabel("Provincia");
		lblProvincia.setBounds(400, 182, 59, 14);
		contentPanel.add(lblProvincia);
		
		textProvincia = new JTextField();
		textProvincia.setBounds(466, 179, 135, 20);
		contentPanel.add(textProvincia);
		textProvincia.setColumns(10);
		
		JLabel lblLicenciaDeConducir = new JLabel("Licencia de Conducir");
		lblLicenciaDeConducir.setBounds(10, 207, 123, 14);
		contentPanel.add(lblLicenciaDeConducir);
		
		textLicConducir = new JTextField();
		textLicConducir.setBounds(133, 204, 121, 20);
		contentPanel.add(textLicConducir);
		textLicConducir.setColumns(10);
		
		JLabel lblEmisora = new JLabel("Autoriadad emisora");
		lblEmisora.setBounds(267, 208, 116, 14);
		contentPanel.add(lblEmisora);
		
		textAutoridadEm = new JTextField();
		textAutoridadEm.setBounds(385, 205, 111, 20);
		contentPanel.add(textAutoridadEm);
		textAutoridadEm.setColumns(10);
		
		JLabel lblVigencia = new JLabel("Vigencia desde");
		lblVigencia.setBounds(10, 232, 86, 14);
		contentPanel.add(lblVigencia);
		
		calendarioVigenciaIni = new JCalendar();
		calendarioVigenciaIni.setBounds(44, 251, 200, 153);
		contentPanel.add(calendarioVigenciaIni);
		
		JLabel lblVigenciaFin = new JLabel("Hasta");
		lblVigenciaFin.setBounds(262, 232, 46, 14);
		contentPanel.add(lblVigenciaFin);
		
		calendarioVigenciaFin = new JCalendar();
		calendarioVigenciaFin.setBounds(290, 251, 200, 153);
		contentPanel.add(calendarioVigenciaFin);
		
		JLabel lblLesionado = new JLabel("Lesionado");
		lblLesionado.setBounds(10, 415, 86, 14);
		contentPanel.add(lblLesionado);
		
		comboBoxLesionado = new JComboBox();
		comboBoxLesionado.setBounds(84, 411, 91, 22);
		contentPanel.add(comboBoxLesionado);
		
		chckbxART = new JCheckBox("ART");
		chckbxART.setBounds(178, 411, 54, 23);
		contentPanel.add(chckbxART);
		
		JLabel lblNNombre = new JLabel("Nombre");
		lblNNombre.setBounds(238, 415, 46, 14);
		contentPanel.add(lblNNombre);
		
		textNombreLes = new JTextField();
		textNombreLes.setBounds(286, 412, 109, 20);
		contentPanel.add(textNombreLes);
		textNombreLes.setColumns(10);
		
		JLabel lblLugarDeAtt = new JLabel("Lugar de atencion");
		lblLugarDeAtt.setBounds(396, 415, 111, 14);
		contentPanel.add(lblLugarDeAtt);
		
		textLugarAtt = new JTextField();
		textLugarAtt.setBounds(500, 412, 103, 20);
		contentPanel.add(textLugarAtt);
		textLugarAtt.setColumns(10);
		
		JLabel lblAlcoholemia = new JLabel("Alcoholemia");
		lblAlcoholemia.setBounds(10, 440, 86, 14);
		contentPanel.add(lblAlcoholemia);
		
		comboBoxAlcholemia = new JComboBox();
		comboBoxAlcholemia.setBounds(83, 436, 117, 22);
		contentPanel.add(comboBoxAlcholemia);
		
		JLabel lblPropAsegurado = new JLabel("El conductor es el propio asegurado");
		lblPropAsegurado.setBounds(226, 440, 197, 14);
		contentPanel.add(lblPropAsegurado);
		
		comboBoxPropAs = new JComboBox();
		comboBoxPropAs.setBounds(427, 436, 54, 22);
		contentPanel.add(comboBoxPropAs);
		
		JLabel lblRelacion = new JLabel("Relacion");
		lblRelacion.setBounds(216, 465, 73, 14);
		contentPanel.add(lblRelacion);
		
		comboBoxRelacion = new JComboBox();
		comboBoxRelacion.setBounds(274, 461, 123, 22);
		contentPanel.add(comboBoxRelacion);
		
		JLabel lblDescAs = new JLabel("¿Cual?");
		lblDescAs.setBounds(10, 465, 46, 14);
		contentPanel.add(lblDescAs);
		
		textDesAs = new JTextField();
		textDesAs.setBounds(66, 462, 134, 20);
		contentPanel.add(textDesAs);
		textDesAs.setColumns(10);
		
		JLabel lblAbodago = new JLabel("Abogado");
		lblAbodago.setBounds(12, 494, 62, 14);
		contentPanel.add(lblAbodago);
		
		comboBoxAbogado = new JComboBox();
		comboBoxAbogado.setBounds(78, 490, 124, 22);
		contentPanel.add(comboBoxAbogado);
		
		JLabel lblApellidoDr = new JLabel("Apellido Dr:");
		lblApellidoDr.setBounds(12, 522, 78, 14);
		contentPanel.add(lblApellidoDr);
		
		textNombreDr = new JTextField();
		textNombreDr.setBounds(93, 519, 164, 20);
		contentPanel.add(textNombreDr);
		textNombreDr.setColumns(10);
		
		JLabel lblNombreDr = new JLabel("Nombre Dr:");
		lblNombreDr.setBounds(270, 522, 78, 14);
		contentPanel.add(lblNombreDr);
		
		textAppDr = new JTextField();
		textAppDr.setBounds(342, 519, 139, 20);
		contentPanel.add(textAppDr);
		textAppDr.setColumns(10);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						// GUARDAR TODOS LOS DATOS EN LA PERSONA
						Tripulantes aux = new Tripulantes();
						aux.setVehicPertenece(comboBoxVehiculo.getSelectedItem().toString());
						aux.setPersona(comboBoxTipoPer.getSelectedItem().toString());
						aux.setApellido(textFieldApellido.getText());
						aux.setEdad(Integer.parseInt(textEdad.getText()));
						aux.setNroDocumento(Integer.parseInt(textFieldDoc.getText()));
						aux.setNombre(textNombres.getText());
						aux.setCelular(Integer.parseInt(textCelular.getText()));
						aux.setOcupacion(textOcupacion.getText());
						aux.setTelefono(Integer.parseInt(textTelefono.getText()));
						aux.setCalle(textCalle.getText());
						aux.setNumero(Integer.parseInt(textNumero.getText()));
						aux.setPiso(Integer.parseInt(textPiso.getText()));
						aux.setDept(textDepto.getText());
						aux.setLocalidad(textLocalidad.getText());
						aux.setPartido(textPartido.getText());
						aux.setProvincia(textProvincia.getText());
						aux.setLicencia(textLicConducir.getText());
						aux.setAutoridadEmisora(textAutoridadEm.getText());
						aux.setVigenciaIni(calendarioVigenciaIni.getDate());
						aux.setVigenciaFin(calendarioVigenciaFin.getDate());
						aux.setLesionado(comboBoxLesionado.getSelectedItem().toString());
						aux.setArt((chckbxART.isSelected())? "Si" : "No");
						aux.setNombreArt(textNombreLes.getText());
						aux.setLugarAtencion(textLugarAtt.getText());
						aux.setAlcoholemia(comboBoxAlcholemia.getSelectedItem().toString());
						aux.setPropioAsegurado(comboBoxPropAs.getSelectedItem().toString());
						aux.setRelacion(comboBoxRelacion.getSelectedItem().toString());
						aux.setCual(textDesAs.getText());
						aux.setAbogado(comboBoxAbogado.getSelectedItem().toString());
						aux.setNombreDr(textNombreDr.getText());
						aux.setApellidoDr(textAppDr.getText());
						// FALTA AGREGAR LA PARTE DE LAS FOTOS
						
					}
				});
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						System.out.print(chckbxART.isSelected());
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
