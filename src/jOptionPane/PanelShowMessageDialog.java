/**
 * PabloClase2022_23 - jOptionPane - PanelShowMessageDialog.java
 * 10 oct 2022 - 8:45:56
 * @author Pablo Sánchez López
 */
package jOptionPane;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 * @author usuario
 *
 */
public class PanelShowMessageDialog extends JPanel {
	private MiIcon icono;
	/**
	 * 
	 */
	public PanelShowMessageDialog() {
		// TODO Auto-generated constructor stub
		JOptionPane.showMessageDialog(this, "Operacion Realizada Correctamente - 2 Argumentos");
		JOptionPane.showMessageDialog(this, "Mensaje ERROR_MESSAGE", "Mensaje en la barra de título", JOptionPane.ERROR_MESSAGE);
		JOptionPane.showMessageDialog(this, "Mensaje INFORMATION_MESSAGE", "Mensaje en la barra de título", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(this, "Mensaje WARNING_MESSAGE", "Mensaje en la barra de título", JOptionPane.WARNING_MESSAGE);
		JOptionPane.showMessageDialog(this, "Mensaje QUESTION_MESSAGE", "Mensaje en la barra de título", JOptionPane.QUESTION_MESSAGE);
		JOptionPane.showMessageDialog(this, "Mensaje PLAIN_MESSAGE", "Mensaje en la barra de título", JOptionPane.PLAIN_MESSAGE);
		
		icono = new MiIcon();
		JOptionPane.showMessageDialog(this, "Mensaje dentro de la ventana", "Titulo", JOptionPane.DEFAULT_OPTION, icono);
	}

}
