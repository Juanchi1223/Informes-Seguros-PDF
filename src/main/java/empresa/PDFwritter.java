package empresa;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import javax.swing.JOptionPane;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfReader;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.forms.PdfAcroForm;
import com.itextpdf.forms.fields.PdfFormField;

public class PDFwritter {
	DateFormat df;
	PdfDocument documento;

	public PDFwritter(int sini) {
		df = new SimpleDateFormat("dd/MM/yyy");	
		String ruta = "src//main//java//src//contrato_template//Contrato4.0_Rellenable.pdf";
		String output = "src//main//java//src//contratos//Contrato Nro " + sini + ".pdf";
		
		try {
			documento = new PdfDocument(new PdfReader(ruta), new PdfWriter(output));
		}
		catch (Exception e) {
			System.out.println("NO SE PUDO ABRIR EL DOCUMENTO ");  // TODO ventaninita para el error (puede ser)
			System.out.println(e);
		}
	}
	
	public void insertar(InformacionBasica contrato) {
        PdfAcroForm acroForm = PdfAcroForm.getAcroForm(documento, true);
		
		try {
			PdfFormField fieldSiniestro = acroForm.getField("siniestro"); 
			fieldSiniestro.setValue(Integer.toString(contrato.getSiniestro()));
			
			PdfFormField  fieldPoliza = acroForm.getField("poliza");
			fieldPoliza.setValue(Integer.toString(contrato.getPoliza()));
			
			PdfFormField  fieldVigenciaIni = acroForm.getField("vigenciaIni");
			fieldVigenciaIni.setValue(df.format(contrato.getVigenciaIni()));
			
			PdfFormField  fieldVigenciaFin = acroForm.getField("vigenciaFin");
			fieldVigenciaFin.setValue(df.format(contrato.getVigenciaFin()));
	
			PdfFormField  fieldFechaOcurrencia = acroForm.getField("fechaOc");
			fieldFechaOcurrencia.setValue(df.format(contrato.getFechaOcurencia()));
			
			PdfFormField  fieldFechaDerivacion = acroForm.getField("fechaDer");
			fieldFechaDerivacion.setValue(df.format(contrato.getFechaDerivacion()));
			
			PdfFormField  fieldAjustadorMeridional = acroForm.getField("ajustador");
			fieldAjustadorMeridional.setValue(contrato.getAjustadorMer());
			
			PdfFormField  fieldLiquidadorExterno = acroForm.getField("liquidador");
			fieldLiquidadorExterno.setValue(contrato.getLiquidExt());
			
			PdfFormField  fieldResponsable = acroForm.getField("responsable");
			fieldResponsable.setValue(contrato.getResponsable());
			
			PdfFormField  fieldTelFax = acroForm.getField("tel");
			fieldTelFax.setValue(Integer.toString(contrato.getTelefono()));
			
			PdfFormField  fieldInt = acroForm.getField("int");
			fieldInt.setValue(Integer.toString(contrato.getInterno()));
			
			PdfFormField  fieldemail = acroForm.getField("email");
			fieldemail.setValue(contrato.getEmail());	
		}
		catch (Exception e){
			System.out.println("ERROR CON LOS FIELDS EN BASICA");
			System.out.println(e);
		}
	}

	public void foto(String x) { // contrato.getFotosLugar().getRutas().get(0) TODO SEGUIR FOTOS
		
		
	}
	public void insertar(InformacionSiniestro contrato) {
        PdfAcroForm acroForm = PdfAcroForm.getAcroForm(documento, true);

		try {
			PdfFormField fieldfecha = acroForm.getField("fecha");
			fieldfecha.setValue(df.format(contrato.getFechaHoraMin()));
			
			PdfFormField fieldhora = acroForm.getField("hora");
			fieldhora.setValue(contrato.getHora());
			
			PdfFormField fieldmin = acroForm.getField("min");
			fieldmin.setValue(contrato.getMin());
			
			PdfFormField  fieldtmp = acroForm.getField("tiempo");
			fieldtmp.setValue(contrato.getTiempo());
			
			PdfFormField  fieldest = acroForm.getField("estado");
			fieldest.setValue(contrato.getEstado());
			
			PdfFormField  fieldcalle = acroForm.getField("calle");
			fieldcalle.setValue(contrato.getLugar().getCalle());
			
			PdfFormField  fielnumero = acroForm.getField("numero");
			fielnumero.setValue(Integer.toString(contrato.getLugar().getNumero()));
			
			PdfFormField  fieldloc = acroForm.getField("localidad");
			fieldloc.setValue(contrato.getLugar().getLocalidad());

			PdfFormField  fieldprov = acroForm.getField("provincia");
			fieldprov.setValue(contrato.getLugar().getProvincia());
			
			PdfFormField  fieldpais = acroForm.getField("pais");
			fieldpais.setValue(contrato.getLugar().getPais());
			
			PdfFormField  fieldjurr = acroForm.getField("jurridicion");
			fieldjurr.setValue(contrato.getLugar().getJurridicion());
			
			PdfFormField  fieldamb = acroForm.getField("ambiente");
			fieldamb.setValue(contrato.getLugar().getAmbiente());
			
			PdfFormField  fieldvis = acroForm.getField("visibilidad");
			fieldvis.setValue(contrato.getLugar().getVisibilidad());
			
			PdfFormField  fieldill = acroForm.getField("iluminacion");
			fieldill.setValue(contrato.getLugar().getIluminacion());
			
			PdfFormField  fieldcarr = acroForm.getField("carriles");
			fieldcarr.setValue(Integer.toString(contrato.getLugar().getCarriles()));

			PdfFormField  fielvel = acroForm.getField("velocidad");
			fielvel.setValue(Integer.toString(contrato.getLugar().getVelocidad()));
			
			PdfFormField  fieldambulancia = acroForm.getField("ambulancia");
			fieldambulancia.setValue(contrato.getLugar().getAmbulancia());
			
			PdfFormField  fieldambCual = acroForm.getField("cual");
			fieldambCual.setValue(contrato.getLugar().getDescAmbulancia());
			
			PdfFormField  fieldpol = acroForm.getField("policial");
			fieldpol.setValue(contrato.getLugar().getPolicia());
			
			PdfFormField  fieldsumario = acroForm.getField("sumario");
			fieldsumario.setValue(contrato.getLugar().getSumario());
			
			PdfFormField  fieldcausa = acroForm.getField("causa");
			fieldcausa.setValue(contrato.getCausa());
			
			PdfFormField  fieldtestSN = acroForm.getField("testigos");
			fieldtestSN.setValue(contrato.getTestigosBool());
			
			PdfFormField  fieldtest1 = acroForm.getField("testigo1");
			fieldtest1.setValue(contrato.getTestigos()[0]);
			
			PdfFormField  fieldtest2 = acroForm.getField("testigo2");
			fieldtest2.setValue(contrato.getTestigos()[1]);
			
			PdfFormField  fieldtest3 = acroForm.getField("testigo3");
			fieldtest3.setValue(contrato.getTestigos()[2]);
			
			
			// FALTA AGREGAR LAS FOTOS 
			
			// ARRANCA SEGUNDA PAGINA
			
			PdfFormField  fieldverAs = acroForm.getField("versionAs");
			fieldverAs.setValue(contrato.getVersionAsegurado());
			
			PdfFormField  fieldverTer = acroForm.getField("versionTer");
			fieldverTer.setValue(contrato.getVersionTercero());
			
			PdfFormField  fieldmecanica = acroForm.getField("mecanica");
			fieldmecanica.setValue(contrato.getMecanicaAccidente());
			
			PdfFormField  fieldobserv = acroForm.getField("observaciones");
			fieldobserv.setValue(contrato.getObservaciones());
			
			PdfFormField  fieldcober = acroForm.getField("cobertura");
			fieldcober.setValue(contrato.getCobertura());

			PdfFormField  fieldfraude = acroForm.getField("fraude");
			fieldfraude.setValue(contrato.getIndiciosFraude());
			
			PdfFormField  fieldanaCob = acroForm.getField("analisisCob");
			fieldanaCob.setValue(contrato.getAnalisis());
			
			PdfFormField  fieldresp = acroForm.getField("responsabilidad");
			fieldresp.setValue(contrato.getResponsabilidad());
			
			PdfFormField  fieldporcet = acroForm.getField("porcentaje");
			fieldporcet.setValue(contrato.getPorcentajeresponsabilidad());
			
			PdfFormField  fieldanalResp = acroForm.getField("analisisRes");
			fieldanalResp.setValue(contrato.getDescResponsabilidad());
			
			PdfFormField  fieldconclu = acroForm.getField("conclusiones");
			fieldconclu.setValue(contrato.getConcluciones());
			
			PdfFormField  fieldtransable = acroForm.getField("transable");
			fieldtransable.setValue(contrato.getTransable());
			
			PdfFormField  fieldmoneda = acroForm.getField("moneda");
			fieldmoneda.setValue(contrato.getMoneda());
			
			PdfFormField  fieldidem = acroForm.getField("indemnizacion");
			fieldidem.setValue(Integer.toString(contrato.getIndemnizacion()));
			
			PdfFormField  fieldhonorarios = acroForm.getField("honorarios");
			fieldhonorarios.setValue(Integer.toString(contrato.getHonorariosGastos()));
			
		} catch (Exception e) {
			System.out.println("ERROR CON FIELDS EN SINIESTRO");
			System.out.println(e);
		}
	}
	
	public void guardar(int sini) {
		JOptionPane.showMessageDialog(null, "¡El PDF se creo!", "Confirmacion", JOptionPane.INFORMATION_MESSAGE);
		documento.close();
	}
}
