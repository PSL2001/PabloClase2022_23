/**
 * PabloClase2022_23 - componentesDeTexto - Panel.java
 * 19 oct 2022 - 9:45:36
 * @author Pablo Sánchez López
 */
package componentesDeTexto;

import java.awt.*;
import java.awt.event.*;
import java.text.ParseException;
import javax.swing.*;
import javax.swing.text.*;

/**
 * @author usuario
 *
 */

public class Panel extends JPanel implements ActionListener {
	/** declaramos los objetos */
	JLabel labelTitulo, etiquetaTextField, etiquetaFormattedTextField, etiquetaCampoContraseña, etiquetaRadioButton, etiquetaCombo, etiquetaJtextArea, etiquetaJEditorPane, etiquetaJTextPane;
	JTextField cajaDeTexto;
	JFormattedTextField cajaDeTextoConFormato;
	MaskFormatter mascara;
	JPasswordField campoContraseña;
	JTextArea areaDeTexto;
	JEditorPane areaEditorPane;
	JTextPane areaTextPane;
	JCheckBox check1, check2;
	JButton boton;

	public Panel() {
		this.setLayout(null);
		/* Definimos las propiedades de los componentes */
		labelTitulo = new JLabel();
		labelTitulo.setText("Componentes De Texto Java Swing");
		labelTitulo.setFont(new java.awt.Font("Tahoma", 1, 20));
		labelTitulo.setBounds(160, 5, 380, 40);
		etiquetaTextField = new JLabel();
		etiquetaTextField.setText("JTextField : ");
		etiquetaTextField.setBounds(20, 60, 280, 23);
		cajaDeTexto = new JTextField();
		cajaDeTexto.setBounds(90, 60, 90, 23);
		etiquetaFormattedTextField = new JLabel();
		etiquetaFormattedTextField.setText("JFormattedTextField : ");
		etiquetaFormattedTextField.setBounds(200, 60, 140, 23);
		try {
			mascara = new MaskFormatter("####");
			cajaDeTextoConFormato = new JFormattedTextField(mascara);
			cajaDeTextoConFormato.setFocusLostBehavior(cajaDeTextoConFormato.COMMIT);
			cajaDeTextoConFormato.setBounds(330, 60, 80, 23);
		} catch (ParseException e1) {
// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		etiquetaCampoContraseña = new JLabel();
		etiquetaCampoContraseña.setText("JPasswordField : ");
		etiquetaCampoContraseña.setBounds(430, 60, 120, 23);
		campoContraseña = new JPasswordField();
		campoContraseña.setBounds(530, 60, 80, 23);
		etiquetaJtextArea = new JLabel();
		etiquetaJtextArea.setText("JTextArea: ");
		etiquetaJtextArea.setBounds(20, 90, 100, 23);
		areaDeTexto = new JTextArea();
		areaDeTexto.setBounds(90, 90, 520, 103);
		etiquetaJEditorPane = new JLabel();
		etiquetaJEditorPane.setText("JEditorPane: ");
		etiquetaJEditorPane.setBounds(10, 200, 100, 23);
		areaEditorPane = new JEditorPane();
		areaEditorPane.setBounds(90, 200, 520, 103);
		/* Definimos el tipo de texto que utiliza */
		areaEditorPane.setContentType("text/html");
		areaEditorPane.setText("<h1><b>Texto En Negrilla y etiqueta H1</b></h1>" + " Texto normal"
				+ "<font color=\"blue\"> Texto con color azul</font>"
				+ "<font face=\"verdana\"> fuente verdana</font>");
		etiquetaJTextPane = new JLabel();
		etiquetaJTextPane.setText("JTextPane: ");
		etiquetaJTextPane.setBounds(20, 310, 100, 23);
		/* usamos StyleContext para definir el estilo a usar */
		StyleContext estilo = new StyleContext();
		/* creamos el estilo, no definimos nombre ni estilo padre... */
		Style estiloRojo = estilo.addStyle(null, null);
		StyleConstants.setForeground(estiloRojo, Color.red);
		/* definimos el estilo a usar */
		DefaultStyledDocument estiloPorDefecto = new DefaultStyledDocument(estilo);
		areaTextPane = new JTextPane(estiloPorDefecto);
		areaTextPane.setCharacterAttributes(estiloRojo, false);
		areaTextPane.setBounds(90, 310, 520, 103);
// Se inserta
		try {
			areaTextPane.getStyledDocument().insertString(areaTextPane.getStyledDocument().getLength(),
					"Texto con estilo rojo, seleccione un check ", estiloRojo);
		} catch (BadLocationException e) {
// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*
		 * Definimos el Foco del componente, para que se inserte de ultimo en el area
		 */
		areaTextPane.setCaretPosition(areaTextPane.getStyledDocument().getLength());
		check1 = new JCheckBox("check1");
		areaTextPane.insertComponent(check1);
		areaTextPane.setCaretPosition(areaTextPane.getStyledDocument().getLength());
		check2 = new JCheckBox("check2");
		areaTextPane.insertComponent(check2);
		boton = new JButton();
		boton.setText("Enviar");
		boton.setBounds(530, 430, 80, 23);
		boton.addActionListener(this);
		/* Agregamos los componentes al panel */
		this.add(labelTitulo);
		this.add(etiquetaTextField);
		this.add(etiquetaFormattedTextField);
		this.add(etiquetaJtextArea);
		this.add(boton);
		this.add(cajaDeTexto);
		this.add(cajaDeTextoConFormato);
		this.add(etiquetaCampoContraseña);
		this.add(campoContraseña);
		this.add(areaDeTexto);
		this.add(etiquetaJEditorPane);
		this.add(areaEditorPane);
		this.add(etiquetaJTextPane);
		this.add(areaTextPane);
	}

	/** Agregamos los eventos de presionar */
	@Override
	public void actionPerformed(ActionEvent evento) {
		String retorno = "";
		retorno += "JTextField = " + cajaDeTexto.getText() + "\n";
		retorno += "JFormattedTextField = " + cajaDeTextoConFormato.getText() + "\n";
		/* getText() es deprecated, sin embargo podemos usarlo */
// retorno += "JPasswordField = " + campoContraseña.getText() + "\n";
		String valorPass = new String(campoContraseña.getPassword());
		retorno += "JPasswordField = " + valorPass + "\n";
		/*
		 * getpassword permite obtener el valor encriptado, para desencriptarlo se
		 * maneja con tipos de datos char
		 */
		retorno += "JPasswordField Encriptado= " + campoContraseña.getPassword() + "\n";
		/* Evento cuando presiona el boton */
		if (evento.getSource() == boton) {
			if (check1.isSelected()) {
				retorno += "check1 seleccionado\n";
			}
			if (check2.isSelected()) {
				retorno += "check2 seleccionado\n";
			}
			JOptionPane.showMessageDialog(null, retorno);
			/* Enviamos el valor de retorno al JTextArea */
			areaDeTexto.setText(retorno);
		}
	}
}