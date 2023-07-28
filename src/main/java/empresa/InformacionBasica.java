package empresa;

import java.io.Serializable;
import java.util.Date;

public class InformacionBasica implements Serializable{
	private int siniestro;
	private int poliza;
	private Date fechaOcurencia;
	private Date vigenciaIni;
	private Date vigenciaFin;
	private Date fechaDerivacion;
	private String ajustadorMer;
	private String liquidExt;
	private String responsable;
	private String email;
	private int telefono;
	private int interno;
	
	public int getSiniestro() {						//	GET
		return siniestro;
	}
	public int getPoliza() {
		return poliza;
	}
	public Date getFechaOcurencia() {
		return fechaOcurencia;
	}
	public Date getVigenciaIni() {
		return vigenciaIni;
	}
	public Date getVigenciaFin() {
		return vigenciaFin;
	}
	public Date getFechaDerivacion() {
		return fechaDerivacion;
	}
	public String getAjustadorMer() {
		return ajustadorMer;
	}
	public String getLiquidExt() {
		return liquidExt;
	}
	public String getResponsable() {
		return responsable;
	}
	public String getEmail() {
		return email;
	}
	public int getTelefono() {
		return telefono;
	}
	public int getInterno() {
		return interno;
	}
	
	public void setSiniestro(int siniestro) {		// SET
		this.siniestro = siniestro;
	}
	public void setPoliza(int poliza) {
		this.poliza = poliza;
	}
	public void setFechaOcurencia(Date fechaOcurencia) {
		this.fechaOcurencia = fechaOcurencia;
	}
	public void setVigenciaIni(Date vigenciaIni) {
		this.vigenciaIni = vigenciaIni;
	}
	public void setVigenciaFin(Date vigenciaFin) {
		this.vigenciaFin = vigenciaFin;
	}
	public void setFechaDerivacion(Date fechaDerivacion) {
		this.fechaDerivacion = fechaDerivacion;
	}
	public void setAjustadorMer(String ajustadorMer) {
		this.ajustadorMer = ajustadorMer;
	}
	public void setLiquidExt(String liquidExt) {
		this.liquidExt = liquidExt;
	}
	public void setResponsable(String responsable) {
		this.responsable = responsable;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public void setInterno(int interno) {
		this.interno = interno;
	}
}
