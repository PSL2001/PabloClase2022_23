/**
 * PabloClase2022_23 - layouts - PanelSimpleGridLayout.java
 * 25 oct 2022 - 9:05:03
 * @author Pablo Sánchez López
 */
package layouts;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * @author usuario
 *
 */
public class PanelSimpleGridLayout extends JPanel {

	/**
	 * 
	 */
	public PanelSimpleGridLayout() {
		//Constructor gridlayout(filas, columnas, espacio horizontal, espacio vertical)
//		this.setLayout(new GridLayout(10,2,0,0));
		//Si no se pone nada, entonces cubre todo
//		this.setLayout(new GridLayout());
		this.add(new JLabel("Primera"));
		this.add(new JLabel("Segunda"));
		this.add(new JLabel("Tercera"));
		this.add(new JLabel("Cuarta"));
		this.add(new JLabel("Quinta"));
		this.add(new JLabel("Sexta"));

		this.add(new JButton("Primera"));
		this.add(new JButton("Segunda"));
		this.add(new JButton("Tercera"));
		this.add(new JButton("Cuarta"));
		this.add(new JButton("Quinta"));
		this.add(new JButton("Sexta"));
	}

}
