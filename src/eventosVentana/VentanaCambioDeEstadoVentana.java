/**
 * PabloClase2022_23 - eventosVentana - VentanaCambioDeEstadoVentana.java
 * 9 nov 2022 - 8:28:49
 * @author Pablo Sánchez López
 */
package eventosVentana;

import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;

import javax.swing.JFrame;

/**
 * @author usuario
 *
 */
public class VentanaCambioDeEstadoVentana extends JFrame implements WindowStateListener {

	/**
	 * 
	 */
	public VentanaCambioDeEstadoVentana() {
		setTitle("Ventana Respondiendo ante el estado");
		setBounds(300, 300, 500, 350);
		addWindowStateListener(this);
	}

	@Override
	public void windowStateChanged(WindowEvent e) {
		System.out.println("La ventana a cambiado de estado");
		System.out.println("Ventana: "+e.getWindow());
		System.out.println("El antiguo estado es: " +e.getOldState());
		System.out.println("El actual estado es: " +e.getNewState());

	}

}
