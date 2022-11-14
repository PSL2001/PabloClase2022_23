/**
 * PabloClase2022_23 - componentesDeTexto - Ventana.java
 * 19 oct 2022 - 9:44:06
 * @author Pablo Sánchez López
 */
package componentesDeTexto;

import javax.swing.JFrame;

/**
 * @author usuario
 *
 */
public class Ventana extends JFrame {
	private Panel panel;
	public Ventana() {
		super("Swing - Componentes De Texto");
		this.setSize(660, 510);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		panel = new Panel();
		this.add(panel);
		this.setVisible(true);
	}
}
