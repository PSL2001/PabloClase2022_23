/**
 * PabloClase2022_23 - jOptionPane - PanelShowImputDialog.java
 * 11 oct 2022 - 8:48:23
 * @author Pablo Sánchez López
 */
package jOptionPane;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 * @author usuario
 *
 */
public class PanelShowImputDialog extends JPanel {
	private MiIcon icon;
	/**
	 * 
	 */
	public PanelShowImputDialog() {
		// TODO Auto-generated constructor stub
		String respuesta0 = JOptionPane.showInputDialog("Escribe tu nombre");
		String respuesta1 = JOptionPane.showInputDialog("¿Cuál es su nombre?", "Maria");
		String respuesta2 = JOptionPane.showInputDialog(this, "Escribe tu nombre");
		String respuesta3 = JOptionPane.showInputDialog(this, "¿Cuál es tu nombre?", "Maria");
		String respuesta4 = JOptionPane.showInputDialog(this, "Escriba nuevamente su nombre", "Error!",
		JOptionPane.ERROR_MESSAGE);
		String[] modulos = { "Acceso a datos", "Sistemas de gestión empresarial.", "Desarrollo de interfaces",
		"Programación de servicios y procesos", "Programación multimedia y dispositivos móviles" };
		icon = new MiIcon();
		String respuesta5 = (String) JOptionPane.showInputDialog(this, "Seleccione una carrera a cursar", "Carrera",
		JOptionPane.DEFAULT_OPTION, icon, modulos, modulos[0]);
	}

}
