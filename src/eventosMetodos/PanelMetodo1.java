/**
 * PabloClase2022_23 - eventosMetodos - PanelMetodo1.java
 * 7 nov 2022 - 9:05:27
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
public class PanelMetodo1 extends JPanel {
	private JButton botonAzul, botonAmarillo, botonRojo;
	private ColorFondo fondo;
	/**
	 * 
	 */
	public PanelMetodo1() {
		botonAzul = new JButton("Azul");
		botonAmarillo = new JButton("Amarillo");
		botonRojo = new JButton("Rojo");
		
		//Instanciamos un objeto de la clase oyente
		fondo = new ColorFondo(Color.BLUE);
		//Registra o asociar el evento oyente al componente a traves de addActionListener
		botonAzul.addActionListener(fondo);
		botonAmarillo.addActionListener(new ColorFondo(Color.YELLOW));
		botonRojo.addActionListener(new ColorFondo(Color.RED));
		
		this.add(botonAzul);
		this.add(botonAmarillo);
		this.add(botonRojo);
	}
	
	//Definimos la clase oyente y la definimos internamente para utilizar el metodo setBackground
	private class ColorFondo implements ActionListener {
		private Color colorFondo;
		
		public ColorFondo(Color c) {
			colorFondo = c;
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			setBackground(colorFondo);
			
		}
		
	}

}
