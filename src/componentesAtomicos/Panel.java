/**
 * PabloClase2022_23 - componentesAtomicos - Panel.java
 * 13 oct 2022 - 13:02:51
 * @author Pablo Sánchez López
 */
package componentesAtomicos;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JSlider;
import javax.swing.JSpinner;
import javax.swing.JToggleButton;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 * @author usuario
 *
 */
public class Panel extends JPanel implements ChangeListener, ActionListener {
	private JLabel label1, label2, label3;
	private JButton btn1;
	private JCheckBox cb1, cb2;
	private JRadioButton rb1, rb2;
	private ButtonGroup rg1;
	private JToggleButton tbutton1;
	private JComboBox<String> combo;
	private JSeparator sepH, sepV;
	private JSpinner spinner;
	private JSlider slider;
	private JProgressBar barra;
	/**
	 * 
	 */
	public Panel() {
		// Instanciamos Objetos
		label1 = new JLabel();
		label1.setText("Componentes Atomicos");
		label1.setHorizontalAlignment(SwingConstants.CENTER);
		label1.setFont(new Font("Segoe Script", Font.BOLD, 16));
		label1.setForeground(Color.MAGENTA); //Esto cambia el como se ve el color del texto
		label1.setBackground(Color.DARK_GRAY); //Color de fondo (NO DEL TEXTO) Para que se muestre el color de fondo hay que añadir setOpaque
		label1.setOpaque(true);
		
		label2 = new JLabel("Esto es una etiqueta o JLabel");
		label2.setFont(new Font("MS UI Gothic", Font.ITALIC, 12));
		label2.setForeground(Color.WHITE);
		label2.setBackground(Color.BLACK);
		label2.setOpaque(true);
		
		label3 = new JLabel("Esto es un JLabel");
		
		btn1 = new JButton("Botón");
		
		cb1 = new JCheckBox("Check 1");
		cb2 = new JCheckBox("Check 2", true);
		
		rb1 = new JRadioButton("Radio 1");
		rb2 = new JRadioButton("Radio 2");
		
		rg1 = new ButtonGroup();
		
		tbutton1 = new JToggleButton("Activar", true);
		
		String[] opciones = {"Opcion 1", "Opcion 2", "Opcion 3", "Opcion 4", "Opcion 5"};
		combo = new JComboBox<String>(opciones);
		
		sepH = new JSeparator();
		sepV = new JSeparator(SwingConstants.VERTICAL);
		
		spinner = new JSpinner();
		
		
		
		slider = new JSlider(SwingConstants.HORIZONTAL,0,200,90);
		slider.setMajorTickSpacing(50);
		slider.setMinorTickSpacing(5);
		slider.setPaintTicks(true);
		slider.setFont(new Font("Tahoma",Font.PLAIN,10));
		slider.setForeground(Color.MAGENTA);
		slider.setPaintLabels(true);
//		slider.setEnabled(false);
		
		barra = new JProgressBar(0, 200);
		barra.setValue(50);
		
		//Listeners
		spinner.addChangeListener(this);
		slider.addChangeListener(this);
		btn1.addActionListener(this);
		tbutton1.addActionListener(this);
		
		
		
		//Posicionamos los componentes
		this.setLayout(null);
		label1.setBounds(150, 10, 500, 60);
		label2.setBounds(20, 80, 150, 20);
		label3.setBounds(200, 80, 250, 20);
		btn1.setBounds(150, 110, 150, 20);
		cb1.setBounds(150, 140, 100, 20);
		cb2.setBounds(250, 140, 100, 20);
		rb1.setBounds(150, 170, 100, 20);
		rb2.setBounds(250, 170, 100, 20);
		tbutton1.setBounds(170, 200, 100, 20);
		combo.setBounds(600, 80, 100, 20);
		combo.setSelectedIndex(2);
		sepH.setBounds(600, 110, 100, 20);
		sepV.setBounds(380, 80, 10, 400);
		spinner.setBounds(650, 210, 50, 30);
		slider.setBounds(430, 130, 200, 70);
		barra.setBounds(450, 250, 250, 50);
		
		//Añadimos Objetos
		this.add(label1);
		this.add(label2);
		this.add(label3);
		this.add(btn1);
		this.add(cb1);
		this.add(cb2);
		rg1.add(rb1);
		rg1.add(rb2);
		this.add(rb1);
		this.add(rb2);
		this.add(tbutton1);
		this.add(combo);
		this.add(sepH);
		this.add(sepV);
		this.add(spinner);
		this.add(slider);
		this.add(barra);
		
		
	}
	@Override
	public void stateChanged(ChangeEvent e) {
		int valor;
		
		if (e.getSource() == spinner) {
			valor = (int) spinner.getValue();
			barra.setValue(valor);
			slider.setValue(valor);
		}
		
		if (e.getSource() == slider) {
			valor = (int) slider.getValue();
			barra.setValue(valor);
			spinner.setValue(valor);
		}
		
		
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btn1) {
//			JOptionPane.showMessageDialog(this, "Hola desde boton 1");
			String salida = validaSalida();
			JOptionPane.showMessageDialog(this, salida);
		}
//		if (e.getActionCommand() == "Activar") {
//			JOptionPane.showMessageDialog(this, "Hola desde toggle button");
//		}
		System.out.println(e.paramString());
		System.out.println(e.getActionCommand());
	}
	
	private String validaSalida() {
		String cad = "Seleccionado: \n";
		if (cb1.isSelected()) {
			cad += "Checkbox 1 \n";
		}
		if (cb2.isSelected()) {
			cad += "Checkbox 2 \n";
		}
		if (rb1.isSelected()) {
			cad += "Radio Button 1 \n";
		}
		if (rb2.isSelected()) {
			cad += "Radio Button 2 \n";
		}
		if (tbutton1.isSelected()) {
			cad += "ToggleButton Activado \n";
		} else {
			cad += "ToggleButton Desactivado \n";
		}
		cad += "Opcion seleccionada: " + combo.getSelectedItem() + "\n";
		return cad;
		
	}

}
