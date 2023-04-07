package empresa;

import java.io.Serializable;
import java.util.ArrayList;

public class VehiculoTerceroLesionado implements Serializable{
	private ArrayList<Vehiculos> listaVehiculos;
	
	
	public ArrayList<Vehiculos> getListaVehiculos() {
		return listaVehiculos;
	}
	public void setListaVehiculos(ArrayList<Vehiculos> listaVehiculos) {
		this.listaVehiculos = listaVehiculos;
	}
	public void agregarVehiculo() {}
	public void borrarVehiculo() {}
}
