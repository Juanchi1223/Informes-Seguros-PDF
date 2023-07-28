package empresa;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JTextField;

public interface InsertarValores{
	
	default int getIndex(String valor, String[] x) {
		int cont = 0;
		
		for(String i : x) {
			if (i.equalsIgnoreCase(valor)) 
				break;
			cont++;
		}
		
		return cont;
	}
	public default void rellenarText(String valor, JTextField textField) {
		if (valor != null)
			textField.setText(valor);
	}
	public default void rellenarText(int valor, JTextField textField) {
		if (valor != 0)
			textField.setText(Integer.toString(valor));
	}
	public default void rellenarBox(String valor,String[] valores,JComboBox comboBox) {
		if (valor != null)
			comboBox.setSelectedIndex(getIndex(valor, valores));
	}
	public default void rellenarCheck(String valor, JCheckBox check) {
		boolean x;
		if (valor != null) {
			x = (valor == "Si")? true : false;
			check.setSelected(x);
		}
	}
} 

