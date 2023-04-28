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
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;

public class AgregarPasajero extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textFieldApellido, textEdad, textFieldDoc, textNombres, textCelular, textOcupacion, textTelefono, textCalle, textNumero;
	private JTextField textPiso, textDepto, textLocalidad, textPartido, textProvincia, textLicConducir, textAutoridadEm;
	private JTextField textNombreLes, textLugarAtt, textDesAs, textNombreDr, textAppDr;
	private JComboBox comboBoxVehiculo, comboBoxTipoPer, comboBoxLesionado, comboBoxAlcholemia, comboBoxAbogado, comboBoxPropAs, comboBoxRelacion;
	private JCalendar calendarioVigenciaIni, calendarioVigenciaFin;
	private JCheckBox chckbxART;

	private Tripulantes persona = new Tripulantes();
	
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
		
//		JLabel lblVehiculoPerte = new JLabel("Vehiculo al que pertenece:");
//		lblVehiculoPerte.setBounds(10, 26, 153, 14);
//		contentPanel.add(lblVehiculoPerte);
//		
//		comboBoxVehiculo = new JComboBox();
//		comboBoxVehiculo.setBounds(162, 22, 129, 22);
//		contentPanel.add(comboBoxVehiculo);
		
		JLabel lblPersona = new JLabel("Identificar persona:");
		lblPersona.setBounds(10, 51, 141, 14);
		contentPanel.add(lblPersona);
		
		String[] valorestipoPer = {"","Pasajero","Conductor"};
		comboBoxTipoPer = new JComboBox();
		comboBoxTipoPer.setModel(new DefaultComboBoxModel(valorestipoPer));
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
		
		String[] valoresLes = {"", "No", "Leve", "Media", "Grave", "Muerte"};
		comboBoxLesionado = new JComboBox();
		comboBoxLesionado.setBounds(77, 411, 91, 22);
		comboBoxLesionado.setModel(new DefaultComboBoxModel(valoresLes));
		contentPanel.add(comboBoxLesionado);
		
		chckbxART = new JCheckBox("ART");
		chckbxART.setBounds(178, 411, 52, 23);
		contentPanel.add(chckbxART);
		
		JLabel lblNNombre = new JLabel("Nombre");
		lblNNombre.setBounds(229, 414, 46, 14);
		contentPanel.add(lblNNombre);
		
		textNombreLes = new JTextField();
		textNombreLes.setBounds(275, 412, 109, 20);
		contentPanel.add(textNombreLes);
		textNombreLes.setColumns(10);
		
		JLabel lblLugarDeAtt = new JLabel("Lugar de atencion");
		lblLugarDeAtt.setBounds(386, 415, 111, 14);
		contentPanel.add(lblLugarDeAtt);
		
		textLugarAtt = new JTextField();
		textLugarAtt.setBounds(500, 412, 103, 20);
		contentPanel.add(textLugarAtt);
		textLugarAtt.setColumns(10);
		
		JLabel lblAlcoholemia = new JLabel("Alcoholemia");
		lblAlcoholemia.setBounds(10, 444, 86, 14);
		contentPanel.add(lblAlcoholemia);
		
		String[] valoresAlch = {"","No","Si Positivo","Si Negativo","Se nego","Si sin resultados"};
		comboBoxAlcholemia = new JComboBox();
		comboBoxAlcholemia.setModel(new DefaultComboBoxModel(valoresAlch));
		comboBoxAlcholemia.setBounds(84, 441, 139, 22);
		contentPanel.add(comboBoxAlcholemia);
		
		JLabel lblPropAsegurado = new JLabel("El conductor es el propio asegurado");
		lblPropAsegurado.setBounds(226, 445, 215, 14);
		contentPanel.add(lblPropAsegurado);
		
		String[] valSiNo = {"","Si","No"};
		comboBoxPropAs = new JComboBox();
		comboBoxPropAs.setModel(new DefaultComboBoxModel(valSiNo));
		comboBoxPropAs.setBounds(442, 440, 54, 22);
		contentPanel.add(comboBoxPropAs);
		
		JLabel lblRelacion = new JLabel("Relacion");
		lblRelacion.setBounds(346, 474, 73, 14);
		contentPanel.add(lblRelacion);
		
		String[] valRel = {"","Abuelo/a","Cuñado/a","Hermano/a", "Hijo/a", "Madre", "Nieto/a", "Nuera", "Padre", "Sobrino/a", "Suegro/a", "Tio/a", "Yerno", "Otro"};
		comboBoxRelacion = new JComboBox();
		comboBoxRelacion.setModel(new DefaultComboBoxModel(valRel));
		comboBoxRelacion.setBounds(404, 470, 142, 22);
		contentPanel.add(comboBoxRelacion);
		
		JLabel lblDescAs = new JLabel("¿Cual?");
		lblDescAs.setBounds(21, 476, 46, 14);
		contentPanel.add(lblDescAs);
		
		textDesAs = new JTextField();
		textDesAs.setBounds(77, 473, 134, 20);
		contentPanel.add(textDesAs);
		textDesAs.setColumns(10);
		
		JLabel lblAbodago = new JLabel("Abogado");
		lblAbodago.setBounds(10, 504, 62, 14);
		contentPanel.add(lblAbodago);
		
		String[] valAbogado = {"","No","Patroncinante","Aporedado"};
		comboBoxAbogado = new JComboBox();
		comboBoxAbogado.setModel(new DefaultComboBoxModel(valAbogado));
		comboBoxAbogado.setBounds(77, 500, 168, 22);
		contentPanel.add(comboBoxAbogado);
		
		JLabel lblApellidoDr = new JLabel("Apellido Dr:");
		lblApellidoDr.setBounds(10, 533, 78, 14);
		contentPanel.add(lblApellidoDr);
		
		textNombreDr = new JTextField();
		textNombreDr.setBounds(77, 530, 164, 20);
		contentPanel.add(textNombreDr);
		textNombreDr.setColumns(10);
		
		JLabel lblNombreDr = new JLabel("Nombre Dr:");
		lblNombreDr.setBounds(268, 533, 78, 14);
		contentPanel.add(lblNombreDr);
		
		textAppDr = new JTextField();
		textAppDr.setBounds(340, 530, 139, 20);
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
						PasajeroFotos subventana = new PasajeroFotos();
						subventana.setModal(true);
						subventana.setVisible(true);
						setVisible(false);
						
						//persona.setVehicPertenece(comboBoxVehiculo.getSelectedItem().toString());
						persona.setPersona(comboBoxTipoPer.getSelectedItem().toString());
						persona.setApellido(textFieldApellido.getText());
						persona.setEdad(Integer.parseInt(textEdad.getText()));
						persona.setNroDocumento(Integer.parseInt(textFieldDoc.getText()));
						persona.setNombre(textNombres.getText());
						persona.setCelular(Integer.parseInt(textCelular.getText()));
						persona.setOcupacion(textOcupacion.getText());
						persona.setTelefono(Integer.parseInt(textTelefono.getText()));
						persona.setCalle(textCalle.getText());
						persona.setNumero(Integer.parseInt(textNumero.getText()));
						persona.setPiso(Integer.parseInt(textPiso.getText()));
						persona.setDept(textDepto.getText());
						persona.setLocalidad(textLocalidad.getText());
						persona.setPartido(textPartido.getText());
						persona.setProvincia(textProvincia.getText());
						persona.setLicencia(textLicConducir.getText());
						persona.setAutoridadEmisora(textAutoridadEm.getText());
						persona.setVigenciaIni(calendarioVigenciaIni.getDate());
						persona.setVigenciaFin(calendarioVigenciaFin.getDate());
						persona.setLesionado(comboBoxLesionado.getSelectedItem().toString());
						persona.setArt((chckbxART.isSelected())? "Si" : "No");
						persona.setNombreArt(textNombreLes.getText());
						persona.setLugarAtencion(textLugarAtt.getText());
						persona.setAlcoholemia(comboBoxAlcholemia.getSelectedItem().toString());
						persona.setPropioAsegurado(comboBoxPropAs.getSelectedItem().toString());
						persona.setRelacion(comboBoxRelacion.getSelectedItem().toString());
						persona.setCual(textDesAs.getText());
						persona.setAbogado(comboBoxAbogado.getSelectedItem().toString());
						persona.setNombreDr(textNombreDr.getText());
						persona.setApellidoDr(textAppDr.getText());
						persona.setDNI(subventana.getDni());
						persona.setLicenciaFoto(subventana.getLicencia());
						persona.setAcreditacionMedica(subventana.getAcredMed());
					}
				});
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						setVisible(false);
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

	public Tripulantes getPersona() {
		return persona;
	}
}
