package ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Home extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Home() {
		setTitle("Informes Seguros Garbuglia");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 780, 567);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnInfBasc = new JButton("Información Basica");
		btnInfBasc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inforBasica ventana = new inforBasica();
				ventana.setVisible(true);
				ventana.setModal(true);
			}
		});
		btnInfBasc.setBounds(32, 67, 193, 53);
		contentPane.add(btnInfBasc);
		
		JButton btnSinistro = new JButton("Información del Siniestro");
		btnSinistro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSinistro.setBounds(32, 131, 193, 53);
		contentPane.add(btnSinistro);
		
		JButton btnAsegLesio = new JButton("Vehículos Asegurados Lesionados");
		btnAsegLesio.setBounds(32, 195, 193, 53);
		contentPane.add(btnAsegLesio);
		
		JButton btnTercLesn = new JButton("Vehículos Terceros Lesionados");
		btnTercLesn.setBounds(32, 259, 193, 53);
		contentPane.add(btnTercLesn);
		
		JButton btnPeaton = new JButton("Peaton");
		btnPeaton.setBounds(32, 323, 193, 53);
		contentPane.add(btnPeaton);
		
		JButton btnOtros = new JButton("Otros Daños");
		btnOtros.setBounds(32, 387, 193, 53);
		contentPane.add(btnOtros);
		
		JButton btnVerInf = new JButton("Ver");
		btnVerInf.setBounds(32, 451, 66, 66);
		contentPane.add(btnVerInf);
		
		JButton btnImprimir = new JButton("Print");
		btnImprimir.setBounds(108, 451, 66, 66);
		contentPane.add(btnImprimir);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setBounds(184, 451, 66, 66);
		contentPane.add(btnNewButton_2);
		
		JButton btnDel = new JButton("Borrar");
		btnDel.setBounds(260, 451, 66, 66);
		contentPane.add(btnDel);
		
		JButton btnResumen = new JButton("Resumen");
		btnResumen.setBounds(336, 451, 89, 23);
		contentPane.add(btnResumen);
		
		JButton btnPrntResumen = new JButton("Imprimir Res");
		btnPrntResumen.setBounds(336, 485, 89, 32);
		contentPane.add(btnPrntResumen);
		
		JButton btnGuardar = new JButton("Guarda como");
		btnGuardar.setBounds(625, 473, 109, 23);
		contentPane.add(btnGuardar);
	}
}
