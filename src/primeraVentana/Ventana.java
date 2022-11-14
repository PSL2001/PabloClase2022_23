/**
 * PabloClase2022_23 - primeraVentana - Ventana.java
 * 3 oct 2022 - 8:49:55
 * @author Pablo Sánchez López
 */
package primeraVentana;

import javax.swing.JFrame;

/**
 * @author usuario
 *
 */
public class Ventana extends JFrame {
	//Creamos el constructor
	public Ventana() {
		//Llamamos al constructor para poner titulo a la ventana
		super("Mi primera Ventana");
		//Añadimos un tamaño
//		this.setSize(500, 300);
		//Para cambiar la localizacion de la Ventana
//		this.setLocation(200, 300);
		//setBounds es lo mismo que setSize con setLocation
		this.setBounds(100, 200, 500, 400);
		//Para activar o desactivar el poder maximizar
		//this.setResizable(false);
		//Para maximizar el tamaño de la ventana
		this.setExtendedState(MAXIMIZED_BOTH); //this.setExtendedState(6);
		//Creamos acciones por defecto al cerrar la aplicacion
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//La hacemos visible
		this.setVisible(true);
		
	}
}
