package ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.apache.pdfbox.Loader;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm;
import org.apache.pdfbox.pdmodel.interactive.form.PDField;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.awt.event.ActionEvent;
import objetos.*;


public class Home extends JFrame {

	private JPanel contentPane;
	private static Contrato contrato;

	public static void main(String[] args) {	
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ObjectInputStream entrada = new ObjectInputStream(new FileInputStream("contrato.ser"));
					contrato = (Contrato) entrada.readObject();
					entrada.close();
					
					Home frame = new Home();
					frame.setVisible(true);
					
					frame.addWindowListener(new java.awt.event.WindowAdapter() {
			            @Override
			            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
							ObjectOutputStream salida = null;
							try {
								salida = new ObjectOutputStream(new FileOutputStream("contrato.ser"));
							} catch (IOException e2) {
								// TODO Auto-generated catch block
								e2.printStackTrace();
							}
							try {
								salida.writeObject(contrato);
							} catch (IOException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
							try {
								salida.close();
							} catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
			                System.exit(0);
			            }
			        });
					
					
					
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
				abrirVentanaInfor();
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
		btnVerInf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CrearPDF();
			}
		});
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

	protected void abrirVentanaInfor() {
		inforBasica ventana = new inforBasica(contrato);
		
		ventana.setModal(true);
		ventana.setVisible(true);
		
		// GUARDAR TODOS LOS DATOS 
		contrato.setSiniestro(ventana.getSinientro());
		contrato.setAjustadorMer(ventana.getAjustador());
		contrato.setEmail(ventana.getEmail());
		contrato.setPoliza(ventana.getPoliza());
		contrato.setResponsable(ventana.getResponsable());
		contrato.setLiquidExt(ventana.getLiquidExt());
		contrato.setFechaDerivacion(ventana.getFechaDev());
		contrato.setFechaOcurencia(ventana.getFechaOcc());
		contrato.setVigenciaFin(ventana.getHasta());
		contrato.setVigenciaIni(ventana.getDesde());
		contrato.setInterno(ventana.getInter());
		contrato.setTelefono(ventana.getNum());
		
	}
	protected void CrearPDF() {
		// ACA SE VA A CREAR EL ARCHIVO DE PDF
		File template = new File("src\\contrato_template\\Contrato1.0_Rellenable.pdf");
		try {
			PDDocument documento = Loader.loadPDF(template);
			PDAcroForm acroForm = documento.getDocumentCatalog().getAcroForm();
			PDField field = acroForm.getField("Campo1"); 
			field.setValue("John Doe");
			
			documento.save("Contrato Juan Canestrari.pdf");
			documento.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}





		
		
		
	}
}
