/**
 * PabloClase2022_23 - eventosRaton - VentanaEventosRaton.java
 * 9 nov 2022 - 9:02:47
 * @author Pablo Sánchez López
 */
package eventosRaton;

import java.awt.HeadlessException;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

/**
 * @author usuario
 *
 */
public class VentanaEventosRaton extends JFrame implements MouseListener {
	

	/**
	 * @throws HeadlessException
	 */
	public VentanaEventosRaton() {
		this.setTitle("Ventana Respondiendo a eventos raton");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(500,10,500,350);
		this.addMouseListener(this);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("Has hecho un clic: ");
		System.out.println("Coordena X: "+e.getX()+" Coordenada Y: "+e.getY());
		System.out.println("Numero de clics: " +e.getClickCount());
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

}
