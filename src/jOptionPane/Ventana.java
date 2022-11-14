/**
 * PabloClase2022_23 - jOptionPane - Ventana.java
 * 10 oct 2022 - 8:43:16
 * @author Pablo Sánchez López
 */
package jOptionPane;

import javax.swing.JFrame;

/**
 * @author usuario
 *
 */
public class Ventana extends JFrame {
	private PanelShowMessageDialog psmd;
	private PanelShowConfirmDialog pscd;
	private PanelShowOptionDialog psod;
	private PanelShowImputDialog psid;
	/**
	 * 
	 */
	public Ventana() {
		// TODO Auto-generated constructor stub
		super("Ventana sobre la que insertamos JOptionPane- Paneles");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setBounds(50, 50, 600, 450);
//		psmd = new PanelShowMessageDialog();
//		this.add(psmd);
//		pscd = new PanelShowConfirmDialog();
//		this.add(pscd);
//		psod = new PanelShowOptionDialog();
//		this.add(psod);
		psid = new PanelShowImputDialog();
		this.add(psid);
		this.setVisible(true);
	}

}
