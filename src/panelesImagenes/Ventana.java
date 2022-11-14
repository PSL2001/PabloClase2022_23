/**
 * PabloClase2022_23 - paneles1 - Ventana.java
 * 4 oct 2022 - 8:45:15
 * @author Pablo Sánchez López
 */
package panelesImagenes;

import javax.swing.JFrame;

/**
 * @author usuario
 *
 */
public class Ventana extends JFrame {
	private Panel miPanel;
	public Ventana() {
		super("Ventana sobre la que escribiremos en un JPanel");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setBounds(50, 50, 600, 450);
		miPanel = new Panel();
		this.add(miPanel);
		//Al final
		this.setVisible(true);
	}
}
