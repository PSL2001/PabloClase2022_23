package jFrameJDialog;

import java.awt.*;
import java.awt.event.*;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import javax.swing.*;

public class VentanaConfirmacion extends JDialog implements ActionListener {
	private JLabel labelTitulo, tituloPanel1, tituloPanel2;// declaramos el objeto Label
	private JPanel miPanelPrincipal;// contenedor de los componentes
	private PanelUno panel1; // panel de ejemplo
	private PanelDos panel2;// panel de ejemplo
	private JButton miBotonPanel2;
	private JButton botonOcultar, botonMostrar, botonReiniciar, botonAceptar;
	private JTextField nombre, apellidos;
	private JLabel nombreLabel, apellidosLabel;

	public VentanaConfirmacion(VentanaPrincipal miVentanaPrincipal, boolean modal)// constructor
	{
		super(miVentanaPrincipal, modal);
		iniciaComponentes();
// Asigna un titulo a la barra de titulo
		setTitle("Ventana Confirmación");
//tama�o de la ventana
		setSize(550, 350);
//pone la ventana en el Centro de la pantalla
		setLocationRelativeTo(null);
	}

	private void iniciaComponentes() {
		miPanelPrincipal = new JPanel();
		miPanelPrincipal.setLayout(null);
		/*
		 * Propiedades del Label, lo instanciamos, posicionamos y activamos los eventos
		 */
		labelTitulo = new JLabel();
		labelTitulo.setText("JPanel Principal");
		labelTitulo.setBounds(200, 20, 180, 23);
		/* propiedades Panel1 */
		componentesPanel1();
		/* propiedades Panel2 */
		componentesPanel2();

		botonMostrar = new JButton();
		botonMostrar.setText("Mostrar Panel2");
		botonMostrar.setBounds(50, 230, 150, 23);
		botonMostrar.addActionListener(this);
		botonOcultar = new JButton();
		botonOcultar.setText("Ocultar Panel2");
		botonOcultar.setBounds(50, 260, 150, 23);
		botonOcultar.addActionListener(this);
		botonReiniciar = new JButton();
		botonReiniciar.setText("Reiniciar Datos");
		botonReiniciar.setBounds(300, 230, 150, 23);
		botonReiniciar.addActionListener(this);
		botonAceptar = new JButton();
		botonAceptar.setText("Aceptar");
		botonAceptar.setBounds(300, 260, 150, 23);
		botonAceptar.addActionListener(this);

		/* Agregamos los componentes al Contenedor */
		miPanelPrincipal.add(labelTitulo);
		miPanelPrincipal.add(panel1);
		miPanelPrincipal.add(panel2);
		miPanelPrincipal.add(botonMostrar);
		miPanelPrincipal.add(botonOcultar);
		miPanelPrincipal.add(botonReiniciar);
		miPanelPrincipal.add(botonAceptar);
		add(miPanelPrincipal);
	}

	private class PanelUno extends JPanel {
		private PanelUno() {
			setLayout(null);
			tituloPanel1 = new JLabel();
			tituloPanel1.setText("Titulo Panel1");
			tituloPanel1.setBounds(40, 20, 90, 23);
			nombreLabel = new JLabel("Nombre:");
			nombreLabel.setBounds(30, 50, 80, 20);
			apellidosLabel = new JLabel("Apellidos:");
			apellidosLabel.setBounds(30, 90, 80, 20);
			nombre = new JTextField();
			nombre.setBounds(100, 50, 90, 20);
			apellidos = new JTextField();
			apellidos.setBounds(100, 90, 90, 20);
			add(tituloPanel1);
			add(nombreLabel);
			add(apellidosLabel);
			add(nombre);
			add(apellidos);
		}
	}

	private void componentesPanel1() {
		panel1 = new PanelUno();
		panel1.setBounds(50, 50, 200, 150);
		panel1.setBackground(Color.lightGray);
	}

	private class PanelDos extends JPanel {
		private PanelDos() {
			setLayout(null);
			tituloPanel2 = new JLabel();
			tituloPanel2.setText("Titulo Panel2");
			tituloPanel2.setBounds(60, 20, 90, 23);
			miBotonPanel2 = new JButton();
			miBotonPanel2.setText("Boton");
			miBotonPanel2.setBounds(50, 80, 90, 23);
			add(tituloPanel2);
			add(miBotonPanel2);
		}
	}

	private void componentesPanel2() {
		panel2 = new PanelDos();
		panel2.setLayout(null);// con esto defino que voy a asignar posiciones de forma manual, sin layout
		panel2.setBounds(280, 50, 200, 150);
		panel2.setBackground(Color.green);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == botonMostrar) {
			panel2.setVisible(true);
		}
		if (e.getSource() == botonOcultar) {
			panel2.setVisible(false);
		}
		if (e.getSource() == botonReiniciar) {
			reiniciarPanel(panel1);
			nombre.requestFocus();
		}
		if (e.getSource() == botonAceptar) {
			comprobarDatos();
		}
	}

//reiniciar los valores de un panel
	private void reiniciarPanel(JPanel panel) {
		Component componentes[] = panel.getComponents();
//obtenemos los componentes situados dentro del panel
		for (Component c : componentes) { // por cada uno de ellos
			if (c instanceof JTextField) { // vemos si es un jTextField
				((JTextField) c).setText(""); // y lo vaciamos
			} else if (c instanceof JScrollPane) { // vemos si es un JScrollPane (del JTextArea)
				Component csp = ((JScrollPane) c).getViewport().getView(); // obtenemos el componente
				if (csp instanceof JTextArea) { // vemos si es un jTexArea
					((JTextArea) csp).setText(""); // y lo vaciamos
				}
			} else if (c instanceof JFormattedTextField) {// vemos si es un JFormattedTextField
				((JFormattedTextField) c).setValue(null); // lo vaciamos
				try {
					((JFormattedTextField) c).commitEdit(); // y actualizarmos su valor
				} catch (ParseException ex) {
				}
			} else if (c instanceof JSpinner) {// vemos si es un JSpinner
				SpinnerModel modelo = ((JSpinner) c).getModel();
				if (modelo instanceof SpinnerDateModel) {// si es de tipo fecha
					Calendar cal = Calendar.getInstance();
					Date fechaHoy = cal.getTime();
					modelo.setValue(fechaHoy); // le ponemos la fecha de hoy
				} else if (modelo instanceof SpinnerNumberModel) { // si es de tipo num�rico
					modelo.setValue(1); // le ponemos el valor m�s bajo inicial (1)
				}
			} else if (c instanceof JComboBox) { // vemos si es un JComboBox
				((JComboBox) c).setSelectedIndex(0); // y seleccionamos el primer elemento
			} else if (c instanceof JCheckBox) { // vemos si es un JCheckBox
				((JCheckBox) c).setSelected(false); // y lo desmarcamos
			}
		}
	}// fin reiniciarPanel

	private void comprobarDatos() {
		boolean ok = !(nombre.getText().equals("")) && !(apellidos.getText().equals(""));
		if (ok) {
			JOptionPane.showMessageDialog(this, "Registro guardado", "Datos del Formulario",
					JOptionPane.INFORMATION_MESSAGE);
			reiniciarPanel(panel1);
		} else {
			JOptionPane.showMessageDialog(this, "Faltan datos por cumplimentar", "Datos del Formulario",
					JOptionPane.ERROR_MESSAGE);
		}
		nombre.requestFocus();
	}// fin comprobarFormulario
}
