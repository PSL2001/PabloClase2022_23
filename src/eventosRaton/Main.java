/**
 * PabloClase2022_23 - eventosRaton - Main.java
 * 9 nov 2022 - 8:59:57
 * @author Pablo Sánchez López
 */
package eventosRaton;

/**
 * @author usuario
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		VentanaEventosRaton miVentana = new VentanaEventosRaton();
		miVentana.setVisible(true);
		VentanaEventosRatonAdaptadora miVentana2 = new
		VentanaEventosRatonAdaptadora();
		miVentana2.setVisible(true);
	}

}
