package ui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.toedter.calendar.JCalendar;

import objetos.Contrato;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class inforBasica extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textFieldSiniestro;
	private JTextField textFieldAjustadorMer;
	private JTextField textFieldLiquidadorExt;
	private JTextField textFieldResponsable;
	private JTextField textFieldEmail;
	private JTextField textPoliza;
	private JTextField textNroTel;
	private JTextField textInt;
	private JCalendar calendarioOcurecia;
	private JCalendar calendarioHasta;
	private JCalendar calendarioDerivacion;
	private JCalendar calendarioDel;
	
	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		try {
//			inforBasica dialog = new inforBasica();
//			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
//			dialog.setVisible(true);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}

	/**
	 * Create the dialog.
	 */
	public inforBasica(Contrato contrato) {
		setResizable(false);
		setTitle("Informacion Basica");
		setBounds(100, 100, 775, 539);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblSiniestro = new JLabel("Siniestro:");
		lblSiniestro.setBounds(81, 39, 65, 14);
		contentPanel.add(lblSiniestro);
		
		JLabel lblFechaOc = new JLabel("Fecha de Occurencia:");
		lblFechaOc.setBounds(11, 67, 125, 14);
		contentPanel.add(lblFechaOc);
		
		JLabel lblFechaDerivacion = new JLabel("Fecha de Derivacion:");
		lblFechaDerivacion.setBounds(11, 232, 125, 14);
		contentPanel.add(lblFechaDerivacion);
		
		JLabel lblAjustadorMer = new JLabel("Ajustador Meridional:");
		lblAjustadorMer.setBounds(23, 397, 125, 14);
		contentPanel.add(lblAjustadorMer);
		
		JLabel lblLiquidadorExt = new JLabel("Liquidador Externo:");
		lblLiquidadorExt.setBounds(31, 422, 125, 14);
		contentPanel.add(lblLiquidadorExt);
		
		JLabel lblResponsable = new JLabel("Responsable:");
		lblResponsable.setBounds(66, 447, 125, 14);
		contentPanel.add(lblResponsable);
		
		JLabel lblEmail = new JLabel("Emal:");
		lblEmail.setBounds(446, 400, 125, 14);
		contentPanel.add(lblEmail);
		
		textFieldSiniestro = new JTextField();
		if(contrato.getSiniestro() != 0)				// SE SUPONE QUE EL NUMERO DE SINIESTRO NUNCA VA A SER 0
			textFieldSiniestro.setText(Integer.toString(contrato.getSiniestro()));
		textFieldSiniestro.setBounds(146, 36, 120, 20);
		contentPanel.add(textFieldSiniestro);
		textFieldSiniestro.setColumns(10);
		
		textFieldAjustadorMer = new JTextField();
		if(contrato.getAjustadorMer() != null)
			textFieldAjustadorMer.setText(contrato.getAjustadorMer());
		textFieldAjustadorMer.setColumns(10);
		textFieldAjustadorMer.setBounds(146, 394, 120, 20);
		contentPanel.add(textFieldAjustadorMer);
		
		textFieldLiquidadorExt = new JTextField();
		if(contrato.getLiquidExt()  != null)
			textFieldLiquidadorExt.setText(contrato.getLiquidExt());
		textFieldLiquidadorExt.setColumns(10);
		textFieldLiquidadorExt.setBounds(146, 419, 120, 20);
		contentPanel.add(textFieldLiquidadorExt);
		
		textFieldResponsable = new JTextField();
		if(contrato.getResponsable() != null)
			textFieldResponsable.setText(contrato.getResponsable());
		textFieldResponsable.setColumns(10);
		textFieldResponsable.setBounds(146, 444, 120, 20);
		contentPanel.add(textFieldResponsable);
		
		textFieldEmail = new JTextField();
		if(contrato.getEmail() != null)
			textFieldEmail.setText(contrato.getEmail()); 
		textFieldEmail.setColumns(10);
		textFieldEmail.setBounds(491, 394, 202, 20);
		contentPanel.add(textFieldEmail);
		
		JLabel lblPoliza = new JLabel("Poliza:");
		lblPoliza.setBounds(446, 39, 46, 14);
		contentPanel.add(lblPoliza);
		
		JLabel lblVigenciaDesde = new JLabel("Vigencia desde:");
		lblVigenciaDesde.setBounds(391, 67, 98, 14);
		contentPanel.add(lblVigenciaDesde);
		
		calendarioDel = new JCalendar();
		if(contrato.getVigenciaIni() != null)
			calendarioDel.setDate(contrato.getVigenciaIni());
		calendarioDel.setBounds(493, 67, 200, 153);
		contentPanel.add(calendarioDel);
		
		JLabel lblTelefono = new JLabel("Tel/Fax");
		lblTelefono.setBounds(435, 422, 46, 14);
		contentPanel.add(lblTelefono);
		
		textPoliza = new JTextField();
		if(contrato.getPoliza() != 0)				// SE SUPONE QUE EL NUMERO DE SINIESTRO NUNCA VA A SER 0
			textPoliza.setText(Integer.toString(contrato.getPoliza()));
		textPoliza.setBounds(493, 36, 86, 20);
		contentPanel.add(textPoliza);
		textPoliza.setColumns(10);
		
		JLabel lblAL = new JLabel("al:");
		lblAL.setBounds(469, 232, 23, 14);
		contentPanel.add(lblAL);
		
		textNroTel = new JTextField();
		if(contrato.getTelefono() != 0)				// SE SUPONE QUE EL NUMERO DE SINIESTRO NUNCA VA A SER 0
			textNroTel.setText(Integer.toString(contrato.getTelefono()));
		textNroTel.setBounds(491, 419, 86, 20);
		contentPanel.add(textNroTel);
		textNroTel.setColumns(10);
		
		JLabel lblInt = new JLabel("Int:");
		lblInt.setBounds(582, 422, 46, 14);
		contentPanel.add(lblInt);
		
		textInt = new JTextField();
		if(contrato.getInterno() != 0)				// SE SUPONE QUE EL NUMERO DE SINIESTRO NUNCA VA A SER 0
			textInt.setText(Integer.toString(contrato.getInterno()));
		textInt.setBounds(604, 419, 89, 20);
		contentPanel.add(textInt);
		textInt.setColumns(10);
		
		calendarioHasta = new JCalendar();
		if(contrato.getVigenciaFin() != null)
			calendarioHasta.setDate(contrato.getVigenciaFin());
		calendarioHasta.setBounds(493, 232, 200, 153);
		contentPanel.add(calendarioHasta);
		
		calendarioOcurecia = new JCalendar();
		if(contrato.getFechaOcurencia() != null)
			calendarioOcurecia.setDate(contrato.getFechaOcurencia());
		calendarioOcurecia.setBounds(146, 65, 200, 153);
		contentPanel.add(calendarioOcurecia);
		
		calendarioDerivacion= new JCalendar();
		if(contrato.getFechaDerivacion() != null)
			calendarioDerivacion.setDate(contrato.getFechaDerivacion());
		calendarioDerivacion.setBounds(146, 231, 200, 153);
		contentPanel.add(calendarioDerivacion);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						setVisible(false);
					}
				});
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
	public int getSinientro(){
		return Integer.parseInt(textFieldSiniestro.getText());
	}
	public int getPoliza() {
		return Integer.parseInt(textPoliza.getText());
	}
	public Date getFechaOcc() {
		return calendarioOcurecia.getDate();
	}
	public Date getFechaDev() {
		return calendarioDerivacion.getDate();
	}
	public Date getDesde() {
		return calendarioDel.getDate();
	}
	public Date getHasta() {
		return calendarioHasta.getDate();
	}
	public String getAjustador() {
		return textFieldAjustadorMer.getText();
	}
	public String getLiquidExt() {
		return textFieldLiquidadorExt.getText();
	}
	public String getResponsable() {
		return textFieldResponsable.getText();
	}
	public String getEmail() {
		return textFieldEmail.getText();
	}
	public int getNum() {
		return Integer.parseInt(textNroTel.getText());
	}
	public int getInter() {
		return Integer.parseInt(textInt.getText());
	}
	
}
