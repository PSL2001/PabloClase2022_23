/**
 * PabloClase2022_23 - eventosMetodos - PanelMetodo4.java
 * 8 nov 2022 - 8:41:57
 * @author Pablo Sánchez López
 */
package eventosMetodos;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;

/**
 * @author usuario
 *
 */
public class PanelMetodo4 extends JPanel {

	/**
	 * 
	 */
	public PanelMetodo4() {
		JButton botonAzul = new JButton("Azul");
		JButton botonAmarillo = new JButton("Amarillo");
		JButton botonRojo = new JButton("Rojo");
		//Funciones anonimas con expresion lambda
		botonAzul.addActionListener(e -> Accion1());
		botonAmarillo.addActionListener(e -> setBackground(Color.YELLOW));
		botonRojo.addActionListener(e -> {
			setBackground(Color.RED);
			botonAzul.setEnabled(false);
		});
		
		this.add(botonAzul);
		this.add(botonAmarillo);
		this.add(botonRojo);
	}

	/**
	 * @return
	 */
	private void Accion1() {
		setBackground(Color.BLUE);
	}
	

}
