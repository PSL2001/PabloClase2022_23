/**
 * PabloClase2022_23 - eventosRaton - VentanaEventosRatonAdaptadora.java
 * 9 nov 2022 - 9:04:53
 * @author Pablo Sánchez López
 */
package eventosRaton;

import java.awt.HeadlessException;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;

/**
 * @author usuario
 *
 */
public class VentanaEventosRatonAdaptadora extends JFrame {

	/**
	 * @throws HeadlessException
	 */
	public VentanaEventosRatonAdaptadora() {
		this.setTitle("Ventana Respondiendo a eventos raton");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(10,10,500,350);
		this.addMouseListener(new EventosDeRaton());
	}
	
	class EventosDeRaton extends MouseAdapter{
		public void mouseClicked(MouseEvent e){
			System.out.println("Has hecho click");
			System.out.println("Coordenada x: "+e.getX()+" Coordenada Y: "+e.getY());
			System.out.println("Numero de clicks: "+e.getClickCount());
			}
		}
	}
