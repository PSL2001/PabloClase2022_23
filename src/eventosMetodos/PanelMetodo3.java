/**
 * PabloClase2022_23 - eventosMetodos - PanelMetodo3.java
 * 8 nov 2022 - 8:28:55
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
public class PanelMetodo3 extends JPanel {
	/**
	 * 
	 */
	public PanelMetodo3() {
		JButton botonAzul = new JButton("Azul");
		JButton botonAmarillo = new JButton("Amarillo");
		JButton botonRojo = new JButton("Rojo");
		//Clases internas Anonimas
		botonAzul.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				setBackground(Color.BLUE);
				
			}
			
		});
		botonAmarillo.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				setBackground(Color.YELLOW);
				
			}
			
		});
		botonRojo.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				setBackground(Color.RED);
				
			}
			
		});
		
		this.add(botonAzul);
		this.add(botonAmarillo);
		this.add(botonRojo);
	}

}
