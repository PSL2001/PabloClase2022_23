/**
 * PabloClase2022_23 - ventanaCentrada - Ventana.java
 * 3 oct 2022 - 9:37:18
 * @author Pablo Sánchez López
 */
package ventanaCentrada;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;

/**
 * @author usuario
 *
 */
public class Ventana extends JFrame {
	public Ventana() {
		super();
		this.setTitle("Ventana Centrada");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
//		this.setSize(200, 200);
		//Importamos Toolkit para cojer la resolucion
		Toolkit miPantalla = Toolkit.getDefaultToolkit();
		//Ahora con Dimension, pedimos el tamaño. Esto devuelve el tamaño de la pantalla
		Dimension tamanioPantalla = miPantalla.getScreenSize();
		//Tanto el ancho como el alto estan guardados y podemos acceder a ellos
		int altoPantalla = tamanioPantalla.height;
		int anchoPantalla = tamanioPantalla.width;
		//Por ultimo para centrar la ventana dividimos los tamaños entre 2
		this.setSize(anchoPantalla/2, altoPantalla/2);
		//Para centrarlo lo dividimos entre 4
		this.setLocation(anchoPantalla/4, altoPantalla/4);
		//Mandamos el icono
		Image miIcono = miPantalla.getImage("src/recursos/icono.png");
		//Y lo establecemos
		this.setIconImage(miIcono);
		//Y la hacemos visible
		this.setVisible(true);
	}
}
