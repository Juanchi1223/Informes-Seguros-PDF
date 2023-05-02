package empresa;

import java.io.Serializable;
import java.util.ArrayList;

public class VehiculosLesionados implements Serializable {
	private ArrayList<VehiculoAsegurado> listaVehiculosAsegurados;
	private ArrayList<VehiculoTercero> listaVehiculosTerceros;
	private int codigo = 0;

	
	
	public void agregarVehiculo(VehiculoAsegurado rodado) {
		this.codigo++;
		rodado.setCodigo(Integer.toString(codigo));
		this.listaVehiculosAsegurados.add(rodado);
	}
	
	public void agregarVehiculo(VehiculoTercero rodado) {
		this.codigo++;
		rodado.setCodigo(Integer.toString(codigo));
		this.listaVehiculosTerceros.add(rodado);
		
	}
	public void borrarVehiculoAs(int posicion) {
		this.listaVehiculosAsegurados.remove(posicion);
	}
	
	public void borrarVehiculoTer(int posicion) {
		this.listaVehiculosTerceros.remove(posicion);
	}
	
	public ArrayList<VehiculoAsegurado> listaVehiculosAsegurados() {
		return listaVehiculosAsegurados;
	}

	public void listaVehiculosAsegurados(ArrayList<VehiculoAsegurado> listaVehiculos) {
		this.listaVehiculosAsegurados = listaVehiculos;
	}

	public ArrayList<VehiculoTercero> getListaVehiculosTerceros() {
		return listaVehiculosTerceros;
	}

	public void setListaVehiculosTerceros(ArrayList<VehiculoTercero> listaVehiculosTerceros) {
		this.listaVehiculosTerceros = listaVehiculosTerceros;
	}
}
