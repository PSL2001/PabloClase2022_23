/**
 * PabloClase2022_23 - eventosFocoVentana - VentanaEventosFocoVentana.java
 * 9 nov 2022 - 9:30:17
 * @author Pablo Sánchez López
 */
package eventosFocoVentana;

import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;

import javax.swing.JFrame;

/**
 * @author usuario
 *
 */
public class VentanaEventosFocoVentana extends JFrame implements WindowFocusListener {
	private VentanaEventosFocoVentana marco1;
	private VentanaEventosFocoVentana marco2;

	@Override
	public void windowGainedFocus(WindowEvent e) {
		// cual de las dos ventanas es la que tiene el foco
		if (e.getSource() == marco1) {
			marco1.setTitle("Tengo el foco!");
		} else {
			marco2.setTitle("Tengo el foco!");
		}
	}

	@Override
	public void windowLostFocus(WindowEvent e) {
		if (e.getSource() == marco1) {
			marco1.setTitle("");
		} else {
			marco2.setTitle("");
		}

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		VentanaEventosFocoVentana miVentana = new VentanaEventosFocoVentana();
		miVentana.iniciar();

	}

	/**
	 * 
	 */
	private void iniciar() {
		marco1 = new VentanaEventosFocoVentana();
		marco2 = new VentanaEventosFocoVentana();
		marco1.setVisible(true);
		marco2.setVisible(true);
		marco1.setBounds(50, 100, 600, 350);
		marco2.setBounds(700, 100, 600, 350);
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marco2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// ponemos los marcos a la escucha y le pasamos como evento a él mismo
		marco1.addWindowFocusListener(this);
		marco2.addWindowFocusListener(this);

	}

}
