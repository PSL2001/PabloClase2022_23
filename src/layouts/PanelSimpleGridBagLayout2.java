/**
 * PabloClase2022_23 - layouts - PanelSimpleGridBagLayout2.java
 * 26 oct 2022 - 9:34:45
 * @author Pablo Sánchez López
 */
package layouts;

import java.awt.LayoutManager;

import java.awt.*;
import javax.swing.*;


import javax.swing.JPanel;

/**
 * @author usuario
 *
 */
public class PanelSimpleGridBagLayout2 extends JPanel {
	private GridBagLayout layout; // layout of this frame
	 private GridBagConstraints constraints; // constraints of this layout
	/**
	 * 
	 */
	public PanelSimpleGridBagLayout2() {
		layout = new GridBagLayout();
		 this.setLayout( layout ); // set frame layout
		 //create GUI components
		 JTextArea textArea1 = new JTextArea( "TextArea1", 5, 10 );
		 JTextArea textArea2 = new JTextArea( "TextArea2", 2, 2 );
		 String[] names = { "Iron", "Steel", "Brass" };
		 JComboBox<String> comboBox = new JComboBox<String>(names);
		 JTextField textField = new JTextField( "TextField" );
		 JButton button1 = new JButton( "Button 1" );
		 JButton button2 = new JButton( "Button 2" );
		 JButton button3 = new JButton( "Button 3" );
		 //para el constructor de las GridBagConstraints
		 Insets insert = new Insets(1,1,1,1);
		 
		/*
		 * textArea1
		 * fill is VERTICAL
		 * gridx = 0
		 * gridy = 0
		 * gridwidth = 1
		 * gridheight = 3
		 * GridBagConstraints(int gridx, int gridy, int gridwidth, int gridheight,
		 */
		double weightx; 
		double weighty;
		 //int anchor, int fill, Insets insets, int ipadx, int ipady)
		 //anchor = GridBagConstraints.CENTER
		 //fill = GridBagConstraints.BOTH
		constraints = new GridBagConstraints(0,0,1,3,1,0,GridBagConstraints.CENTER,GridBagConstraints.BOTH,insert ,0,0);
		 constraints = new GridBagConstraints(0,0,1,3,0,0,GridBagConstraints.CENTER,GridBagConstraints.BOTH,insert,0,0);
		 layout.setConstraints(textArea1, constraints ); // set constraints
		 this.add(textArea1); // add component
		 //button1
		 //weightx and weighty for button1 are both 0: the default
		 //fill is HORIZONTAL
		 constraints = new GridBagConstraints(1,0,2,1,0,0,GridBagConstraints.CENTER,GridBagConstraints.HORIZONTAL,insert,0,0);
		 layout.setConstraints(button1, constraints ); // set constraints
		 this.add(button1); // add component
		 
		 //Combo Box
		//fill is HORIZONTAL
		 //weightx and weighty for comboBox are both 1: the default
		 constraints = new GridBagConstraints(1,2,2,1,0,0,GridBagConstraints.CENTER,GridBagConstraints.HORIZONTAL,insert,0,0);
		 layout.setConstraints(comboBox, constraints ); // set constraints
		 this.add(comboBox); // add component

		 //button2
		 //fill is BOTH
		 constraints = new GridBagConstraints(1,1,1,1,1,1,GridBagConstraints.CENTER,GridBagConstraints.BOTH,insert,0,0);
		 layout.setConstraints(button2, constraints ); // set constraints
		 this.add(button2); // add component
		 
		 constraints = new GridBagConstraints(2,1,1,1,0,0,GridBagConstraints.CENTER,GridBagConstraints.BOTH,insert,0,0);
		 layout.setConstraints(button3, constraints ); // set constraints
		 this.add(button3); // add component
		 
		 //textField
		 constraints = new GridBagConstraints(0,3,2,1,0,0,GridBagConstraints.CENTER,GridBagConstraints.BOTH,insert,0,0);
		 layout.setConstraints(textField, constraints ); // set constraints
		 this.add(textField); // add component
		 
		 //textArea2
		 constraints = new GridBagConstraints(2,3,2,1,0,0,GridBagConstraints.CENTER,GridBagConstraints.BOTH,insert,0,0);
		 layout.setConstraints(textArea2, constraints ); // set constraints
		 this.add(textArea2); // add component



	}

}
