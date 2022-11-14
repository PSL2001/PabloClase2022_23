/**
 * PabloClase2022_23 - pruebaMenu - Ventana.java
 * 14 nov 2022 - 9:35:10
 * @author Pablo Sánchez López
 */
package pruebaMenu;

import java.awt.Frame;

import javax.swing.*;

/**
 * @author usuario
 *
 */
public class Ventana extends JFrame {
	private JMenuBar mibarra;
	private JMenu archivo, edicion, herramientas, opciones;
	private JMenuItem guardar, guardarComo, cortar, copiar, pegar, opcion1, opcion2,  generales, itemEmergente1, itemEmergente2;
	private JPopupMenu menuEmergente;
	private JPanel miPanel;
	
	public Ventana() {
		super("Menus y menu emergentes");
		this.setSize(400, 300);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.iniciarComponentes();
	}
	/**
	 * 
	 */
	private void iniciarComponentes() {
		mibarra = new JMenuBar();
		
		archivo = new JMenu("Archivo");
		edicion = new JMenu("Edicion");
		herramientas = new JMenu("Herramientas");
		opciones = new JMenu("Opciones");
		
		//Opciones de los menus
		
		guardar = new JMenuItem("Guardar");
		guardarComo = new JMenuItem("Guardar como");
		cortar = new JMenuItem("Cortar");
		copiar = new JMenuItem("Copiar");
		pegar = new JMenuItem("Pegar");
		opcion1 = new JMenuItem("Opcion 1");
		opcion2 = new JMenuItem("Opcion 2");
		generales = new JMenuItem("Generales");
		
		//Opciones a los menus
		
		archivo.add(guardar);
		archivo.add(guardarComo);
		edicion.add(cortar);
		edicion.add(copiar);
		edicion.add(pegar);
		
		//Incluimos el separador
		edicion.addSeparator();
		herramientas.add(generales);
		opciones.add(opcion1);
		opciones.add(opcion2);
		
		//Especificamos que opciones no cuelgan de la barra general
		
		edicion.add(opciones);
		mibarra.add(archivo);
		mibarra.add(edicion);
		mibarra.add(herramientas);
		
		//Añadimos la barra a la ventana
		this.setJMenuBar(mibarra);
		
		//Opciones del menu emergente
		miPanel = new JPanel();
		itemEmergente1 = new JMenuItem("Opcion Emergente 1");
		itemEmergente2 = new JMenuItem("Opcion Emergente 2");
		//Creamos el menu emergente y le añadimos los items
		menuEmergente = new JPopupMenu();
		menuEmergente.add(itemEmergente1);
		menuEmergente.add(itemEmergente2);
		//Añadimos el menu al panel
		miPanel.setComponentPopupMenu(menuEmergente);
		this.add(miPanel);
		
	}
}
