package empresa;

import java.util.ArrayList;

public class Vehiculos {
	private String daños;
	private String codigo;
	private String tipo;
	private String propietario;
	private String marca;
	private String modelo;
	private int año;
	private String dominio;
	private int nroChasis;
	private int nroMotor;
	private String seguro;
	private String nomSeguro;
	private String denuncia;
	private String documentacion;
	private Fotos docFotos;
	private String justificarDocs;
	private Fotos rodadoFotos;
	private Fotos cotizacion;
	private ArrayList<Tripulantes> listaTripulantes;
	
	public String getDaños() {
		return daños;
	}
	public String getCodigo() {
		return codigo;
	}
	public String getTipo() {
		return tipo;
	}
	public String getPropietario() {
		return propietario;
	}
	public String getMarca() {
		return marca;
	}
	public String getModelo() {
		return modelo;
	}
	public int getAño() {
		return año;
	}
	public String getDominio() {
		return dominio;
	}
	public int getNroChasis() {
		return nroChasis;
	}
	public int getNroMotor() {
		return nroMotor;
	}
	public String getSeguro() {
		return seguro;
	}
	public String getNomSeguro() {
		return nomSeguro;
	}
	public String getDenuncia() {
		return denuncia;
	}
	public String getDocumentacion() {
		return documentacion;
	}
	public Fotos getDocFotos() {
		return docFotos;
	}
	public String getJustificarDocs() {
		return justificarDocs;
	}
	public Fotos getRodadoFotos() {
		return rodadoFotos;
	}
	public Fotos getCotizacion() {
		return cotizacion;
	}
	public ArrayList<Tripulantes> getListaTripulantes() {
		return listaTripulantes;
	}
	
	public void setDaños(String daños) {
		this.daños = daños;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public void setAño(int año) {
		this.año = año;
	}
	public void setDominio(String dominio) {
		this.dominio = dominio;
	}
	public void setNroChasis(int nroChasis) {
		this.nroChasis = nroChasis;
	}
	public void setNroMotor(int nroMotor) {
		this.nroMotor = nroMotor;
	}
	public void setSeguro(String seguro) {
		this.seguro = seguro;
	}
	public void setNomSeguro(String nomSeguro) {
		this.nomSeguro = nomSeguro;
	}
	public void setDenuncia(String denuncia) {
		this.denuncia = denuncia;
	}
	public void setDocumentacion(String documentacion) {
		this.documentacion = documentacion;
	}
	public void setDocFotos(Fotos docFotos) {
		this.docFotos = docFotos;
	}
	public void setJustificarDocs(String justificarDocs) {
		this.justificarDocs = justificarDocs;
	}
	public void setRodadoFotos(Fotos rodadoFotos) {
		this.rodadoFotos = rodadoFotos;
	}
	public void setCotizacion(Fotos cotizacion) {
		this.cotizacion = cotizacion;
	}
	public void setListaTripulantes(ArrayList<Tripulantes> listaTripulantes) {
		this.listaTripulantes = listaTripulantes;
	}
	
	
	
}
