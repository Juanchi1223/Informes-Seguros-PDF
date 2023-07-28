package empresa;

import java.io.Serializable;

public class Peaton implements Serializable{
	protected String apellido;
	protected String nombre;
	protected int edad;
	protected int nroDocumento;
	protected int celular;
	protected String ocupacion;
	protected int telefono;
	protected String calle;
	protected int numero;
	protected int piso;
	protected String dept;
	protected String localidad;
	protected String partido;
	protected String provincia;
	protected String lesionado;
	protected String art;
	protected String nombreArt;
	protected String lugarAtencion;
	protected String abogado;
	protected String nombreDr;
	protected String apellidoDr;
	protected Fotos DNI;
	protected Fotos AcreditacionMedica;
	protected String justificaAcred;
	
	public String getApellido() {
		return apellido;
	}
	public String getNombre() {
		return nombre;
	}
	public int getEdad() {
		return edad;
	}
	public int getNroDocumento() {
		return nroDocumento;
	}
	public int getCelular() {
		return celular;
	}
	public String getOcupacion() {
		return ocupacion;
	}
	public int getTelefono() {
		return telefono;
	}
	public String getCalle() {
		return calle;
	}
	public int getNumero() {
		return numero;
	}
	public int getPiso() {
		return piso;
	}
	public String getDept() {
		return dept;
	}
	public String getLocalidad() {
		return localidad;
	}
	public String getPartido() {
		return partido;
	}
	public String getLesionado() {
		return lesionado;
	}
	public String getArt() {
		return art;
	}
	public String getNombreArt() {
		return nombreArt;
	}
	public String getLugarAtencion() {
		return lugarAtencion;
	}
	public String getAbogado() {
		return abogado;
	}
	public String getNombreDr() {
		return nombreDr;
	}
	public String getApellidoDr() {
		return apellidoDr;
	}
	public Fotos getDNI() {
		return DNI;
	}
	public Fotos getAcreditacionMedica() {
		return AcreditacionMedica;
	}
	public String getJustificaAcred() {
		return justificaAcred;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public void setNroDocumento(int nroDocumento) {
		this.nroDocumento = nroDocumento;
	}
	public void setCelular(int celular) {
		this.celular = celular;
	}
	public void setOcupacion(String ocupacion) {
		this.ocupacion = ocupacion;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public void setPiso(int piso) {
		this.piso = piso;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	public void setPartido(String partido) {
		this.partido = partido;
	}
	public void setLesionado(String lesionado) {
		this.lesionado = lesionado;
	}
	public void setArt(String art) {
		this.art = art;
	}
	public void setNombreArt(String nombreArt) {
		this.nombreArt = nombreArt;
	}
	public void setLugarAtencion(String lugarAtencion) {
		this.lugarAtencion = lugarAtencion;
	}
	public void setAbogado(String abogado) {
		this.abogado = abogado;
	}
	public void setNombreDr(String nombreDr) {
		this.nombreDr = nombreDr;
	}
	public void setApellidoDr(String apellidoDr) {
		this.apellidoDr = apellidoDr;
	}
	public void setDNI(Fotos dNI) {
		DNI = dNI;
	}
	public void setAcreditacionMedica(Fotos acreditacionMedica) {
		AcreditacionMedica = acreditacionMedica;
	}
	public void setJustificaAcred(String justificaAcred) {
		this.justificaAcred = justificaAcred;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	
	public String toString(){
		return this.nombre + " " + this.apellido;
	}
}
