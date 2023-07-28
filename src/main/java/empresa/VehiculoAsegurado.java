package empresa;

import java.io.Serializable;
import java.util.ArrayList;

public class VehiculoAsegurado implements Serializable {
		protected String daños;
		protected String codigo;
		protected String tipo;
		protected String propietario;
		protected String marca;
		protected String modelo;
		protected int año;
		protected String dominio;
		protected String nroChasis;
		protected String nroMotor;
		protected String denuncia;
		protected String documentacion;
		protected Fotos docFotos;
		protected String justificarDocs;
		protected Fotos rodadoFotos;
		protected String justificarFotos;
		protected Fotos cotizacion;
		protected ArrayList<Tripulantes> listaTripulantes = new ArrayList<Tripulantes>();
		
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
		public String getNroChasis() {
			return nroChasis;
		}
		public String getNroMotor() {
			return nroMotor;
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
		public void setNroChasis(String nroChasis) {
			this.nroChasis = nroChasis;
		}
		public void setNroMotor(String nroMotor) {
			this.nroMotor = nroMotor;
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
		public String getJustificarFotos() {
			return justificarFotos;
		}
		public void setJustificarFotos(String justificarFotos) {
			this.justificarFotos = justificarFotos;
		}
		public String toString() {
			return this.propietario +" (" +this.codigo+")";
		}
}
