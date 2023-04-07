package empresa;

import java.io.Serializable;
import java.util.ArrayList;

public class Peatones implements Serializable {
	private ArrayList<Peaton> listaPeatones; 
	
	public ArrayList<Peaton> getListaPeatones() {
		return listaPeatones;
	}

	public void setListaPeatones(ArrayList<Peaton> listaPeatones) {
		this.listaPeatones = listaPeatones;
	}

	public void agregarPeaton() {};
	public void borrarPeaton() {};
}
