package empresa;

import java.awt.Image;
import java.io.Serializable;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Fotos implements Serializable {
	private ArrayList<String> rutas;
	
	public Fotos(int cantidad) {
		rutas = new ArrayList<String>();
		for(int i = 0; i < cantidad; i++) {
			this.rutas.add(null);
		}
	}
	
	public void agregarFoto(int posicion, String ruta) {	// agrega al array
		this.rutas.add(posicion, ruta);
	}
	
	public String adjuntarArchivo(JButton botton, JLabel marco) {	// abre el OS para tomar la foto
		String Ruta = null;
		
		JFileChooser fcDoc1 = new JFileChooser();
		FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos de imagen", "jpg", "jpeg", "png", "gif");
		fcDoc1.setFileFilter(filter);
		
		int selecionar = fcDoc1.showOpenDialog(botton);
		
		if (selecionar == JFileChooser.APPROVE_OPTION) {
           Ruta = fcDoc1.getSelectedFile().getPath();
   
	       Image mImagen = new ImageIcon(Ruta).getImage();
	       ImageIcon mIcono = new ImageIcon(mImagen.getScaledInstance(marco.getWidth(), marco.getHeight(), Image.SCALE_SMOOTH));
	       marco.setIcon(mIcono); 
            
        }
		return Ruta;
	}
	public void setFotoAdj(int pos, JLabel marco) {		// par insertar las fotos cuando se modifica
		if(rutas.get(pos) != null) {
			Image mImagen = new ImageIcon(rutas.get(pos)).getImage();
	       	ImageIcon mIcono = new ImageIcon(mImagen.getScaledInstance(marco.getWidth(), marco.getHeight(), Image.SCALE_SMOOTH));
	       	marco.setIcon(mIcono);
		}	
	}

	public ArrayList<String> getRutas() {
		return rutas;
	}
	

}
