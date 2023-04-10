package empresa;

import java.io.Serializable;
import java.util.ArrayList;

public class Daño implements Serializable{
	private String nombreProp;
	private String seguro;
	private String nombreSeguro;
	private String denuncia;
	private String documentacion;
	private ArrayList<String> RutaFotosDoc = new ArrayList<String>();
	private String justficarDoc;
	private ArrayList<String> RutaFotosDaño = new ArrayList<String>();
	private String justificaFoto;
	
	public String getNombreProp() {
		return nombreProp;
	}
	public String getSeguro() {
		return seguro;
	}
	public String getNombreSeguro() {
		return nombreSeguro;
	}
	public String getDenuncia() {
		return denuncia;
	}
	public String getDocumentacion() {
		return documentacion;
	}
	public ArrayList<String> getFotosDoc() {
		return RutaFotosDoc;
	}
	public String getJustficarDoc() {
		return justficarDoc;
	}
	public ArrayList<String> getFotosDaño() {
		return RutaFotosDaño;
	}
	public String getJustificaFoto() {
		return justificaFoto;
	}
	
	public void setNombreProp(String nombreProp) {
		this.nombreProp = nombreProp;
	}
	public void setSeguro(String seguro) {
		this.seguro = seguro;
	}
	public void setNombreSeguro(String nombreSeguro) {
		this.nombreSeguro = nombreSeguro;
	}
	public void setDenuncia(String denuncia) {
		this.denuncia = denuncia;
	}
	public void setDocumentacion(String documentacion) {
		this.documentacion = documentacion;
	}
	
	public void setJustficarDoc(String justficarDoc) {
		this.justficarDoc = justficarDoc;
	}
	
	public void setJustificaFoto(String justificaFoto) {
		this.justificaFoto = justificaFoto;
	}
	public void setRutaFotosDoc(ArrayList<String> rutaFotosDoc) {
		RutaFotosDoc = rutaFotosDoc;
	}
	public void setRutaFotosDaño(ArrayList<String> rutaFotosDaño) {
		RutaFotosDaño = rutaFotosDaño;
	}
	
	public String toString() {
		return nombreProp;
	}
	
	
}
