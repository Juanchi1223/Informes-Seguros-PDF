package empresa;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import javax.swing.JOptionPane;

import org.apache.pdfbox.Loader;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject;
import org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm;
import org.apache.pdfbox.pdmodel.interactive.form.PDField;



public class PDFwritter {
	DateFormat df;
	File template;
	PDDocument documento;

	public PDFwritter() {
		df = new SimpleDateFormat("dd/MM/yyy");	
		template = new File("src\\contrato_template\\Contrato4.0_Rellenable.pdf");
		
		try {
			documento = Loader.loadPDF(template);
		}
		catch (Exception e) {
			System.out.println("NO SE PUDO ABRIR EL DOCUMENTO ");  // TODO ventaninita para el error (puede ser)
			System.out.println(e);
		}
	}
	
	public void insertar(InformacionBasica contrato) {
		PDAcroForm acroForm = documento.getDocumentCatalog().getAcroForm();
		
		try {
			PDField fieldSiniestro = acroForm.getField("siniestro"); 
			fieldSiniestro.setValue(Integer.toString(contrato.getSiniestro()));
			
			PDField fieldPoliza = acroForm.getField("poliza");
			fieldPoliza.setValue(Integer.toString(contrato.getPoliza()));
			
			PDField fieldVigenciaIni = acroForm.getField("vigenciaIni");
			fieldVigenciaIni.setValue(df.format(contrato.getVigenciaIni()));
			
			PDField fieldVigenciaFin = acroForm.getField("vigenciaFin");
			fieldVigenciaFin.setValue(df.format(contrato.getVigenciaFin()));
	
			PDField fieldFechaOcurrencia = acroForm.getField("fechaOc");
			fieldFechaOcurrencia.setValue(df.format(contrato.getFechaOcurencia()));
			
			PDField fieldFechaDerivacion = acroForm.getField("fechaDer");
			fieldFechaDerivacion.setValue(df.format(contrato.getFechaDerivacion()));
			
			PDField fieldAjustadorMeridional = acroForm.getField("ajustador");
			fieldAjustadorMeridional.setValue(contrato.getAjustadorMer());
			
			PDField fieldLiquidadorExterno = acroForm.getField("liquidador");
			fieldLiquidadorExterno.setValue(contrato.getLiquidExt());
			
			PDField fieldResponsable = acroForm.getField("responsable");
			fieldResponsable.setValue(contrato.getResponsable());
			
			PDField fieldTelFax = acroForm.getField("tel");
			fieldTelFax.setValue(Integer.toString(contrato.getTelefono()));
			
			PDField fieldInt = acroForm.getField("int");
			fieldInt.setValue(Integer.toString(contrato.getInterno()));
			
			PDField fieldemail = acroForm.getField("email");
			fieldemail.setValue(contrato.getEmail());	
		}
		catch (Exception e){
			System.out.println("ERROR CON LOS FIELDS EN BASICA");
			System.out.println(e);
		}
	}

	public void foto(String x) { // contrato.getFotosLugar().getRutas().get(0) TODO SEGUIR FOTOS
		try {
			PDPage page = documento.getPage(0);
			PDImageXObject pdImage1 = PDImageXObject.createFromFile(x, documento);  
			PDPageContentStream contents = new PDPageContentStream(documento, page);
			contents.drawImage(pdImage1, 51.023628475f , 432.26462139f, 162.17954799f, 168.07561173f);
			contents.close();
		}
		catch (Exception e){
			
		}
	}
	public void insertar(InformacionSiniestro contrato) {
		PDAcroForm acroForm = documento.getDocumentCatalog().getAcroForm();

		try {
			PDField fieldfecha = acroForm.getField("fecha");
			fieldfecha.setValue(df.format(contrato.getFechaHoraMin()));
			
			PDField fieldhora = acroForm.getField("hora");
			fieldhora.setValue(contrato.getHora());
			
			PDField fieldmin = acroForm.getField("min");
			fieldmin.setValue(contrato.getMin());
			
			PDField fieldtmp = acroForm.getField("tiempo");
			fieldtmp.setValue(contrato.getTiempo());
			
			PDField fieldest = acroForm.getField("estado");
			fieldest.setValue(contrato.getEstado());
			
			PDField fieldcalle = acroForm.getField("calle");
			fieldcalle.setValue(contrato.getLugar().getCalle());
			
			PDField fielnumero = acroForm.getField("numero");
			fielnumero.setValue(Integer.toString(contrato.getLugar().getNumero()));
			
			PDField fieldloc = acroForm.getField("localidad");
			fieldloc.setValue(contrato.getLugar().getLocalidad());

			PDField fieldprov = acroForm.getField("provincia");
			fieldprov.setValue(contrato.getLugar().getProvincia());
			
			PDField fieldpais = acroForm.getField("pais");
			fieldpais.setValue(contrato.getLugar().getPais());
			
			PDField fieldjurr = acroForm.getField("jurridicion");
			fieldjurr.setValue(contrato.getLugar().getJurridicion());
			
			PDField fieldamb = acroForm.getField("ambiente");
			fieldamb.setValue(contrato.getLugar().getAmbiente());
			
			PDField fieldvis = acroForm.getField("visibilidad");
			fieldvis.setValue(contrato.getLugar().getVisibilidad());
			
			PDField fieldill = acroForm.getField("iluminacion");
			fieldill.setValue(contrato.getLugar().getIluminacion());
			
			PDField fieldcarr = acroForm.getField("carriles");
			fieldcarr.setValue(Integer.toString(contrato.getLugar().getCarriles()));

			PDField fielvel = acroForm.getField("velocidad");
			fielvel.setValue(Integer.toString(contrato.getLugar().getVelocidad()));
			
			PDField fieldambulancia = acroForm.getField("ambulancia");
			fieldambulancia.setValue(contrato.getLugar().getAmbulancia());
			
			PDField fieldambCual = acroForm.getField("cual");
			fieldambCual.setValue(contrato.getLugar().getDescAmbulancia());
			
			PDField fieldpol = acroForm.getField("policial");
			fieldpol.setValue(contrato.getLugar().getPolicia());
			
			PDField fieldsumario = acroForm.getField("sumario");
			fieldsumario.setValue(contrato.getLugar().getSumario());
			
			PDField fieldcausa = acroForm.getField("causa");
			fieldcausa.setValue(contrato.getCausa());
			
			PDField fieldtestSN = acroForm.getField("testigos");
			fieldtestSN.setValue(contrato.getTestigosBool());
			
			PDField fieldtest1 = acroForm.getField("testigo1");
			fieldtest1.setValue(contrato.getTestigos()[0]);
			
			PDField fieldtest2 = acroForm.getField("testigo2");
			fieldtest2.setValue(contrato.getTestigos()[1]);
			
			PDField fieldtest3 = acroForm.getField("testigo3");
			fieldtest3.setValue(contrato.getTestigos()[2]);
			
			
			// FALTA AGREGAR LAS FOTOS 
			
			// ARRANCA SEGUNDA PAGINA
			
			PDField fieldverAs = acroForm.getField("versionAs");
			fieldverAs.setValue(contrato.getVersionAsegurado());
			
			PDField fieldverTer = acroForm.getField("versionTer");
			fieldverTer.setValue(contrato.getVersionTercero());
			
			PDField fieldmecanica = acroForm.getField("mecanica");
			fieldmecanica.setValue(contrato.getMecanicaAccidente());
			
			PDField fieldobserv = acroForm.getField("observaciones");
			fieldobserv.setValue(contrato.getObservaciones());
			
			PDField fieldcober = acroForm.getField("cobertura");
			fieldcober.setValue(contrato.getCobertura());

			PDField fieldfraude = acroForm.getField("fraude");
			fieldfraude.setValue(contrato.getIndiciosFraude());
			
			PDField fieldanaCob = acroForm.getField("analisisCob");
			fieldanaCob.setValue(contrato.getAnalisis());
			
			PDField fieldresp = acroForm.getField("responsabilidad");
			fieldresp.setValue(contrato.getResponsabilidad());
			
			PDField fieldporcet = acroForm.getField("porcentaje");
			fieldporcet.setValue(contrato.getPorcentajeresponsabilidad());
			
			PDField fieldanalResp = acroForm.getField("analisisRes");
			fieldanalResp.setValue(contrato.getDescResponsabilidad());
			
			PDField fieldconclu = acroForm.getField("conclusiones");
			fieldconclu.setValue(contrato.getConcluciones());
			
			PDField fieldtransable = acroForm.getField("transable");
			fieldtransable.setValue(contrato.getTransable());
			
			PDField fieldmoneda = acroForm.getField("moneda");
			fieldmoneda.setValue(contrato.getMoneda());
			
			PDField fieldidem = acroForm.getField("indemnizacion");
			fieldidem.setValue(Integer.toString(contrato.getIndemnizacion()));
			
			PDField fieldhonorarios = acroForm.getField("honorarios");
			fieldhonorarios.setValue(Integer.toString(contrato.getHonorariosGastos()));
			
		} catch (Exception e) {
			System.out.println("ERROR CON FIELDS EN SINIESTRO");
			System.out.println(e);
		}
	}
	
	public void guardar(int sini) {
		String nombre = "Contrato Nro " + sini + ".pdf" ;
		
		JOptionPane.showMessageDialog(null, "¡El PDF se creo!", "Confirmacion", JOptionPane.INFORMATION_MESSAGE);

		
		try {
			// TODO buscar una manera de agregarle una contraseña 
			
			documento.save("src\\contratos\\" + nombre);
			
			documento.close();
		} catch (IOException e) {
			System.out.println("ERROR");
			System.out.println(e);
		}

	}
}
