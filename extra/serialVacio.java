package extra;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import empresa.*;

public class serialVacio {
	/*
	 * Clase que sirve para hacer el serial Vacio
	 * 
	 * 
	 * */

	public static void main(String[] args) throws FileNotFoundException, IOException {
		ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream("contrato.ser"));
		Contrato x = new Contrato();
		
		salida.writeObject(x);
		salida.close();
		System.out.print("Serial Vacio Creado");
	}

}
