package empresa;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

public class Tripulantes extends Peaton implements Serializable{
	private String vehicPertenece;
	private String persona;
	private String licencia;
	private String autoridadEmisora;
	private Date vigenciaIni;
	private Date vigenciaFin;
	private String alcoholemia;
	private String propioAsegurado;
	private String relacion;
	private String cual;
	private Fotos licenciaFoto = new Fotos(2);
	
	public Tripulantes() {
		super();
	}
	
	public String getVehicPertenece() {
		return vehicPertenece;
	}
	public String getPersona() {
		return persona;
	}
	public String getLicencia() {
		return licencia;
	}
	public String getAutoridadEmisora() {
		return autoridadEmisora;
	}
	public Date getVigenciaIni() {
		return vigenciaIni;
	}
	public Date getVigenciaFin() {
		return vigenciaFin;
	}
	public String getAlcoholemia() {
		return alcoholemia;
	}
	public String getPropioAsegurado() {
		return propioAsegurado;
	}
	public String getRelacion() {
		return relacion;
	}
	public String getCual() {
		return cual;
	}
	public Fotos getLicenciaFoto() {
		return licenciaFoto;
	}
	
	public void setVehicPertenece(String vehicPertenece) {
		this.vehicPertenece = vehicPertenece;
	}
	public void setPersona(String persona) {
		this.persona = persona;
	}
	public void setLicencia(String licencia) {
		this.licencia = licencia;
	}
	public void setAutoridadEmisora(String autoridadEmisora) {
		this.autoridadEmisora = autoridadEmisora;
	}
	public void setVigenciaIni(Date vigenciaIni) {
		this.vigenciaIni = vigenciaIni;
	}
	public void setVigenciaFin(Date vigenciaFin) {
		this.vigenciaFin = vigenciaFin;
	}
	public void setAlcoholemia(String alcoholemia) {
		this.alcoholemia = alcoholemia;
	}
	public void setPropioAsegurado(String propioAsegurado) {
		this.propioAsegurado = propioAsegurado;
	}
	public void setRelacion(String relacion) {
		this.relacion = relacion;
	}
	public void setCual(String cual) {
		this.cual = cual;
	}
	public void setLicenciaFoto(Fotos licenciaFoto) {
		this.licenciaFoto = licenciaFoto;
	}
}
