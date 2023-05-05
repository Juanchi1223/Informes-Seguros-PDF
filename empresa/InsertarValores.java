package empresa;

public interface InsertarValores{
	public default  int getIndex(String valor, String[] x) {
		int cont = 0;
		
		for(String i : x) {
			if (i.equalsIgnoreCase(valor)) 
				break;
			cont++;
		}
		
		return cont;
	}
}
