/**
 * PabloClase2022_23 - eventosMetodos - PanelMetodo2.java
 * 7 nov 2022 - 9:28:09
 * @author Pablo Sánchez López
 */
package eventosMetodos;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

/**
 * @author usuario
 *
 */
public class PanelMetodo2 extends JPanel implements ActionListener {
	private JButton botonAzul, botonAmarillo, botonRojo;
	/**
	 * 
	 */
	public PanelMetodo2() {
		botonAzul = new JButton("Azul");
		botonAmarillo = new JButton("Amarillo");
		botonRojo = new JButton("Rojo");
		
		//listeners
		botonAzul.addActionListener(this);
		botonAmarillo.addActionListener(this);
		botonRojo.addActionListener(this);
		
		this.add(botonAzul);
		this.add(botonAmarillo);
		this.add(botonRojo);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object boton = e.getSource();
		
		if (boton == botonAzul) {
			setBackground(Color.BLUE);
		}
		
		if (boton == botonAmarillo) {
			setBackground(Color.YELLOW);
		}
		
		if (boton == botonRojo) {
			setBackground(Color.RED);
		}
		
	}

}
