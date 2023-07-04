package ui.Daños;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Image;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;

import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;
import javax.swing.filechooser.FileNameExtensionFilter;

import empresa.*;

import javax.imageio.ImageIO;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.Action;

public class ModificarDaño extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textProp; 
	private JTextField textSeguro;
	private JComboBox SeguroSiNo; 
	private JComboBox DenunciaSiNo;
	private JComboBox AdjDocSiNo;
	private JTextField textJstDoc;
	private JTextField textJstFoto;
	private Fotos FtsDoc;
	private Fotos Fts;
	
	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		try {
//			ModificarDaño dialog = new ModificarDaño(Daño d = new Daño());
//			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
//			dialog.setVisible(true);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}

	/**
	 * Create the dialog.
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public ModificarDaño(Daño daño) {
		setBounds(100, 100, 533, 680);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblPropietario = new JLabel("Propietario o Titular");
		lblPropietario.setBounds(27, 36, 122, 14);
		contentPanel.add(lblPropietario);
		
		textProp = new JTextField();
		if(daño.getNombreProp() != null) {
			textProp.setText(daño.getNombreProp());
		}
		textProp.setBounds(148, 33, 291, 20);
		contentPanel.add(textProp);
		textProp.setColumns(10);
		
		JLabel lblSeguro = new JLabel("¿Tiene algun tipo de seguro?");
		lblSeguro.setBounds(27, 61, 168, 14);
		contentPanel.add(lblSeguro);
		
		SeguroSiNo = new JComboBox();
		SeguroSiNo.setModel(new DefaultComboBoxModel(new String[] {"No", "Si"}));
		SeguroSiNo.setSelectedIndex(getSiNoIndex(daño.getSeguro()));
		SeguroSiNo.setBounds(196, 57, 44, 22);
		contentPanel.add(SeguroSiNo);
		
		JLabel lblCual = new JLabel("¿Cual?");
		lblCual.setBounds(250, 61, 46, 14);
		contentPanel.add(lblCual);
		
		textSeguro = new JTextField();
		if (daño.getNombreSeguro() != null) {
			textSeguro.setText(daño.getNombreSeguro());
		}
		textSeguro.setBounds(297, 58, 142, 20);
		contentPanel.add(textSeguro);
		textSeguro.setColumns(10);
		
		JLabel lblDenuncia = new JLabel("¿Realizo la denuncia?");
		lblDenuncia.setBounds(27, 90, 160, 14);
		contentPanel.add(lblDenuncia);
		
		DenunciaSiNo = new JComboBox();
		DenunciaSiNo.setModel(new DefaultComboBoxModel(new String[] {"No", "Si"}));
		DenunciaSiNo.setSelectedIndex(getSiNoIndex(daño.getDenuncia()));
		DenunciaSiNo.setBounds(171, 86, 44, 22);
		contentPanel.add(DenunciaSiNo);
		
		JLabel lblAdjDoc = new JLabel("¿Adjunta la documentacion?");
		lblAdjDoc.setBounds(225, 90, 168, 14);
		contentPanel.add(lblAdjDoc);
		
		AdjDocSiNo = new JComboBox();
		AdjDocSiNo.setModel(new DefaultComboBoxModel(new String[] {"No", "Si"}));
		AdjDocSiNo.setSelectedIndex(getSiNoIndex(daño.getDocumentacion()));
		AdjDocSiNo.setBounds(395, 86, 44, 22);
		contentPanel.add(AdjDocSiNo);
		
		FtsDoc = daño.getFotosDoc();
		Fts = daño.getFotosDaño();
		
		JPanel panelDoc1 = new JPanel();
		panelDoc1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelDoc1.setBounds(27, 129, 122, 122);
		contentPanel.add(panelDoc1);
		panelDoc1.setLayout(new BorderLayout(0, 0));
		
		JLabel lblDoc1 = new JLabel("");
		panelDoc1.add(lblDoc1);
		lblDoc1.setForeground(Color.WHITE);
		lblDoc1.setBounds(27, 151, 122, 122);
		FtsDoc.setFotoAdj(0, lblDoc1);

		JPanel panelDoc2 = new JPanel();
		panelDoc2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelDoc2.setBounds(225, 129, 122, 122);
		contentPanel.add(panelDoc2);
		panelDoc2.setLayout(new BorderLayout(0, 0));
		
		JLabel lblDoc2 = new JLabel("");
		panelDoc2.add(lblDoc2, BorderLayout.CENTER);
		lblDoc2.setForeground(Color.WHITE);
		lblDoc2.setBounds(225, 151, 122, 122);
		FtsDoc.setFotoAdj(1, lblDoc2);
		
		JPanel panelFoto1 = new JPanel();
		panelFoto1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelFoto1.setBounds(27, 310, 122, 122);
		contentPanel.add(panelFoto1);
		panelFoto1.setLayout(new BorderLayout(0, 0));
		
		JLabel lblFoto1 = new JLabel("");
		panelFoto1.add(lblFoto1);
		lblFoto1.setForeground(Color.WHITE);
		lblFoto1.setBounds(27, 310, 122, 122);
		Fts.setFotoAdj(0, lblFoto1);
		
		JPanel panelFoto2 = new JPanel();
		panelFoto2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelFoto2.setBounds(238, 310, 122, 122);
		contentPanel.add(panelFoto2);
		panelFoto2.setLayout(new BorderLayout(0, 0));
		
		JLabel lblFoto2 = new JLabel("");
		panelFoto2.add(lblFoto2, BorderLayout.CENTER);
		lblFoto2.setForeground(Color.WHITE);
		lblFoto2.setBounds(238, 310, 122, 122);
		Fts.setFotoAdj(1, lblFoto2);
		
		JPanel panelFoto3 = new JPanel();
		panelFoto3.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelFoto3.setBounds(27, 439, 122, 122);
		contentPanel.add(panelFoto3);
		panelFoto3.setLayout(new BorderLayout(0, 0));
		
		JLabel lblFoto3 = new JLabel("");
		panelFoto3.add(lblFoto3);
		lblFoto3.setBackground(SystemColor.menu);
		lblFoto3.setForeground(Color.WHITE);
		lblFoto3.setBounds(27, 439, 122, 122);
		Fts.setFotoAdj(2, lblFoto3);
		
		JPanel panelFoto4 = new JPanel();
		panelFoto4.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelFoto4.setBounds(238, 443, 122, 122);
		contentPanel.add(panelFoto4);
		panelFoto4.setLayout(new BorderLayout(0, 0));
		
		JLabel lblFoto4 = new JLabel("");
		panelFoto4.add(lblFoto4);
		lblFoto4.setForeground(Color.WHITE);
		lblFoto4.setBounds(238, 443, 122, 122);
		Fts.setFotoAdj(3, lblFoto4);
		
		JButton btnAdjDoc1 = new JButton("btnAdjDoc1");
		btnAdjDoc1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ruta1 = FtsDoc.adjuntarArchivo(btnAdjDoc1, lblDoc1);
				FtsDoc.agregarFoto(0, ruta1);;
			}
		});
		btnAdjDoc1.setBounds(159, 151, 36, 23);
		contentPanel.add(btnAdjDoc1);
		
		JButton btnAdjDoc2 = new JButton("btnAdjDoc2");
		btnAdjDoc2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ruta2 =FtsDoc.adjuntarArchivo(btnAdjDoc2, lblDoc2);
				FtsDoc.agregarFoto(1, ruta2);
			}
		});
		btnAdjDoc2.setBounds(370, 146, 36, 23);
		contentPanel.add(btnAdjDoc2);
		
		JButton btnAdjFt1 = new JButton("btnAdjFt1");
		btnAdjFt1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ruta1 = Fts.adjuntarArchivo(btnAdjFt1, lblFoto1);
				Fts.agregarFoto(0, ruta1);				
			}
		});
		btnAdjFt1.setBounds(159, 306, 36, 23);
		contentPanel.add(btnAdjFt1);
		
		JButton btnAdjFt2 = new JButton("btnAdjFt2");
		btnAdjFt2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ruta2 = Fts.adjuntarArchivo(btnAdjFt2, lblFoto3);
				Fts.agregarFoto(1, ruta2);
			}
		});
		btnAdjFt2.setBounds(159, 439, 36, 23);
		contentPanel.add(btnAdjFt2);
		
		JButton btnAdjFt3 = new JButton("btnAdjFt3");
		btnAdjFt3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ruta3 = Fts.adjuntarArchivo(btnAdjFt3, lblFoto2);
				Fts.agregarFoto(2, ruta3);
			}
		});
		btnAdjFt3.setBounds(370, 306, 36, 23);
		contentPanel.add(btnAdjFt3);
		
		JButton btnAdjFt4 = new JButton("btnAdjFt4");
		btnAdjFt4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ruta4 = Fts.adjuntarArchivo(btnAdjFt4, lblFoto4);
				Fts.agregarFoto(3, ruta4);
			}
		});
		btnAdjFt4.setBounds(370, 439, 36, 23);
		contentPanel.add(btnAdjFt4);
		
		JLabel lblJstDoc = new JLabel("Justificar Documentacion");
		lblJstDoc.setBounds(27, 285, 160, 14);
		contentPanel.add(lblJstDoc);
		
		textJstDoc = new JTextField();
		if(daño.getJustficarDoc() != null){
			textJstDoc.setText(daño.getJustficarDoc());
		}
		textJstDoc.setBounds(196, 282, 291, 20);
		contentPanel.add(textJstDoc);
		textJstDoc.setColumns(10);
		
		JLabel lblJstFoto = new JLabel("Justificar Fotos");
		lblJstFoto.setBounds(27, 578, 160, 14);
		contentPanel.add(lblJstFoto);
		
		textJstFoto = new JTextField();
		if(daño.getJustificaFoto() != null) {
			textJstFoto.setText(daño.getJustificaFoto());
		}
		textJstFoto.setColumns(10);
		textJstFoto.setBounds(196, 576, 291, 20);
		contentPanel.add(textJstFoto);
		
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						ok(daño);
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
	private int getSiNoIndex(String s) {
		if(s == "No")
			return 0;
		else
			return 1;
		
	}

	private void ok(Daño daño) {
		daño.setNombreProp(getNombreProp());
		daño.setSeguro(getSeguroSiNo());
		daño.setNombreSeguro(getNombreSeguro());
		daño.setDenuncia(getDenunciaSiNo());
		daño.setDocumentacion(getDocSino());
		daño.setJustficarDoc(getJustDoc());
		daño.setJustificaFoto(getJustFotos());
		daño.setRutaFotosDoc(FtsDoc);
		daño.setRutaFotosDaño(Fts);
		
		setVisible(false);
	}
	private String getNombreProp() {
		return textProp.getText();
	}
	private String getSeguroSiNo() {
		return SeguroSiNo.getSelectedObjects().toString();
	}
	private String getNombreSeguro() {
		return textSeguro.getText();
	}
	private String getDenunciaSiNo(){
		return DenunciaSiNo.getSelectedItem().toString();
	}
	private String getDocSino() {
		return AdjDocSiNo.getSelectedItem().toString();
	}
	private String getJustDoc() {
		return textJstDoc.getText();
	}
	private String getJustFotos() {
		return textJstFoto.getText();
	}
}
