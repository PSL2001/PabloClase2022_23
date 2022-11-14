/**
 * PabloClase2022_23 - eventosTeclado - VentanaTeclado.java
 * 9 nov 2022 - 8:46:52
 * @author Pablo Sánchez López
 */
package eventosTeclado;

import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

/**
 * @author usuario
 *
 */
public class VentanaTeclado extends JFrame {

	/**
	 * @throws HeadlessException
	 */
	public VentanaTeclado() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(300,300,500,350);
		/*
		 * 2º paso. nos creamos una instancia que pertenezca a la clase
		 * oyente y le decimos que este preparado para cuando se produzca el evento
		 */
		EventoDeTeclado tecla =new EventoDeTeclado();
		addKeyListener(tecla);
	}
	////1º paso. clase oyente
	class EventoDeTeclado implements KeyListener {
		// Esta detecta cuando se ha escrito una tecla
		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		//Este detecta el pulsado de la tecla
		@Override
		public void keyPressed(KeyEvent e) {
			//obtener el codigo de la tecla pulsada
			int codigo=e.getKeyCode();
			System.out.println(codigo);
			char letra=e.getKeyChar();
			System.out.println(letra);
			
		}
		//Esta detecta el levantado de la tecla
		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
}
