package empresa;

import java.io.Serializable;
import java.util.ArrayList;

public class VehiculoAseguradoLesionados implements Serializable{
	private ArrayList<Vehiculos> listaVehiculos;

	public ArrayList<Vehiculos> getListaVehiculos() {
		return listaVehiculos;
	}

	public void setListaVehiculos(ArrayList<Vehiculos> listaVehiculos) {
		this.listaVehiculos = listaVehiculos;
	}
	
	public void agregarVehiculo(Vehiculos rodado) {
		this.listaVehiculos.add(rodado);
	}
	public void borrarVehiculo(int posicion) {
		this.listaVehiculos.remove(posicion);
	}
}
