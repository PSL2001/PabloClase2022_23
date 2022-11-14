/**
 * PabloClase2022_23 - layouts - PanelSimpleBorderLayout.java
 * 25 oct 2022 - 9:04:55
 * @author Pablo Sánchez López
 */
package layouts;

import java.awt.BorderLayout;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 * @author usuario
 *
 */
public class PanelSimpleBorderLayout extends JPanel {
	private JPanel p1;

	/**
	 * 
	 */
	public PanelSimpleBorderLayout() {
		// TODO Auto-generated constructor stub
		this.setLayout(new BorderLayout());
		p1 = new JPanel();
//		this.add(new JLabel("Norte", SwingConstants.CENTER), BorderLayout.NORTH);
		//Solo se añade el ultimo elemento en una posicion
//		this.add(new JLabel("Norte 2", SwingConstants.CENTER), BorderLayout.NORTH);
//		this.add(new JLabel("Sur", SwingConstants.CENTER), BorderLayout.SOUTH);
//		this.add(new JLabel("Centro", SwingConstants.CENTER), BorderLayout.CENTER);
		this.add(new JLabel("Oeste", SwingConstants.CENTER), BorderLayout.WEST);
		this.add(new JLabel("Este", SwingConstants.CENTER), BorderLayout.EAST);
		p1.add(new JLabel("Dentro de p1_a"));
		p1.add(new JLabel("Dentro de p1_b"));
		p1.add(new JLabel("Dentro de p1_c"));
		p1.setBorder(BorderFactory.createTitledBorder("Panel 1"));
		this.add(p1);
//		this.add(p1, BorderLayout.CENTER);
	}

}
