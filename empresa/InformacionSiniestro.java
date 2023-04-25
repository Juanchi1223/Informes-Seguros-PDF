package empresa;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;

public class InformacionSiniestro implements Serializable{
	private Date fecha;
	private String hora;
	private String min;
	private String tiempo;
	private String estado;
	private Lugar lugar = new Lugar();		// !
	private Fotos fotosLugar = new Fotos(5);	// !
	private String causa; // que es causa
	private String testigosBool;
	private String[] testigos = new String[3];
	private String versionAsegurado;
	private String versionTercero;
	private String mecanicaAccidente;
	private String observaciones;
	private String cobertura;
	private String indiciosFraude;
	private String analisis;
	private String responsabilidad;
	private String porcentajeresponsabilidad;
	private String descResponsabilidad;
	private String concluciones;
	private String transable;
	private String moneda;
	private int indemnizacion;
	private int honorariosGastos;
	
	public Date getFechaHoraMin() {
		return fecha;
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
	public String[] getTestigos() {
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
	public String getPorcentajeresponsabilidad() {
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
	public int getHonorariosGastos() {
		return honorariosGastos;
	}
	
	public void setFechaHoraMin(Date fecha) {
		this.fecha = fecha;
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
	public void setTestigos(String[] testigos) {
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
	public void setPorcentajeresponsabilidad(String porcentajeresponsabilidad) {
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
	public void setHonorariosGastos(int honorariosGastos) {
		this.honorariosGastos = honorariosGastos;
	}
	public int getIndemnizacion() {
		return indemnizacion;
	}
	public void setIndemnizacion(int indemnizacion) {
		this.indemnizacion = indemnizacion;
	}

	public String getHora() {
		return hora;
	}

	public String getMin() {
		return min;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public void setMin(String min) {
		this.min = min;
	}
}
