package ui.VehiculosTer;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import empresa.*;
import ui.VehiculosAs.AgregarPasajero;
import ui.VehiculosAs.ModificarPasajero;

public class ModificarVehiculoTer extends JDialog implements InsertarValores{

	private final JPanel contentPanel = new JPanel();
	
	private JTextField textCodVeh, textFieldPropietario, textMarca,  textModelo, textAño, textDominio, textNumChasis, textNumMotor, textJustificarDcs, textJustificarFts, textFieldNombreSeguro;
	private JComboBox comboBoxDaños, comboBoxTipo, comboBoxDenuncia, comboBoxDoc, comboBoxSeguro;
	private Fotos FotosDoc;
	private Fotos Fotos;
	private Fotos FotoCotizacion;
	private ArrayList<Tripulantes> tripulantes;
	
	private VehiculoTercero vehiculoMod = new VehiculoTercero();

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		try {
//			ModificarVehiculoTer dialog = new ModificarVehiculoTer();
//			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
//			dialog.setVisible(true);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}

	/**
	 * Create the dialog.
	 */
	public ModificarVehiculoTer(VehiculoTercero vehiculo) {
		FotosDoc = vehiculo.getDocFotos();
		Fotos = vehiculo.getRodadoFotos();
		FotoCotizacion = vehiculo.getCotizacion();
		tripulantes = vehiculo.getListaTripulantes();
		
		
		setTitle("Ingresar un nuevo Vehiculo Asegurado");
		setBounds(100, 100, 672, 841);
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
		if (vehiculo.getCodigo() != null) {
			textCodVeh.setText(vehiculo.getCodigo());
		}
		textCodVeh.setBounds(327, 16, 74, 20);
		contentPanel.add(textCodVeh);
		textCodVeh.setColumns(10);
		
		comboBoxDaños = new JComboBox();
		String[] valorSiNo = {"","Si","No"};
		comboBoxDaños.setModel(new DefaultComboBoxModel(valorSiNo));
		rellenarBox(vehiculo.getDaños(), valorSiNo, comboBoxDaños);
		comboBoxDaños.setBounds(160, 15, 64, 22);
		contentPanel.add(comboBoxDaños);
		
		JLabel lblTipo = new JLabel("Tipo de vehiculo:");
		lblTipo.setBounds(411, 19, 106, 14);
		contentPanel.add(lblTipo);
		
		comboBoxTipo = new JComboBox();
		String[] valorTipo = {"","Auto","Utilitario", "Camioneta","Camion"};
		comboBoxTipo.setModel(new DefaultComboBoxModel(valorTipo));
		rellenarBox(vehiculo.getTipo(), valorTipo, comboBoxTipo);
		comboBoxTipo.setBounds(508, 14, 112, 22);
		contentPanel.add(comboBoxTipo);
		
		JLabel lblPropietario = new JLabel("Propietario o Titular:");
		lblPropietario.setBounds(44, 43, 122, 14);
		contentPanel.add(lblPropietario);
		
		textFieldPropietario = new JTextField();
		rellenarText(vehiculo.getPropietario(), textFieldPropietario);
		textFieldPropietario.setBounds(169, 40, 451, 20);
		contentPanel.add(textFieldPropietario);
		textFieldPropietario.setColumns(10);
		
		JLabel lblMarca = new JLabel("Marca:");
		lblMarca.setBounds(44, 68, 46, 14);
		contentPanel.add(lblMarca);
		
		textMarca = new JTextField();
		rellenarText(vehiculo.getMarca(), textMarca);
		textMarca.setBounds(100, 65, 106, 20);
		contentPanel.add(textMarca);
		textMarca.setColumns(10);
		
		JLabel lblModelo = new JLabel("Modelo");
		lblModelo.setBounds(216, 68, 46, 14);
		contentPanel.add(lblModelo);
		
		textModelo = new JTextField();
		rellenarText(vehiculo.getModelo(), textModelo);
		textModelo.setBounds(272, 65, 106, 20);
		contentPanel.add(textModelo);
		textModelo.setColumns(10);
		
		JLabel lblAño = new JLabel("Año:");
		lblAño.setBounds(388, 68, 37, 14);
		contentPanel.add(lblAño);
		
		textAño = new JTextField();
		rellenarText(vehiculo.getAño(), textAño);
		textAño.setBounds(422, 65, 46, 20);
		contentPanel.add(textAño);
		textAño.setColumns(10);
		
		JLabel lblDominio = new JLabel("Dominio:");
		lblDominio.setBounds(478, 68, 64, 14);
		contentPanel.add(lblDominio);
		
		textDominio = new JTextField();
		rellenarText(vehiculo.getDominio(), textDominio);
		textDominio.setBounds(534, 65, 86, 20);
		contentPanel.add(textDominio);
		textDominio.setColumns(10);
		
		JLabel lblNumChasis = new JLabel("N° de Chasis:");
		lblNumChasis.setBounds(44, 93, 86, 14);
		contentPanel.add(lblNumChasis);
		
		textNumChasis = new JTextField();
		rellenarText(vehiculo.getNroChasis(), textNumChasis);
		textNumChasis.setBounds(120, 90, 191, 20);
		contentPanel.add(textNumChasis);
		textNumChasis.setColumns(10);
		
		JLabel lblNumMot = new JLabel("N° de Motor:");
		lblNumMot.setBounds(321, 93, 74, 14);
		contentPanel.add(lblNumMot);
		
		textNumMotor = new JTextField();
		rellenarText(vehiculo.getNroMotor(), textNumMotor);			
		textNumMotor.setBounds(392, 90, 228, 20);
		contentPanel.add(textNumMotor);
		textNumMotor.setColumns(10);
		
		JLabel lblDenuncia = new JLabel("¿Realizo la denuncia?");
		lblDenuncia.setBounds(216, 121, 124, 14);
		contentPanel.add(lblDenuncia);
		
		comboBoxDenuncia = new JComboBox();
		comboBoxDenuncia.setModel(new DefaultComboBoxModel(valorSiNo));
		rellenarBox(vehiculo.getDenuncia(), valorSiNo, comboBoxDenuncia);
		comboBoxDenuncia.setBounds(356, 116, 51, 22);
		contentPanel.add(comboBoxDenuncia);
		
		JLabel lblDoc = new JLabel("¿Adjunta documentacion?");
		lblDoc.setBounds(414, 120, 168, 14);
		contentPanel.add(lblDoc);
		
		comboBoxDoc = new JComboBox();
		comboBoxDoc.setModel(new DefaultComboBoxModel(valorSiNo));
		rellenarBox(vehiculo.getDocumentacion(), valorSiNo, comboBoxDoc);
		comboBoxDoc.setBounds(569, 116, 51, 22);
		contentPanel.add(comboBoxDoc);
		
		JLabel lblAdjDoc = new JLabel("Documentacion:");
		lblAdjDoc.setBounds(45, 176, 161, 14);
		contentPanel.add(lblAdjDoc);
		
		JPanel panelBordeFt = new JPanel();
		panelBordeFt.setBorder(new LineBorder(Color.DARK_GRAY));
		panelBordeFt.setBounds(45, 201, 179, 113);
		contentPanel.add(panelBordeFt);
		panelBordeFt.setLayout(new GridLayout(1, 0, 0, 0));
		
		JLabel FotoDoc1 = new JLabel("");
		FotoDoc1.setBounds(45, 168, 179, 113);
		FotosDoc.setFotoAdj(0, FotoDoc1);
		panelBordeFt.add(FotoDoc1);
		
		JPanel panelBordeFt2 = new JPanel();
		panelBordeFt2.setBorder(new LineBorder(Color.DARK_GRAY));
		panelBordeFt2.setBounds(303, 201, 179, 113);
		contentPanel.add(panelBordeFt2);
		panelBordeFt2.setLayout(new GridLayout(1, 0, 0, 0));
		
		JLabel FotoDoc2 = new JLabel("");
		FotoDoc2.setBounds(303, 168, 179, 113);
		FotosDoc.setFotoAdj(1, FotoDoc2);
		panelBordeFt2.add(FotoDoc2);
		
		JButton btnAjuntarDoc1 = new JButton("...");
		btnAjuntarDoc1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ruta = FotosDoc.adjuntarArchivo(btnAjuntarDoc1, FotoDoc1);
				FotosDoc.agregarFoto(0, ruta);
			}
		});
		btnAjuntarDoc1.setBounds(231, 201, 37, 23);
		contentPanel.add(btnAjuntarDoc1);
		
		JButton btnAjuntarDoc2 = new JButton("...");
		btnAjuntarDoc2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ruta = FotosDoc.adjuntarArchivo(btnAjuntarDoc2, FotoDoc2);
				FotosDoc.agregarFoto(1, ruta);
			}
		});
		btnAjuntarDoc2.setBounds(492, 201, 37, 23);
		contentPanel.add(btnAjuntarDoc2);
		
		JLabel lblFotos = new JLabel("Fotos:");
		lblFotos.setBounds(29, 359, 46, 14);
		contentPanel.add(lblFotos);
		
		JPanel panelBordeFoto3 = new JPanel();
		panelBordeFoto3.setBorder(new LineBorder(Color.DARK_GRAY));
		panelBordeFoto3.setBounds(29, 384, 112, 113);
		contentPanel.add(panelBordeFoto3);
		panelBordeFoto3.setLayout(new BorderLayout(0, 0));
		
		JLabel Foto1 = new JLabel("");
		Foto1.setBounds(29, 351, 112, 113);
		Fotos.setFotoAdj(0, Foto1);
		panelBordeFoto3.add(Foto1, BorderLayout.CENTER);
		
		JPanel panelBordeFoto4 = new JPanel();
		panelBordeFoto4.setBorder(new LineBorder(Color.DARK_GRAY));
		panelBordeFoto4.setBounds(180, 384, 112, 113);
		contentPanel.add(panelBordeFoto4);
		panelBordeFoto4.setLayout(new BorderLayout(0, 0));
		
		JLabel Foto2 = new JLabel("");
		Foto2.setBounds(180, 351, 112, 113);
		Fotos.setFotoAdj(1, Foto2);
		panelBordeFoto4.add(Foto2, BorderLayout.CENTER);
		
		JPanel panelBordeFoto5 = new JPanel();
		panelBordeFoto5.setBorder(new LineBorder(Color.DARK_GRAY));
		panelBordeFoto5.setBounds(338, 384, 112, 113);
		contentPanel.add(panelBordeFoto5);
		panelBordeFoto5.setLayout(new BorderLayout(0, 0));
		
		JLabel Foto3 = new JLabel("");
		Foto3.setBounds(338, 351, 112, 113);
		Fotos.setFotoAdj(2, Foto3);
		panelBordeFoto5.add(Foto3, BorderLayout.CENTER);
		
		JPanel panelBordeFoto6 = new JPanel();
		panelBordeFoto6.setBorder(new LineBorder(Color.DARK_GRAY));
		panelBordeFoto6.setBounds(492, 384, 112, 113);
		contentPanel.add(panelBordeFoto6);
		panelBordeFoto6.setLayout(new BorderLayout(0, 0));
		
		JLabel Foto4 = new JLabel("");
		Foto4.setBounds(492, 351, 112, 113);
		Fotos.setFotoAdj(3, Foto4);
		panelBordeFoto6.add(Foto4, BorderLayout.CENTER);
		
		JLabel lblJustificarDoc = new JLabel("Justificar:");
		lblJustificarDoc.setBounds(29, 334, 74, 14);
		contentPanel.add(lblJustificarDoc);
		
		textJustificarDcs = new JTextField();
		rellenarText(vehiculo.getJustificarDocs(),textJustificarDcs);
		textJustificarDcs.setBounds(100, 331, 520, 20);
		contentPanel.add(textJustificarDcs);
		textJustificarDcs.setColumns(10);
		
		JButton btnAbjFoto1 = new JButton("...");
		btnAbjFoto1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ruta = Fotos.adjuntarArchivo(btnAbjFoto1, Foto1);
				Fotos.agregarFoto(0, ruta);
			}
		});
		btnAbjFoto1.setBounds(147, 385, 27, 23);
		contentPanel.add(btnAbjFoto1);
		
		JButton btnAdjFoto2 = new JButton("...");
		btnAdjFoto2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ruta = Fotos.adjuntarArchivo(btnAdjFoto2, Foto2);
				Fotos.agregarFoto(1, ruta);
			}
		});
		btnAdjFoto2.setBounds(302, 385, 27, 23);
		contentPanel.add(btnAdjFoto2);
		
		JButton btnAdjFoto3 = new JButton("...");
		btnAdjFoto3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ruta = Fotos.adjuntarArchivo(btnAdjFoto3, Foto3);
				Fotos.agregarFoto(2, ruta);
			}
		});
		btnAdjFoto3.setBounds(457, 386, 27, 23);
		contentPanel.add(btnAdjFoto3);
		
		JButton btnAdjFoto4 = new JButton("...");
		btnAdjFoto4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ruta = Fotos.adjuntarArchivo(btnAdjFoto4, Foto4);
				Fotos.agregarFoto(3, ruta);
			}
		});
		btnAdjFoto4.setBounds(610, 384, 27, 23);
		contentPanel.add(btnAdjFoto4);
		
		JLabel lblJustificarFotos = new JLabel("Justificar:");
		lblJustificarFotos.setBounds(29, 511, 74, 14);
		contentPanel.add(lblJustificarFotos);
		
		textJustificarFts = new JTextField();
		rellenarText(vehiculo.getJustificarFotos() ,textJustificarFts);
		textJustificarFts.setColumns(10);
		textJustificarFts.setBounds(100, 508, 520, 20);
		contentPanel.add(textJustificarFts);
		
		JLabel lblCotizacion = new JLabel("Cotizacion:");
		lblCotizacion.setBounds(29, 544, 61, 14);
		contentPanel.add(lblCotizacion);
		
		JPanel panelBordeFoto7 = new JPanel();
		panelBordeFoto7.setBorder(new LineBorder(Color.DARK_GRAY));
		panelBordeFoto7.setBounds(29, 569, 260, 196);
		contentPanel.add(panelBordeFoto7);
		panelBordeFoto7.setLayout(new BorderLayout(0, 0));
		
		JLabel Cotizacion = new JLabel("");
		Cotizacion.setBounds(29, 536, 260, 196);
		FotoCotizacion.setFotoAdj(0, Cotizacion);
		panelBordeFoto7.add(Cotizacion, BorderLayout.CENTER);
		
		JButton btnAdjCot = new JButton("...");
		btnAdjCot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ruta = FotoCotizacion.adjuntarArchivo(btnAdjCot, Cotizacion);
				FotoCotizacion.agregarFoto(0, ruta);
			}
		});
		btnAdjCot.setBounds(300, 569, 40, 23);
		contentPanel.add(btnAdjCot);
		
		JList listPasajeros = new JList();
		listPasajeros.setBounds(459, 569, 161, 196);
		listPasajeros.setListData(tripulantes.toArray());
		contentPanel.add(listPasajeros);

		JLabel lblPasajeros = new JLabel("Pasajeros:");
		lblPasajeros.setBounds(361, 544, 89, 14);
		contentPanel.add(lblPasajeros);
		
		JButton btnAgrPas = new JButton("Agregar ");
		btnAgrPas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	
				AgregarPasajero ventana = new AgregarPasajero();
				
				ventana.setModal(true);
				ventana.setVisible(true);
				
				if (ventana.getPersona().getApellido() != null)
					tripulantes.add(ventana.getPersona());
				
				listPasajeros.setListData(tripulantes.toArray());
				
			}
		});
		btnAgrPas.setBounds(361, 598, 89, 23);
		contentPanel.add(btnAgrPas);
		
		JButton btnModPas = new JButton("Modificar");
		btnModPas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = listPasajeros.getSelectedIndex();
				Tripulantes tripMod = tripulantes.get(a) ;
				
				ModificarPasajero ventana = new ModificarPasajero(tripMod);
				ventana.setModal(true);
				ventana.setVisible(true);
				
				tripulantes.set(a, ventana.getPersona());
				
				listPasajeros.setListData(tripulantes.toArray());
			}
		});
		btnModPas.setBounds(361, 645, 89, 23);
		contentPanel.add(btnModPas);
		
		JButton btnElimPas = new JButton("Eliminar");
		btnElimPas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = listPasajeros.getSelectedIndex();
				
				if(a >= 0)
					tripulantes.remove(a);
				
				listPasajeros.setListData(tripulantes.toArray());
			}
		});
		btnElimPas.setBounds(361, 693, 89, 23);
		contentPanel.add(btnElimPas);
		
		JLabel lblSeguro = new JLabel("¿Tenia algun tipo de seguro?");
		lblSeguro.setBounds(45, 146, 180, 14);
		contentPanel.add(lblSeguro);
		
		comboBoxSeguro = new JComboBox();
		comboBoxSeguro.setModel(new DefaultComboBoxModel(valorSiNo));
		comboBoxSeguro.setBounds(216, 141, 58, 22);
		rellenarBox(vehiculo.getSeguro(),valorSiNo,comboBoxSeguro);
		contentPanel.add(comboBoxSeguro);
		
		JLabel lblNombreSeguro = new JLabel("¿Cual?");
		lblNombreSeguro.setBounds(303, 146, 46, 14);
		contentPanel.add(lblNombreSeguro);
		
		textFieldNombreSeguro = new JTextField();
		textFieldNombreSeguro.setBounds(356, 143, 180, 20);
		rellenarText(vehiculo.getDescSeguro(), textFieldNombreSeguro);
		contentPanel.add(textFieldNombreSeguro);
		textFieldNombreSeguro.setColumns(10);
		
		
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						setVisible(false);
						guardarVehiculo();
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

	protected void guardarVehiculo() {
		vehiculoMod.setDaños(getComboBoxDaños());
		vehiculoMod.setTipo(getComboBoxTipo());
		vehiculoMod.setPropietario(getTextFieldPropietario());
		vehiculoMod.setMarca(getTextMarca());
		vehiculoMod.setModelo(getTextModelo());
		vehiculoMod.setAño(getTextAño());
		vehiculoMod.setDominio(getTextDominio());
		vehiculoMod.setNroChasis(getTextNumChasis());
		vehiculoMod.setNroMotor(getTextNumMotor());
		vehiculoMod.setDenuncia(getComboBoxDenuncia());
		vehiculoMod.setDocumentacion(getComboBoxDoc());
		vehiculoMod.setDocFotos(getFotosDoc());
		vehiculoMod.setJustificarDocs(getTextJustificarDcs());
		vehiculoMod.setRodadoFotos(getFotos());
		vehiculoMod.setJustificarFotos(getTextJustificarFts());
		vehiculoMod.setCotizacion(getFotoCotizacion());
		vehiculoMod.setListaTripulantes(getTripulantes());
		
		vehiculoMod.setSeguro(getSeguro());
		vehiculoMod.setDescSeguro(getNomSeguro());
	}
	
	public String getTextCodVeh() {
		return textCodVeh.getText();
	}
	
	public String getTextFieldPropietario() {
		return textFieldPropietario.getText();
	}
	
	public String getTextMarca() {
		return textMarca.getText();
	}
	
	public String getTextModelo() {
		return textModelo.getText();
	}
	
	public int getTextAño() {
		return Integer.parseInt(textAño.getText());
	}
	
	public String getTextDominio() {
		return textDominio.getText();
	}
	
	public int getTextNumChasis() {
		return Integer.parseInt(textNumChasis.getText());
	}
	
	public int getTextNumMotor() {
		return Integer.parseInt(textNumMotor.getText());
	}
	
	public String getTextJustificarDcs() {
		return textJustificarDcs.getText();
	}
	
	public String getTextJustificarFts() {
		return textJustificarFts.getText();
	}
	
	public String getComboBoxDaños() {
		return comboBoxDaños.getSelectedItem().toString();
	}
	
	public String getComboBoxTipo() {
		return comboBoxTipo.getSelectedItem().toString();
	}
	
	public String getComboBoxDenuncia() {
		return comboBoxDenuncia.getSelectedItem().toString();
	}
	
	public String getComboBoxDoc() {
		return comboBoxDoc.getSelectedItem().toString();
	}
	public String getSeguro() {
		return comboBoxSeguro.getSelectedItem().toString();
	}
	public String getNomSeguro() {
		return textFieldNombreSeguro.getText();
	}
	
	public Fotos getFotosDoc() {
		return FotosDoc;
	}
	
	public Fotos getFotos() {
		return Fotos;
	}
	
	public Fotos getFotoCotizacion() {
		return FotoCotizacion;
	}
	
	public ArrayList<Tripulantes> getTripulantes() {
		return tripulantes;
	}
	
	public VehiculoAsegurado getvehiculoMod() {
		return vehiculoMod;
	}
}


