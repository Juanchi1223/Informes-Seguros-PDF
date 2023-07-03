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
import javax.swing.border.LineBorder;

import empresa.Fotos;
import empresa.InsertarValores;
import empresa.Peaton;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class AgregarPeaton extends JDialog implements InsertarValores{

	private final JPanel contentPanel = new JPanel();
	private JTextField textApellido, textNombre, textEdad, textDocumento, textOcupacion, textCalle, textCelular, textTelefono, textNumeroDir, textPisoDir, textDeptDir, textLocalidad, textPartido, textProvincia;
	private JTextField textJustificarACMED, textNombreART, textLugarAtt, textNombreDr, textApellidoDr;
	private JComboBox<String> comboBoxLesionado, comboBoxAbogadoSN;
	private JLabel DNI1, DNI2, MED1, MED2, MED3, MED4;
	private JButton btnDNI1, btnDNI2, btnMED1, btnMED2, btnMED3, btnMED4;
	private JCheckBox chckbxART;
	
	private Fotos DNI = new Fotos(2);
	private Fotos ACMED = new Fotos(4);
	
	private Peaton persona;
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
		setBounds(100, 100, 685, 828);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setBounds(10, 26, 46, 14);
		contentPanel.add(lblApellido);
		
		textApellido = new JTextField();
		textApellido.setBounds(62, 23, 253, 20);
		contentPanel.add(textApellido);
		textApellido.setColumns(10);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(10, 54, 59, 14);
		contentPanel.add(lblNombre);
		
		textNombre = new JTextField();
		textNombre.setBounds(62, 51, 253, 20);
		contentPanel.add(textNombre);
		textNombre.setColumns(10);
		
		JLabel lblEdad = new JLabel("Edad");
		lblEdad.setBounds(325, 26, 46, 14);
		contentPanel.add(lblEdad);
		
		textEdad = new JTextField();
		textEdad.setBounds(365, 23, 59, 20);
		contentPanel.add(textEdad);
		textEdad.setColumns(10);
		
		JLabel lblDocumento = new JLabel("Documento");
		lblDocumento.setBounds(434, 26, 73, 14);
		contentPanel.add(lblDocumento);
		
		textDocumento = new JTextField();
		textDocumento.setBounds(505, 23, 138, 20);
		contentPanel.add(textDocumento);
		textDocumento.setColumns(10);
		
		JLabel lblOcupacion = new JLabel("Ocupacion");
		lblOcupacion.setBounds(10, 81, 73, 14);
		contentPanel.add(lblOcupacion);
		
		textOcupacion = new JTextField();
		textOcupacion.setBounds(72, 78, 243, 20);
		contentPanel.add(textOcupacion);
		textOcupacion.setColumns(10);
		
		JLabel lblCalle = new JLabel("Calle");
		lblCalle.setBounds(23, 109, 46, 14);
		contentPanel.add(lblCalle);
		
		textCalle = new JTextField();
		textCalle.setBounds(63, 106, 206, 20);
		contentPanel.add(textCalle);
		textCalle.setColumns(10);
		
		JLabel lblCelular = new JLabel("Celular");
		lblCelular.setBounds(365, 54, 46, 14);
		contentPanel.add(lblCelular);
		
		JLabel lblTelefonoPar = new JLabel("Tel Particular");
		lblTelefonoPar.setBounds(325, 81, 86, 14);
		contentPanel.add(lblTelefonoPar);
		
		textCelular = new JTextField();
		textCelular.setBounds(418, 51, 225, 20);
		contentPanel.add(textCelular);
		textCelular.setColumns(10);
		
		textTelefono = new JTextField();
		textTelefono.setColumns(10);
		textTelefono.setBounds(418, 78, 225, 20);
		contentPanel.add(textTelefono);
		
		JLabel lblNumeroDir = new JLabel("Numero");
		lblNumeroDir.setBounds(279, 109, 46, 14);
		contentPanel.add(lblNumeroDir);
		
		textNumeroDir = new JTextField();
		textNumeroDir.setBounds(329, 106, 86, 20);
		contentPanel.add(textNumeroDir);
		textNumeroDir.setColumns(10);
		
		JLabel lblPiso = new JLabel("Piso");
		lblPiso.setBounds(425, 109, 46, 14);
		contentPanel.add(lblPiso);
		
		textPisoDir = new JTextField();
		textPisoDir.setBounds(467, 106, 46, 20);
		contentPanel.add(textPisoDir);
		textPisoDir.setColumns(10);
		
		JLabel lblDeptDir = new JLabel("Dept");
		lblDeptDir.setBounds(523, 109, 46, 14);
		contentPanel.add(lblDeptDir);
		
		textDeptDir = new JTextField();
		textDeptDir.setBounds(569, 106, 73, 20);
		contentPanel.add(textDeptDir);
		textDeptDir.setColumns(10);
		
		JLabel lblLocalidad = new JLabel("Localidad");
		lblLocalidad.setBounds(10, 134, 59, 14);
		contentPanel.add(lblLocalidad);
		
		textLocalidad = new JTextField();
		textLocalidad.setBounds(73, 131, 159, 20);
		contentPanel.add(textLocalidad);
		textLocalidad.setColumns(10);
		
		JLabel lblParitdo = new JLabel("Partido");
		lblParitdo.setBounds(242, 134, 46, 14);
		contentPanel.add(lblParitdo);
		
		textPartido = new JTextField();
		textPartido.setBounds(285, 131, 139, 20);
		contentPanel.add(textPartido);
		textPartido.setColumns(10);
		
		JLabel lblProvincia = new JLabel("Provincia");
		lblProvincia.setBounds(434, 134, 73, 14);
		contentPanel.add(lblProvincia);
		
		textProvincia = new JTextField();
		textProvincia.setBounds(505, 131, 138, 20);
		contentPanel.add(textProvincia);
		textProvincia.setColumns(10);
		
		JLabel lblLesionado = new JLabel("Lesionado");
		lblLesionado.setBounds(10, 159, 59, 14);
		contentPanel.add(lblLesionado);
		
		String[] valoreLes = {"", "No", "Leve", "Media", "Grave", "Muerte"};
		comboBoxLesionado = new JComboBox<String>();
		comboBoxLesionado.setModel(new DefaultComboBoxModel<String>(valoreLes));
		comboBoxLesionado.setBounds(72, 156, 86, 20);
		contentPanel.add(comboBoxLesionado);
		
		chckbxART = new JCheckBox("ART");
		chckbxART.setBounds(164, 155, 52, 23);
		contentPanel.add(chckbxART);
		
		JLabel lblNombreART = new JLabel("Nombre");
		lblNombreART.setBounds(222, 159, 46, 14);
		contentPanel.add(lblNombreART);
		
		textNombreART = new JTextField();
		textNombreART.setBounds(271, 156, 132, 20);
		contentPanel.add(textNombreART);
		textNombreART.setColumns(10);
		
		JLabel lblLugarAtt = new JLabel("Lugar de Atencion");
		lblLugarAtt.setBounds(409, 159, 115, 14);
		contentPanel.add(lblLugarAtt);
		
		textLugarAtt = new JTextField();
		textLugarAtt.setBounds(515, 156, 128, 20);
		contentPanel.add(textLugarAtt);
		textLugarAtt.setColumns(10);
		
		JLabel lblAbogado = new JLabel("Abogado");
		lblAbogado.setBounds(10, 184, 59, 14);
		contentPanel.add(lblAbogado);
		
		String[] valoresAbogado = {"", "No", "Patrocinante", "Apoderado"};
		comboBoxAbogadoSN = new JComboBox<String>();
		comboBoxAbogadoSN.setModel(new DefaultComboBoxModel<String>(valoresAbogado));
		comboBoxAbogadoSN.setBounds(72, 180, 86, 22);
		contentPanel.add(comboBoxAbogadoSN);
		
		JLabel lblNombreDr = new JLabel("Nombre Dr:");
		lblNombreDr.setBounds(164, 184, 68, 14);
		contentPanel.add(lblNombreDr);
		
		textNombreDr = new JTextField();
		textNombreDr.setBounds(242, 181, 148, 20);
		contentPanel.add(textNombreDr);
		textNombreDr.setColumns(10);
		
		JLabel lblApellidoDr = new JLabel("Apellido Dr:");
		lblApellidoDr.setBounds(403, 184, 68, 14);
		contentPanel.add(lblApellidoDr);
		
		textApellidoDr = new JTextField();
		textApellidoDr.setBounds(477, 181, 166, 20);
		contentPanel.add(textApellidoDr);
		textApellidoDr.setColumns(10);
		
		JLabel lblDNI = new JLabel("DNI");
		lblDNI.setBounds(23, 225, 46, 14);
		contentPanel.add(lblDNI);
		
		JPanel panelDNI1 = new JPanel();
		panelDNI1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelDNI1.setBounds(50, 250, 183, 106);
		contentPanel.add(panelDNI1);
		panelDNI1.setLayout(new BorderLayout(0, 0));
		
		DNI1 = new JLabel("");
		panelDNI1.add(DNI1, BorderLayout.CENTER);
		
		JPanel panelDNI2 = new JPanel();
		panelDNI2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelDNI2.setBounds(358, 250, 183, 106);
		contentPanel.add(panelDNI2);
		panelDNI2.setLayout(new BorderLayout(0, 0));
		
		DNI2 = new JLabel("");
		panelDNI2.add(DNI2, BorderLayout.CENTER);
		
		btnDNI1 = new JButton("...");
		btnDNI1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ruta = DNI.adjuntarArchivo(btnDNI1, DNI1);
				DNI.agregarFoto(0, ruta);
			}
		});
		btnDNI1.setBounds(250, 250, 47, 23);
		contentPanel.add(btnDNI1);
		
		btnDNI2 = new JButton("...");
		btnDNI2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ruta = DNI.adjuntarArchivo(btnDNI2, DNI2);
				DNI.agregarFoto(1, ruta);		
			}								
		});
		btnDNI2.setBounds(558, 250, 47, 23);
		contentPanel.add(btnDNI2);
		
		JLabel lblAcreditacionMed = new JLabel("Acreditacion Medica");
		lblAcreditacionMed.setBounds(23, 367, 121, 14);
		contentPanel.add(lblAcreditacionMed);
		
		JPanel panelMED1 = new JPanel();
		panelMED1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelMED1.setBounds(78, 398, 174, 148);
		contentPanel.add(panelMED1);
		panelMED1.setLayout(new BorderLayout(0, 0));
		
		MED1 = new JLabel("");
		panelMED1.add(MED1, BorderLayout.CENTER);
		
		btnMED1 = new JButton("...");
		btnMED1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ruta = ACMED.adjuntarArchivo(btnMED1, MED1);
				ACMED.agregarFoto(0, ruta);
			}
		});
		btnMED1.setBounds(258, 398, 30, 23);
		contentPanel.add(btnMED1);
		
		JPanel panelMED2 = new JPanel();
		panelMED2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelMED2.setBounds(349, 398, 174, 148);
		contentPanel.add(panelMED2);
		panelMED2.setLayout(new BorderLayout(0, 0));
		
		MED2 = new JLabel("");
		panelMED2.add(MED2, BorderLayout.CENTER);
		
		btnMED2 = new JButton("...");
		btnMED2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ruta = ACMED.adjuntarArchivo(btnMED2, MED2);
				ACMED.agregarFoto(1, ruta);
			}
		});
		btnMED2.setBounds(539, 398, 30, 23);
		contentPanel.add(btnMED2);
		
		btnMED3 = new JButton("...");
		btnMED3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ruta = ACMED.adjuntarArchivo(btnMED3, MED3);
				ACMED.agregarFoto(2, ruta);
			}
		});
		btnMED3.setBounds(262, 558, 30, 23);
		contentPanel.add(btnMED3);
		
		JPanel panelMED4 = new JPanel();
		panelMED4.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelMED4.setBounds(349, 558, 174, 148);
		contentPanel.add(panelMED4);
		panelMED4.setLayout(new BorderLayout(0, 0));
		
		MED4 = new JLabel("");
		panelMED4.add(MED4, BorderLayout.CENTER);
		
		btnMED4 = new JButton("...");
		btnMED4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ruta = ACMED.adjuntarArchivo(btnMED4, MED4);
				ACMED.agregarFoto(3, ruta);
			}
		});
		btnMED4.setBounds(539, 558, 30, 23);
		contentPanel.add(btnMED4);
		
		JLabel lblJustificarAC = new JLabel("Justificar acreditaciones");
		lblJustificarAC.setBounds(10, 731, 148, 14);
		contentPanel.add(lblJustificarAC);
		
		textJustificarACMED = new JTextField();
		textJustificarACMED.setBounds(160, 728, 471, 20);
		contentPanel.add(textJustificarACMED);
		textJustificarACMED.setColumns(10);
		
		JPanel panelMED3 = new JPanel();
		panelMED3.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelMED3.setBounds(78, 558, 174, 148);
		contentPanel.add(panelMED3);
		panelMED3.setLayout(new BorderLayout(0, 0));
		
		MED3 = new JLabel("");
		panelMED3.add(MED3, BorderLayout.CENTER);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						persona = new Peaton();
						setPersona(persona);
						setVisible(false);
					}
				});
				okButton.setActionCommand("OK");
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
	public AgregarPeaton(Peaton peaton){
		setTitle("Modificar Peaton");
		setBounds(100, 100, 685, 828);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		DNI = peaton.getDNI();
		ACMED = peaton.getAcreditacionMedica();
		
		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setBounds(10, 26, 46, 14);
		contentPanel.add(lblApellido);
		
		textApellido = new JTextField();
		textApellido.setBounds(62, 23, 253, 20);
		rellenarText(peaton.getApellido(), textApellido);
		contentPanel.add(textApellido);
		textApellido.setColumns(10);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(10, 54, 59, 14);
		contentPanel.add(lblNombre);
		
		textNombre = new JTextField();
		textNombre.setBounds(62, 51, 253, 20);
		rellenarText(peaton.getNombre(), textNombre);
		contentPanel.add(textNombre);
		textNombre.setColumns(10);
		
		JLabel lblEdad = new JLabel("Edad");
		lblEdad.setBounds(325, 26, 46, 14);
		contentPanel.add(lblEdad);
		
		textEdad = new JTextField();
		textEdad.setBounds(365, 23, 59, 20);
		rellenarText(peaton.getEdad(), textEdad);
		contentPanel.add(textEdad);
		textEdad.setColumns(10);
		
		JLabel lblDocumento = new JLabel("Documento");
		lblDocumento.setBounds(434, 26, 73, 14);
		contentPanel.add(lblDocumento);
		
		textDocumento = new JTextField();
		textDocumento.setBounds(505, 23, 138, 20);
		rellenarText(peaton.getNroDocumento(), textDocumento);
		contentPanel.add(textDocumento);
		textDocumento.setColumns(10);
		
		JLabel lblOcupacion = new JLabel("Ocupacion");
		lblOcupacion.setBounds(10, 81, 73, 14);
		contentPanel.add(lblOcupacion);
		
		textOcupacion = new JTextField();
		textOcupacion.setBounds(72, 78, 243, 20);
		rellenarText(peaton.getOcupacion(), textOcupacion);
		contentPanel.add(textOcupacion);
		textOcupacion.setColumns(10);
		
		JLabel lblCalle = new JLabel("Calle");
		lblCalle.setBounds(23, 109, 46, 14);
		contentPanel.add(lblCalle);
		
		textCalle = new JTextField();
		textCalle.setBounds(63, 106, 206, 20);
		rellenarText(peaton.getCalle(), this.textCalle);
		contentPanel.add(textCalle);
		textCalle.setColumns(10);
		
		JLabel lblCelular = new JLabel("Celular");
		lblCelular.setBounds(365, 54, 46, 14);
		contentPanel.add(lblCelular);
		
		JLabel lblTelefonoPar = new JLabel("Tel Particular");
		lblTelefonoPar.setBounds(325, 81, 86, 14);
		contentPanel.add(lblTelefonoPar);
		
		textCelular = new JTextField();
		textCelular.setBounds(418, 51, 225, 20);
		rellenarText(peaton.getCelular(), this.textCelular);
		contentPanel.add(textCelular);
		textCelular.setColumns(10);
		
		textTelefono = new JTextField();
		textTelefono.setColumns(10);
		rellenarText(peaton.getTelefono(), this.textTelefono);
		textTelefono.setBounds(418, 78, 225, 20);
		contentPanel.add(textTelefono);
		
		JLabel lblNumeroDir = new JLabel("Numero");
		lblNumeroDir.setBounds(279, 109, 46, 14);
		contentPanel.add(lblNumeroDir);
		
		textNumeroDir = new JTextField();
		textNumeroDir.setBounds(329, 106, 86, 20);
		rellenarText(peaton.getNumero(), this.textNumeroDir);
		contentPanel.add(textNumeroDir);
		textNumeroDir.setColumns(10);
		
		JLabel lblPiso = new JLabel("Piso");
		lblPiso.setBounds(425, 109, 46, 14);
		contentPanel.add(lblPiso);
		
		textPisoDir = new JTextField();
		textPisoDir.setBounds(467, 106, 46, 20);
		rellenarText(peaton.getPiso(), this.textPisoDir);
		contentPanel.add(textPisoDir);
		textPisoDir.setColumns(10);
		
		JLabel lblDeptDir = new JLabel("Dept");
		lblDeptDir.setBounds(523, 109, 46, 14);
		contentPanel.add(lblDeptDir);
		
		textDeptDir = new JTextField();
		textDeptDir.setBounds(569, 106, 73, 20);
		rellenarText(peaton.getDept(), this.textDeptDir);
		contentPanel.add(textDeptDir);
		textDeptDir.setColumns(10);
		
		JLabel lblLocalidad = new JLabel("Localidad");
		lblLocalidad.setBounds(10, 134, 59, 14);
		contentPanel.add(lblLocalidad);
		
		textLocalidad = new JTextField();
		textLocalidad.setBounds(73, 131, 159, 20);
		rellenarText(peaton.getLocalidad(), this.textLocalidad);
		contentPanel.add(textLocalidad);
		textLocalidad.setColumns(10);
		
		JLabel lblParitdo = new JLabel("Partido");
		lblParitdo.setBounds(242, 134, 46, 14);
		contentPanel.add(lblParitdo);
		
		textPartido = new JTextField();
		textPartido.setBounds(285, 131, 139, 20);
		rellenarText(peaton.getPartido(), this.textPartido);
		contentPanel.add(textPartido);
		textPartido.setColumns(10);
		
		JLabel lblProvincia = new JLabel("Provincia");
		lblProvincia.setBounds(434, 134, 73, 14);
		contentPanel.add(lblProvincia);
		
		textProvincia = new JTextField();
		textProvincia.setBounds(505, 131, 138, 20);
		rellenarText(peaton.getProvincia(), this.textProvincia);
		contentPanel.add(textProvincia);
		textProvincia.setColumns(10);
		
		JLabel lblLesionado = new JLabel("Lesionado");
		lblLesionado.setBounds(10, 159, 59, 14);
		contentPanel.add(lblLesionado);
		
		String[] valoreLes = {"", "No", "Leve", "Media", "Grave", "Muerte"};
		comboBoxLesionado = new JComboBox<String>();
		comboBoxLesionado.setModel(new DefaultComboBoxModel<String>(valoreLes));
		comboBoxLesionado.setBounds(72, 156, 86, 20);
		rellenarBox(peaton.getLesionado(), valoreLes, this.comboBoxLesionado);
		contentPanel.add(comboBoxLesionado);
		
		chckbxART = new JCheckBox("ART");
		chckbxART.setBounds(164, 155, 52, 23);
		rellenarCheck(peaton.getArt(), this.chckbxART);
		contentPanel.add(chckbxART);
		
		JLabel lblNombreART = new JLabel("Nombre");
		lblNombreART.setBounds(222, 159, 46, 14);
		contentPanel.add(lblNombreART);
		
		textNombreART = new JTextField();
		textNombreART.setBounds(271, 156, 132, 20);
		rellenarText(peaton.getNombreArt(), this.textNombreART);
		contentPanel.add(textNombreART);
		textNombreART.setColumns(10);
		
		JLabel lblLugarAtt = new JLabel("Lugar de Atencion");
		lblLugarAtt.setBounds(409, 159, 115, 14);
		contentPanel.add(lblLugarAtt);
		
		textLugarAtt = new JTextField();
		textLugarAtt.setBounds(515, 156, 128, 20);
		rellenarText(peaton.getLugarAtencion(), this.textLugarAtt);
		contentPanel.add(textLugarAtt);
		textLugarAtt.setColumns(10);
		
		JLabel lblAbogado = new JLabel("Abogado");
		lblAbogado.setBounds(10, 184, 59, 14);
		contentPanel.add(lblAbogado);
		
		String[] valoresAbogado = {"", "No", "Patrocinante", "Apoderado"};
		comboBoxAbogadoSN = new JComboBox<String>();
		comboBoxAbogadoSN.setModel(new DefaultComboBoxModel<String>(valoresAbogado));
		comboBoxAbogadoSN.setBounds(72, 180, 86, 22);
		rellenarBox(peaton.getAbogado(), valoresAbogado, this.comboBoxAbogadoSN);
		contentPanel.add(comboBoxAbogadoSN);
		
		JLabel lblNombreDr = new JLabel("Nombre Dr:");
		lblNombreDr.setBounds(164, 184, 68, 14);
		contentPanel.add(lblNombreDr);
		
		textNombreDr = new JTextField();
		textNombreDr.setBounds(242, 181, 148, 20);
		rellenarText(peaton.getNombreDr(), this.textNombreDr);
		contentPanel.add(textNombreDr);
		textNombreDr.setColumns(10);
		
		JLabel lblApellidoDr = new JLabel("Apellido Dr:");
		lblApellidoDr.setBounds(403, 184, 68, 14);
		contentPanel.add(lblApellidoDr);
		
		textApellidoDr = new JTextField();
		textApellidoDr.setBounds(477, 181, 166, 20);
		rellenarText(peaton.getApellidoDr(), this.textApellidoDr);
		contentPanel.add(textApellidoDr);
		textApellidoDr.setColumns(10);
		
		JLabel lblDNI = new JLabel("DNI");
		lblDNI.setBounds(23, 225, 46, 14);
		contentPanel.add(lblDNI);
		
		JPanel panelDNI1 = new JPanel();
		panelDNI1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelDNI1.setBounds(50, 250, 183, 106);
		contentPanel.add(panelDNI1);
		panelDNI1.setLayout(new BorderLayout(0, 0));
		
		DNI1 = new JLabel("");
		DNI1.setBounds(50, 250, 183, 106);
		DNI.setFotoAdj(0, DNI1);
		panelDNI1.add(DNI1, BorderLayout.CENTER);
		
		JPanel panelDNI2 = new JPanel();
		panelDNI2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelDNI2.setBounds(358, 250, 183, 106);
		contentPanel.add(panelDNI2);
		panelDNI2.setLayout(new BorderLayout(0, 0));
		
		DNI2 = new JLabel("");
		DNI2.setBounds(358, 250, 183, 106);
		DNI.setFotoAdj(1, DNI2);
		panelDNI2.add(DNI2, BorderLayout.CENTER);
		
		btnDNI1 = new JButton("...");
		btnDNI1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ruta = DNI.adjuntarArchivo(btnDNI1, DNI1);
				DNI.agregarFoto(0, ruta);
			}
		});
		btnDNI1.setBounds(250, 250, 47, 23);
		contentPanel.add(btnDNI1);
		
		btnDNI2 = new JButton("...");
		btnDNI2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ruta = DNI.adjuntarArchivo(btnDNI2, DNI2);
				DNI.agregarFoto(1, ruta);
			}
		});
		btnDNI2.setBounds(558, 250, 47, 23);
		contentPanel.add(btnDNI2);
		
		JLabel lblAcreditacionMed = new JLabel("Acreditacion Medica");
		lblAcreditacionMed.setBounds(23, 367, 121, 14);
		contentPanel.add(lblAcreditacionMed);
		
		JPanel panelMED1 = new JPanel();
		panelMED1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelMED1.setBounds(78, 398, 174, 148);
		contentPanel.add(panelMED1);
		panelMED1.setLayout(new BorderLayout(0, 0));
		
		MED1 = new JLabel("");
		MED1.setBounds(78, 398, 174, 148);
		ACMED.setFotoAdj(0, MED1);
		panelMED1.add(MED1, BorderLayout.CENTER);
		
		btnMED1 = new JButton("...");
		btnMED1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ruta = ACMED.adjuntarArchivo(btnMED1, MED1);
				ACMED.agregarFoto(0, ruta);
			}
		});
		btnMED1.setBounds(258, 398, 30, 23);
		contentPanel.add(btnMED1);
		
		JPanel panelMED2 = new JPanel();
		panelMED2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelMED2.setBounds(349, 398, 174, 148);
		contentPanel.add(panelMED2);
		panelMED2.setLayout(new BorderLayout(0, 0));
		
		MED2 = new JLabel("");
		MED2.setBounds(349, 398, 174, 148);
		ACMED.setFotoAdj(1, MED2);
		panelMED2.add(MED2, BorderLayout.CENTER);
		
		btnMED2 = new JButton("...");
		btnMED2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ruta = ACMED.adjuntarArchivo(btnMED2, MED2);
				ACMED.agregarFoto(1, ruta);
			}
		});
		btnMED2.setBounds(539, 398, 30, 23);
		contentPanel.add(btnMED2);
		
		btnMED3 = new JButton("...");
		btnMED3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ruta = ACMED.adjuntarArchivo(btnMED3, MED3);
				ACMED.agregarFoto(2, ruta);
			}
		});
		btnMED3.setBounds(262, 558, 30, 23);
		contentPanel.add(btnMED3);
		
		JPanel panelMED4 = new JPanel();
		panelMED4.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelMED4.setBounds(349, 558, 174, 148);
		contentPanel.add(panelMED4);
		panelMED4.setLayout(new BorderLayout(0, 0));
		
		MED4 = new JLabel("");
		MED4.setBounds(349, 558, 174, 148);
		ACMED.setFotoAdj(3, MED4);
		panelMED4.add(MED4, BorderLayout.CENTER);
		
		btnMED4 = new JButton("...");
		btnMED4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ruta = ACMED.adjuntarArchivo(btnMED4, MED4);
				ACMED.agregarFoto(3, ruta);
			}
		});
		btnMED4.setBounds(539, 558, 30, 23);
		contentPanel.add(btnMED4);
		
		JLabel lblJustificarAC = new JLabel("Justificar acreditaciones");
		lblJustificarAC.setBounds(10, 731, 148, 14);
		contentPanel.add(lblJustificarAC);
		
		textJustificarACMED = new JTextField();
		textJustificarACMED.setBounds(160, 728, 471, 20);
		rellenarText(peaton.getJustificaAcred(), this.textJustificarACMED);
		contentPanel.add(textJustificarACMED);
		textJustificarACMED.setColumns(10);
		
		JPanel panelMED3 = new JPanel();
		panelMED3.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelMED3.setBounds(78, 558, 174, 148);
		contentPanel.add(panelMED3);
		panelMED3.setLayout(new BorderLayout(0, 0));
		
		MED3 = new JLabel("");
		MED3.setBounds(78, 558, 174, 148);
		ACMED.setFotoAdj(2, MED3);
		panelMED3.add(MED3, BorderLayout.CENTER);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						setPersona(peaton);
						setVisible(false);
					}
				});
				okButton.setActionCommand("OK");
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

//	protected void cambiarPersona(Peaton peaton) {
//		
//		peaton.setApellido(getTextApellido());
//		peaton.setNombre(getTextNombre()); 
//		peaton.setEdad(getTextEdad());
//		peaton.setNroDocumento(getTextDocumento());
//		peaton.setCelular(getTextCelular());
//		peaton.setOcupacion(getTextOcupacion());
//		peaton.setTelefono(getTextTelefono());
//		peaton.setCalle(getTextCalle());
//		peaton.setNumero(getTextNumeroDir());
//		peaton.setPiso(getTextPisoDir());
//		peaton.setDept(getTextDeptDir());
//		peaton.setLocalidad(getTextLocalidad());
//		peaton.setPartido(getTextPartido());
//		peaton.setProvincia(getTextProvincia());
//		peaton.setLesionado(getComboBoxLesionado());
//		peaton.setArt(getChckbxART());
//		peaton.setNombreArt(getTextNombreART());
//		peaton.setLugarAtencion(getTextLugarAtt());
//		peaton.setAbogado(getComboBoxAbogadoSN());
//		peaton.setNombreDr(getTextNombreDr());
//		peaton.setApellidoDr(getTextApellidoDr());
//		peaton.setDNI(DNI);
//		peaton.setAcreditacionMedica(ACMED);
//		peaton.setJustificaAcred(getTextJustificarACMED());
//	}

	protected void setPersona(Peaton persona) {
		
		persona.setApellido(getTextApellido());
		persona.setNombre(getTextNombre()); 
		persona.setEdad(getTextEdad());
		persona.setNroDocumento(getTextDocumento());
		persona.setCelular(getTextCelular());
		persona.setOcupacion(getTextOcupacion());
		persona.setTelefono(getTextTelefono());
		persona.setCalle(getTextCalle());
		persona.setNumero(getTextNumeroDir());
		persona.setPiso(getTextPisoDir());
		persona.setDept(getTextDeptDir());
		persona.setLocalidad(getTextLocalidad());
		persona.setPartido(getTextPartido());
		persona.setProvincia(getTextProvincia());
		persona.setLesionado(getComboBoxLesionado());
		persona.setArt(getChckbxART());
		persona.setNombreArt(getTextNombreART());
		persona.setLugarAtencion(getTextLugarAtt());
		persona.setAbogado(getComboBoxAbogadoSN());
		persona.setNombreDr(getTextNombreDr());
		persona.setApellidoDr(getTextApellidoDr());
		persona.setDNI(DNI);
		persona.setAcreditacionMedica(ACMED);
		persona.setJustificaAcred(getTextJustificarACMED());
	}
	
	public String getTextApellido() {
		return textApellido.getText();
	}

	public String getTextNombre() {
		return textNombre.getText();
	}

	public int getTextEdad() {
		if (textEdad.getText().isEmpty())
			return 0;
		return Integer.parseInt(textEdad.getText());
	}

	public int getTextDocumento() {
		if (textDocumento.getText().isEmpty())
			return 0;
		return Integer.parseInt(textDocumento.getText());
	}

	public String getTextOcupacion() {
		return textOcupacion.getText();
	}

	public String getTextCalle() {
		return textCalle.getText();
	}

	public int getTextCelular() {
		if (textCelular.getText().isEmpty())
			return 0;
		return Integer.parseInt(textCelular.getText());
	}

	public int getTextTelefono() {
		if (textTelefono.getText().isEmpty())
			return 0;
		return Integer.parseInt(textTelefono.getText());
	}

	public int getTextNumeroDir() {
		if (textNumeroDir.getText().isEmpty())
			return 0;
		return Integer.parseInt(textNumeroDir.getText());
	}

	public int getTextPisoDir() {
		if (textPisoDir.getText().isEmpty())
			return 0;
		return Integer.parseInt(textPisoDir.getText()); 
	}

	public String getTextDeptDir() {
		return textDeptDir.getText();
	}

	public String getTextLocalidad() {
		return textLocalidad.getText();
	}

	public String getTextPartido() {
		return textPartido.getText();
	}

	public String getTextProvincia() {
		return textProvincia.getText();
	}

	public String getTextJustificarACMED() {
		return textJustificarACMED.getText();
	}

	public String getTextNombreART() {
		return textNombreART.getText();
	}

	public String getTextLugarAtt() {
		return textLugarAtt.getText();
	}

	public String getTextNombreDr() {
		return textNombreDr.getText();
	}

	public String getTextApellidoDr() {
		return textApellidoDr.getText();
	}

	public String getComboBoxLesionado() {
		return comboBoxLesionado.getSelectedItem().toString();
	}

	public String getComboBoxAbogadoSN() {
		return comboBoxAbogadoSN.getSelectedItem().toString();
	}

	public Fotos getDNI() {
		return DNI;
	}

	public Fotos getACMED() {
		return ACMED;
	}

	public Peaton getPersona() {
		return persona;
	}

	public String getChckbxART() {
		if (chckbxART.isSelected())
			return "Si";
		else
			return "No";
	}

	public String getNombrePersona() {
		return persona.getNombre();
	}
}
