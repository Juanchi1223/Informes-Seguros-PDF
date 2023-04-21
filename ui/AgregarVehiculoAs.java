package ui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JList;

public class AgregarVehiculoAs extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textCodVeh;
	private JTextField textField;
	private JTextField textMarca;
	private JTextField textField_1;
	private JTextField textAño;
	private JTextField textDominio;
	private JTextField textNumChasis;
	private JTextField textNumMotor;
	private JTextField textFieldDescSeguro;
	private JTextField textJustificarDcs;
	private JTextField textJustificarFts;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			AgregarVehiculoAs dialog = new AgregarVehiculoAs();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public AgregarVehiculoAs() {
		setTitle("Ingresar un nuevo Vehiculo Asegurado");
		setBounds(100, 100, 672, 815);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblDaños = new JLabel("¿Reclama daños?");
		lblDaños.setBounds(45, 19, 106, 14);
		contentPanel.add(lblDaños);
		
		JLabel lblCodigoVehiculo = new JLabel("Codigo vehiculo:");
		lblCodigoVehiculo.setBounds(234, 19, 106, 14);
		contentPanel.add(lblCodigoVehiculo);
		
		textCodVeh = new JTextField();
		textCodVeh.setBounds(327, 16, 74, 20);
		contentPanel.add(textCodVeh);
		textCodVeh.setColumns(10);
		
		JComboBox comboBoxDaños = new JComboBox();
		comboBoxDaños.setBounds(160, 15, 64, 22);
		contentPanel.add(comboBoxDaños);
		
		JLabel lblTipo = new JLabel("Tipo de vehiculo:");
		lblTipo.setBounds(411, 19, 106, 14);
		contentPanel.add(lblTipo);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(508, 14, 112, 22);
		contentPanel.add(comboBox);
		
		JLabel lblPropietario = new JLabel("Propietario o Titular:");
		lblPropietario.setBounds(44, 43, 122, 14);
		contentPanel.add(lblPropietario);
		
		textField = new JTextField();
		textField.setBounds(169, 40, 451, 20);
		contentPanel.add(textField);
		textField.setColumns(10);
		
		JLabel lblMarca = new JLabel("Marca:");
		lblMarca.setBounds(44, 68, 46, 14);
		contentPanel.add(lblMarca);
		
		textMarca = new JTextField();
		textMarca.setBounds(100, 65, 106, 20);
		contentPanel.add(textMarca);
		textMarca.setColumns(10);
		
		JLabel lblModelo = new JLabel("Modelo");
		lblModelo.setBounds(216, 68, 46, 14);
		contentPanel.add(lblModelo);
		
		textField_1 = new JTextField();
		textField_1.setBounds(272, 65, 106, 20);
		contentPanel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblAño = new JLabel("Año:");
		lblAño.setBounds(388, 68, 37, 14);
		contentPanel.add(lblAño);
		
		textAño = new JTextField();
		textAño.setBounds(422, 65, 46, 20);
		contentPanel.add(textAño);
		textAño.setColumns(10);
		
		JLabel lblDominio = new JLabel("Dominio:");
		lblDominio.setBounds(478, 68, 64, 14);
		contentPanel.add(lblDominio);
		
		textDominio = new JTextField();
		textDominio.setBounds(534, 65, 86, 20);
		contentPanel.add(textDominio);
		textDominio.setColumns(10);
		
		JLabel lblNumChasis = new JLabel("N° de Chasis:");
		lblNumChasis.setBounds(44, 93, 86, 14);
		contentPanel.add(lblNumChasis);
		
		textNumChasis = new JTextField();
		textNumChasis.setBounds(120, 90, 103, 20);
		contentPanel.add(textNumChasis);
		textNumChasis.setColumns(10);
		
		JLabel lblNumMot = new JLabel("N° de Motor:");
		lblNumMot.setBounds(226, 93, 74, 14);
		contentPanel.add(lblNumMot);
		
		textNumMotor = new JTextField();
		textNumMotor.setBounds(297, 90, 103, 20);
		contentPanel.add(textNumMotor);
		textNumMotor.setColumns(10);
		
		JLabel lblSeguro = new JLabel("¿Tiene algun tipo de seguro?");
		lblSeguro.setBounds(403, 93, 176, 14);
		contentPanel.add(lblSeguro);
		
		JComboBox comboBoxSeguro = new JComboBox();
		comboBoxSeguro.setBounds(569, 89, 51, 22);
		contentPanel.add(comboBoxSeguro);
		
		JLabel lblDescSeguro = new JLabel("¿Cual?:");
		lblDescSeguro.setBounds(45, 118, 46, 14);
		contentPanel.add(lblDescSeguro);
		
		textFieldDescSeguro = new JTextField();
		textFieldDescSeguro.setBounds(95, 115, 111, 20);
		contentPanel.add(textFieldDescSeguro);
		textFieldDescSeguro.setColumns(10);
		
		JLabel lblDenuncia = new JLabel("¿Realizo la denuncia?");
		lblDenuncia.setBounds(216, 118, 124, 14);
		contentPanel.add(lblDenuncia);
		
		JComboBox comboBoxDenuncia = new JComboBox();
		comboBoxDenuncia.setBounds(350, 114, 51, 22);
		contentPanel.add(comboBoxDenuncia);
		
		JLabel lblDoc = new JLabel("¿Adjunta documentacion?");
		lblDoc.setBounds(411, 118, 168, 14);
		contentPanel.add(lblDoc);
		
		JComboBox comboBoxDoc = new JComboBox();
		comboBoxDoc.setBounds(569, 114, 51, 22);
		contentPanel.add(comboBoxDoc);
		
		JLabel lblAdjDoc = new JLabel("Documentacion:");
		lblAdjDoc.setBounds(45, 143, 161, 14);
		contentPanel.add(lblAdjDoc);
		
		JPanel panelBordeFt = new JPanel();
		panelBordeFt.setBorder(new LineBorder(Color.DARK_GRAY));
		panelBordeFt.setBounds(45, 168, 179, 113);
		contentPanel.add(panelBordeFt);
		panelBordeFt.setLayout(new GridLayout(1, 0, 0, 0));
		
		JLabel FotoDoc1 = new JLabel("");
		panelBordeFt.add(FotoDoc1);
		
		JPanel panelBordeFt2 = new JPanel();
		panelBordeFt2.setBorder(new LineBorder(Color.DARK_GRAY));
		panelBordeFt2.setBounds(303, 168, 179, 113);
		contentPanel.add(panelBordeFt2);
		panelBordeFt2.setLayout(new GridLayout(1, 0, 0, 0));
		
		JLabel FotoDoc2 = new JLabel("");
		panelBordeFt2.add(FotoDoc2);
		
		JButton btnAjuntarDoc1 = new JButton("...");
		btnAjuntarDoc1.setBounds(231, 168, 37, 23);
		contentPanel.add(btnAjuntarDoc1);
		
		JButton btnAjuntarDoc1_1 = new JButton("...");
		btnAjuntarDoc1_1.setBounds(492, 168, 37, 23);
		contentPanel.add(btnAjuntarDoc1_1);
		
		JLabel lblFotos = new JLabel("Fotos:");
		lblFotos.setBounds(29, 326, 46, 14);
		contentPanel.add(lblFotos);
		
		JPanel panelBordeFoto3 = new JPanel();
		panelBordeFoto3.setBorder(new LineBorder(Color.DARK_GRAY));
		panelBordeFoto3.setBounds(29, 351, 112, 113);
		contentPanel.add(panelBordeFoto3);
		panelBordeFoto3.setLayout(new BorderLayout(0, 0));
		
		JLabel Foto1 = new JLabel("");
		panelBordeFoto3.add(Foto1, BorderLayout.CENTER);
		
		JPanel panelBordeFoto4 = new JPanel();
		panelBordeFoto4.setBorder(new LineBorder(Color.DARK_GRAY));
		panelBordeFoto4.setBounds(180, 351, 112, 113);
		contentPanel.add(panelBordeFoto4);
		panelBordeFoto4.setLayout(new BorderLayout(0, 0));
		
		JLabel FOTO2 = new JLabel("");
		panelBordeFoto4.add(FOTO2, BorderLayout.CENTER);
		
		JPanel panelBordeFoto5 = new JPanel();
		panelBordeFoto5.setBorder(new LineBorder(Color.DARK_GRAY));
		panelBordeFoto5.setBounds(338, 351, 112, 113);
		contentPanel.add(panelBordeFoto5);
		panelBordeFoto5.setLayout(new BorderLayout(0, 0));
		
		JLabel Foto3 = new JLabel("");
		panelBordeFoto5.add(Foto3, BorderLayout.CENTER);
		
		JPanel panelBordeFoto6 = new JPanel();
		panelBordeFoto6.setBorder(new LineBorder(Color.DARK_GRAY));
		panelBordeFoto6.setBounds(492, 351, 112, 113);
		contentPanel.add(panelBordeFoto6);
		panelBordeFoto6.setLayout(new BorderLayout(0, 0));
		
		JLabel Foto4 = new JLabel("");
		panelBordeFoto6.add(Foto4, BorderLayout.CENTER);
		
		JLabel lblJustificarDoc = new JLabel("Justificar:");
		lblJustificarDoc.setBounds(29, 301, 74, 14);
		contentPanel.add(lblJustificarDoc);
		
		textJustificarDcs = new JTextField();
		textJustificarDcs.setBounds(100, 298, 520, 20);
		contentPanel.add(textJustificarDcs);
		textJustificarDcs.setColumns(10);
		
		JButton btnAbjFoto1 = new JButton("...");
		btnAbjFoto1.setBounds(147, 352, 27, 23);
		contentPanel.add(btnAbjFoto1);
		
		JButton btnAdjFoto2 = new JButton("...");
		btnAdjFoto2.setBounds(302, 352, 27, 23);
		contentPanel.add(btnAdjFoto2);
		
		JButton btnAdjFoto3 = new JButton("...");
		btnAdjFoto3.setBounds(457, 353, 27, 23);
		contentPanel.add(btnAdjFoto3);
		
		JButton btnAdjFoto4 = new JButton("...");
		btnAdjFoto4.setBounds(610, 351, 27, 23);
		contentPanel.add(btnAdjFoto4);
		
		JLabel lblJustificarFotos = new JLabel("Justificar:");
		lblJustificarFotos.setBounds(29, 478, 74, 14);
		contentPanel.add(lblJustificarFotos);
		
		textJustificarFts = new JTextField();
		textJustificarFts.setColumns(10);
		textJustificarFts.setBounds(100, 475, 520, 20);
		contentPanel.add(textJustificarFts);
		
		JLabel lblCotizacion = new JLabel("Cotizacion:");
		lblCotizacion.setBounds(29, 511, 61, 14);
		contentPanel.add(lblCotizacion);
		
		JPanel panelBordeFoto7 = new JPanel();
		panelBordeFoto7.setBorder(new LineBorder(Color.DARK_GRAY));
		panelBordeFoto7.setBounds(29, 536, 260, 196);
		contentPanel.add(panelBordeFoto7);
		
		JButton btnAdjCot = new JButton("...");
		btnAdjCot.setBounds(300, 536, 40, 23);
		contentPanel.add(btnAdjCot);
		
		JButton btnAgrPas = new JButton("Agregar ");
		btnAgrPas.setBounds(361, 565, 89, 23);
		contentPanel.add(btnAgrPas);
		
		JButton btnModPas = new JButton("Modificar");
		btnModPas.setBounds(361, 612, 89, 23);
		contentPanel.add(btnModPas);
		
		JButton btnElimPas = new JButton("Eliminar");
		btnElimPas.setBounds(361, 660, 89, 23);
		contentPanel.add(btnElimPas);
		
		JList listPasajeros = new JList();
		listPasajeros.setBounds(459, 536, 161, 196);
		contentPanel.add(listPasajeros);
		
		JLabel lblPasajeros = new JLabel("Pasajeros:");
		lblPasajeros.setBounds(361, 511, 89, 14);
		contentPanel.add(lblPasajeros);
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
