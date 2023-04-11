package ui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import empresa.Daño;
import empresa.OtrosDaños;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuItem;
import javax.swing.JList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ManejoDeDaños extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		try {
//			ManejoDeDaños dialog = new ManejoDeDaños();
//			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
//			dialog.setVisible(true);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}

	/**
	 * Create the dialog.
	 */
	public ManejoDeDaños(OtrosDaños daños) {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JList list = new JList();
		try {
			list.setListData(daños.getListaDeDaños().toArray());
		}
		catch (Exception e){
			
		}
		
		list.setBounds(215, 11, 194, 206);
		contentPanel.add(list);
		
		JButton btnAgregar = new JButton("Agregar Daño");
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AgregarDaño ventana = new AgregarDaño();
				
				ventana.setModal(true);
				ventana.setVisible(true);
				
				daños.agregarDaño(ventana.getDaño());
				list.setListData(daños.getListaDeDaños().toArray());
			}
		});
		btnAgregar.setBounds(49, 41, 106, 23);
		contentPanel.add(btnAgregar);
		
		JButton btnModificar = new JButton("Modificar Daño");
		btnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = list.getSelectedIndex();
				Daño aux = daños.getListaDeDaños().get(a);
				
				ModificarDaño ventana = new ModificarDaño(aux);
				ventana.setModal(true);
				ventana.setVisible(true);				
				
				
			}
		});
		btnModificar.setBounds(49, 100, 106, 23);
		contentPanel.add(btnModificar);
		
		JButton btnEliminar = new JButton("Eliminar Daño");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				list.getSelectedValue();
				
				eliminar();
			}
		});
		btnEliminar.setBounds(49, 156, 106, 23);
		contentPanel.add(btnEliminar);
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
	private void eliminar() {
		
		
	}
}
