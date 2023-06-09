package empresa;

import java.io.Serializable;
import java.util.ArrayList;

public class Peatones implements Serializable {
	private ArrayList<Peaton> listaPeatones = new ArrayList<Peaton>(); 
	
	public ArrayList<Peaton> getListaPeatones() {
		return listaPeatones;
	}

	public void setListaPeatones(ArrayList<Peaton> listaPeatones) {
		this.listaPeatones = listaPeatones;
	}

	public void agregarPeaton(Peaton peaton) {
		this.listaPeatones.add(peaton);
	}
	public void borrarPeaton(int indice) {
		this.listaPeatones.remove(indice);
	}
}
