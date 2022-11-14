/**
 * PabloClase2022_23 - paneles1 - Panel.java
 * 4 oct 2022 - 8:45:08
 * @author Pablo Sánchez López
 */
package paneles1;

import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * @author usuario
 *
 */
public class Panel extends JPanel {
	//Declaramos objetos
	private JLabel labelTitulo;
	public Panel() {
		//Distribucion de objetos con posicion absoluta (normalmente es de izquierda a derecha)
		this.setLayout(null);
		//Instanciamos labelTitulo
		labelTitulo = new JLabel("Estamos aprendiendo Swing");
		//Posicionamos el titulo (x, y, ancho, alto)
		labelTitulo.setBounds(160, 5, 380, 40);
		//Añadimos los componentes, siempre al final
		this.add(labelTitulo);
		
	}
	
}
