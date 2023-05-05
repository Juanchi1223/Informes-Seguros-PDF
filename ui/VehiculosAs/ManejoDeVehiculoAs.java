package ui.VehiculosAs;

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
import empresa.VehiculosLesionados;

public class ManejoDeVehiculoAs extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 * 
	public static void main(String[] args) {
		try {
			ManejoDeVehiculoAs dialog = new ManejoDeVehiculoAs();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	 * Create the dialog.
	 */
	public ManejoDeVehiculoAs(VehiculosLesionados vehiculos) {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JList list = new JList();
		try {
			list.setListData(vehiculos.listaVehiculosAsegurados().toArray());
		}
		catch (Exception e){
			
		}
		
		list.setBounds(215, 11, 194, 206);
		contentPanel.add(list);
		
		JButton btnAgregar = new JButton("Agregar Vehiculo");
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AgregarVehiculoAs ventana = new AgregarVehiculoAs();
				
				ventana.setModal(true);
				ventana.setVisible(true);
				
				if (ventana.getVehiculoNuevo().getPropietario() != null)
					vehiculos.agregarVehiculo(ventana.getVehiculoNuevo());

				list.setListData(vehiculos.listaVehiculosAsegurados().toArray());
			}
		});
		btnAgregar.setBounds(49, 41, 132, 23);
		contentPanel.add(btnAgregar);
		
		JButton btnModificar = new JButton("Modificar Vehiculo");
		btnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				int a = list.getSelectedIndex();
//				Daño aux = vehiculos.getListaVehiculos().get(a);
//				
//				ModificarDaño ventana = new ModificarDaño(aux);
//				ventana.setModal(true);
//				ventana.setVisible(true);				
//				
//				list.setListData(vehiculos.getListaVehiculos().toArray());

			}
		});
		btnModificar.setBounds(49, 100, 132, 23);
		contentPanel.add(btnModificar);
		
		JButton btnEliminar = new JButton("Eliminar Vehiculo");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {		// TODO Corregir Codigos Luegos de Borrar
				int x = list.getSelectedIndex();						
				vehiculos.borrarVehiculoAs(x);

				list.setListData(vehiculos.listaVehiculosAsegurados().toArray());
			}
		});
		btnEliminar.setBounds(49, 156, 132, 23);
		contentPanel.add(btnEliminar);
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

}
