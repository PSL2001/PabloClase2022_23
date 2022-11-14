/**
 * PabloClase2022_23 - eventosMetodos - PanelMetodo4B.java
 * 8 nov 2022 - 8:48:57
 * @author Pablo Sánchez López
 */
package eventosMetodos;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JPanel;

/**
 * @author usuario
 *
 */
public class PanelMetodo4B extends JPanel {
	private JButton botonAzul, botonAmarillo, botonRojo;
	/**
	 * 
	 */
	public PanelMetodo4B() {
		botonAzul = new JButton("Azul");
		botonAmarillo = new JButton("Amarillo");
		botonRojo = new JButton("Rojo");
		//Funciones anonimas con expresion lambda
		botonAzul.setMnemonic(KeyEvent.VK_A);
		botonAzul.setToolTipText("Mucho Texto");
		
		botonAzul.addActionListener(e -> Accion1(e));
		botonAmarillo.addActionListener(e -> Accion1(e));
		botonRojo.addActionListener(e -> Accion1(e));
		
		this.add(botonAzul);
		this.add(botonAmarillo);
		this.add(botonRojo);
	}

	/**
	 * @return
	 */
	private void Accion1(ActionEvent e) {
		Object boton = e.getSource();
		
		if(boton == botonAzul) {
			this.setBackground(Color.BLUE);
		}
		
		if(boton == botonAmarillo) {
			this.setBackground(Color.YELLOW);
		}
		
		if(boton == botonRojo) {
			this.setBackground(Color.RED);
		}
	}

}
