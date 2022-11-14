/**
 * PabloClase2022_23 - layouts - PanelSimpleBoxLayout.java
 * 25 oct 2022 - 9:05:18
 * @author Pablo Sánchez López
 */
package layouts;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * @author usuario
 *
 */
public class PanelSimpleBoxLayout extends JPanel {
	public PanelSimpleBoxLayout() {
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
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
