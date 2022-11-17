package jFrameJDialog;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class VentanaPrincipal extends JFrame implements ActionListener {
	private JPanel miPanel;/* declaramos el Panel */
	private JButton botonCambiar;/* declaramos el objeto Boton */
	private JLabel labelTitulo;/* declaramos el objeto Label */
	private VentanaPrincipal miVentanaPrincipal;

	public VentanaPrincipal() {
		/* permite iniciar las propiedades de los componentes */
		iniciarComponentes();
		/* Asigna un titulo a la barra de titulo */
		setTitle("JFrame VentanaPrincipal");
		/* tamaño de la ventana */
		setSize(400, 250);
		/* pone la ventana en el Centro de la pantalla */
		setLocationRelativeTo(null);
	}

	/**
	 * @param miVentana Enviamos una instancia de la ventana principal
	 */
	public void setVentanaPrincipal(VentanaPrincipal miVentana) {
		miVentanaPrincipal = miVentana;
	}

	private void iniciarComponentes() {
		miPanel = new JPanel();/* instanciamos el Panel */
		/*
		 * con esto definmos nosotros mismos los tamaños y posicion de los componentes
		 */
		miPanel.setLayout(null);
		/*
		 * Propiedades del boton, lo instanciamos, posicionamos y activamos los eventos
		 */
		botonCambiar = new JButton();
		botonCambiar.setText("Iniciar");
		botonCambiar.setBounds(100, 80, 80, 23);
		botonCambiar.addActionListener(this);
		/*
		 * Propiedades del Label, lo instanciamos, posicionamos y activamos los eventos
		 */
		labelTitulo = new JLabel();
		labelTitulo.setText("VENTANA PRINCIPAL");
		labelTitulo.setBounds(80, 20, 180, 23);
		/* Agregamos los componentes al Contenedor */
		miPanel.add(labelTitulo);
		miPanel.add(botonCambiar);
		add(miPanel);
	}

	/* Agregamos el evento al momento de llamar la otra ventana */
	@Override
	public void actionPerformed(ActionEvent evento) {
		if (evento.getSource() == botonCambiar) {
			VentanaConfirmacion miVentanaConfirmacion = new VentanaConfirmacion(miVentanaPrincipal, true);
			miVentanaConfirmacion.setVisible(true);
		}
	}
}
