/**
 * PabloClase2022_23 - ventanaCentrada - Ventana.java
 * 3 oct 2022 - 9:37:18
 * @author Pablo Sánchez López
 */
package componentesAtomicos;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;

/**
 * @author usuario
 *
 */
public class Ventana extends JFrame {
	private Panel miPanel;
	public Ventana() {
		super();
		this.setTitle("Componentes Atomicos");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setBounds(200, 260, 800, 500);
		miPanel = new Panel();
		this.add(miPanel);
		this.setVisible(true);
	}
}
