/**
 * PabloClase2022_23 - eventosVentana - VentanaEventosVentanaClaseAdaptadora.java
 * 8 nov 2022 - 9:33:08
 * @author Pablo Sánchez López
 */
package eventosVentana;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

/**
 * @author usuario
 *
 */
public class VentanaEventosVentanaClaseAdaptadora extends JFrame {

	/**
	 * 
	 */
	public VentanaEventosVentanaClaseAdaptadora() {
		super("Ventana Respondiendo con clase adaptadora");
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setBounds(300,300,500,350);
		this.addWindowListener(new Oyente());
	}
	
	class Oyente extends WindowAdapter{
		@Override
		public void windowActivated(WindowEvent e) {
			System.out.println("Ventana activada");
		}
		
		@Override
		public void windowIconified(WindowEvent e) {
			System.out.println("Ventana minimizada");
		}
	}

}
