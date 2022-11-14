/**
 * PabloClase2022_23 - layouts - Ventana.java
 * 25 oct 2022 - 8:35:29
 * @author Pablo Sánchez López
 */
package layouts;

import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JFrame;

/**
 * @author usuario
 *
 */
public class Ventana extends JFrame {
	private PanelSimpleFlowLayout psfl;
	private PanelSimpleBorderLayout psbl;
	private PanelSimpleGridLayout psgl;
	private PanelSimpleBoxLayout psboxl;
	private PanelSimpleBoxLayoutBox psboxlbox;
	private PanelSimpleGridBagLayout psgbl;
	private PanelSimpleGridBagLayout2 psgbl2;
	/**
	 * 
	 */
	public Ventana() {
		super("Ventana sobre la que aplicamos Layouts");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
//		psfl = new PanelSimpleFlowLayout();
//		psfl.setBorder(BorderFactory.createTitledBorder("PanelSimpleFlowLayout"));
//		this.add(psfl);
		
//		psbl = new PanelSimpleBorderLayout();
//		psbl.setBorder(BorderFactory.createTitledBorder("PanelSimpleBorderLayout"));
//		this.add(psbl);
		
//		psgl=new PanelSimpleGridLayout();
//		psgl.setBorder(BorderFactory.createTitledBorder("PanelSimpleGridLayout"));
//		this.add(psgl);
		
//		psboxl= new PanelSimpleBoxLayout();
//		psboxl.setBorder(BorderFactory.createTitledBorder("PanelSimpleBoxLayout"));
//		this.add(psboxl);
//		
		psboxlbox = new PanelSimpleBoxLayoutBox();
		psboxlbox.setBorder(BorderFactory.createTitledBorder("PanelSimpleBoxLayoutBox"));
		this.add(psboxlbox);
		
//		psgbl= new PanelSimpleGridBagLayout();
//		psgbl.setBorder(BorderFactory.createTitledBorder("SimpleGridBagLayout"));
//		this.add(psgbl);
		
//		psgbl2 = new PanelSimpleGridBagLayout2();
//		psgbl2.setBorder(BorderFactory.createTitledBorder("SimploGridBagLayout2"));
//		this.add(psgbl2);
		
		//Para definir tamaño
		this.setMinimumSize(new Dimension(400, 300));
		this.setMaximumSize(new Dimension(800, 800));
		this.pack();
		this.setVisible(true);
	}

}
