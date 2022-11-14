/**
 * PabloClase2022_23 - paneles1 - Ventana.java
 * 4 oct 2022 - 8:45:15
 * @author Pablo Sánchez López
 */
package paneles2;

import javax.swing.JFrame;

/**
 * @author usuario
 *
 */
public class Ventana extends JFrame {
	//Declaramos los paneles
	private Panel1 miPanel1;
	private Panel2 miPanel2;
	private Panel3 miPanel3;
	private Panel4 miPanel4;
	private Panel5 miPanel5;
	private Panel6 miPanel6;
	public Ventana() {
		super("Ventana sobre la que escribiremos en un JPanel");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setBounds(50, 50, 600, 450);
		this.setLayout(null);
		miPanel1 = new Panel1();
		miPanel2 = new Panel2();
		miPanel3 = new Panel3();
		miPanel4 = new Panel4();
		miPanel5 = new Panel5();
		miPanel6 = new Panel6();
		//Posicionamos
		miPanel1.setBounds(10, 10, 100, 50);
		miPanel2.setBounds(120, 10, 100, 50);
		miPanel3.setBounds(240, 10, 100, 50);
		miPanel4.setBounds(10, 60, 100, 50);
		miPanel5.setBounds(10, 120, 100, 50);
		miPanel6.setBounds(120, 120, 100, 50);
		//Añadidmos
		add(miPanel1);
		add(miPanel2);
		add(miPanel3);
		add(miPanel4);
		add(miPanel5);
		add(miPanel6);
		//Al final
		this.setVisible(true);
	}
}
