/**
 * PabloClase2022_23 - eventosVentana - VentanaEventosVentana.java
 * 8 nov 2022 - 9:08:55
 * @author Pablo Sánchez López
 */
package eventosVentana;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

/**
 * @author usuario
 *
 */
public class VentanaEventosVentana extends JFrame implements WindowListener {

	/**
	 * 
	 */
	public VentanaEventosVentana() {
		super("Ventana Respondiendo");
		this.setBounds(300, 300, 500, 350);
		this.addWindowListener(this);
	}

	@Override
	public void windowOpened(WindowEvent e) {
		System.out.println("Ventana abierta");

	}

	@Override
	/*
	 *
	 * Este metodo se producira en ventana 2, debido a que ventana1 no da tiempo ha que se ejecute, se termina el programa por la constante EXIT_ON_CLOSE
	 * Si utilizamos la constante EXIT_ON_CLOSE, cuando cerramos una se finaliza el programa y por lo tanto se cierran 
	 * las dos, entonces tendremos que utilizar en la segunda ventana otra constante DISPOSE_ON_CLOSE.
	 * Primero cerramos la ventana que tiene la constante DISPOSE_ON_CLOSE y despues la que tiene EXIT_ON_CLOSE.
	 * 
	 */
	public void windowClosing(WindowEvent e) {
		System.out.println("Ventana cerrandose");
	}

	@Override
	public void windowClosed(WindowEvent e) {
		System.out.println("Ventana cerrada");
	}

	@Override
	public void windowIconified(WindowEvent e) {
		System.out.println("Ventana minimizada");

	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		System.out.println("Ventana restaurada");

	}

	@Override
	public void windowActivated(WindowEvent e) {
		System.out.println("Ventana activada");

	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		System.out.println("Ventana desactivada");

	}

}
