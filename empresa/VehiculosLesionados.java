package empresa;

import java.io.Serializable;
import java.util.ArrayList;

public class VehiculosLesionados implements Serializable {
	private ArrayList<Vehiculos> listaVehiculosAsegurados;
	private ArrayList<Vehiculos> listaVehiculosTerceros;
	private int codigo = 0;

	
	
	public void agregarVehiculoAs(Vehiculos rodado) {
		this.codigo++;
		rodado.setCodigo(Integer.toString(codigo));
		this.listaVehiculos.add(rodado);
	}
	public void borrarVehiculo(int posicion) {
		this.listaVehiculos.remove(posicion);
	}
	
	public ArrayList<Vehiculos> listaVehiculosAsegurados() {
		return listaVehiculosAsegurados;
	}

	public void listaVehiculosAsegurados(ArrayList<Vehiculos> listaVehiculos) {
		this.listaVehiculosAsegurados = listaVehiculos;
	}

	public ArrayList<Vehiculos> getListaVehiculosTerceros() {
		return listaVehiculosTerceros;
	}

	public void setListaVehiculosTerceros(ArrayList<Vehiculos> listaVehiculosTerceros) {
		this.listaVehiculosTerceros = listaVehiculosTerceros;
	}
}
