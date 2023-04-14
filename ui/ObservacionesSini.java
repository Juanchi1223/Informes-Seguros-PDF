package ui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;

public class ObservacionesSini extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ObservacionesSini dialog = new ObservacionesSini();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public ObservacionesSini() {
		setTitle("Observaciones");
		setBounds(100, 100, 690, 572);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblVerAsegurado = new JLabel("Version del asegurado:");
		lblVerAsegurado.setBounds(20, 21, 131, 14);
		contentPanel.add(lblVerAsegurado);
		
		JScrollPane scrollPaneAs = new JScrollPane();
		scrollPaneAs.setBounds(20, 36, 289, 73);
		contentPanel.add(scrollPaneAs);
		
		JTextArea textAreaAsegurado = new JTextArea();
		textAreaAsegurado.setLineWrap(true);
		scrollPaneAs.setViewportView(textAreaAsegurado);
		
		JLabel lblVerTercero = new JLabel("Version de un tercero:");
		lblVerTercero.setBounds(336, 22, 131, 14);
		contentPanel.add(lblVerTercero);
		
		JLabel lblMecanica = new JLabel("Mecanica de Accidente:");
		lblMecanica.setBounds(20, 123, 174, 14);
		contentPanel.add(lblMecanica);
		
		JScrollPane scrollPaneTercero = new JScrollPane();
		scrollPaneTercero.setBounds(336, 36, 293, 73);
		contentPanel.add(scrollPaneTercero);
		
		JTextArea textAreaTercero = new JTextArea();
		scrollPaneTercero.setViewportView(textAreaTercero);
		
		JScrollPane scrollPaneMec = new JScrollPane();
		scrollPaneMec.setBounds(20, 137, 289, 73);
		contentPanel.add(scrollPaneMec);
		
		JTextArea textAreaMecanica = new JTextArea();
		scrollPaneMec.setViewportView(textAreaMecanica);
		
		JLabel lblObservaciones = new JLabel("Observaciones:");
		lblObservaciones.setBounds(336, 123, 168, 14);
		contentPanel.add(lblObservaciones);
		
		JScrollPane scrollPaneObservaciones = new JScrollPane();
		scrollPaneObservaciones.setBounds(336, 137, 289, 73);
		contentPanel.add(scrollPaneObservaciones);
		
		JTextArea textAreaObservaciones = new JTextArea();
		scrollPaneObservaciones.setViewportView(textAreaObservaciones);
		
		JLabel lblCobertura = new JLabel("Cobertura:");
		lblCobertura.setBounds(20, 221, 72, 14);
		contentPanel.add(lblCobertura);
		
		JComboBox comboBoxCobertura = new JComboBox();
		comboBoxCobertura.setModel(new DefaultComboBoxModel(new String[] {"", "Cubierto", "Sin Cobertura", "Dudosa"}));
		comboBoxCobertura.setBounds(83, 217, 93, 22);
		contentPanel.add(comboBoxCobertura);
		
		JLabel lblIndicosFraude = new JLabel("Indicios de fraude");
		lblIndicosFraude.setBounds(186, 221, 108, 14);
		contentPanel.add(lblIndicosFraude);
		
		JComboBox comboBoxFraude = new JComboBox();
		comboBoxFraude.setModel(new DefaultComboBoxModel(new String[] {"", "Si", "No"}));
		comboBoxFraude.setBounds(298, 218, 48, 22);
		contentPanel.add(comboBoxFraude);
		
		JLabel lblAnalicizCob = new JLabel("Analizic de cobertura:");
		lblAnalicizCob.setBounds(20, 250, 131, 14);
		contentPanel.add(lblAnalicizCob);
		
		JScrollPane scrollPaneAnaCob = new JScrollPane();
		scrollPaneAnaCob.setBounds(20, 266, 289, 73);
		contentPanel.add(scrollPaneAnaCob);
		
		JTextArea textAreaCob = new JTextArea();
		scrollPaneAnaCob.setViewportView(textAreaCob);
		
		JLabel lblResponsabilidad = new JLabel("Responsabilidad");
		lblResponsabilidad.setBounds(357, 221, 110, 14);
		contentPanel.add(lblResponsabilidad);
		
		JComboBox comboBoxResp = new JComboBox();
		comboBoxResp.setModel(new DefaultComboBoxModel(new String[] {"", "Plena", "Concurrencia  reclamante", "Concurrencia codemandado", "Nula"}));
		comboBoxResp.setBounds(458, 217, 196, 22);
		contentPanel.add(comboBoxResp);
		
		JComboBox comboBoxPorcentaje = new JComboBox();
		comboBoxPorcentaje.setModel(new DefaultComboBoxModel(new String[] {"", "25", "50", "75"}));
		comboBoxPorcentaje.setBounds(568, 242, 47, 22);
		contentPanel.add(comboBoxPorcentaje);
		
		JLabel lblPorcentaje = new JLabel("%");
		lblPorcentaje.setBounds(625, 246, 29, 14);
		contentPanel.add(lblPorcentaje);
		
		JScrollPane scrollPaneResp = new JScrollPane();
		scrollPaneResp.setBounds(340, 266, 289, 73);
		contentPanel.add(scrollPaneResp);
		
		JTextArea textAreaResp = new JTextArea();
		scrollPaneResp.setViewportView(textAreaResp);
		
		JLabel lblAnalizicDeResponsabilidad = new JLabel("Analizic de responsabilidad:");
		lblAnalizicDeResponsabilidad.setBounds(340, 251, 196, 14);
		contentPanel.add(lblAnalizicDeResponsabilidad);
		
		JLabel lblConcluciones = new JLabel("Concluciones:");
		lblConcluciones.setBounds(20, 350, 131, 14);
		contentPanel.add(lblConcluciones);
		
		JScrollPane scrollPaneConclu = new JScrollPane();
		scrollPaneConclu.setBounds(20, 366, 609, 73);
		contentPanel.add(scrollPaneConclu);
		
		JTextArea textAreaConclu = new JTextArea();
		scrollPaneConclu.setViewportView(textAreaConclu);
		
		JLabel lblTransable = new JLabel("¿El caso es transable?");
		lblTransable.setBounds(20, 450, 144, 14);
		contentPanel.add(lblTransable);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"", "Si", "En negociacion", "No por Abg no negocia", "No por cobertura", "No por fraude", "No por pred. desmedida", "No por responsabilidad", "Transado", "Otro"}));
		comboBox.setBounds(157, 446, 160, 22);
		contentPanel.add(comboBox);
		
		JLabel lblIdnSug = new JLabel("Res. Indemnicacion Sugerida");
		lblIdnSug.setBounds(323, 450, 181, 14);
		contentPanel.add(lblIdnSug);
		
		JComboBox comboBoxPorcentaje_1 = new JComboBox();
		comboBoxPorcentaje_1.setModel(new DefaultComboBoxModel(new String[] {"", "$ARG", "U$S"}));
		comboBoxPorcentaje_1.setBounds(493, 446, 68, 22);
		contentPanel.add(comboBoxPorcentaje_1);
		
		textField = new JTextField();
		textField.setBounds(568, 446, 86, 20);
		contentPanel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(568, 475, 86, 20);
		contentPanel.add(textField_1);
		
		JLabel lblHonoGast = new JLabel("Honorarios + gastos");
		lblHonoGast.setBounds(435, 478, 126, 14);
		contentPanel.add(lblHonoGast);
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
