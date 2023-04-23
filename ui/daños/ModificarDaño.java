package ui.daños;

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
	private JFileChooser fcDoc1;
	private JComboBox SeguroSiNo; 
	private JComboBox DenunciaSiNo;
	private JComboBox AdjDocSiNo;
	private JTextField textJstDoc;
	private JTextField textJstFoto;
	private ArrayList<String> FtsDoc;
	private ArrayList<String> Fts;
	
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
		
		JLabel lblDoc1 = new JLabel("");
		lblDoc1.setForeground(Color.WHITE);
		lblDoc1.setBounds(27, 151, 122, 122);
		setFotoAdjunta(FtsDoc.get(0), lblDoc1);
		contentPanel.add(lblDoc1);
		
		JLabel lblDoc2 = new JLabel("");
		lblDoc2.setForeground(Color.WHITE);
		lblDoc2.setBounds(225, 151, 122, 122);
		setFotoAdjunta(FtsDoc.get(1), lblDoc2);
		contentPanel.add(lblDoc2);
		
		JLabel lblFoto1 = new JLabel("");
		lblFoto1.setForeground(Color.WHITE);
		lblFoto1.setBounds(27, 310, 122, 122);
		setFotoAdjunta(Fts.get(0), lblFoto1);
		contentPanel.add(lblFoto1);
		
		JLabel lblFoto2 = new JLabel("");
		lblFoto2.setForeground(Color.WHITE);
		lblFoto2.setBounds(238, 310, 122, 122);
		setFotoAdjunta(Fts.get(1), lblFoto2);
		contentPanel.add(lblFoto2);
		
		JLabel lblFoto3 = new JLabel("");
		lblFoto3.setBackground(SystemColor.menu);
		lblFoto3.setForeground(Color.WHITE);
		lblFoto3.setBounds(27, 439, 122, 122);
		setFotoAdjunta(Fts.get(2), lblFoto3);
		contentPanel.add(lblFoto3);
		
		JLabel lblFoto4 = new JLabel("");
		lblFoto4.setForeground(Color.WHITE);
		lblFoto4.setBounds(238, 443, 122, 122);
		setFotoAdjunta(Fts.get(3), lblFoto4);
		contentPanel.add(lblFoto4);
		
		
		JButton btnAdjDoc1 = new JButton("btnAdjDoc1");
		btnAdjDoc1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				adjuntarArchivo(btnAdjDoc1, lblDoc1,1 ,true);
			}
		});
		btnAdjDoc1.setBounds(159, 151, 36, 23);
		contentPanel.add(btnAdjDoc1);
		
		JButton btnAdjDoc2 = new JButton("btnAdjDoc2");
		btnAdjDoc2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				adjuntarArchivo(btnAdjDoc2, lblDoc2, 2, true);
			}
		});
		btnAdjDoc2.setBounds(370, 146, 36, 23);
		contentPanel.add(btnAdjDoc2);
		
		JButton btnAdjFt1 = new JButton("btnAdjFt1");
		btnAdjFt1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				adjuntarArchivo(btnAdjFt1, lblFoto1, 1,false);
			}
		});
		btnAdjFt1.setBounds(159, 306, 36, 23);
		contentPanel.add(btnAdjFt1);
		
		JButton btnAdjFt2 = new JButton("btnAdjFt2");
		btnAdjFt2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				adjuntarArchivo(btnAdjFt2, lblFoto3, 2,false);
			}
		});
		btnAdjFt2.setBounds(159, 439, 36, 23);
		contentPanel.add(btnAdjFt2);
		
		JButton btnAdjFt3 = new JButton("btnAdjFt3");
		btnAdjFt3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				adjuntarArchivo(btnAdjFt3, lblFoto2, 3,false);
			}
		});
		btnAdjFt3.setBounds(370, 306, 36, 23);
		contentPanel.add(btnAdjFt3);
		
		JButton btnAdjFt4 = new JButton("btnAdjFt4");
		btnAdjFt4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				adjuntarArchivo(btnAdjFt4, lblFoto4, 4,false);
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

	private void adjuntarArchivo(JButton botton, JLabel marco, int pos,boolean doc) {
		fcDoc1 = new JFileChooser();
		FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos de imagen", "jpg", "jpeg", "png", "gif");
		fcDoc1.setFileFilter(filter);
		
		int selecionar = fcDoc1.showOpenDialog(botton);
		
		if (selecionar == JFileChooser.APPROVE_OPTION) {
           String Ruta = fcDoc1.getSelectedFile().getPath();
           agregarArrayList(Ruta, doc, pos);
            
	       Image mImagen = new ImageIcon(Ruta).getImage();
	       ImageIcon mIcono = new ImageIcon(mImagen.getScaledInstance(marco.getWidth(), marco.getHeight(), Image.SCALE_SMOOTH));
	       marco.setIcon(mIcono); 
            
        }
	}
	
	private void agregarArrayList(String ruta, boolean doc, int pos) {
		if (doc) {
			FtsDoc.add(pos, ruta);
		}
		else{
			Fts.add(pos, ruta);
		}
		
	}
	private void setFotoAdjunta(String Ruta, JLabel marco) {
		if(Ruta != null) {
			Image mImagen = new ImageIcon(Ruta).getImage();
	       	ImageIcon mIcono = new ImageIcon(mImagen.getScaledInstance(marco.getWidth(), marco.getHeight(), Image.SCALE_SMOOTH));
	       	marco.setIcon(mIcono);
		}
	}

	private void ok(Daño daño) {
		daño.setNombreProp(textProp.getText());
		daño.setSeguro(SeguroSiNo.getSelectedObjects().toString());
		daño.setNombreSeguro(textSeguro.getText());
		daño.setDenuncia(DenunciaSiNo.getSelectedItem().toString());
		daño.setDocumentacion(AdjDocSiNo.getSelectedItem().toString());
		daño.setJustficarDoc(textJstDoc.getText());
		daño.setJustificaFoto(textJstFoto.getText());
		daño.setRutaFotosDoc(FtsDoc);
		daño.setRutaFotosDoc(Fts);
		
		setVisible(false);
	}
}
