package objetos;

import java.util.Date;

public class Contrato {
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
		
		
		public int getSiniestro() {
			return siniestro;
		}
		public void setSiniestro(int siniestro) {
			this.siniestro = siniestro;
		}
		public int getPoliza() {
			return poliza;
		}
		public void setPoliza(int poliza) {
			this.poliza = poliza;
		}
		public Date getFechaOcurencia() {
			return fechaOcurencia;
		}
		public void setFechaOcurencia(Date fechaOcurencia) {
			this.fechaOcurencia = fechaOcurencia;
		}
		public Date getVigenciaIni() {
			return vigenciaIni;
		}
		public void setVigenciaIni(Date vigenciaIni) {
			this.vigenciaIni = vigenciaIni;
		}
		public Date getVigenciaFin() {
			return vigenciaFin;
		}
		public void setVigenciaFin(Date vigenciaFin) {
			this.vigenciaFin = vigenciaFin;
		}
		public Date getFechaDerivacion() {
			return fechaDerivacion;
		}
		public void setFechaDerivacion(Date fechaDerivacion) {
			this.fechaDerivacion = fechaDerivacion;
		}
		public String getAjustadorMer() {
			return ajustadorMer;
		}
		public void setAjustadorMer(String ajustadorMer) {
			this.ajustadorMer = ajustadorMer;
		}
		public String getLiquidExt() {
			return liquidExt;
		}
		public void setLiquidExt(String liquidExt) {
			this.liquidExt = liquidExt;
		}
		public String getResponsable() {
			return responsable;
		}
		public void setResponsable(String responsable) {
			this.responsable = responsable;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public int getTelefono() {
			return telefono;
		}
		public void setTelefono(int telefono) {
			this.telefono = telefono;
		}
		public int getInterno() {
			return interno;
		}
		public void setInterno(int interno) {
			this.interno = interno;
		}
}
