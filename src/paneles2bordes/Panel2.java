/**
 * PabloClase2022_23 - paneles1 - Panel.java
 * 4 oct 2022 - 8:45:08
 * @author Pablo Sánchez López
 */
package paneles2bordes;

import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * @author usuario
 *
 */
public class Panel2 extends JPanel {
	//Declaramos objetos
	private JLabel labelTitulo;
	public Panel2() {
		//Distribucion de objetos con posicion absoluta (normalmente es de izquierda a derecha)
		this.setLayout(null);
		//Instanciamos labelTitulo
		labelTitulo = new JLabel("Panel2");
		//Posicionamos el titulo (x, y, ancho, alto)
		labelTitulo.setBounds(5, 5, 50, 20);
		//Añadimos los componentes, siempre al final
		this.add(labelTitulo);
		
	}
	
}
