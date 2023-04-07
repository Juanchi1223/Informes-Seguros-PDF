package empresa;

import java.io.Serializable;

public class Daño implements Serializable{
	private String nombreProp;
	private String seguro;
	private String nombreSeguro;
	private String denuncia;
	private String documentacion;
	private Fotos FotosDoc;
	private String justficarDoc;
	private Fotos FotosDaño;
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
	public Fotos getFotosDoc() {
		return FotosDoc;
	}
	public String getJustficarDoc() {
		return justficarDoc;
	}
	public Fotos getFotosDaño() {
		return FotosDaño;
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
	public void setFotosDoc(Fotos fotosDoc) {
		FotosDoc = fotosDoc;
	}
	public void setJustficarDoc(String justficarDoc) {
		this.justficarDoc = justficarDoc;
	}
	public void setFotosDaño(Fotos fotosDaño) {
		FotosDaño = fotosDaño;
	}
	public void setJustificaFoto(String justificaFoto) {
		this.justificaFoto = justificaFoto;
	}

}
