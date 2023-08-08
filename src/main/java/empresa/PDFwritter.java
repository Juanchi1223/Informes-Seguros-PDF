package empresa;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfPage;
import com.itextpdf.kernel.pdf.PdfReader;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.kernel.pdf.canvas.PdfCanvas;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Image;
import com.itextpdf.forms.PdfAcroForm;
import com.itextpdf.forms.fields.PdfFormField;
import com.itextpdf.io.image.ImageData;
import com.itextpdf.io.image.ImageDataFactory;

import org.apache.pdfbox.io.MemoryUsageSetting;
import org.apache.pdfbox.multipdf.PDFMergerUtility;

public class PDFwritter {
	DateFormat df;
	PdfDocument documento;
	Document doc;
	int sini; 
	
	public PDFwritter(int sini) {
		df = new SimpleDateFormat("dd/MM/yyy");	
		String ruta = "src//main//java//src//contrato_template//Contrato4.0_Rellenable.pdf";
		String output = "src//main//java//src//contratos//Contrato Nro " + sini + ".pdf";
		
		try {
			documento = new PdfDocument(new PdfReader(ruta), new PdfWriter(output));
			doc = new Document(documento);
			this.sini = sini;
		}
		catch (Exception e) {
			System.out.println("NO SE PUDO ABRIR EL DOCUMENTO ");  // TODO ventaninita para el error (puede ser) y una barra de progreso
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

	public void fotoPag1(String foto, float x,float y,float w,float h) { // String foto1 = fotos.get(0);
		try 
		{
			ImageData imgData1 = ImageDataFactory.create(foto);
			
            PdfPage Page = documento.getPage(1);
            Image image = new Image(imgData1).scaleToFit(w, h);
            
            image.setFixedPosition(Page.getPageSize().getLeft() + x, Page.getPageSize().getTop() - y);
            doc.add(image);
            
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
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
			ArrayList<String> rutas = contrato.getFotosLugar().getRutas();
			
			// en las coordenadas el primer numero es el que da la calucalodra y el otro es el desvios que se agrega 
			
			fotoPag1(rutas.get(0), 38.267716535433f + 2, 324.19842519685f + 122, 121.63464566929f - 5, 126.05669291339f);
			fotoPag1(rutas.get(1), 175.88976377953f + 2, 324.19842519685f + 122, 121.63464566929f - 5, 126.05669291339f);
			fotoPag1(rutas.get(2), 38.267716535433f + 2, 482.11653543307f + 122, 121.63464566929f - 5, 126.05669291339f);
			fotoPag1(rutas.get(3), 175.88976377953f + 2, 482.11653543307f + 122, 121.63464566929f - 5, 126.05669291339f);
			fotoPag1(rutas.get(4), 338.45669291339f + 2, 327.85511811024f + 122 + 60, 189.52440944882f, 184.93228346457f - 5);
			
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
	
	public void paginasVehiculo(VehiculoAsegurado vehiculo) {
		try 
		{
			PdfDocument documentoTemp = new PdfDocument(new PdfReader("src//main//java//src//contrato_template//Vehiculos_Rellenable.pdf"), new PdfWriter("src//main//java//src//contrato_template//Vehiculos_Temp.pdf"));
			
	        PdfAcroForm acroForm = PdfAcroForm.getAcroForm(documentoTemp, true);
	        
	        PdfFormField  fieldvehiculo = acroForm.getField("tipoVehiculo");
	        fieldvehiculo.setValue(vehiculo.getTipo());
			
	        PdfFormField  fieldpropietario = acroForm.getField("propietario");
	        fieldpropietario.setValue(vehiculo.getPropietario());
	        
	        PdfFormField  fieldmarca = acroForm.getField("marca");
	        fieldmarca.setValue(vehiculo.getMarca());
	        
	        PdfFormField  fieldmodelo = acroForm.getField("modelo");
	        fieldmodelo.setValue(vehiculo.getModelo());
	        
	        PdfFormField  fieldano = acroForm.getField("ano");
	        fieldano.setValue(Integer.toString(vehiculo.getAño()));
	        
	        PdfFormField  fieldDominio = acroForm.getField("dominio");
	        fieldDominio.setValue(vehiculo.getDominio());
	        
	        PdfFormField  fieldnroChasis = acroForm.getField("nroChasis");
	        fieldnroChasis.setValue(vehiculo.getNroChasis());
	        
	        PdfFormField  fieldnroMotor = acroForm.getField("nroMotor");
	        fieldnroMotor.setValue(vehiculo.getNroMotor());
	        
	        PdfFormField  fieldDenuncia = acroForm.getField("denuncia");
	        fieldDenuncia.setValue(vehiculo.getDenuncia());
	        
	        PdfFormField  fieldDanos = acroForm.getField("danos");
	        fieldDanos.setValue(vehiculo.getDaños());
	        
	        PdfFormField  fieldDoc = acroForm.getField("documentacion");
	        fieldDoc.setValue(vehiculo.getDocumentacion());
	        
	        PdfFormField  fieldJustFts = acroForm.getField("justificacionFotos");
	        fieldJustFts.setValue(vehiculo.getJustificarFotos());
	        
	        PdfFormField  fielJustDoc = acroForm.getField("justificacionDoc");
	        fielJustDoc.setValue(vehiculo.getJustificarDocs());
		
	        documentoTemp.close();
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}

	public void guardar() {
		JOptionPane.showMessageDialog(null, "¡El PDF se creo!", "Confirmacion", JOptionPane.INFORMATION_MESSAGE);
		documento.close();
	}
	
	public void unirPDFs(ArrayList<String> rutasPDF, String rutaSalida) {	// !!!! ESTE ES MEJOR
	    try {
	        PDFMergerUtility pdfMerger = new PDFMergerUtility();

	        // Agregar los archivos PDF que deseas unir
	        for (String rutaPDF : rutasPDF) {
	            pdfMerger.addSource(new File(rutaPDF));
	        }

	        // Establecer el archivo PDF de salida
	        pdfMerger.setDestinationFileName(rutaSalida);

	        // Unir los archivos PDF utilizando setupTempFileOnly()
	        pdfMerger.mergeDocuments(MemoryUsageSetting.setupTempFileOnly());

	        System.out.println("Los PDFs se han unido en uno solo con éxito.");
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}
	
	public void unirPDFs(String rutaPDF1, String rutaPDF2, String rutaSalida) {
	    try {
	        // Crear un nuevo documento PDF de salida con un PdfWriter asociado
	        PdfDocument outputPdfDocument = new PdfDocument(new PdfWriter(rutaSalida));

	        // Abrir los documentos de entrada (PDFs que deseas unir)
	        PdfDocument inputPdfDocument1 = new PdfDocument(new PdfReader(rutaPDF1));
	        PdfDocument inputPdfDocument2 = new PdfDocument(new PdfReader(rutaPDF2));

	        // Obtener el número total de páginas de cada documento de entrada
	        int totalPaginas1 = inputPdfDocument1.getNumberOfPages();
	        int totalPaginas2 = inputPdfDocument2.getNumberOfPages();

	        // Copiar el contenido de las páginas del primer documento al documento de salida
	        for (int i = 1; i <= totalPaginas1; i++) {
	            PdfPage pagina = inputPdfDocument1.getPage(i).copyTo(outputPdfDocument);
	            outputPdfDocument.addPage(pagina);
	        }

	        // Copiar el contenido de las páginas del segundo documento al documento de salida
	        for (int i = 1; i <= totalPaginas2; i++) {
	            PdfPage pagina = inputPdfDocument2.getPage(i).copyTo(outputPdfDocument);
	            outputPdfDocument.addPage(pagina);
	        }

	        // Cerrar los documentos
	        outputPdfDocument.close();
	        inputPdfDocument1.close();
	        inputPdfDocument2.close();

	        System.out.println("Los PDFs se han unido en uno solo con éxito.");
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}
	
	private void llenarField(PdfAcroForm acroForm, String field, String value) {
		PdfFormField  fieldvehiculo = acroForm.getField(field);
        fieldvehiculo.setValue(value);
	}
	
}
