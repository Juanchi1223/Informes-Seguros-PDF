package empresa;

import java.io.Serializable;

public class VehiculoTercero extends VehiculoAsegurado implements Serializable {
	private String seguro;
	private String descSeguro;
	
	public VehiculoTercero() {
		super();
	}
	
	public String getSeguro() {
		return seguro;
	}
	public String getDescSeguro() {
		return descSeguro;
	}
	public void setSeguro(String seguro) {
		this.seguro = seguro;
	}
	public void setDescSeguro(String descSeguro) {
		this.descSeguro = descSeguro;
	}
}
