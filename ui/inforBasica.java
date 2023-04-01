package ui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.toedter.calendar.JCalendar;

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
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			inforBasica dialog = new inforBasica();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public inforBasica() {
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
		lblFechaDerivacion.setBounds(11, 215, 125, 14);
		contentPanel.add(lblFechaDerivacion);
		
		JLabel lblAjustadorMer = new JLabel("Ajustador Meridional:");
		lblAjustadorMer.setBounds(16, 380, 125, 14);
		contentPanel.add(lblAjustadorMer);
		
		JLabel lblLiquidadorExt = new JLabel("Liquidador Externo:");
		lblLiquidadorExt.setBounds(24, 405, 125, 14);
		contentPanel.add(lblLiquidadorExt);
		
		JLabel lblResponsable = new JLabel("Responsable:");
		lblResponsable.setBounds(59, 430, 125, 14);
		contentPanel.add(lblResponsable);
		
		JLabel lblEmail = new JLabel("Emal:");
		lblEmail.setBounds(446, 383, 125, 14);
		contentPanel.add(lblEmail);
		
		textFieldSiniestro = new JTextField();
		textFieldSiniestro.setBounds(146, 36, 120, 20);
		contentPanel.add(textFieldSiniestro);
		textFieldSiniestro.setColumns(10);
		
		textFieldAjustadorMer = new JTextField();
		textFieldAjustadorMer.setColumns(10);
		textFieldAjustadorMer.setBounds(139, 377, 120, 20);
		contentPanel.add(textFieldAjustadorMer);
		
		textFieldLiquidadorExt = new JTextField();
		textFieldLiquidadorExt.setColumns(10);
		textFieldLiquidadorExt.setBounds(139, 402, 120, 20);
		contentPanel.add(textFieldLiquidadorExt);
		
		textFieldResponsable = new JTextField();
		textFieldResponsable.setColumns(10);
		textFieldResponsable.setBounds(139, 427, 120, 20);
		contentPanel.add(textFieldResponsable);
		
		textFieldEmail = new JTextField();
		textFieldEmail.setColumns(10);
		textFieldEmail.setBounds(491, 377, 202, 20);
		contentPanel.add(textFieldEmail);
		
		JLabel lblPoliza = new JLabel("Poliza:");
		lblPoliza.setBounds(446, 39, 46, 14);
		contentPanel.add(lblPoliza);
		
		JLabel lblVigenciaDesde = new JLabel("Vigencia desde:");
		lblVigenciaDesde.setBounds(391, 67, 98, 14);
		contentPanel.add(lblVigenciaDesde);
		
		JCalendar calendarioDel = new JCalendar();
		calendarioDel.setBounds(493, 67, 200, 135);
		contentPanel.add(calendarioDel);
		
		JLabel lblTelefono = new JLabel("Tel/Fax");
		lblTelefono.setBounds(435, 405, 46, 14);
		contentPanel.add(lblTelefono);
		
		textPoliza = new JTextField();
		textPoliza.setBounds(493, 36, 86, 20);
		contentPanel.add(textPoliza);
		textPoliza.setColumns(10);
		
		JLabel lblAL = new JLabel("al:");
		lblAL.setBounds(468, 216, 23, 14);
		contentPanel.add(lblAL);
		
		textNroTel = new JTextField();
		textNroTel.setBounds(491, 402, 86, 20);
		contentPanel.add(textNroTel);
		textNroTel.setColumns(10);
		
		JLabel lblInt = new JLabel("Int:");
		lblInt.setBounds(582, 405, 46, 14);
		contentPanel.add(lblInt);
		
		textInt = new JTextField();
		textInt.setBounds(604, 402, 89, 20);
		contentPanel.add(textInt);
		textInt.setColumns(10);
		
		JCalendar calendarioHasta = new JCalendar();
		calendarioHasta.setBounds(493, 215, 200, 135);
		contentPanel.add(calendarioHasta);
		
		JCalendar calendarioOcurecia = new JCalendar();
		calendarioOcurecia.setBounds(146, 65, 200, 135);
		contentPanel.add(calendarioOcurecia);
		
		JCalendar calendarioDerivacion= new JCalendar();
		calendarioDerivacion.setBounds(146, 215, 200, 135);
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
}
