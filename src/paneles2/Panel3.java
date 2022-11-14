/**
 * PabloClase2022_23 - paneles1 - Panel.java
 * 4 oct 2022 - 8:45:08
 * @author Pablo Sánchez López
 */
package paneles2;

import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * @author usuario
 *
 */
public class Panel3 extends JPanel {
	//Declaramos objetos
	private JLabel labelTitulo;
	public Panel3() {
		//Distribucion de objetos con posicion absoluta (normalmente es de izquierda a derecha)
		this.setLayout(null);
		//Instanciamos labelTitulo
		labelTitulo = new JLabel("Panel3");
		//Posicionamos el titulo (x, y, ancho, alto)
		labelTitulo.setBounds(5, 5, 50, 20);
		//Añadimos los componentes, siempre al final
		this.add(labelTitulo);
		
	}
	
}
