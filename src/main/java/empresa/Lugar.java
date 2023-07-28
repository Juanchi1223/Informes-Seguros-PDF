package empresa;

import java.io.Serializable;

public class Lugar implements Serializable{
	/*
	 * Contiene la informacion del lugar del hecho en el siniestro
	 * 
	 * */
	private String calle;
	private int numero;
	private String localidad;
	private String provincia;
	private String pais;
	private String jurridicion;
	private String visibilidad;
	private String ambiente;
	private String estado;
	private String iluminacion;
	private int carriles;
	private int velocidad;
	private String ambulancia;
	private String descAmbulancia;
	private String policia;
	private String Sumario;
	
	public String getCalle() {
		return calle;
	}
	public int getNumero() {
		return numero;
	}
	public String getLocalidad() {
		return localidad;
	}
	public String getProvincia() {
		return provincia;
	}
	public String getPais() {
		return pais;
	}
	public String getJurridicion() {
		return jurridicion;
	}
	public String getVisibilidad() {
		return visibilidad;
	}
	public String getAmbiente() {
		return ambiente;
	}
	public String getIluminacion() {
		return iluminacion;
	}
	public int getCarriles() {
		return carriles;
	}
	public int getVelocidad() {
		return velocidad;
	}
	public String getAmbulancia() {
		return ambulancia;
	}
	public String getDescAmbulancia() {
		return descAmbulancia;
	}
	public String getPolicia() {
		return policia;
	}
	public String getSumario() {
		return Sumario;
	}
	
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public void setNumero(int i) {
		this.numero = i;
	}
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public void setJurridicion(String jurridicion) {
		this.jurridicion = jurridicion;
	}
	public void setVisibilidad(String visibilidad) {
		this.visibilidad = visibilidad;
	}
	public void setAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}
	public void setIluminacion(String iluminacion) {
		this.iluminacion = iluminacion;
	}
	public void setCarriles(int i) {
		this.carriles = i;
	}
	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}
	public void setAmbulancia(String ambulancia) {
		this.ambulancia = ambulancia;
	}
	public void setDescAmbulancia(String descAmbulancia) {
		this.descAmbulancia = descAmbulancia;
	}
	public void setPolicia(String policia) {
		this.policia = policia;
	}
	public void setSumario(String sumario) {
		Sumario = sumario;
	}
	
	
}
