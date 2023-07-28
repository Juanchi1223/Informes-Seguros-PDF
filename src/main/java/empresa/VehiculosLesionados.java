package empresa;

import java.io.Serializable;
import java.util.ArrayList;

public class VehiculosLesionados implements Serializable {
	private ArrayList<VehiculoAsegurado> listaVehiculosAsegurados = new ArrayList<VehiculoAsegurado>();
	private ArrayList<VehiculoTercero> listaVehiculosTerceros = new ArrayList<VehiculoTercero>();
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
		for(int i = posicion; i < listaVehiculosAsegurados.size(); i++ ) {
			VehiculoAsegurado aux = listaVehiculosAsegurados.get(i);
			int indiceNuevo = Integer.parseInt(aux.getCodigo()) - 1; 
			aux.setCodigo(Integer.toString(indiceNuevo));
		}
		if (posicion == listaVehiculosAsegurados.size()) {
			this.codigo--;
		}
	}
	
	public void borrarVehiculoTer(int posicion) {	
		this.listaVehiculosTerceros.remove(posicion);
		for(int i = posicion; i < listaVehiculosTerceros.size(); i++ ) {
			VehiculoTercero aux = listaVehiculosTerceros.get(i);
			int indiceNuevo = Integer.parseInt(aux.getCodigo()) - 1; 
			aux.setCodigo(Integer.toString(indiceNuevo));
		}
		if (posicion == listaVehiculosTerceros.size()) {
			this.codigo--;
		}
		
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
