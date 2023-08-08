package empresa;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

import org.apache.pdfbox.io.MemoryUsageSetting;
import org.apache.pdfbox.multipdf.PDFMergerUtility;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm;
import org.apache.pdfbox.pdmodel.interactive.form.PDField;

import com.itextpdf.forms.PdfAcroForm;
import com.itextpdf.forms.fields.PdfFormField;
import com.itextpdf.io.image.ImageData;
import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.pdf.PdfArray;
import com.itextpdf.kernel.pdf.PdfDictionary;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfName;
import com.itextpdf.kernel.pdf.PdfObject;
import com.itextpdf.kernel.pdf.PdfPage;
import com.itextpdf.kernel.pdf.PdfReader;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.AreaBreak;
import com.itextpdf.layout.element.Image;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.property.UnitValue;

public class PDFwriter {
	DateFormat df = new SimpleDateFormat("dd/MM/yyy");	

	public String insertar(InformacionBasica basica, InformacionSiniestro siniestro) {
		String output, input;
		PdfDocument documento;
		Document doc;
		
		input = "src//main//java//src//contrato_template//Contrato4.0_Rellenable.pdf";
		output = "src//main//java//src//temp//temp_inforBasicaSini.pdf";
		
		
		try {
			documento = new PdfDocument(new PdfReader(input), new PdfWriter(output));
			doc = new Document(documento);
			
	        PdfAcroForm acroForm = PdfAcroForm.getAcroForm(documento, true);

	        llenarField(acroForm, "siniestro", Integer.toString(basica.getSiniestro()));
	        llenarField(acroForm, "poliza", Integer.toString(basica.getPoliza()));
	        llenarField(acroForm, "vigenciaIni", df.format(basica.getVigenciaIni()));
	        llenarField(acroForm, "vigenciaFin", df.format(basica.getVigenciaFin()));
	        llenarField(acroForm, "fechaOc", df.format(basica.getFechaOcurencia()));
	        llenarField(acroForm, "fechaDer", df.format(basica.getFechaDerivacion()));
	        llenarField(acroForm, "ajustador", basica.getAjustadorMer());
	        llenarField(acroForm, "liquidador", basica.getLiquidExt());
	        llenarField(acroForm, "responsable", basica.getResponsable());
	        llenarField(acroForm, "tel", Integer.toString(basica.getTelefono()));
	        llenarField(acroForm, "int", Integer.toString(basica.getInterno()));
	        llenarField(acroForm, "email", basica.getEmail());
	        
	        // PARTE DE SINIESTRO
	        llenarField(acroForm, "fecha", df.format(siniestro.getFechaHoraMin()));
	        llenarField(acroForm, "hora", siniestro.getHora());
	        llenarField(acroForm, "min", siniestro.getMin());
	        llenarField(acroForm, "tiempo", siniestro.getTiempo());
	        llenarField(acroForm, "estado", siniestro.getEstado());
	        llenarField(acroForm, "calle", siniestro.getLugar().getCalle());
	        llenarField(acroForm, "numero", Integer.toString(siniestro.getLugar().getNumero()));
	        llenarField(acroForm, "localidad", siniestro.getLugar().getLocalidad());
	        llenarField(acroForm, "provincia", siniestro.getLugar().getProvincia());
	        llenarField(acroForm, "pais", siniestro.getLugar().getPais());
	        llenarField(acroForm, "jurridicion", siniestro.getLugar().getJurridicion());
	        llenarField(acroForm, "ambiente", siniestro.getLugar().getAmbiente());
	        llenarField(acroForm, "visibilidad", siniestro.getLugar().getVisibilidad());
	        llenarField(acroForm, "iluminacion", siniestro.getLugar().getIluminacion());
	        llenarField(acroForm, "carriles", Integer.toString(siniestro.getLugar().getCarriles()));
	        llenarField(acroForm, "velocidad", Integer.toString(siniestro.getLugar().getVelocidad()));
	        llenarField(acroForm, "ambulancia", siniestro.getLugar().getAmbulancia());
	        llenarField(acroForm, "cual", siniestro.getLugar().getDescAmbulancia());
	        llenarField(acroForm, "policial", siniestro.getLugar().getPolicia());
	        llenarField(acroForm, "sumario", siniestro.getLugar().getSumario());
	        llenarField(acroForm, "causa", siniestro.getCausa());
	        llenarField(acroForm, "testigos", siniestro.getTestigosBool());
	        llenarField(acroForm, "testigo1", siniestro.getTestigos()[0]);
	        llenarField(acroForm, "testigo2", siniestro.getTestigos()[1]);
	        llenarField(acroForm, "testigo3", siniestro.getTestigos()[2]);
	        
	        // FOTOS
			ArrayList<String> rutas = siniestro.getFotosLugar().getRutas();
			
			fotoPag1(rutas.get(0), 38.267716535433f + 2, 324.19842519685f + 122, 121.63464566929f - 5, 126.05669291339f, documento, doc);
			fotoPag1(rutas.get(1), 175.88976377953f + 2, 324.19842519685f + 122, 121.63464566929f - 5, 126.05669291339f, documento, doc);
			fotoPag1(rutas.get(2), 38.267716535433f + 2, 482.11653543307f + 122, 121.63464566929f - 5, 126.05669291339f, documento, doc);
			fotoPag1(rutas.get(3), 175.88976377953f + 2, 482.11653543307f + 122, 121.63464566929f - 5, 126.05669291339f, documento, doc);
			fotoPag1(rutas.get(4), 338.45669291339f + 2, 327.85511811024f + 122 + 60, 189.52440944882f, 184.93228346457f - 5, documento, doc);
	        
	        // SEGUNDA PAGINA
			llenarField(acroForm, "versionAs", siniestro.getVersionAsegurado());
		    llenarField(acroForm, "versionTer", siniestro.getVersionTercero());
		    llenarField(acroForm, "mecanica", siniestro.getMecanicaAccidente());
		    llenarField(acroForm, "observaciones", siniestro.getObservaciones());
		    llenarField(acroForm, "cobertura", siniestro.getCobertura());
		    llenarField(acroForm, "fraude", siniestro.getIndiciosFraude());
		    llenarField(acroForm, "analisisCob", siniestro.getAnalisis());
		    llenarField(acroForm, "responsabilidad", siniestro.getResponsabilidad());
		    llenarField(acroForm, "porcentaje", siniestro.getPorcentajeresponsabilidad());
		    llenarField(acroForm, "analisisRes", siniestro.getDescResponsabilidad());
		    llenarField(acroForm, "conclusiones", siniestro.getConcluciones());
		    llenarField(acroForm, "transable", siniestro.getTransable());
		    llenarField(acroForm, "moneda", siniestro.getMoneda());
		    llenarField(acroForm, "indemnizacion", Integer.toString(siniestro.getIndemnizacion()));
		    llenarField(acroForm, "honorarios", Integer.toString(siniestro.getHonorariosGastos()));

		    doc.close();
		    documento.close();
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return output;
	} 
	
	public void fotoPag1(String foto, float x,float y,float w,float h, PdfDocument documento, Document doc) { // String foto1 = fotos.get(0);
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
	
	
	public String insertar(VehiculoAsegurado vehiculo, int indice) {
		String output, input, rutaFinal;
		ArrayList<String> listaRutas;
		PdfDocument documento;
		Document doc;
		
		input = "src//main//java//src//contrato_template//Vehiculos_Rellenable.pdf";
		output = "src//main//java//src//temp//tempVehiculoPasajero//temp_Vehiculo.pdf";
		
		rutaFinal = "src//main//java//src//temp//temp_vehiculo_"+ indice +".pdf";
		
		try {
			documento = new PdfDocument(new PdfReader(input), new PdfWriter(output));
			doc = new Document(documento);
			
	        PdfAcroForm acroForm = PdfAcroForm.getAcroForm(documento, true);
			
			llenarField(acroForm, "tipoVehiculo", vehiculo.getTipo());
		    llenarField(acroForm, "propietario", vehiculo.getPropietario());
		    llenarField(acroForm, "marca", vehiculo.getMarca());
		    llenarField(acroForm, "modelo", vehiculo.getModelo());
		    llenarField(acroForm, "ano", Integer.toString(vehiculo.getAño()));
		    llenarField(acroForm, "dominio", vehiculo.getDominio());
		    llenarField(acroForm, "nroChasis", vehiculo.getNroChasis());
		    llenarField(acroForm, "nroMotor", vehiculo.getNroMotor());
		    llenarField(acroForm, "seguro", "-");
		    llenarField(acroForm, "seguroDesc", "-");
		    llenarField(acroForm, "denuncia", vehiculo.getDenuncia());
		    llenarField(acroForm, "danos", vehiculo.getDaños());
		    llenarField(acroForm, "documentacion", vehiculo.getDocumentacion());
		    llenarField(acroForm, "justificacionFotos", vehiculo.getJustificarFotos());
		    llenarField(acroForm, "justificacionDoc", vehiculo.getJustificarDocs());
		    
		    // AGREGAR LAS FOTOS
		    
		    ArrayList<String> fotosDocs = vehiculo.getDocFotos().getRutas();
		    
		    ArrayList<String> fotosRod = vehiculo.getRodadoFotos().getRutas();
		    
		    ArrayList<String> fotosCot = vehiculo.getCotizacion().getRutas();
		    
            PdfPage Page = documento.getPage(1);
            
            agregarFoto(fotosRod.get(0), Page, doc, 18.68031496f + 7.5f, 261.8645669f + 250, 265.4645669f, 252.3685039f- 5);
            agregarFoto(fotosRod.get(1), Page, doc, 297.6377953f + 7.5f, 261.8645669f + 250, 265.4645669f, 252.3685039f- 5);
            agregarFoto(fotosRod.get(2), Page, doc, 18.68031496f + 7.5f, 528.4629921f + 250, 265.4645669f, 252.3685039f- 5);
            agregarFoto(fotosRod.get(3), Page, doc, 297.6377953f + 7.5f, 528.4629921f + 250, 265.4645669f, 252.3685039f- 5);
            
            doc.add(new AreaBreak());	// PASAR A PAG 2
            
		    agregarFoto(fotosDocs.get(0), Page, doc, 18.68031496f + 7.5f, 82.68661417f + 250, 265.4645669f, 252.3685039f- 5);
		    agregarFoto(fotosDocs.get(1), Page, doc, 297.6377953f + 7.5f, 82.68661417f + 250, 265.4645669f, 252.3685039f- 5);
		    
		    //80.64566929	384.9448819	425.6503937	429.5055118
		    agregarFoto(fotosCot.get(0), Page, doc, 80.64566929f + 2f, 384.9448819f + 427, 425.6503937f, 429.5055118f- 7);
		    
		    doc.close();
		    documento.close();
			// AGREGAR LOS PASAJEROS
			listaRutas = new ArrayList<String>();
			String rutas;
			
			listaRutas.add(output);
			
			ArrayList<Tripulantes> listaTrip = vehiculo.getListaTripulantes();
			
			for (int i = 0; i < listaTrip.size(); i++) {
				Tripulantes aux = listaTrip.get(i);
				rutas = insertar(aux, i);
				listaRutas.add(rutas);
			}
		
			
			unirPDFs(listaRutas, rutaFinal);
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return rutaFinal;
	}
	private void agregarFoto(String foto, PdfPage page, Document doc, float x,float y,float w,float h) {
		try  
		{
			ImageData imgData1 = ImageDataFactory.create(foto);
		 	Image image = new Image(imgData1).scaleToFit(w, h);
	        
	        image.setFixedPosition(page.getPageSize().getLeft() + x, page.getPageSize().getTop() - y);
	        doc.add(image);
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
       
	}
	
	private String insertar(Tripulantes a, int i) {
		String output, input;
		PdfDocument documento;
		Document doc;
		
		input = "src//main//java//src//contrato_template//Tripulantes_Rellenable.pdf";
		output = "src//main//java//src//temp//tempVehiculoPasajero//temp_psjro_"+ i +".pdf";
		
		try {
			documento = new PdfDocument(new PdfReader(input), new PdfWriter(output));
			doc = new Document(documento);
			
	        PdfAcroForm acroForm = PdfAcroForm.getAcroForm(documento, true);
			
			llenarField(acroForm, "tipoPersona", a.getPersona());
			llenarField(acroForm, "apellido", a.getApellido());
			llenarField(acroForm, "nombres", a.getNombre());
			llenarField(acroForm, "edad", a.getEdad());
			llenarField(acroForm, "documento", a.getNroDocumento());
			llenarField(acroForm, "celular", a.getCelular());
			llenarField(acroForm, "telefono", a.getTelefono());
			llenarField(acroForm, "ocupacion", a.getOcupacion());
			llenarField(acroForm, "calle", a.getCalle());
			llenarField(acroForm, "numero", a.getNumero());
			llenarField(acroForm, "piso", a.getPiso());
			llenarField(acroForm, "depto", a.getDept());
			llenarField(acroForm, "localidad", a.getLocalidad());
			llenarField(acroForm, "partido", a.getPartido());
			llenarField(acroForm, "provincia", a.getProvincia());
			llenarField(acroForm, "lesionado", a.getLesionado());
			llenarField(acroForm, "ART", a.getArt());
			llenarField(acroForm, "nombreART", a.getNombreArt());
			llenarField(acroForm, "lugarAtencion", a.getLugarAtencion());
			llenarField(acroForm, "alcoholemia", a.getAlcoholemia());
			llenarField(acroForm, "abogado", a.getAbogado());
			llenarField(acroForm, "apellidoDr", a.getApellidoDr());
			llenarField(acroForm, "nombresDr", a.getNombreDr());
			llenarField(acroForm, "licenciaConducir", a.getLicencia());
			llenarField(acroForm, "entidadEmisora", a.getAutoridadEmisora());
			llenarField(acroForm, "vigenciaDesde", a.getVigenciaIni());
			llenarField(acroForm, "vigenciaHasta", a.getVigenciaFin());
			llenarField(acroForm, "justificacionAcred", a.getJustificaAcred());
			
			//AGREGAR FOTOS
			
			doc.close();
			documento.close();
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return output;
	}
	
	public String insertar(VehiculoTercero vehiculo, int indice) {
		String output, input, rutaFinal;
		ArrayList<String> listaRutas;
		PdfDocument documento;
		Document doc;
		
		input = "src//main//java//src//contrato_template//Vehiculos_Rellenable.pdf";
		output = "src//main//java//src//temp//tempVehiculoPasajero//temp_Vehiculo.pdf";
		
		rutaFinal = "src//main//java//src//temp//temp_vehiculoTer_"+ indice +".pdf";
		
		try {
			documento = new PdfDocument(new PdfReader(input), new PdfWriter(output));
			doc = new Document(documento);
			
	        PdfAcroForm acroForm = PdfAcroForm.getAcroForm(documento, true);
			
			llenarField(acroForm, "tipoVehiculo", vehiculo.getTipo());
		    llenarField(acroForm, "propietario", vehiculo.getPropietario());
		    llenarField(acroForm, "marca", vehiculo.getMarca());
		    llenarField(acroForm, "modelo", vehiculo.getModelo());
		    llenarField(acroForm, "ano", Integer.toString(vehiculo.getAño()));
		    llenarField(acroForm, "dominio", vehiculo.getDominio());
		    llenarField(acroForm, "nroChasis", vehiculo.getNroChasis());
		    llenarField(acroForm, "nroMotor", vehiculo.getNroMotor());
		    llenarField(acroForm, "seguro", vehiculo.getSeguro());
		    llenarField(acroForm, "seguroDesc", vehiculo.getDescSeguro());
		    llenarField(acroForm, "denuncia", vehiculo.getDenuncia());
		    llenarField(acroForm, "danos", vehiculo.getDaños());
		    llenarField(acroForm, "documentacion", vehiculo.getDocumentacion());
		    llenarField(acroForm, "justificacionFotos", vehiculo.getJustificarFotos());
		    llenarField(acroForm, "justificacionDoc", vehiculo.getJustificarDocs());
		    
		    // AGREGAR LAS FOTOS
		    
		    ArrayList<String> fotosDocs = vehiculo.getDocFotos().getRutas();
		    
		    ArrayList<String> fotosRod = vehiculo.getRodadoFotos().getRutas();
		    
		    ArrayList<String> fotosCot = vehiculo.getCotizacion().getRutas();
		    
            PdfPage Page = documento.getPage(1);
            
            agregarFoto(fotosRod.get(0), Page, doc, 18.68031496f + 7.5f, 261.8645669f + 250, 265.4645669f, 252.3685039f- 5);
            agregarFoto(fotosRod.get(1), Page, doc, 297.6377953f + 7.5f, 261.8645669f + 250, 265.4645669f, 252.3685039f- 5);
            agregarFoto(fotosRod.get(2), Page, doc, 18.68031496f + 7.5f, 528.4629921f + 250, 265.4645669f, 252.3685039f- 5);
            agregarFoto(fotosRod.get(3), Page, doc, 297.6377953f + 7.5f, 528.4629921f + 250, 265.4645669f, 252.3685039f- 5);
            
            doc.add(new AreaBreak());	// PASAR A PAG 2
            
		    agregarFoto(fotosDocs.get(0), Page, doc, 18.68031496f + 7.5f, 82.68661417f + 250, 265.4645669f, 252.3685039f- 5);
		    agregarFoto(fotosDocs.get(1), Page, doc, 297.6377953f + 7.5f, 82.68661417f + 250, 265.4645669f, 252.3685039f- 5);
		    
		    agregarFoto(fotosCot.get(0), Page, doc, 80.64566929f + 2f, 384.9448819f + 427, 425.6503937f, 429.5055118f- 7);
		    
		    doc.close();
		    documento.close();
			// AGREGAR LOS PASAJEROS
			listaRutas = new ArrayList<String>();
			String rutas;
			
			listaRutas.add(output);
					
			ArrayList<Tripulantes> listaTrip = vehiculo.getListaTripulantes();
						
			for (int i = 0; i < listaTrip.size(); i++) {
				Tripulantes aux = listaTrip.get(i);
				rutas = insertar(aux, i);
				listaRutas.add(rutas);
			}
		
			
			unirPDFs(listaRutas, rutaFinal);
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return rutaFinal;
	}
	
	public String insertar(Daño a, int i) {
		String output, input;
		PdfDocument documento;
		Document doc;
		
		input = "src//main//java//src//contrato_template//Daños_Rellenable.pdf";
		output = "src//main//java//src//temp//temp_daño_"+ i +".pdf";

		try {
			documento = new PdfDocument(new PdfReader(input), new PdfWriter(output));
			doc = new Document(documento);

			PdfAcroForm acroForm = PdfAcroForm.getAcroForm(documento, true);

			llenarField(acroForm, "propietario", a.getNombreProp());
			llenarField(acroForm, "seguro", a.getSeguro());
			llenarField(acroForm, "seguroCual", a.getNombreSeguro());
			llenarField(acroForm, "denuncia", a.getDenuncia());
			llenarField(acroForm, "documentacion", a.getDocumentacion());
			llenarField(acroForm, "justificarDoc", a.getJustficarDoc());
			llenarField(acroForm, "justificarFotos", a.getJustificaFoto());

			doc.close();
			documento.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return output;
	}
	public String insertar(Peaton a, int i) {
		String output, input;
		PdfDocument documento;
		Document doc;
		
		input = "src//main//java//src//contrato_template//Peatones_Rellenable.pdf";
		output = "src//main//java//src//temp//temp_peaton_"+ i +".pdf";

		try {
			documento = new PdfDocument(new PdfReader(input), new PdfWriter(output));
			doc = new Document(documento);

			PdfAcroForm acroForm = PdfAcroForm.getAcroForm(documento, true);

			llenarField(acroForm, "apellido", a.getApellido());
			llenarField(acroForm, "nombre", a.getNombre());
			llenarField(acroForm, "edad", a.getEdad());
			llenarField(acroForm, "celular", a.getCelular());
			llenarField(acroForm, "telefono", a.getTelefono());
			llenarField(acroForm, "ocupacion", a.getOcupacion());
			llenarField(acroForm, "documento", a.getNroDocumento());
			llenarField(acroForm, "calle", a.getCalle());
			llenarField(acroForm, "localidad", a.getLocalidad());
			llenarField(acroForm, "provincia", a.getProvincia());
			llenarField(acroForm, "partido", a.getPartido());
			llenarField(acroForm, "numero", a.getNumero());
			llenarField(acroForm, "piso", a.getPiso());
			llenarField(acroForm, "depto", a.getDept());
			llenarField(acroForm, "lesionado", a.getLesionado());
			llenarField(acroForm, "art", a.getArt());
			llenarField(acroForm, "nombreART", a.getNombreArt());
			llenarField(acroForm, "lugarATT", a.getLugarAtencion());
			llenarField(acroForm, "abogado", a.getAbogado());
			llenarField(acroForm, "apellidoDr", a.getApellidoDr());
			llenarField(acroForm, "nombreDr", a.getNombreDr());
			llenarField(acroForm, "justificarAcred", a.getJustificaAcred());

			// TODO AGREGAR FOTOS peaton
			
			doc.close();
			documento.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return output;
	}

	// FUNCIONES PARA FORMAR EL PDF
	
	public void unirPDFs(ArrayList<String> rutasPDF, String rutaSalida) {	
	    try {
	        PDFMergerUtility pdfMerger = new PDFMergerUtility();

	        for (String rutaPDF : rutasPDF) {
	            pdfMerger.addSource(new File(rutaPDF));
	        }

	        pdfMerger.setDestinationFileName(rutaSalida);

	        pdfMerger.mergeDocuments(MemoryUsageSetting.setupTempFileOnly());

	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}
	
	public void bloquearCampos(String ruta) {
		 try (PDDocument document = PDDocument.load(new File(ruta))) {
	            PDAcroForm acroForm = document.getDocumentCatalog().getAcroForm();
	            
	            for (PDField field : acroForm.getFields()) {
	                field.setReadOnly(true);
	            }
	            
	            document.save(ruta);
            
		 } catch (IOException e) {
	            e.printStackTrace();
        }
	}
	
	
	// FUNICIONES PARA RELLENAR 
	
	private void llenarField(PdfAcroForm acroForm, String field, String value) {
		if (value != null) {
		PdfFormField  fieldvehiculo = acroForm.getField(field);
        fieldvehiculo.setValue(value);
		}
	}
	
	private void llenarField(PdfAcroForm acroForm, String field, int value) {
		String valueString = Integer.toString(value);
		PdfFormField  fieldvehiculo = acroForm.getField(field);
        fieldvehiculo.setValue(valueString);
	}
	
	private void llenarField(PdfAcroForm acroForm, String field, Date value) {
		PdfFormField  fieldvehiculo = acroForm.getField(field);
        fieldvehiculo.setValue(df.format(value));
	}
}
