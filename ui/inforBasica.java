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

import empresa.*;

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
	 * Create the dialog.
	 */
	public inforBasica(Contrato contrato) {
		setResizable(false);
		
		InformacionBasica objeto = contrato.getInfoaBas();
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
		
		if(objeto.getSiniestro() != 0)				// SE SUPONE QUE EL NUMERO DE SINIESTRO NUNCA VA A SER 0
			textFieldSiniestro.setText(Integer.toString(objeto.getSiniestro()));
		
		textFieldSiniestro.setBounds(146, 36, 120, 20);
		contentPanel.add(textFieldSiniestro);
		textFieldSiniestro.setColumns(10);
		
		textFieldAjustadorMer = new JTextField();
		if(objeto.getAjustadorMer() != null)
			textFieldAjustadorMer.setText(objeto.getAjustadorMer());
		textFieldAjustadorMer.setColumns(10);
		textFieldAjustadorMer.setBounds(146, 394, 120, 20);
		contentPanel.add(textFieldAjustadorMer);
		
		textFieldLiquidadorExt = new JTextField();
		if(objeto.getLiquidExt()  != null)
			textFieldLiquidadorExt.setText(objeto.getLiquidExt());
		textFieldLiquidadorExt.setColumns(10);
		textFieldLiquidadorExt.setBounds(146, 419, 120, 20);
		contentPanel.add(textFieldLiquidadorExt);
		
		textFieldResponsable = new JTextField();
		if(objeto.getResponsable() != null)
			textFieldResponsable.setText(objeto.getResponsable());
		textFieldResponsable.setColumns(10);
		textFieldResponsable.setBounds(146, 444, 120, 20);
		contentPanel.add(textFieldResponsable);
		
		textFieldEmail = new JTextField();
		if(objeto.getEmail() != null)
			textFieldEmail.setText(objeto.getEmail()); 
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
		if(objeto.getVigenciaIni() != null)
			calendarioDel.setDate(objeto.getVigenciaIni());
		calendarioDel.setBounds(493, 67, 200, 153);
		contentPanel.add(calendarioDel);
		
		JLabel lblTelefono = new JLabel("Tel/Fax");
		lblTelefono.setBounds(435, 422, 46, 14);
		contentPanel.add(lblTelefono);
		
		textPoliza = new JTextField();
		if(objeto.getPoliza() != 0)				// SE SUPONE QUE EL NUMERO DE SINIESTRO NUNCA VA A SER 0
			textPoliza.setText(Integer.toString(objeto.getPoliza()));
		textPoliza.setBounds(493, 36, 86, 20);
		contentPanel.add(textPoliza);
		textPoliza.setColumns(10);
		
		JLabel lblAL = new JLabel("al:");
		lblAL.setBounds(469, 232, 23, 14);
		contentPanel.add(lblAL);
		
		textNroTel = new JTextField();
		if(objeto.getTelefono() != 0)				// SE SUPONE QUE EL NUMERO DE SINIESTRO NUNCA VA A SER 0
			textNroTel.setText(Integer.toString(objeto.getTelefono()));
		textNroTel.setBounds(491, 419, 86, 20);
		contentPanel.add(textNroTel);
		textNroTel.setColumns(10);
		
		JLabel lblInt = new JLabel("Int:");
		lblInt.setBounds(582, 422, 46, 14);
		contentPanel.add(lblInt);
		
		textInt = new JTextField();
		if(objeto.getInterno() != 0)				// SE SUPONE QUE EL NUMERO DE SINIESTRO NUNCA VA A SER 0
			textInt.setText(Integer.toString(objeto.getInterno()));
		textInt.setBounds(604, 419, 89, 20);
		contentPanel.add(textInt);
		textInt.setColumns(10);
		
		calendarioHasta = new JCalendar();
		if(objeto.getVigenciaFin() != null)
			calendarioHasta.setDate(objeto.getVigenciaFin());
		calendarioHasta.setBounds(493, 232, 200, 153);
		contentPanel.add(calendarioHasta);
		
		calendarioOcurecia = new JCalendar();
		if(objeto.getFechaOcurencia() != null)
			calendarioOcurecia.setDate(objeto.getFechaOcurencia());
		calendarioOcurecia.setBounds(146, 65, 200, 153);
		contentPanel.add(calendarioOcurecia);
		
		calendarioDerivacion= new JCalendar();
		if(objeto.getFechaDerivacion() != null)
			calendarioDerivacion.setDate(objeto.getFechaDerivacion());
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
