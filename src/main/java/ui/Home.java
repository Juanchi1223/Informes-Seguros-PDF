package ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

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
import ui.Daños.ManejoDeDaños;
import ui.InformacionSiniestro.InforSini;
import ui.Peatones.ManejadorDePeatones;
import ui.VehiculosAs.ManejoDeVehiculoAs;
import ui.VehiculosTer.ManejoDeVehiculoTer;
import java.awt.Font;
import javax.swing.UIManager;
import java.awt.Color;


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
								e2.printStackTrace();
							}
							try { 
								salida.writeObject(contrato);
							} catch (IOException e1) {
								e1.printStackTrace();
							}
							try {
								salida.close();
							} catch (IOException e) {
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
		btnInfBasc.setFont(new Font("Verdana", Font.PLAIN, 11));
		btnInfBasc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				abrirVentanaInfor();
			}
		});
		btnInfBasc.setBounds(32, 49, 249, 53);
		contentPane.add(btnInfBasc);
		
		JButton btnSinistro = new JButton("Información del Siniestro");
		btnSinistro.setFont(new Font("Verdana", Font.PLAIN, 11));
		btnSinistro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				abrirInforSini();
			}

			
		});
		btnSinistro.setBounds(32, 113, 249, 53);
		contentPane.add(btnSinistro);
		
		JButton btnAsegLesio = new JButton("Vehículos Asegurados Lesionados");
		btnAsegLesio.setFont(new Font("Verdana", Font.PLAIN, 11));
		btnAsegLesio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				abrirAsegurados();
			}
		});
		btnAsegLesio.setBounds(32, 177, 249, 53);
		contentPane.add(btnAsegLesio);
		
		JButton btnTercLesn = new JButton("Vehículos Terceros Lesionados");
		btnTercLesn.setFont(new Font("Verdana", Font.PLAIN, 11));
		btnTercLesn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				abrirTerceros();
			}
		});
		btnTercLesn.setBounds(32, 241, 249, 53);
		contentPane.add(btnTercLesn);
		
		JButton btnPeaton = new JButton("Peaton");
		btnPeaton.setFont(new Font("Verdana", Font.PLAIN, 11));
		btnPeaton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				abrirPeaton();
			}
		});
		btnPeaton.setBounds(32, 305, 249, 53);
		contentPane.add(btnPeaton);
		
		JButton btnOtros = new JButton("Otros Daños");
		btnOtros.setFont(new Font("Verdana", Font.PLAIN, 11));
		btnOtros.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				abrirVentanaOtros();
			}
		});
		btnOtros.setBounds(32, 369, 249, 53);
		contentPane.add(btnOtros);
		
		JButton btnVerInf = new JButton("Ver");
		btnVerInf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					crearPDF();
				} catch (Exception e1) {
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
	}
	protected void abrirPeaton() {
		Peatones lista = contrato.getPeatones();
		ManejadorDePeatones ventana = new ManejadorDePeatones(lista);
		
		ventana.setModal(true);
		ventana.setVisible(true);
	}

	protected void abrirTerceros() {
		VehiculosLesionados vehiculos = contrato.getVehiculos();
		ManejoDeVehiculoTer ventana = new ManejoDeVehiculoTer(vehiculos);
		
		ventana.setModal(true);
		ventana.setVisible(true);
	}

	protected void abrirAsegurados() {
		VehiculosLesionados vehiculos = contrato.getVehiculos();
		ManejoDeVehiculoAs ventana = new ManejoDeVehiculoAs(vehiculos);
		
		ventana.setModal(true);
		ventana.setVisible(true);
		
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
	protected void crearPDF() {
		PDFwritter aux = new PDFwritter(contrato.getInfoaBas().getSiniestro());
		
		aux.insertar(contrato.getInfoaBas());
		aux.insertar(contrato.getInfoSin());
		
		aux.guardar(contrato.getInfoaBas().getSiniestro());
	}
}
