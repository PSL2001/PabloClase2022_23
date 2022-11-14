/**
 * PabloClase2022_23 - jOptionPane - MiIcon.java
 * 10 oct 2022 - 9:03:20
 * @author Pablo Sánchez López
 */
package jOptionPane;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.JOptionPane;

/**
 * @author usuario
 *
 */
public class MiIcon implements Icon {

	/**
	 * 
	 */
	public MiIcon() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void paintIcon(Component c, Graphics g, int x, int y) {
		Image imagen;
		try {
			imagen = ImageIO.read(getClass().getResource("../recursos/icono3.png"));
			g.drawImage(imagen, x, y, c);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(c, "Imagen No Encontrada", "Atención", JOptionPane.WARNING_MESSAGE);
		}
		
	}

	@Override
	public int getIconWidth() {
		// TODO Auto-generated method stub
		return 50;
	}

	@Override
	public int getIconHeight() {
		// TODO Auto-generated method stub
		return 37;
	}

}
