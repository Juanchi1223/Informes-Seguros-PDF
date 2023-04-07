package empresa;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Date;

public class InformacionSiniestro implements Serializable{
	private Date fechaHoraMin;
	private String tiempo;
	private String estado;
	private Lugar lugar;		// !
	private Fotos fotosLugar;	// !
	private String causa;
	private String testigosBool;
	private Array[] testigos;
	private String versionAsegurado;
	private String versionTercero;
	private String mecanicaAccidente;
	private String observaciones;
	private String cobertura;
	private String indiciosFraude;
	private String analisis;
	private String responsabilidad;
	private int porcentajeresponsabilidad;
	private String descResponsabilidad;
	private String concluciones;
	private String transable;
	private String moneda;
	private String honorariosGastos;
	
	public Date getFechaHoraMin() {
		return fechaHoraMin;
	}
	public String getTiempo() {
		return tiempo;
	}
	public String getEstado() {
		return estado;
	}
	public Lugar getLugar() {
		return lugar;
	}
	public Fotos getFotosLugar() {
		return fotosLugar;
	}
	public String getCausa() {
		return causa;
	}
	public String getTestigosBool() {
		return testigosBool;
	}
	public Array[] getTestigos() {
		return testigos;
	}
	public String getVersionAsegurado() {
		return versionAsegurado;
	}
	public String getVersionTercero() {
		return versionTercero;
	}
	public String getMecanicaAccidente() {
		return mecanicaAccidente;
	}
	public String getObservaciones() {
		return observaciones;
	}
	public String getCobertura() {
		return cobertura;
	}
	public String getIndiciosFraude() {
		return indiciosFraude;
	}
	public String getAnalisis() {
		return analisis;
	}
	public String getResponsabilidad() {
		return responsabilidad;
	}
	public int getPorcentajeresponsabilidad() {
		return porcentajeresponsabilidad;
	}
	public String getDescResponsabilidad() {
		return descResponsabilidad;
	}
	public String getConcluciones() {
		return concluciones;
	}
	public String getTransable() {
		return transable;
	}
	public String getMoneda() {
		return moneda;
	}
	public String getHonorariosGastos() {
		return honorariosGastos;
	}
	
	public void setFechaHoraMin(Date fechaHoraMin) {
		this.fechaHoraMin = fechaHoraMin;
	}
	public void setTiempo(String tiempo) {
		this.tiempo = tiempo;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public void setLugar(Lugar lugar) {
		this.lugar = lugar;
	}
	public void setFotosLugar(Fotos fotosLugar) {
		this.fotosLugar = fotosLugar;
	}
	public void setCausa(String causa) {
		this.causa = causa;
	}
	public void setTestigosBool(String testigosBool) {
		this.testigosBool = testigosBool;
	}
	public void setTestigos(Array[] testigos) {
		this.testigos = testigos;
	}
	public void setVersionAsegurado(String versionAsegurado) {
		this.versionAsegurado = versionAsegurado;
	}
	public void setVersionTercero(String versionTercero) {
		this.versionTercero = versionTercero;
	}
	public void setMecanicaAccidente(String mecanicaAccidente) {
		this.mecanicaAccidente = mecanicaAccidente;
	}
	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
	public void setCobertura(String cobertura) {
		this.cobertura = cobertura;
	}
	public void setIndiciosFraude(String indiciosFraude) {
		this.indiciosFraude = indiciosFraude;
	}
	public void setAnalisis(String analisis) {
		this.analisis = analisis;
	}
	public void setResponsabilidad(String responsabilidad) {
		this.responsabilidad = responsabilidad;
	}
	public void setPorcentajeresponsabilidad(int porcentajeresponsabilidad) {
		this.porcentajeresponsabilidad = porcentajeresponsabilidad;
	}
	public void setDescResponsabilidad(String descResponsabilidad) {
		this.descResponsabilidad = descResponsabilidad;
	}
	public void setConcluciones(String concluciones) {
		this.concluciones = concluciones;
	}
	public void setTransable(String transable) {
		this.transable = transable;
	}
	public void setMoneda(String moneda) {
		this.moneda = moneda;
	}
	public void setHonorariosGastos(String honorariosGastos) {
		this.honorariosGastos = honorariosGastos;
	}
}
