package empresa;

import java.io.Serializable;
import java.util.ArrayList;

public class OtrosDaños implements Serializable {
	private ArrayList<Daño> listaDeDaños = new ArrayList<Daño>();

	public ArrayList<Daño> getListaDeDaños() {
		return listaDeDaños;
	}
	public void setListaDeDaños(ArrayList<Daño> listaDeDaños) {
		this.listaDeDaños = listaDeDaños;
	}
	
	public void agregarDaño(Daño nuevoDaño) {
		listaDeDaños.add(nuevoDaño);
	}
	public void borrarDaño(int indiceDaño) {
		listaDeDaños.remove(indiceDaño);
	}
}
