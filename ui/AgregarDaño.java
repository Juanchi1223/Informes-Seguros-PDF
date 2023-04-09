package ui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.imageio.ImageIO;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.swing.Action;

public class AgregarDaño extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JFileChooser fcDoc1;
	private final Action action = new SwingAction();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			AgregarDaño dialog = new AgregarDaño();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public AgregarDaño() {
		setBounds(100, 100, 533, 641);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblPropietario = new JLabel("Propietario o Titular");
		lblPropietario.setBounds(27, 36, 122, 14);
		contentPanel.add(lblPropietario);
		
		textField = new JTextField();
		textField.setBounds(148, 33, 291, 20);
		contentPanel.add(textField);
		textField.setColumns(10);
		
		JLabel lblSeguro = new JLabel("¿Tiene algun tipo de seguro?");
		lblSeguro.setBounds(27, 61, 168, 14);
		contentPanel.add(lblSeguro);
		
		JComboBox SeguroSiNo = new JComboBox();
		SeguroSiNo.setModel(new DefaultComboBoxModel(new String[] {"No", "Si"}));
		SeguroSiNo.setBounds(196, 57, 44, 22);
		contentPanel.add(SeguroSiNo);
		
		JLabel lblCual = new JLabel("¿Cual?");
		lblCual.setBounds(250, 61, 46, 14);
		contentPanel.add(lblCual);
		
		textField_1 = new JTextField();
		textField_1.setBounds(297, 58, 142, 20);
		contentPanel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblDenuncia = new JLabel("¿Realizo la denuncia?");
		lblDenuncia.setBounds(27, 90, 160, 14);
		contentPanel.add(lblDenuncia);
		
		JComboBox DenunciaSiNo = new JComboBox();
		DenunciaSiNo.setModel(new DefaultComboBoxModel(new String[] {"No", "Si"}));
		DenunciaSiNo.setBounds(171, 86, 44, 22);
		contentPanel.add(DenunciaSiNo);
		
		JLabel lblAdjDoc = new JLabel("¿Adjunta la documentacion?");
		lblAdjDoc.setBounds(225, 90, 168, 14);
		contentPanel.add(lblAdjDoc);
		
		JComboBox AdjDocSiNo = new JComboBox();
		AdjDocSiNo.setModel(new DefaultComboBoxModel(new String[] {"No", "Si"}));
		AdjDocSiNo.setBounds(395, 86, 44, 22);
		contentPanel.add(AdjDocSiNo);
		
		JPanel PanelDoc1 = new JPanel();
		PanelDoc1.setBorder(new LineBorder(new Color(0, 0, 0)));
		PanelDoc1.setBackground(SystemColor.menu);
		PanelDoc1.setBounds(27, 146, 122, 122);
		contentPanel.add(PanelDoc1);
		
		JPanel PanelDoc2 = new JPanel();
		PanelDoc2.setBorder(new LineBorder(new Color(0, 0, 0)));
		PanelDoc2.setBackground(SystemColor.menu);
		PanelDoc2.setBounds(238, 146, 122, 122);
		contentPanel.add(PanelDoc2);
		
		JPanel PanelFoto1 = new JPanel();
		PanelFoto1.setBorder(new LineBorder(new Color(0, 0, 0)));
		PanelFoto1.setBackground(SystemColor.menu);
		PanelFoto1.setBounds(27, 306, 122, 122);
		contentPanel.add(PanelFoto1);
		
		JPanel PanelFoto2 = new JPanel();
		PanelFoto2.setBorder(new LineBorder(new Color(0, 0, 0)));
		PanelFoto2.setBackground(SystemColor.menu);
		PanelFoto2.setBounds(27, 439, 122, 122);
		contentPanel.add(PanelFoto2);
		
		JPanel PanelFoto3 = new JPanel();
		PanelFoto3.setBorder(new LineBorder(new Color(0, 0, 0)));
		PanelFoto3.setBackground(SystemColor.menu);
		PanelFoto3.setBounds(238, 306, 122, 122);
		contentPanel.add(PanelFoto3);
		
		JPanel PanelFoto4 = new JPanel();
		PanelFoto4.setBorder(new LineBorder(new Color(0, 0, 0)));
		PanelFoto4.setBackground(SystemColor.menu);
		PanelFoto4.setBounds(238, 439, 122, 122);
		contentPanel.add(PanelFoto4);
		
		JButton btnAdjDoc1 = new JButton("btnAdjDoc1");
		btnAdjDoc1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fcDoc1 = new JFileChooser();
				FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos de imagen", "jpg", "jpeg", "png", "gif");
				fcDoc1.setFileFilter(filter);
				
				int selecionar = fcDoc1.showOpenDialog(btnAdjDoc1);
				
				// BUSCAR UNA MANERA DE HACER QUE ESTE SEA REPRESETNADO EN LA INTERFAZ
				
//				if (selecionar != -1) {
//					// PanelDoc1
//					try {
//						BufferedImage backgroundImage = ImageIO.read(fcDoc1.getSelectedFile());
//						PanelDoc1.add(backgroundImage);
//					} catch (IOException e1) {
//						e1.printStackTrace();
//					}
//				}
			}
		});
		btnAdjDoc1.setBounds(159, 151, 36, 23);
		contentPanel.add(btnAdjDoc1);
		
		JButton btnAdjDoc2 = new JButton("btnAdjDoc2");
		btnAdjDoc2.setBounds(370, 146, 36, 23);
		contentPanel.add(btnAdjDoc2);
		
		JButton btnAdjFt1 = new JButton("btnAdjFt1");
		btnAdjFt1.setBounds(159, 306, 36, 23);
		contentPanel.add(btnAdjFt1);
		
		JButton btnAdjFt2 = new JButton("btnAdjFt2");
		btnAdjFt2.setBounds(159, 439, 36, 23);
		contentPanel.add(btnAdjFt2);
		
		JButton btnAdjFt3 = new JButton("btnAdjFt3");
		btnAdjFt3.setBounds(370, 306, 36, 23);
		contentPanel.add(btnAdjFt3);
		
		JButton btnAdjFt4 = new JButton("btnAdjFt4");
		btnAdjFt4.setBounds(370, 439, 36, 23);
		contentPanel.add(btnAdjFt4);
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
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
