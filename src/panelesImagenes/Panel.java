/**
 * PabloClase2022_23 - paneles1 - Panel.java
 * 4 oct 2022 - 8:45:08
 * @author Pablo Sánchez López
 */
package panelesImagenes;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * @author usuario
 *
 */
public class Panel extends JPanel {
	//Declaramos objetos
	private JLabel titulo, labelPintura1, pintura1, labelPintura2, pintura2;
	private ImageIcon imagen1, imagen2;
	public Panel() {
		//Distribucion de objetos con posicion absoluta (normalmente es de izquierda a derecha)
		this.setLayout(null);
		//Instanciamos labelTitulo
		titulo = new JLabel("Estamos añadiendo Imagenes");
		//Posicionamos el titulo (x, y, ancho, alto)
		titulo.setBounds(160, 5, 380, 40);
		//La ruta relativa del fichero externo al proyecto compilado
		labelPintura1 = new JLabel("Pintura 1 - Fichero Externo al Proyecto Compilado");
		labelPintura1.setBounds(50, 60, 380, 40);
		imagen1 = new ImageIcon("src/recursos/persona.png");
		pintura1 = new JLabel(imagen1);
		pintura1.setBounds(100, 100, 100, 150);
		
		
		//Añadimos los componentes, siempre al final
		add(titulo);
		add(labelPintura1);
		add(pintura1);
		
	}
	
}
