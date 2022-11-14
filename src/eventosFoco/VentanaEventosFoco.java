/**
 * PabloClase2022_23 - eventosFoco - VentanaEventosFoco.java
 * 9 nov 2022 - 9:14:41
 * @author Pablo Sánchez López
 */
package eventosFoco;

import java.awt.HeadlessException;

import javax.swing.JFrame;

/**
 * @author usuario
 *
 */
public class VentanaEventosFoco extends JFrame {

	/**
	 * @throws HeadlessException
	 */
	public VentanaEventosFoco() {
		this.setTitle("Ventana Respondiendo FocusEvent");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(300, 300, 500, 350);
		this.add(new Panel());

	}

}
