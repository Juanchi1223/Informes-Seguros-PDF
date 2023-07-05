package ui.InformacionSiniestro;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import empresa.InformacionSiniestro;

import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;

public class ObservacionesSini extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textIndmn;
	private JTextField textHonorarios;
	private JTextArea textAreaAsegurado;
	private JTextArea textAreaTercero;
	private JTextArea textAreaMecanica;
	private JTextArea textAreaObservaciones;
	private JComboBox comboBoxCobertura;
	private JComboBox comboBoxFraude;
	private JTextArea textAreaCob;
	private JComboBox comboBoxResp;
	private JComboBox comboBoxPorcentaje;
	private JTextArea textAreaResp;
	private JTextArea textAreaConclu;
	private JComboBox comboBoxTransable;
	private JComboBox comboBoxMoneda;

	/**
	 * Launch the application.
	 
	public static void main(String[] args) {
		try {
			ObservacionesSini dialog = new ObservacionesSini();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	 */
	public ObservacionesSini(InformacionSiniestro contrato) {
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
		
		textAreaAsegurado = new JTextArea();
		textAreaAsegurado.setLineWrap(true);
		if (contrato.getVersionAsegurado() != null && contrato.getVersionAsegurado() != "")
			textAreaAsegurado.setText(contrato.getVersionAsegurado());
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
		
		textAreaTercero = new JTextArea();
		textAreaTercero.setLineWrap(true);
		if (contrato.getVersionTercero() != null && contrato.getVersionTercero() != "")
			textAreaTercero.setText(contrato.getVersionTercero());
		scrollPaneTercero.setViewportView(textAreaTercero);
		
		JScrollPane scrollPaneMec = new JScrollPane();
		scrollPaneMec.setBounds(20, 137, 289, 73);
		contentPanel.add(scrollPaneMec);
		
		textAreaMecanica = new JTextArea();
		textAreaMecanica.setLineWrap(true);
		if (contrato.getMecanicaAccidente() != null && contrato.getMecanicaAccidente() != "")
			textAreaMecanica.setText(contrato.getMecanicaAccidente());
		scrollPaneMec.setViewportView(textAreaMecanica);
		
		JLabel lblObservaciones = new JLabel("Observaciones:");
		lblObservaciones.setBounds(336, 123, 168, 14);
		contentPanel.add(lblObservaciones);
		
		JScrollPane scrollPaneObservaciones = new JScrollPane();
		scrollPaneObservaciones.setBounds(336, 137, 289, 73);
		contentPanel.add(scrollPaneObservaciones);
		
		textAreaObservaciones = new JTextArea();
		textAreaObservaciones.setLineWrap(true);
		if (contrato.getObservaciones() != null && contrato.getObservaciones() != "")
			textAreaObservaciones.setText(contrato.getObservaciones());
		scrollPaneObservaciones.setViewportView(textAreaObservaciones);
		
		JLabel lblCobertura = new JLabel("Cobertura:");
		lblCobertura.setBounds(20, 221, 72, 14);
		contentPanel.add(lblCobertura);
		
		comboBoxCobertura = new JComboBox();
		String[] valorCob = {"", "Cubierto", "Sin Cobertura", "Dudosa"};
		comboBoxCobertura.setModel(new DefaultComboBoxModel(valorCob));
		comboBoxCobertura.setBounds(83, 217, 93, 22);
		if (contrato.getCobertura() != null && contrato.getCobertura() != "")
			comboBoxCobertura.setSelectedIndex(getIndex(contrato.getCobertura(), valorCob));
		contentPanel.add(comboBoxCobertura);
		
		JLabel lblIndicosFraude = new JLabel("Indicios de fraude");
		lblIndicosFraude.setBounds(186, 221, 108, 14);
		contentPanel.add(lblIndicosFraude);
		
		comboBoxFraude = new JComboBox();
		String[] SiNo = {"", "Si", "No"};
		comboBoxFraude.setModel(new DefaultComboBoxModel(SiNo));
		comboBoxFraude.setBounds(298, 218, 48, 22);
		if (contrato.getIndiciosFraude() != null && contrato.getIndiciosFraude() != "")
			comboBoxFraude.setSelectedIndex(getIndex(contrato.getIndiciosFraude(), SiNo));
		contentPanel.add(comboBoxFraude);
		
		JLabel lblAnalicizCob = new JLabel("Analizic de cobertura:");
		lblAnalicizCob.setBounds(20, 250, 131, 14);
		contentPanel.add(lblAnalicizCob);
		
		JScrollPane scrollPaneAnaCob = new JScrollPane();
		scrollPaneAnaCob.setBounds(20, 266, 289, 73);
		contentPanel.add(scrollPaneAnaCob);
		
		textAreaCob = new JTextArea();
		textAreaCob.setLineWrap(true);
		if(contrato.getAnalisis() != null && contrato.getAnalisis() != "")
			textAreaCob.setText(contrato.getAnalisis());
		scrollPaneAnaCob.setViewportView(textAreaCob);
		
		JLabel lblResponsabilidad = new JLabel("Responsabilidad");
		lblResponsabilidad.setBounds(357, 221, 110, 14);
		contentPanel.add(lblResponsabilidad);
		
		comboBoxResp = new JComboBox();
		String[] valorResp = {"", "Plena", "Concurrencia  reclamante", "Concurrencia codemandado", "Nula"};
		comboBoxResp.setModel(new DefaultComboBoxModel(valorResp));
		comboBoxResp.setBounds(458, 217, 196, 22);
		if(contrato.getResponsabilidad() != null && contrato.getResponsabilidad() != "")
			comboBoxResp.setSelectedIndex(getIndex(contrato.getResponsabilidad(), valorResp));
		contentPanel.add(comboBoxResp);
		
		comboBoxPorcentaje = new JComboBox();
		String[] valorPorc = {"", "25", "50", "75"};
		comboBoxPorcentaje.setModel(new DefaultComboBoxModel(valorPorc));
		comboBoxPorcentaje.setBounds(568, 242, 47, 22);
		if (contrato.getPorcentajeresponsabilidad() != null && contrato.getPorcentajeresponsabilidad() != "")
			comboBoxPorcentaje.setSelectedIndex(getIndex(contrato.getPorcentajeresponsabilidad(), valorPorc));
		contentPanel.add(comboBoxPorcentaje);
		
		JLabel lblPorcentaje = new JLabel("%");
		lblPorcentaje.setBounds(625, 246, 29, 14);
		contentPanel.add(lblPorcentaje);
		
		JScrollPane scrollPaneResp = new JScrollPane();
		scrollPaneResp.setBounds(340, 266, 289, 73);
		contentPanel.add(scrollPaneResp);
		
		textAreaResp = new JTextArea();
		textAreaResp.setLineWrap(true);
		if (contrato.getDescResponsabilidad() != null && contrato.getDescResponsabilidad() != "")
			textAreaResp.setText(contrato.getDescResponsabilidad());
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
		
		textAreaConclu = new JTextArea();
		textAreaConclu.setLineWrap(true);
		if (contrato.getConcluciones() != null && contrato.getConcluciones() != "")
			textAreaConclu.setText(contrato.getConcluciones());
		scrollPaneConclu.setViewportView(textAreaConclu);
		
		JLabel lblTransable = new JLabel("¿El caso es transable?");
		lblTransable.setBounds(20, 450, 144, 14);
		contentPanel.add(lblTransable);
		
		comboBoxTransable = new JComboBox();
		String[] valorTransable = {"", "Si", "En negociacion", "No por Abg no negocia", "No por cobertura", "No por fraude", "No por pred. desmedida", "No por responsabilidad", "Transado", "Otro"};
		comboBoxTransable.setModel(new DefaultComboBoxModel(valorTransable));
		comboBoxTransable.setBounds(157, 446, 160, 22);
		if (contrato.getTransable() != null && contrato.getTransable() != "")
			comboBoxTransable.setSelectedIndex(getIndex(contrato.getTransable(), valorTransable));
		contentPanel.add(comboBoxTransable);
		
		JLabel lblIdnSug = new JLabel("Res. Indemnicacion Sugerida");
		lblIdnSug.setBounds(323, 450, 181, 14);
		contentPanel.add(lblIdnSug);
		
		comboBoxMoneda = new JComboBox();
		String[] valorMoneda =  {"", "$ARG", "U$S"};
		comboBoxMoneda.setModel(new DefaultComboBoxModel(valorMoneda));
		comboBoxMoneda.setBounds(493, 446, 68, 22);
		if(contrato.getMoneda() != null && contrato.getMoneda() != "")
			comboBoxMoneda.setSelectedIndex(getIndex(contrato.getMoneda(), valorMoneda));
		contentPanel.add(comboBoxMoneda);
		
		textIndmn = new JTextField();
		textIndmn.setBounds(568, 446, 86, 20);
		if (contrato.getIndemnizacion() != 0)
			textIndmn.setText(Integer.toString(contrato.getIndemnizacion()));
		contentPanel.add(textIndmn);
		textIndmn.setColumns(10);
		
		textHonorarios = new JTextField();
		textHonorarios.setColumns(10);
		textHonorarios.setBounds(568, 475, 86, 20);
		if (contrato.getHonorariosGastos() != 0)
			textHonorarios.setText(Integer.toString(contrato.getHonorariosGastos()));
		contentPanel.add(textHonorarios);
		
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
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						ok();
					}
				});
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						cancel();
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
		setVisible(false);
	}
	
	protected void cancel() {
		setVisible(false);
	}


	public int getTextIndmn() {
		if (textIndmn.getText().isEmpty())
			return 0;
		return Integer.parseInt(textIndmn.getText());
	}

	public int getTextHonorarios() {
		if (textHonorarios.getText().isEmpty())
			return 0;
		return Integer.parseInt(textHonorarios.getText());
	}

	public String getTextAreaAsegurado() {
		return textAreaAsegurado.getText();
	}

	public String getTextAreaTercero() {
		return textAreaTercero.getText();
	}

	public String getTextAreaMecanica() {
		return textAreaMecanica.getText();
	}

	public String getTextAreaObservaciones() {
		return textAreaObservaciones.getText();
	}

	public String getComboBoxCobertura() {
		return comboBoxCobertura.getSelectedItem().toString();
	}

	public String getComboBoxFraude() {
		return comboBoxFraude.getSelectedItem().toString();
	}

	public String getTextAreaCob() {
		return textAreaCob.getText();
	}

	public String getComboBoxResp() {
		return comboBoxResp.getSelectedItem().toString();
	}

	public String getComboBoxPorcentaje() {
		return comboBoxPorcentaje.getSelectedItem().toString();
	}

	public String getTextAreaResp() {
		return textAreaResp.getText();
	}

	public String getTextAreaConclu() {
		return textAreaConclu.getText();
	}

	public String getComboBoxTransable() {
		return comboBoxTransable.getSelectedItem().toString();
	}

	public String getComboBoxMoneda() {
		return comboBoxMoneda.getSelectedItem().toString();
	}
}
