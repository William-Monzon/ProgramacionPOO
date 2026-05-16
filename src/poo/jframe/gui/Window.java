package poo.jframe.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame; //Importo para heredar de JFrame
import javax.swing.JPanel;  //Para crear el panel principal
import javax.swing.border.EmptyBorder; //Para darle bordes al panel

import poo.jframe.Operations;

import javax.swing.JLabel;  //Para crear labels
import javax.swing.JOptionPane; //Para hacer ventanas emergentes
import javax.swing.SwingConstants;
import java.awt.Font; //Para darle tamaño, fuente y negrita al texto
import javax.swing.JTextField;  //Para crear campos de textos
import javax.swing.JButton;  //Para crear botones
import java.awt.event.ActionListener; //Para que el boton escuche una acción
import java.awt.event.ActionEvent;  //Para poder hacer objetos con eventos

public class Window extends JFrame implements ActionListener {

	
	private JPanel panelPrincipal;
	private JTextField txtCampoNum1;
	private JTextField txtCampoNum2;
	JButton btnSuma, btnResta, btnMultiplicar, btnDividir;
	
	Operations myOperations;
	private JLabel lblResultado;
	
	public Window() { //Constructor de la clase
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Hace que la ventana se cierre cuando el usuario quiera y el programa ya no se ejecute, sino que finalice
		
		componentes();
		setTitle("Ventana de Operaciones");
		setResizable(false); //Define si el usuario puede cambiar el tamaño de la ventana, en este caso es "false", osea que no puede cambiar el tamaño
		setLocationRelativeTo(null); //Hago que la ventana se centre en la pantalla

	}

	private void componentes() {
		
		setBounds(100, 100, 346, 271);
		panelPrincipal = new JPanel();
		panelPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5)); //Bordes del panel principal
		setContentPane(panelPrincipal); //muestra lo que hay dentro de la ventana
		panelPrincipal.setLayout(null); // Organiza los componentes para que se vean ordenados
		
		
		JLabel lblTitutlo = new JLabel("Operaciones Matemáticas"); //Instancio un label
		lblTitutlo.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTitutlo.setHorizontalAlignment(SwingConstants.CENTER); //Centro el titulo
		lblTitutlo.setBounds(24, 10, 298, 34); //Le doy ancho largo, espacios en horizontal y vertical
		panelPrincipal.add(lblTitutlo); //Ingreso el titulo en la ventana
		
		txtCampoNum1 = new JTextField(); //Instancio campo de texto
		txtCampoNum1.setBounds(131, 54, 118, 19); //ancho, largo espacios en x y del campo de texto
		panelPrincipal.add(txtCampoNum1); //Agrego el campo de texto
		txtCampoNum1.setColumns(10); //Limita la cantidad de caracteres para que solo se lean 10, no limita los caractere que el ususario ingrese
		
		txtCampoNum2 = new JTextField();
		txtCampoNum2.setColumns(10);
		txtCampoNum2.setBounds(131, 83, 118, 19);
		panelPrincipal.add(txtCampoNum2);
		
		JLabel lblNum1 = new JLabel("Número 1: ");
		lblNum1.setBounds(34, 54, 63, 19);
		panelPrincipal.add(lblNum1);
		
		JLabel lblNum2 = new JLabel("Número 2: ");
		lblNum2.setBounds(34, 83, 63, 19);
		panelPrincipal.add(lblNum2);
		
		btnSuma = new JButton("Suma");  //Instancio un botón
		btnSuma.setBounds(13, 138, 84, 20); //ancho, largo y espacios en x y del botón
		btnSuma.addActionListener(this); //método para hacer que a la hora de presionar el botón el programa lo escuche
		panelPrincipal.add(btnSuma); //Agrego el botón a la ventana principal
		
		btnResta = new JButton("Resta");
		btnResta.setBounds(113, 138, 84, 20);
		btnResta.addActionListener(this);	
		panelPrincipal.add(btnResta);
		
		btnMultiplicar = new JButton("Multiplicación");
		btnMultiplicar.setBounds(218, 138, 84, 20);
		btnMultiplicar.addActionListener(this);
		panelPrincipal.add(btnMultiplicar);
		
		btnDividir = new JButton("División");
		btnDividir.setBounds(113, 168, 84, 20);
		btnDividir.addActionListener(this);
		panelPrincipal.add(btnDividir);
		
		lblResultado = new JLabel("");
		lblResultado.setHorizontalAlignment(SwingConstants.CENTER); //Centro el label resultado
		lblResultado.setBounds(10, 205, 312, 19);
		panelPrincipal.add(lblResultado);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(btnSuma==e.getSource()) {
			int num1 = Integer.parseInt(txtCampoNum1.getText()); //Cambio las variables de String a int con el parseInt
			int num2 = Integer.parseInt(txtCampoNum2.getText());
			int sum=myOperations.sumar(num1, num2); //le asigo el valor de los métodos de operations, que realizan las operaciones
			lblResultado.setText("La suma es = " + sum); //Muestro el resultado
		}
		if(btnResta==e.getSource()) {
			int num1 = Integer.parseInt(txtCampoNum1.getText());
			int num2 = Integer.parseInt(txtCampoNum2.getText());
			int rest=myOperations.restar(num1, num2);
			lblResultado.setText("La resta es = " + rest);
		}
		if(btnMultiplicar==e.getSource()) {
			int num1 = Integer.parseInt(txtCampoNum1.getText());
			int num2 = Integer.parseInt(txtCampoNum2.getText());
			int mult=myOperations.multiplicar(num1, num2);
			lblResultado.setText("La multiplicación es = " + mult);
		}
		if(btnDividir==e.getSource()) {
			int num1 = Integer.parseInt(txtCampoNum1.getText());
			int num2 = Integer.parseInt(txtCampoNum2.getText());
			String div=myOperations.dividir(num1, num2);
			lblResultado.setText(div);
		}
		
	}

	public void asignarOperaciones(Operations myOperations) {
		this.myOperations = myOperations; //Asigno al atributo myOperations las operaciones de la clase Operations
	}
}
