package empresa;

import java.io.Serializable;

public class Contrato implements Serializable{
	private InformacionBasica infoaBas;
	private InformacionSiniestro infoSin;
	private OtrosDaños otrosDaños;
	private Peatones peatones;
	private VehiculoAseguradoLesionados vehiculosAsegurados;
	private VehiculoTerceroLesionado vehiculosTerceros;
	
	
	public InformacionBasica getInfoaBas() {					// GET
		return infoaBas;
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
	
	
	public void setInfoaBas(InformacionBasica infoaBas) {		// SET
		this.infoaBas = infoaBas;	
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
