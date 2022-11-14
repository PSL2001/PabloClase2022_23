/**
 * PabloClase2022_23 - eventosMetodos - Ventana.java
 * 7 nov 2022 - 9:04:22
 * @author Pablo Sánchez López
 */
package eventosMetodos;

import javax.swing.JFrame;

/**
 * @author usuario
 *
 */
public class Ventana extends JFrame {
	private PanelMetodo1 pm1;
	private PanelMetodo2 pm2;
	private PanelMetodo3 pm3;
	private PanelMetodo4 pm4;
	private PanelMetodo4B pm4b;
	/**
	 * 
	 */
	public Ventana() {
		super("Eventos");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setBounds(50, 50, 600, 450);
		
//		pm1 = new PanelMetodo1();
//		this.add(pm1);
		
//		
//		pm2 = new PanelMetodo2();
//		this.add(pm2);
		
//		pm3 = new PanelMetodo3();
//		this.add(pm3);
		
//		pm4 = new PanelMetodo4();
//		this.add(pm4);
		
		pm4b = new PanelMetodo4B();
		this.add(pm4b);
	}

}
