package empresa;

import java.io.Serializable;

public class Contrato implements Serializable{
	private InformacionBasica infoBas;
	private InformacionSiniestro infoSin;
	private OtrosDaños otrosDaños;
	private Peatones peatones;
	private VehiculoAseguradoLesionados vehiculosAsegurados;
	private VehiculoTerceroLesionado vehiculosTerceros;
	
	
	public Contrato() {			// CARGAR TODO EN NULL
		this.infoBas = new InformacionBasica();
		this.infoSin = new InformacionSiniestro();
		this.otrosDaños = new OtrosDaños();
		this.peatones = new Peatones();
		this.vehiculosAsegurados = new VehiculoAseguradoLesionados();
		this.vehiculosTerceros = new VehiculoTerceroLesionado();
	}
	
	public InformacionBasica getInfoaBas() {					// GET
		return infoBas;
	}
	public InformacionSiniestro getInfoSin() {
		return infoSin;
	}
	public OtrosDaños getOtrosDaños() {
		return otrosDaños;
	}
	public Peatones getPeatones() {
		return peatones;
	}
	public VehiculoAseguradoLesionados getVehiculosAsegurados() {
		return vehiculosAsegurados;
	}
	public VehiculoTerceroLesionado getVehiculosTerceros() {
		return vehiculosTerceros;
	}
	
	
	public void setInfoaBas(InformacionBasica infoBas) {		// SET
		this.infoBas = infoBas;	
	}
	public void setInfoSin(InformacionSiniestro infoSin) {
		this.infoSin = infoSin;
	}
	public void setOtrosDaños(OtrosDaños otrosDaños) {
		this.otrosDaños = otrosDaños;
	}
	public void setPeatones(Peatones peatones) {
		this.peatones = peatones;
	}
	public void setVehiculosAsegurados(VehiculoAseguradoLesionados vehiculosAsegurados) {
		this.vehiculosAsegurados = vehiculosAsegurados;
	}
	public void setVehiculosTerceros(VehiculoTerceroLesionado vehiculosTerceros) {
		this.vehiculosTerceros = vehiculosTerceros;
	}
	
}
