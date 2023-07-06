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
		setResizable(false);
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
				
				
				if ( !propietarioVacio(ventana.getPropietarioVehiculo())) 
					vehiculos.agregarVehiculo(ventana.getVehiculoNuevo());
				
				list.setListData(vehiculos.listaVehiculosAsegurados().toArray());				
			}
		});
		btnAgregar.setBounds(49, 41, 132, 23);
		contentPanel.add(btnAgregar);
		
		JButton btnModificar = new JButton("Modificar Vehiculo");
		btnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = list.getSelectedIndex();
				
				try {
					ModificarVehiculo ventana = new ModificarVehiculo(vehiculos.listaVehiculosAsegurados().get(a));
					
					ventana.setModal(true);
					ventana.setVisible(true);	
					
					// ACA SE TIENE QUE ACTUALIZAR ME IMAGINO
				}
				catch(IndexOutOfBoundsException error) {
					;	// no pasa nada si no se seleciona nada
				}
				
				list.setListData(vehiculos.listaVehiculosAsegurados().toArray());

			}
		});
		btnModificar.setBounds(49, 100, 132, 23);
		contentPanel.add(btnModificar);
		
		JButton btnEliminar = new JButton("Eliminar Vehiculo");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int x = list.getSelectedIndex();	
				try {
					vehiculos.borrarVehiculoAs(x);
				}
				catch(IndexOutOfBoundsException error) {
					;	// no pasa nada si no se seleciona nada
				}

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

	protected boolean propietarioVacio(String propietario) {
		if ( propietario != null && !propietario.equals(""))
			return false;
		return true;
	}

}
