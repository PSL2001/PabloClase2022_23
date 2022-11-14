/**
 * PabloClase2022_23 - layouts - Panel.java
 * 25 oct 2022 - 8:36:48
 * @author Pablo Sánchez López
 */
package layouts;

import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * @author usuario
 *
 */
public class PanelSimpleFlowLayout extends JPanel {

	/**
	 * 
	 */
	public PanelSimpleFlowLayout() {
		// this.setLayout(new FlowLayout());
		// this.setLayout(new FlowLayout(FlowLayout.RIGHT));
		// this.setLayout(new FlowLayout(FlowLayout.LEFT,40,40));
		 this.setLayout(new FlowLayout(1,80,10));
		this.add(new JLabel("Primera"));
		this.add(new JLabel("Segunda"));
		this.add(new JLabel("Tercera"));
		this.add(new JLabel("Cuarta"));
		this.add(new JLabel("Quinta"));
		this.add(new JLabel("Sexta"));

	}

}
