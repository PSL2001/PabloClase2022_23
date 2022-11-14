/**
 * PabloClase2022_23 - layouts - PanelSimpleBoxLayoutBox.java
 * 25 oct 2022 - 9:05:26
 * @author Pablo Sánchez López
 */
package layouts;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 * @author usuario
 *
 */
public class PanelSimpleBoxLayoutBox extends JPanel {
	public PanelSimpleBoxLayoutBox() {
		JButton b1 = new JButton("Boton 1");
		JButton b2 = new JButton("Boton 2");
		JButton b3 = new JButton("Boton 3");
		JButton b4 = new JButton("Boton 4");
		JButton b5 = new JButton("Boton 5");
		JButton b6 = new JButton("Boton 6");
		Box cajaH = Box.createHorizontalBox(); // método factoría (Crea un boxlayout en horizontal)
		cajaH.add(b1);
		// separación horizontal de 10 pixeles
		cajaH.add(Box.createHorizontalStrut(10));
		cajaH.add(b2);
		cajaH.add(Box.createHorizontalStrut(0));
		// zona rígida, separación horizontal
		cajaH.add(Box.createRigidArea(new Dimension(5,5)));
		cajaH.add(b3);
		cajaH.add(Box.createRigidArea(new Dimension(5,5)));
		this.add(cajaH,BorderLayout.NORTH);
		//Crea marco vertical
		Box cajaV = Box.createVerticalBox();
		cajaV.add(Box.createHorizontalStrut(70));
		cajaV.add(b4);
		// separación horizontal 10 pixeles
		cajaV.add(Box.createVerticalStrut(10));
		cajaV.add(b5);
		cajaV.add(Box.createVerticalStrut(10));
		cajaV.add(Box.createRigidArea(new Dimension(5,5)));
		cajaV.add(b6);
		this.add(cajaV,BorderLayout.CENTER);
	}
}
