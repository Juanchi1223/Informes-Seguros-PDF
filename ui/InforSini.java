package ui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Image;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.toedter.calendar.JCalendar;

import empresa.Fotos;
import empresa.InformacionSiniestro;
import empresa.Lugar;

import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JTextArea;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.CardLayout;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.border.TitledBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;

public class InforSini extends JDialog {

	private final JPanel contentPanel = new JPanel();
	
	private JCalendar calendarioFecha;
	private JTextField textCalle, textNumero, textLocalidad, textCarriles, textVelocidad, textAmCual, textSumario, textTestigo1, textTestigo2, textTestigo3;
	private JComboBox comboBoxHora, comboBoxAmSiNo, comboBoxMinuto, comboBoxTiempo, comboBoxEstado, comboBoxProv, comboBoxVisibilidad, comboBoxAmbiente, comboBoxiluminacion, comboBoxPenalSiNo, comboBoxTestigos, comboBoxJuridicc, comboBoxPais, comboBoxPolSiNo;
	
	private JLabel lblCalle;
	private String[] SiNo = {"","Si","No"};
	private String[] testigos;
	private Lugar lugar;
	private ArrayList<String> fotos;
	private JFileChooser fcDoc1;
	private JLabel Foto1, Foto2, Foto3, Foto4, Croquis;
	
	private int indm, honorarios;	// VARIABLES DE SUBVETANA
	private String verAs, verTer, mecanica, observaciones, cobertura, fraude, anCobertura, respns, porcentajeResp, anResp, conclu, transable, moneda; 

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		try {
//			InforSini dialog = new InforSini();
//			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
//			dialog.setVisible(true);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}

	/**
	 * Create the dialog.
	 */
	public InforSini(InformacionSiniestro contrato) {
		setBackground(SystemColor.menu);
		setResizable(false);
		setTitle("Informacion Siniestro");
		setBounds(100, 100, 728, 572);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		fotos = contrato.getFotosLugar();
		
		JLabel lblFecha = new JLabel("Fecha:");
		lblFecha.setBounds(10, 25, 46, 14);
		contentPanel.add(lblFecha);
		
		calendarioFecha = new JCalendar();
		if(contrato.getFechaHoraMin() != null)
			calendarioFecha.setDate(contrato.getFechaHoraMin());
		calendarioFecha.setBounds(58, 25, 200, 153);
		contentPanel.add(calendarioFecha);
		{
			JLabel lblHora = new JLabel("Hora:");
			lblHora.setBounds(268, 25, 46, 14);
			contentPanel.add(lblHora);
		}
		
		comboBoxHora = new JComboBox();
		comboBoxHora.setModel(new DefaultComboBoxModel(crearArrayHora()));
		if (contrato.getHora() != null && contrato.getHora() != "") {
			comboBoxHora.setSelectedIndex(Integer.parseInt(contrato.getHora())+1);
		}
		comboBoxHora.setBounds(309, 21, 40, 22);
		contentPanel.add(comboBoxHora);
		{
			JLabel lblMinuto = new JLabel(":");
			lblMinuto.setBounds(353, 25, 11, 14);
			contentPanel.add(lblMinuto);
		}
		{
			comboBoxMinuto = new JComboBox();
			String[] valores =  {"", "00", "15", "30", "45"};
			comboBoxMinuto.setModel(new DefaultComboBoxModel(valores));
			if (contrato.getMin() != null && contrato.getMin() != "")
				comboBoxHora.setSelectedIndex(getIndex(contrato.getMin(), valores));
			comboBoxMinuto.setBounds(359, 21, 40, 22);
			contentPanel.add(comboBoxMinuto);
		}
		{
			JLabel lblTiempo = new JLabel("Tiempo:");
			lblTiempo.setBounds(409, 25, 46, 14);
			contentPanel.add(lblTiempo);
		}
		{
			comboBoxTiempo = new JComboBox();
			String[] valorTiempo =  {"", "Diurno", "Nocturno"};
			comboBoxTiempo.setModel(new DefaultComboBoxModel(valorTiempo));
			if (contrato.getTiempo() != null && contrato.getTiempo() != "")
				comboBoxTiempo.setSelectedIndex(getIndex(contrato.getTiempo(), valorTiempo));
			comboBoxTiempo.setBounds(463, 21, 78, 22);
			contentPanel.add(comboBoxTiempo);
		}
		{
			JLabel lblEstado = new JLabel("Estado:");
			lblEstado.setBounds(543, 24, 46, 14);
			contentPanel.add(lblEstado);
		}
		{
			comboBoxEstado = new JComboBox();
			comboBoxEstado.setModel(new DefaultComboBoxModel(new String[] {"", "Seco", "Lluvia", "Granizo ", "Niebla", "Nieve"}));
			comboBoxEstado.setBounds(590, 21, 61, 22);
			contentPanel.add(comboBoxEstado);
		}
		{
			lblCalle = new JLabel("Calle:");
			lblCalle.setBounds(268, 53, 46, 14);
			contentPanel.add(lblCalle);
		}
		{
			textCalle = new JTextField();
			textCalle.setBounds(309, 50, 181, 20);
			contentPanel.add(textCalle);
			textCalle.setColumns(10);
		}
		{
			JLabel lblNumero = new JLabel("Numero:");
			lblNumero.setBounds(500, 53, 61, 14);
			contentPanel.add(lblNumero);
		}
		{
			textNumero = new JTextField();
			textNumero.setBounds(556, 50, 86, 20);
			contentPanel.add(textNumero);
			textNumero.setColumns(10);
		}
		{
			JLabel lblLocalidad = new JLabel("Localidad:");
			lblLocalidad.setBounds(268, 85, 69, 14);
			contentPanel.add(lblLocalidad);
		}
		
		textLocalidad = new JTextField();
		textLocalidad.setBounds(335, 81, 108, 20);
		contentPanel.add(textLocalidad);
		textLocalidad.setColumns(10);
		
		JLabel lblProvincia = new JLabel("Provincia:");
		lblProvincia.setBounds(453, 83, 78, 14);
		contentPanel.add(lblProvincia);
		
		comboBoxProv = new JComboBox();
		comboBoxProv.setModel(new DefaultComboBoxModel(new String[] {"", "Buenos Aires", "Catamarca", "Chaco", "Chubut", "Córdova", "Corrientes", "Entre Rios ", "Formaso", "Jujuy", "La pampa", "La rioja", "Mendoza", "Misiones ", "Neuquen", "Rio Negro", "Salta", "San Juan", "San Luis", "Santa Cruz ", "Santa Fe", "Santiago del Estero", "Tierra del Fuego", "Tucuman"}));
		comboBoxProv.setBounds(513, 79, 165, 22);
		contentPanel.add(comboBoxProv);
		
		JLabel lblVisibilidad = new JLabel("Visibilidad:");
		lblVisibilidad.setBounds(394, 146, 81, 14);
		contentPanel.add(lblVisibilidad);
		
		comboBoxVisibilidad = new JComboBox<String>();
		comboBoxVisibilidad.setModel(new DefaultComboBoxModel(new String[] {"", "Buena", "Regular", "Mala"}));
		comboBoxVisibilidad.setBounds(460, 142, 78, 22);
		contentPanel.add(comboBoxVisibilidad);
		
		JLabel lblAmbiente = new JLabel("Ambiente:");
		lblAmbiente.setBounds(262, 147, 69, 14);
		contentPanel.add(lblAmbiente);
		
		comboBoxAmbiente = new JComboBox();
		comboBoxAmbiente.setModel(new DefaultComboBoxModel(new String[] {"", "Rural", "Urbano"}));
		comboBoxAmbiente.setBounds(323, 142, 69, 22);
		contentPanel.add(comboBoxAmbiente);
		{
			JLabel lbliluminacion = new JLabel("Iluminacion:");
			lbliluminacion.setBounds(540, 146, 82, 14);
			contentPanel.add(lbliluminacion);
		}
		{
			comboBoxiluminacion = new JComboBox();
			comboBoxiluminacion.setModel(new DefaultComboBoxModel(new String[] {"", "Buena", "Regular", "Mala"}));
			comboBoxiluminacion.setBounds(616, 141, 90, 22);
			contentPanel.add(comboBoxiluminacion);
		}
		{
			Foto1 = new JLabel("");
			Foto1.setBackground(SystemColor.desktop);
			Foto1.setBounds(10, 206, 108, 108);
			contentPanel.add(Foto1);
		}
		{
			Foto2 = new JLabel("");
			Foto2.setBackground(Color.BLACK);
			Foto2.setBounds(174, 206, 108, 108);
			contentPanel.add(Foto2);
		}
		{
			Foto3 = new JLabel("");
			Foto3.setBackground(Color.BLACK);
			Foto3.setBounds(341, 206, 108, 108);
			contentPanel.add(Foto3);
		}
		{
			Foto4 = new JLabel("");
			Foto4.setBackground(Color.BLACK);
			Foto4.setBounds(513, 206, 108, 108);
			contentPanel.add(Foto4);
		}
		{
			Croquis = new JLabel("");
			Croquis.setBackground(Color.BLACK);
			Croquis.setBounds(10, 347, 108, 108);
			contentPanel.add(Croquis);
		}
		
		JButton btnFt1 = new JButton("Foto1");
		btnFt1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				adjuntarArchivo(btnFt1, Foto1 , 0);
			}
		});
		btnFt1.setBounds(132, 208, 24, 23);
		contentPanel.add(btnFt1);
		{
			JButton btnFt2 = new JButton("Foto2");
			btnFt2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					adjuntarArchivo(btnFt2, Foto2 , 1);
				}
			});
			btnFt2.setBounds(291, 208, 24, 23);
			contentPanel.add(btnFt2);
		}
		{
			JButton btnFt3 = new JButton("Foto3");
			btnFt3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					adjuntarArchivo(btnFt3, Foto3 , 2);
				}
			});
			btnFt3.setBounds(462, 208, 24, 23);
			contentPanel.add(btnFt3);
		}
		{
			JButton btnFt4 = new JButton("Foto4");
			btnFt4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					adjuntarArchivo(btnFt4, Foto4 , 3);
				}
			});
			btnFt4.setBounds(630, 208, 24, 23);
			contentPanel.add(btnFt4);
		}
		{
			JButton btnCroquis = new JButton("Croquis");
			btnCroquis.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					adjuntarArchivo(btnCroquis, Croquis , 4);
				}
			});
			btnCroquis.setBounds(132, 349, 24, 23);
			contentPanel.add(btnCroquis);
		}
		{
			JLabel lblFoto1Label = new JLabel("Foto1");
			lblFoto1Label.setBounds(10, 192, 46, 14);
			contentPanel.add(lblFoto1Label);
		}
		{
			JLabel lblFoto2Label = new JLabel("Foto 2");
			lblFoto2Label.setBounds(174, 189, 46, 14);
			contentPanel.add(lblFoto2Label);
		}
		{
			JLabel lblFoto3Label = new JLabel("Foto 3");
			lblFoto3Label.setBounds(343, 190, 46, 14);
			contentPanel.add(lblFoto3Label);
		}
		{
			JLabel lblFoto4Label = new JLabel("Foto 4");
			lblFoto4Label.setBounds(512, 189, 46, 14);
			contentPanel.add(lblFoto4Label);
		}
		{
			JLabel lblCrqsLabel = new JLabel("Croquis");
			lblCrqsLabel.setBounds(10, 329, 46, 14);
			contentPanel.add(lblCrqsLabel);
		}
		
		JPanel panelAux1 = new JPanel();
		panelAux1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panelAux1.setBackground(SystemColor.menu);
		panelAux1.setBounds(10, 206, 108, 108);
		contentPanel.add(panelAux1);
		
		JPanel panelAux2 = new JPanel();
		panelAux2.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panelAux2.setBackground(SystemColor.menu);
		panelAux2.setBounds(174, 206, 108, 108);
		contentPanel.add(panelAux2);
		
		JPanel panelAux3 = new JPanel();
		panelAux3.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panelAux3.setBackground(SystemColor.menu);
		panelAux3.setBounds(341, 206, 108, 108);
		contentPanel.add(panelAux3);
		
		JPanel panelAux4 = new JPanel();
		panelAux4.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panelAux4.setBackground(SystemColor.menu);
		panelAux4.setBounds(513, 206, 108, 108);
		contentPanel.add(panelAux4);
		
		JPanel panelAux5 = new JPanel();
		panelAux5.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panelAux5.setBackground(SystemColor.menu);
		panelAux5.setBounds(10, 347, 108, 108);
		contentPanel.add(panelAux5);
		{
			JLabel lblCarriles = new JLabel("¿Cuantos carriles de transito habia en la ruta del asegurado?");
			lblCarriles.setBounds(195, 332, 346, 14);
			contentPanel.add(lblCarriles);
		}
		{
			textCarriles = new JTextField();
			textCarriles.setBounds(551, 329, 29, 20);
			contentPanel.add(textCarriles);
			textCarriles.setColumns(10);
		}
		{
			JLabel lblVelocidad = new JLabel("¿Cual era la velocidad del asegurado?: ");
			lblVelocidad.setBounds(195, 362, 248, 14);
			contentPanel.add(lblVelocidad);
		}
		{
			textVelocidad = new JTextField();
			textVelocidad.setBounds(421, 359, 35, 20);
			contentPanel.add(textVelocidad);
			textVelocidad.setColumns(10);
		}
		{
			JLabel lblKmXhora = new JLabel("Km/h");
			lblKmXhora.setBounds(464, 362, 46, 14);
			contentPanel.add(lblKmXhora);
		}
		{
			JLabel lblAmbulancia = new JLabel("¿Participacion de la ambulancia?");
			lblAmbulancia.setBounds(195, 389, 204, 14);
			contentPanel.add(lblAmbulancia);
		}
		{
			comboBoxAmSiNo = new JComboBox();
			comboBoxAmSiNo.setModel(new DefaultComboBoxModel(SiNo));
			comboBoxAmSiNo.setBounds(390, 384, 46, 22);
			contentPanel.add(comboBoxAmSiNo);
		}
		{
			JLabel lblCualAm = new JLabel("¿Cual?");
			lblCualAm.setBounds(447, 389, 46, 14);
			contentPanel.add(lblCualAm);
		}
		{
			textAmCual = new JTextField();
			textAmCual.setBounds(503, 386, 118, 20);
			contentPanel.add(textAmCual);
			textAmCual.setColumns(10);
		}
		{
			JLabel lblPolicial = new JLabel("¿Intervencion Policial?");
			lblPolicial.setBounds(195, 414, 142, 14);
			contentPanel.add(lblPolicial);
		}
		{
			comboBoxPolSiNo = new JComboBox();
			comboBoxPolSiNo.setModel(new DefaultComboBoxModel(SiNo));
			comboBoxPolSiNo.setBounds(330, 410, 46, 22);
			contentPanel.add(comboBoxPolSiNo);
		}
		{
			JLabel lblSumario = new JLabel("Sumario");
			lblSumario.setBounds(393, 414, 62, 14);
			contentPanel.add(lblSumario);
		}
		{
			textSumario = new JTextField();
			textSumario.setBounds(453, 411, 168, 20);
			contentPanel.add(textSumario);
			textSumario.setColumns(10);
		}
		{
			JLabel lblCuasaPenal = new JLabel("¿Causa Penal?");
			lblCuasaPenal.setBounds(195, 439, 108, 14);
			contentPanel.add(lblCuasaPenal);
		}
		{
			comboBoxPenalSiNo = new JComboBox();
			comboBoxPenalSiNo.setModel(new DefaultComboBoxModel(SiNo));
			comboBoxPenalSiNo.setBounds(291, 435, 46, 22);
			contentPanel.add(comboBoxPenalSiNo);
		}
		{
			JLabel lblTestigos = new JLabel("¿Existen testigos del accidente?");
			lblTestigos.setBounds(353, 439, 188, 14);
			contentPanel.add(lblTestigos);
		}
		{
			comboBoxTestigos = new JComboBox();
			comboBoxTestigos.setModel(new DefaultComboBoxModel(SiNo));
			comboBoxTestigos.setBounds(540, 435, 46, 22);
			contentPanel.add(comboBoxTestigos);
		}
		{
			JLabel lblTestigo1 = new JLabel("Testigos 1");
			lblTestigo1.setBounds(24, 468, 67, 14);
			contentPanel.add(lblTestigo1);
		}
		{
			textTestigo1 = new JTextField();
			textTestigo1.setBounds(91, 465, 128, 20);
			contentPanel.add(textTestigo1);
			textTestigo1.setColumns(10);
		}
		{
			JLabel lblTestigo2 = new JLabel("Testigos 2");
			lblTestigo2.setBounds(242, 467, 67, 14);
			contentPanel.add(lblTestigo2);
		}
		{
			textTestigo2 = new JTextField();
			textTestigo2.setColumns(10);
			textTestigo2.setBounds(309, 464, 128, 20);
			contentPanel.add(textTestigo2);
		}
		{
			JLabel lblTestigo3 = new JLabel("Testigos 3");
			lblTestigo3.setBounds(469, 467, 67, 14);
			contentPanel.add(lblTestigo3);
		}
		{
			textTestigo3 = new JTextField();
			textTestigo3.setColumns(10);
			textTestigo3.setBounds(536, 464, 128, 20);
			contentPanel.add(textTestigo3);
		}
		
		JLabel lblPais = new JLabel("Pais:");
		lblPais.setBounds(268, 112, 46, 14);
		contentPanel.add(lblPais);
		
		comboBoxPais = new JComboBox();
		comboBoxPais.setModel(new DefaultComboBoxModel(new String[] {"", "Argentina", "Brasil", "Chile", "Paraguay", "Uruguay"}));
		comboBoxPais.setBounds(309, 108, 83, 22);
		contentPanel.add(comboBoxPais);
		{
			JLabel lblJurridicion = new JLabel("Jurridiccion:");
			lblJurridicion.setBounds(432, 113, 87, 14);
			contentPanel.add(lblJurridicion);
		}
		{
			comboBoxJuridicc = new JComboBox();
			comboBoxJuridicc.setModel(new DefaultComboBoxModel(new String[] {"", "Cdad autonoma Bs As", "Cordoba", "Lomas de Zamora", "Mendoza ", "Moron ", "Quilmes", "San Isidro", "Santa Fe", "Resto de Bs As", "Resto del interior"}));
			comboBoxJuridicc.setBounds(513, 108, 189, 22);
			contentPanel.add(comboBoxJuridicc);
		}
		
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						ok();
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						setVisible(false);
					}
				});
				buttonPane.add(cancelButton);
			}
		}
	}

	

	private int getIndex(String valor, String[] x) {
		int cont = 0;
		
		for(String i : x) {
			if (i.equalsIgnoreCase(valor)) 
				break;
			cont++;
		}
		
		return cont;
	}



	private void ok() {

		ObservacionesSini subventana = new ObservacionesSini();
		
		subventana.setModal(true);
		subventana.setVisible(true);
		
		setVisible(false);
		
		obsVariables(subventana);
	}

	private void obsVariables(ObservacionesSini subventana) {
		indm = subventana.getTextIndmn();
		honorarios = subventana.getTextHonorarios();
		
		verAs = subventana.getTextAreaAsegurado();
		verTer = subventana.getTextAreaTercero();
		mecanica = subventana.getTextAreaMecanica();
		observaciones = subventana.getTextAreaObservaciones();
		cobertura = subventana.getComboBoxCobertura();
		fraude = subventana.getComboBoxFraude();
		anCobertura = subventana.getTextAreaCob();
		respns = subventana.getComboBoxResp();
		porcentajeResp = subventana.getComboBoxPorcentaje();
		anResp = subventana.getTextAreaResp();
		conclu = subventana.getTextAreaConclu();
		transable = subventana.getComboBoxTransable();
		moneda = subventana.getComboBoxMoneda();
	}
	private void adjuntarArchivo(JButton botton, JLabel marco, int pos) {
		fcDoc1 = new JFileChooser();
		FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos de imagen", "jpg", "jpeg", "png", "gif");
		fcDoc1.setFileFilter(filter);
		
		int selecionar = fcDoc1.showOpenDialog(botton);
		
		if (selecionar == JFileChooser.APPROVE_OPTION) {
           String Ruta = fcDoc1.getSelectedFile().getPath();
           fotos.add(pos, Ruta);
            
	       Image mImagen = new ImageIcon(Ruta).getImage();
	       ImageIcon mIcono = new ImageIcon(mImagen.getScaledInstance(marco.getWidth(), marco.getHeight(), Image.SCALE_SMOOTH));
	       marco.setIcon(mIcono); 
            
        }
		
	}

	private String[] crearArrayHora() {
		// TODO Auto-generated method stub
		String[] retorno = new String[25];
		retorno[0] = "";
		for(int i = 0; i < 24; i++) {
			retorno[i+1] = Integer.toString(i);
		}
		return retorno;
	}

	public Date getFecha() {
		return calendarioFecha.getDate();
	}
	public String getHr() {
		return comboBoxHora.getSelectedItem().toString();
	} 
	public String getMin() {
		return comboBoxMinuto.getSelectedItem().toString();
	}
	
	private String getTextCalle() {
		return textCalle.getText();
	}

	private int getTextNumero() {
		return Integer.parseInt(textNumero.getText());
	}

	private String getTextLocalidad() {
		return textLocalidad.getText();
	}

	private int getTextCarriles() {
		return Integer.parseInt(textCarriles.getText());
	}

	private int getTextVelocidad() {
		return Integer.parseInt(textVelocidad.getText());
	}

	private String getTextAmCual() {
		return textAmCual.getText();
	}

	private String getTextSumario() {
		return textSumario.getText();
	}

	public String getTextTestigo1() {
		return textTestigo1.getText();
	}

	private String getTextTestigo2() {
		return textTestigo2.getText();
	}

	private String getTextTestigo3() {
		return textTestigo3.getText();
	}
	
	public String[] getTestigos() {
		testigos = new String[3];
		if (getTextTestigo1() != "")
			testigos[0] = getTextTestigo1();
		if (getTextTestigo2() != "")
			testigos[1] = getTextTestigo2();
		if (getTextTestigo3() != "")
			testigos[2] = getTextTestigo3();
		return testigos;
	}	

	private String getComboBoxAmSiNo() {
		return comboBoxAmSiNo.getSelectedItem().toString();
	}

	public String getComboBoxTiempo() {
		return comboBoxTiempo.getSelectedItem().toString();
	}

	public String getComboBoxEstado() {
		return comboBoxEstado.getSelectedItem().toString();
	}

	private String getComboBoxProv() {
		return comboBoxProv.getSelectedItem().toString();
	}

	private String getComboBoxVisibilidad() {
		return comboBoxVisibilidad.getSelectedItem().toString();
	}

	private String getComboBoxAmbiente() {
		return comboBoxAmbiente.getSelectedItem().toString();
	}

	private String getComboBoxiluminacion() {
		return comboBoxiluminacion.getSelectedItem().toString();
	}

	public String getComboBoxPenalSiNo() {
		return comboBoxPenalSiNo.getSelectedItem().toString();
	}

	public String getComboBoxTestigos() {
		return comboBoxTestigos.getSelectedItem().toString();
	}
	private String getPais() {
		return comboBoxPais.getSelectedItem().toString();
	}
	private String getJuridicc(){
		return comboBoxJuridicc.getSelectedItem().toString();
	}
	private String getPolicia() {
		return comboBoxPolSiNo.getSelectedItem().toString();
	}

	public Lugar getLugar() {
		lugar = new Lugar();
		
		lugar.setCalle(getTextCalle());
		lugar.setNumero(getTextNumero());
		lugar.setLocalidad(getTextLocalidad());
		lugar.setProvincia(getComboBoxProv());
		lugar.setPais(getPais());
		lugar.setJurridicion(getJuridicc());
		lugar.setVisibilidad(getComboBoxVisibilidad());
		lugar.setAmbiente(getComboBoxAmbiente());
		lugar.setIluminacion(getComboBoxiluminacion());
		lugar.setCarriles(getTextCarriles());
		lugar.setVelocidad(getTextVelocidad());
		lugar.setAmbulancia(getComboBoxAmSiNo());
		lugar.setDescAmbulancia(getTextAmCual());
		lugar.setPolicia(getPolicia());
		lugar.setSumario(getTextSumario());
		
		return lugar;
	}
	
	public int getIndm() {
		return indm;
	}

	public int getHonorarios() {
		return honorarios;
	}

	public String getVerAs() {
		return verAs;
	}

	public String getVerTer() {
		return verTer;
	}

	public String getMecanica() {
		return mecanica;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public String getCobertura() {
		return cobertura;
	}

	public String getFraude() {
		return fraude;
	}

	public String getAnCobertura() {
		return anCobertura;
	}

	public String getRespns() {
		return respns;
	}

	public String getPorcentajeResp() {
		return porcentajeResp;
	}

	public String getAnResp() {
		return anResp;
	}

	public String getConclu() {
		return conclu;
	}

	public String getTransable() {
		return transable;
	}

	public String getMoneda() {
		return moneda;
	}

	public ArrayList<String> getFotos() {
		return fotos;
	}
	
}
