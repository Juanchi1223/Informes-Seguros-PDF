package ui.VehiculosAs;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;

import empresa.Fotos;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PasajeroFotos extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private Fotos Dni = new Fotos(2);
	private Fotos Licencia = new Fotos(2);
	private Fotos AcredMed = new Fotos(4);

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			PasajeroFotos dialog = new PasajeroFotos();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public PasajeroFotos() {
		setResizable(false);
		setBounds(100, 100, 580, 669);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblDNI = new JLabel("DNI:");
		lblDNI.setBounds(30, 11, 46, 14);
		contentPanel.add(lblDNI);
		
		JPanel panelFotoDni1 = new JPanel();
		panelFotoDni1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panelFotoDni1.setBounds(30, 36, 170, 114);
		contentPanel.add(panelFotoDni1);
		panelFotoDni1.setLayout(new BorderLayout(0, 0));
		
		JLabel FotoDni1 = new JLabel("");
		panelFotoDni1.add(FotoDni1, BorderLayout.CENTER);
		
		JPanel panelFotoDni2 = new JPanel();
		panelFotoDni2.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panelFotoDni2.setBounds(306, 36, 170, 114);
		contentPanel.add(panelFotoDni2);
		panelFotoDni2.setLayout(new BorderLayout(0, 0));
		
		JLabel FotoDni2 = new JLabel("");
		panelFotoDni2.add(FotoDni2, BorderLayout.CENTER);
		
		JButton btnDni1 = new JButton("...");
		btnDni1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Dni1 = Dni.adjuntarArchivo(btnDni1, FotoDni1);
				Dni.agregarFoto(0, Dni1);
			}
		});
		btnDni1.setBounds(217, 36, 39, 23);
		contentPanel.add(btnDni1);
		
		JButton btnDni2 = new JButton("...");
		btnDni2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Dni2 = Dni.adjuntarArchivo(btnDni2, FotoDni2);
				Dni.agregarFoto(1, Dni2);
			}
		});
		btnDni2.setBounds(495, 36, 39, 23);
		contentPanel.add(btnDni2);
		
		JLabel lblLicencia = new JLabel("Licencia:");
		lblLicencia.setBounds(30, 161, 102, 14);
		contentPanel.add(lblLicencia);
		
		JPanel panelLic1 = new JPanel();
		panelLic1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panelLic1.setBounds(30, 186, 170, 114);
		contentPanel.add(panelLic1);
		panelLic1.setLayout(new BorderLayout(0, 0));
		
		JLabel Lic1 = new JLabel("");
		panelLic1.add(Lic1, BorderLayout.CENTER);
		
		JPanel panelLic2 = new JPanel();
		panelLic2.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panelLic2.setBounds(306, 186, 170, 114);
		contentPanel.add(panelLic2);
		panelLic2.setLayout(new BorderLayout(0, 0));
		
		JLabel Lic2 = new JLabel("");
		panelLic2.add(Lic2, BorderLayout.CENTER);
		
		JButton btnLic1 = new JButton("...");
		btnLic1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String RutaLic1 = Licencia.adjuntarArchivo(btnLic1, Lic1);
				Licencia.agregarFoto(0, RutaLic1);
			}
		});
		btnLic1.setBounds(217, 186, 39, 23);
		contentPanel.add(btnLic1);
		
		JButton btnLic2 = new JButton("...");
		btnLic2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String RutaLic2 = Licencia.adjuntarArchivo(btnLic2, Lic2);
				Licencia.agregarFoto(1, RutaLic2);
			}
		});
		btnLic2.setBounds(495, 186, 39, 23);
		contentPanel.add(btnLic2);
		
		JLabel lblAcreditacionMed = new JLabel("Acreditacion Medica:");
		lblAcreditacionMed.setBounds(30, 311, 130, 14);
		contentPanel.add(lblAcreditacionMed);
		
		JPanel panelAcMed1 = new JPanel();
		panelAcMed1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panelAcMed1.setBounds(30, 336, 170, 114);
		contentPanel.add(panelAcMed1);
		panelAcMed1.setLayout(new BorderLayout(0, 0));
		
		JLabel AcMed1 = new JLabel("");
		panelAcMed1.add(AcMed1, BorderLayout.CENTER);
		
		JPanel panelAcMed3 = new JPanel();
		panelAcMed3.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panelAcMed3.setBounds(30, 461, 170, 114);
		contentPanel.add(panelAcMed3);
		panelAcMed3.setLayout(new BorderLayout(0, 0));
		
		JLabel AcMed3 = new JLabel("");
		panelAcMed3.add(AcMed3, BorderLayout.CENTER);
		
		JPanel panelAcMed2 = new JPanel();
		panelAcMed2.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panelAcMed2.setBounds(306, 336, 170, 114);
		contentPanel.add(panelAcMed2);
		panelAcMed2.setLayout(new BorderLayout(0, 0));
		
		JLabel AcMed2 = new JLabel("");
		panelAcMed2.add(AcMed2, BorderLayout.CENTER);
		
		JPanel panelAcMed4 = new JPanel();
		panelAcMed4.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panelAcMed4.setBounds(306, 461, 170, 114);
		contentPanel.add(panelAcMed4);
		panelAcMed4.setLayout(new BorderLayout(0, 0));
		
		JLabel AcMed4 = new JLabel("");
		panelAcMed4.add(AcMed4, BorderLayout.CENTER);
		
		JButton btnAcMed1 = new JButton("...");
		btnAcMed1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String acred1 = AcredMed.adjuntarArchivo(btnAcMed1, AcMed1);
				AcredMed.agregarFoto(0, acred1);
			}
		});
		btnAcMed1.setBounds(217, 336, 39, 23);
		contentPanel.add(btnAcMed1);
		
		JButton btnAcMed2 = new JButton("...");
		btnAcMed2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String acred2 = AcredMed.adjuntarArchivo(btnAcMed2, AcMed2);
				AcredMed.agregarFoto(1, acred2);
			}
		});
		btnAcMed2.setBounds(495, 336, 39, 23);
		contentPanel.add(btnAcMed2);
		
		JButton btnAcMed3 = new JButton("...");
		btnAcMed3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String acred3 = AcredMed.adjuntarArchivo(btnAcMed3, AcMed3);
				AcredMed.agregarFoto(2, acred3);
			}
		});
		btnAcMed3.setBounds(217, 461, 39, 23);
		contentPanel.add(btnAcMed3);
		
		JButton btnAcMed4 = new JButton("...");
		btnAcMed4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String acred4 = AcredMed.adjuntarArchivo(btnAcMed4, AcMed4);
				AcredMed.agregarFoto(3, acred4);
			}
		});
		btnAcMed4.setBounds(495, 461, 39, 23);
		contentPanel.add(btnAcMed4);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
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

	public Fotos getDni() {
		return Dni;
	}

	public Fotos getLicencia() {
		return Licencia;
	}

	public Fotos getAcredMed() {
		return AcredMed;
	}
}
