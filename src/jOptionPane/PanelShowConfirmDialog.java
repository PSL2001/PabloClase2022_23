/**
 * PabloClase2022_23 - jOptionPane - PanelShowConfirmDialog.java
 * 10 oct 2022 - 9:37:51
 * @author Pablo Sánchez López
 */
package jOptionPane;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 * @author usuario
 *
 */
public class PanelShowConfirmDialog extends JPanel {
	private MiIcon icon;
	/**
	 * 
	 */
	public PanelShowConfirmDialog() {
		// TODO Auto-generated constructor stub
		int respuesta5 = JOptionPane.showConfirmDialog(this, "Chao", "Titulo", JOptionPane.YES_OPTION, JOptionPane.INFORMATION_MESSAGE);
		int respuesta0 = JOptionPane.showConfirmDialog(this, "¿Está seguro?");
		int respuesta1 = JOptionPane.showConfirmDialog(this, "¿Esta seguro?", "Alerta!", JOptionPane.YES_NO_OPTION);
		int respuesta2 = JOptionPane.showConfirmDialog(this, "¿Esta seguro?", "Alerta!", JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);
		
		icon = new MiIcon();
		int resp = JOptionPane.showConfirmDialog(this, "¿Esta seguro?", "Alerta!", JOptionPane.YES_NO_OPTION, JOptionPane.DEFAULT_OPTION, icon);

		
	}

}
