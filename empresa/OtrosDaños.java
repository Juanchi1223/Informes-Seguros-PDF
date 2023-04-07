package empresa;

import java.io.Serializable;
import java.util.ArrayList;

public class OtrosDaños implements Serializable {
	private ArrayList<Daño> listaDeDaños;

	public ArrayList<Daño> getListaDeDaños() {
		return listaDeDaños;
	}
	public void setListaDeDaños(ArrayList<Daño> listaDeDaños) {
		this.listaDeDaños = listaDeDaños;
	}
	
	public void agregarDaño() {}
	public void borrarDaño() {}
}
