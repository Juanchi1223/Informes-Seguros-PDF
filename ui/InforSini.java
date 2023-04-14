package ui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.toedter.calendar.JCalendar;

import empresa.InformacionSiniestro;

import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JTextArea;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.CardLayout;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.Date;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.border.TitledBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;

public class InforSini extends JDialog {

	private final JPanel contentPanel = new JPanel();
	
	private JCalendar calendarioFecha;
	private JTextField textCalle;
	private JTextField textNumero;
	private JTextField textField;
	private JTextField textCarriles;
	private JTextField textVelocidad;
	private JTextField textAmCual;
	private JTextField textSumario;
	private JTextField textTestigo1;
	private JTextField textTestigo2;
	private JTextField textTestigo3;
	private JLabel lblCalle;
	private String[] SiNo = {"","Si","No"};

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
		setBounds(100, 100, 690, 572);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblFecha = new JLabel("Fecha:");
		lblFecha.setBounds(10, 25, 46, 14);
		contentPanel.add(lblFecha);
		
		calendarioFecha = new JCalendar();
//		if(objeto.getFechaOcurencia() != null)
//			calendarioFecha.setDate(objeto.getFechaOcurencia());
		calendarioFecha.setBounds(58, 25, 200, 153);
		contentPanel.add(calendarioFecha);
		{
			JLabel lblHora = new JLabel("Hora:");
			lblHora.setBounds(268, 25, 46, 14);
			contentPanel.add(lblHora);
		}
		
		JComboBox comboBoxHora = new JComboBox();
		comboBoxHora.setModel(new DefaultComboBoxModel(crearArrayHora()));
		comboBoxHora.setBounds(309, 21, 40, 22);
		contentPanel.add(comboBoxHora);
		{
			JLabel lblMinuto = new JLabel(":");
			lblMinuto.setBounds(353, 25, 11, 14);
			contentPanel.add(lblMinuto);
		}
		{
			JComboBox comboBoxMinuto = new JComboBox();
			comboBoxMinuto.setModel(new DefaultComboBoxModel(new String[] {"", "00", "15", "30", "45"}));
			comboBoxMinuto.setBounds(359, 21, 40, 22);
			contentPanel.add(comboBoxMinuto);
		}
		{
			JLabel lblTiempo = new JLabel("Tiempo:");
			lblTiempo.setBounds(409, 25, 46, 14);
			contentPanel.add(lblTiempo);
		}
		{
			JComboBox comboBoxTiempo = new JComboBox();
			comboBoxTiempo.setModel(new DefaultComboBoxModel(new String[] {"", "Diurno", "Nocturno"}));
			comboBoxTiempo.setBounds(463, 21, 78, 22);
			contentPanel.add(comboBoxTiempo);
		}
		{
			JLabel lblEstado = new JLabel("Estado:");
			lblEstado.setBounds(543, 24, 46, 14);
			contentPanel.add(lblEstado);
		}
		{
			JComboBox comboBoxEstado = new JComboBox();
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
			textCalle.setBounds(309, 50, 150, 20);
			contentPanel.add(textCalle);
			textCalle.setColumns(10);
		}
		{
			JLabel lblNumero = new JLabel("Numero:");
			lblNumero.setBounds(470, 53, 61, 14);
			contentPanel.add(lblNumero);
		}
		{
			textNumero = new JTextField();
			textNumero.setBounds(526, 50, 86, 20);
			contentPanel.add(textNumero);
			textNumero.setColumns(10);
		}
		{
			JLabel lblLocalidad = new JLabel("Localidad:");
			lblLocalidad.setBounds(268, 85, 69, 14);
			contentPanel.add(lblLocalidad);
		}
		
		textField = new JTextField();
		textField.setBounds(335, 81, 108, 20);
		contentPanel.add(textField);
		textField.setColumns(10);
		
		JLabel lblProvincia = new JLabel("Provincia:");
		lblProvincia.setBounds(453, 83, 78, 14);
		contentPanel.add(lblProvincia);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"", "Buenos Aires", "Catamarca", "Chaco", "Chubut", "Córdova", "Corrientes", "Entre Rios ", "Formaso", "Jujuy", "La pampa", "La rioja", "Mendoza", "Misiones ", "Neuquen", "Rio Negro", "Salta", "San Juan", "San Luis", "Santa Cruz ", "Santa Fe", "Santiago del Estero", "Tierra del Fuego", "Tucuman"}));
		comboBox.setBounds(513, 79, 138, 22);
		contentPanel.add(comboBox);
		
		JLabel lblVisibilidad = new JLabel("Visibilidad:");
		lblVisibilidad.setBounds(268, 114, 81, 14);
		contentPanel.add(lblVisibilidad);
		
		JComboBox comboBoxVisibilidad = new JComboBox();
		comboBoxVisibilidad.setModel(new DefaultComboBoxModel(new String[] {"", "Buena", "Regular", "Mala"}));
		comboBoxVisibilidad.setBounds(335, 110, 78, 22);
		contentPanel.add(comboBoxVisibilidad);
		
		JLabel lblAmbiente = new JLabel("Ambiente:");
		lblAmbiente.setBounds(457, 114, 69, 14);
		contentPanel.add(lblAmbiente);
		
		JComboBox comboBoxAmbiente = new JComboBox();
		comboBoxAmbiente.setModel(new DefaultComboBoxModel(new String[] {"", "Rural", "Urbano"}));
		comboBoxAmbiente.setBounds(520, 110, 69, 22);
		contentPanel.add(comboBoxAmbiente);
		{
			JLabel lbliluminacion = new JLabel("Iluminacion:");
			lbliluminacion.setBounds(345, 143, 82, 14);
			contentPanel.add(lbliluminacion);
		}
		{
			JComboBox comboBoxiluminacion = new JComboBox();
			comboBoxiluminacion.setModel(new DefaultComboBoxModel(new String[] {"", "Buena", "Regular", "Mala"}));
			comboBoxiluminacion.setBounds(431, 139, 90, 22);
			contentPanel.add(comboBoxiluminacion);
		}
		{
			JLabel Foto1 = new JLabel("");
			Foto1.setBackground(SystemColor.desktop);
			Foto1.setBounds(10, 206, 108, 108);
			contentPanel.add(Foto1);
		}
		{
			JLabel Foto2 = new JLabel("");
			Foto2.setBackground(Color.BLACK);
			Foto2.setBounds(174, 206, 108, 108);
			contentPanel.add(Foto2);
		}
		{
			JLabel Foto3 = new JLabel("");
			Foto3.setBackground(Color.BLACK);
			Foto3.setBounds(341, 206, 108, 108);
			contentPanel.add(Foto3);
		}
		{
			JLabel Foto4 = new JLabel("");
			Foto4.setBackground(Color.BLACK);
			Foto4.setBounds(513, 206, 108, 108);
			contentPanel.add(Foto4);
		}
		{
			JLabel Croquis = new JLabel("");
			Croquis.setBackground(Color.BLACK);
			Croquis.setBounds(10, 347, 108, 108);
			contentPanel.add(Croquis);
		}
		
		JButton btnFt1 = new JButton("Foto1");
		btnFt1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnFt1.setBounds(132, 208, 24, 23);
		contentPanel.add(btnFt1);
		{
			JButton btnFt2 = new JButton("Foto2");
			btnFt2.setBounds(291, 208, 24, 23);
			contentPanel.add(btnFt2);
		}
		{
			JButton btnFt3 = new JButton("Foto3");
			btnFt3.setBounds(462, 208, 24, 23);
			contentPanel.add(btnFt3);
		}
		{
			JButton btnFt4 = new JButton("Foto4");
			btnFt4.setBounds(630, 208, 24, 23);
			contentPanel.add(btnFt4);
		}
		{
			JButton btnCroquis = new JButton("Croquis");
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
			JComboBox comboBoxAmSiNo = new JComboBox();
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
			JComboBox comboBoxPolSiNo = new JComboBox();
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
			JComboBox comboBoxPenalSiNo = new JComboBox();
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
			JComboBox comboBox_1 = new JComboBox();
			comboBox_1.setModel(new DefaultComboBoxModel(SiNo));
			comboBox_1.setBounds(540, 435, 46, 22);
			contentPanel.add(comboBox_1);
		}
		{
			JLabel lblTestigo1 = new JLabel("Testigos 1");
			lblTestigo1.setBounds(21, 466, 67, 14);
			contentPanel.add(lblTestigo1);
		}
		{
			textTestigo1 = new JTextField();
			textTestigo1.setBounds(88, 463, 128, 20);
			contentPanel.add(textTestigo1);
			textTestigo1.setColumns(10);
		}
		{
			JLabel lblTestigo2 = new JLabel("Testigos 2");
			lblTestigo2.setBounds(223, 467, 67, 14);
			contentPanel.add(lblTestigo2);
		}
		{
			textTestigo2 = new JTextField();
			textTestigo2.setColumns(10);
			textTestigo2.setBounds(290, 464, 128, 20);
			contentPanel.add(textTestigo2);
		}
		{
			JLabel lblTestigo3 = new JLabel("Testigos 3");
			lblTestigo3.setBounds(427, 467, 67, 14);
			contentPanel.add(lblTestigo3);
		}
		{
			textTestigo3 = new JTextField();
			textTestigo3.setColumns(10);
			textTestigo3.setBounds(494, 464, 128, 20);
			contentPanel.add(textTestigo3);
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

	private void ok() {

		ObservacionesSini subventana = new ObservacionesSini();
		
		subventana.setModal(true);
		subventana.setVisible(true);
		
		setVisible(false);
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

	public Date getCalendarioFecha() {
		return calendarioFecha.getDate();
	}

	public JTextField getTextCalle() {
		return textCalle;
	}

	public JTextField getTextNumero() {
		return textNumero;
	}

	public JTextField getTextField() {
		return textField;
	}

	public JTextField getTextCarriles() {
		return textCarriles;
	}

	public JTextField getTextVelocidad() {
		return textVelocidad;
	}

	public JTextField getTextAmCual() {
		return textAmCual;
	}

	public JTextField getTextSumario() {
		return textSumario;
	}

	public JTextField getTextTestigo1() {
		return textTestigo1;
	}

	public JTextField getTextTestigo2() {
		return textTestigo2;
	}

	public JTextField getTextTestigo3() {
		return textTestigo3;
	}
}
