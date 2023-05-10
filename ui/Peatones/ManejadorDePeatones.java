package ui.Peatones;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import empresa.Daño;
import empresa.Peatones;
import ui.Daños.AgregarDaño;
import ui.Daños.ModificarDaño;

public class ManejadorDePeatones extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		try {
//			ManejadorDePeatones dialog = new ManejadorDePeatones();
//			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
//			dialog.setVisible(true);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}

	/**
	 * Create the dialog.
	 */
	public ManejadorDePeatones(Peatones listaPeatones) {

		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JList list = new JList();
		try {
			list.setListData(listaPeatones.getListaPeatones().toArray());
		}
		catch (Exception e){
			
		}
		
		list.setBounds(215, 11, 194, 206);
		contentPanel.add(list);
		
		JButton btnAgregar = new JButton("Agregar Peaton");
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				AgregarDaño ventana = new AgregarDaño();
//				
//				ventana.setModal(true);
//				ventana.setVisible(true);
//				
//				daños.agregarDaño(ventana.getDaño()); // TODO como hacer para que no se agregen vacios
//				list.setListData(daños.getListaDeDaños().toArray());
			}
		});
		btnAgregar.setBounds(49, 41, 106, 23);
		contentPanel.add(btnAgregar);
		
		JButton btnModificar = new JButton("Modificar Peaton");
		btnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				int a = list.getSelectedIndex();
//				Daño aux = daños.getListaDeDaños().get(a);
//				
//				ModificarDaño ventana = new ModificarDaño(aux);
//				ventana.setModal(true);
//				ventana.setVisible(true);				
//				
//				list.setListData(daños.getListaDeDaños().toArray());

			}
		});
		btnModificar.setBounds(49, 100, 106, 23);
		contentPanel.add(btnModificar);
		
		JButton btnEliminar = new JButton("Eliminar Peaton");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				int x = list.getSelectedIndex();				
//				
//				daños.borrarDaño(x);
//				
//				list.setListData(daños.getListaDeDaños().toArray());
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
}