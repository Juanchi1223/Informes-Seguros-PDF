package ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
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
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;
import empresa.*;


public class Home extends JFrame {

	private JPanel contentPane;
	private static Home frame;
	private static Contrato contrato;

	public static void main(String[] args) {	
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ObjectInputStream entrada = new ObjectInputStream(new FileInputStream("contrato.ser"));
					contrato = (Contrato) entrada.readObject();
					entrada.close();
					
					frame = new Home();
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
				abrirInforSini();
			}

			
		});
		btnSinistro.setBounds(32, 131, 193, 53);
		contentPane.add(btnSinistro);
		
		JButton btnAsegLesio = new JButton("Vehículos Asegurados Lesionados");
		btnSinistro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}

			
		});
		btnAsegLesio.setBounds(32, 195, 193, 53);
		contentPane.add(btnAsegLesio);
		
		JButton btnTercLesn = new JButton("Vehículos Terceros Lesionados");
		btnTercLesn.setBounds(32, 259, 193, 53);
		contentPane.add(btnTercLesn);
		
		JButton btnPeaton = new JButton("Peaton");
		btnPeaton.setBounds(32, 323, 193, 53);
		contentPane.add(btnPeaton);
		
		JButton btnOtros = new JButton("Otros Daños");
		btnOtros.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				abrirVentanaOtros();
			}
		});
		btnOtros.setBounds(32, 387, 193, 53);
		contentPane.add(btnOtros);
		
		JButton btnVerInf = new JButton("Ver");
		btnVerInf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					CrearPDF();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
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
	protected void abrirInforSini() {
		InformacionSiniestro infSin = contrato.getInfoSin();
		InforSini ventana = new InforSini(infSin);
		
		ventana.setModal(true);
		ventana.setVisible(true);
		
		// CAMBIAR EL CODIGO PARA QUE SE GUARDE EN EL CONTROLADOR
		InformacionSiniestro objeto = contrato.getInfoSin();
	
		objeto.setFechaHoraMin(ventana.getFecha());
		objeto.setHora(ventana.getHr());
		objeto.setMin(ventana.getMin());
		objeto.setTiempo(ventana.getComboBoxTiempo());
		objeto.setEstado(ventana.getComboBoxEstado());
		objeto.setLugar(ventana.getLugar());
		objeto.setFotosLugar(ventana.getFotos());
		objeto.setCausa(ventana.getComboBoxPenalSiNo());
		objeto.setTestigosBool(ventana.getComboBoxTestigos());
		objeto.setTestigos(ventana.getTestigos());
		objeto.setVersionAsegurado(ventana.getVerAs());
		objeto.setVersionTercero(ventana.getVerTer());
		objeto.setMecanicaAccidente(ventana.getMecanica());
		objeto.setObservaciones(ventana.getObservaciones());
		objeto.setCobertura(ventana.getCobertura());
		objeto.setIndiciosFraude(ventana.getFraude());
		objeto.setAnalisis(ventana.getAnCobertura());
		objeto.setResponsabilidad(ventana.getRespns());
		objeto.setPorcentajeresponsabilidad(ventana.getPorcentajeResp());
		objeto.setDescResponsabilidad(ventana.getAnResp());
		objeto.setConcluciones(ventana.getConclu());
		objeto.setTransable(ventana.getTransable());
		objeto.setMoneda(ventana.getMoneda());
		objeto.setIndemnizacion(ventana.getIndm());
		objeto.setHonorariosGastos(ventana.getHonorarios());
	}
	protected void abrirVentanaOtros() {
		OtrosDaños objeto = contrato.getOtrosDaños();
		ManejoDeDaños ventana = new ManejoDeDaños(objeto);
		
		ventana.setModal(true);
		ventana.setVisible(true);
		
		// CAMBIAR EL CODIGO PARA QUE SE GUARDE EN EL CONTROLADOR
		
	}
	protected void abrirVentanaInfor() {
		inforBasica ventana = new inforBasica(contrato);
		
		ventana.setModal(true);
		ventana.setVisible(true);
		
		// GUARDAR TODOS LOS DATOS -> se se salio con OK
		InformacionBasica objeto = contrato.getInfoaBas();
		
		objeto.setSiniestro(ventana.getSinientro());
		objeto.setPoliza(ventana.getPoliza());	
		objeto.setAjustadorMer(ventana.getAjustador());
		objeto.setEmail(ventana.getEmail());
		objeto.setResponsable(ventana.getResponsable());
		objeto.setLiquidExt(ventana.getLiquidExt());
		objeto.setFechaDerivacion(ventana.getFechaDev());
		objeto.setFechaOcurencia(ventana.getFechaOcc());
		objeto.setVigenciaFin(ventana.getHasta());
		objeto.setVigenciaIni(ventana.getDesde());
		objeto.setInterno(ventana.getInter());
		objeto.setTelefono(ventana.getNum());
	}
	protected void CrearPDF() throws Exception {
		// ACA SE VA A CREAR EL ARCHIVO DE PDF
		DateFormat df = new SimpleDateFormat("dd/MM/yyy");	// formato de fecha para rellenar
		File template = new File("src\\contrato_template\\Contrato2.0_Rellenable.pdf");
		InformacionBasica objeto = contrato.getInfoaBas();
		try {
			PDDocument documento = Loader.loadPDF(template);
			PDAcroForm acroForm = documento.getDocumentCatalog().getAcroForm();
			
			PDField fieldSiniestro = acroForm.getField("Siniestro"); 
			fieldSiniestro.setValue(Integer.toString(objeto.getSiniestro()));
			
			PDField fieldPoliza = acroForm.getField("Poliza");
			fieldPoliza.setValue(Integer.toString(objeto.getPoliza()));
			
			PDField fieldVigenciaIni = acroForm.getField("VigenciaIni");
			fieldVigenciaIni.setValue(df.format(objeto.getVigenciaIni()));
			
			PDField fieldVigenciaFin = acroForm.getField("VigenciaFin");
			fieldVigenciaFin.setValue(df.format(objeto.getVigenciaFin()));

			PDField fieldFechaOcurrencia = acroForm.getField("FechaOcurrencia");
			fieldFechaOcurrencia.setValue(df.format(objeto.getFechaOcurencia()));
			
			PDField fieldFechaDerivacion = acroForm.getField("FechaDerivacion");
			fieldFechaDerivacion.setValue(df.format(objeto.getFechaDerivacion()));
			
			PDField fieldAjustadorMeridional = acroForm.getField("AjustadorMeridional");
			fieldAjustadorMeridional.setValue(objeto.getAjustadorMer());
			
			PDField fieldLiquidadorExterno = acroForm.getField("LiquidadorExterno");
			fieldLiquidadorExterno.setValue(objeto.getLiquidExt());
			
			PDField fieldResponsable = acroForm.getField("Responsable");
			fieldResponsable.setValue(objeto.getResponsable());
			
			PDField fieldTelFax = acroForm.getField("Tel/Fax");
			fieldTelFax.setValue(Integer.toString(objeto.getTelefono()));
			
			PDField fieldInt = acroForm.getField("Int");
			fieldInt.setValue(Integer.toString(objeto.getInterno()));
			
			PDField fieldemail = acroForm.getField("e-mail");
			fieldemail.setValue(objeto.getEmail());	
			
			
			String nombre = "Contrato Nro " + objeto.getSiniestro() + ".pdf" ;
						
			JOptionPane.showMessageDialog(null, "¡El PDF se creo!", "Confirmacion", JOptionPane.INFORMATION_MESSAGE);

			documento.save("src\\contratos\\" + nombre);
	        
			documento.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, "Error: El PDF no se pudo crear", "ERROR", JOptionPane.WARNING_MESSAGE);
			e.printStackTrace();
		}
	}
}
