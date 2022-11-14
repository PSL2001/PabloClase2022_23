/**
 * PabloClase2022_23 - jOptionPane - PanelShowOptionDialog.java
 * 10 oct 2022 - 9:53:45
 * @author Pablo Sánchez López
 */
package jOptionPane;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 * @author usuario
 *
 */
public class PanelShowOptionDialog extends JPanel {
	private MiIcon icon;
	/**
	 * 
	 */
	public PanelShowOptionDialog() {
		// TODO Auto-generated constructor stub
		icon = new MiIcon();
		String[] opciones = { "Opcion A", "Opcion B", "Opcion C", "Opcion D" };
		int seleccion = JOptionPane.showOptionDialog(null, "Es necesario que seleccione una opcion", "Titulo", 
				JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, icon, opciones, opciones[0]);
	}

}
