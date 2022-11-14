/**
 * PabloClase2022_23 - paneles1 - Ventana.java
 * 4 oct 2022 - 8:45:15
 * @author Pablo Sánchez López
 */
package paneles2bordes;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;

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
	//Color
	private Color c1;
	private Color c2;
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
		//Posicionamos en la ventana
		miPanel1.setBounds(10, 10, 100, 50);
		miPanel2.setBounds(120, 10, 100, 50);
		miPanel3.setBounds(240, 10, 100, 50);
		miPanel4.setBounds(10, 60, 100, 50);
		miPanel5.setBounds(10, 120, 100, 50);
		miPanel6.setBounds(120, 120, 300, 120);
		//Creamos los bordes con los colores correspondientes
		c1 = new Color(144, 94, 150);
		// Borde de color rojo con grosor de linea de 2px
		// Border line = BorderFactory.createLineBorder(Color.RED, 2);
		Border line = BorderFactory.createLineBorder(c1, 2);
		miPanel1.setBorder(line);
		c2= new Color(183, 62, 62);
		miPanel2.setBorder(BorderFactory.createLineBorder(c2));
		//Bordes Biselados
		miPanel3.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED, Color.BLUE, Color.GREEN, Color.BLACK, Color.RED));
		miPanel4.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED, Color.BLUE, Color.GREEN, Color.BLACK, Color.RED));
		//Bordes Grabados
		miPanel5.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED, Color.RED, Color.GRAY));
		//Bordes Mate
		ImageIcon icono = new ImageIcon("src/recursos/icono.png"); //Aqui va la ruta relativa al programa fuente desde 'src'
		miPanel6.setBorder(BorderFactory.createMatteBorder(30, 30, 30, 30, icono));
		//Añadimos a la ventana
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
