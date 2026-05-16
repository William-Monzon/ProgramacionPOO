package poo.swing.gui;

import java.awt.Color; //Para darle color al label
import java.awt.event.MouseEvent; //Utilizar los eventos de MouseListener
import java.awt.event.MouseListener; //Utilizar la implementaciones de MouseListener

import javax.swing.JButton; //Utilizar botones
import javax.swing.JFrame;	 //Para heredar de JFrame y utilizar todos sus atributos
import javax.swing.JLabel;	//Utilizar labels
import javax.swing.JTextField; //Utilizar campos de texto

public class Window extends JFrame implements MouseListener{ //Heredo de JFrame e implemento MouseListener
	//Atributos de tipo JButton, JLabel y JTextField
	JButton btnAceptar;
	private JLabel lblTitulo;
	private JTextField txtNombre;
	
	public Window() { //Constructor de la clase
		System.out.println("Ingreso a la ventana princiapal");
		
		setTitle("Mi primer ventana");
		setSize(500,500);
		setLocationRelativeTo(null); //Hace que la ventana aparezca en el medio de la pantalla
		setLayout(null); //Hace que el usuario haga los tamaños de los componentes de forma manual
		setVisible(true); //Hace visible la ventana
		
		componentes();
	}
		private void componentes() {
			lblTitulo = new JLabel(); //Le doy a la variable el valor del objeto Jlabel
			lblTitulo.setText("Bienvenidos"); //Ingreso texto
			lblTitulo.setBounds(20,65,80,25); //le doy ancho, largo y posicion en x y al label
			lblTitulo.setBackground(Color.green); //Le doy un color especifico al label
			lblTitulo.setOpaque(true); //Bloque la vista de componentes que se encuentren detrás y con el true hace que se puédan utilizar colores sólidos
			
			btnAceptar = new JButton(); //Instancio un botón
			btnAceptar.setText("Presioname!");
			btnAceptar.setBounds(120,65,110,25); //ancho, largo y posicion en x y del botón
			btnAceptar.addMouseListener(this); //hago que al presionar el boton el programa lo escuche
			
			txtNombre = new JTextField(); //Instancio el campo de texto
			txtNombre.setBounds(120, 10, 150, 30);
			txtNombre.setToolTipText("Ingrese su nombre");
			
			add(lblTitulo); //Agrego a la ventana el label
			add(btnAceptar);//Agrego a la ventana el botón
			add(txtNombre); //Agrego a la ventana el campo de texto
		}
		
			
		
		@Override
		public void mouseClicked(MouseEvent e) { //Método cuando el usuario termia de presionar
			if (e.getSource()==btnAceptar) { //getSource le revela al programa que botón hizo el ruido
				
				lblTitulo.setBackground(Color.green);
				String nombre = txtNombre.getText();
				System.out.println(nombre + " Gracias por presionarme!");
			}	
		}
		@Override
		public void mousePressed(MouseEvent e) { //Método cuando el usuario presiona el botón
			if (e.getSource()==btnAceptar) {
				System.out.println("Presiona!");
			}
			
		}
		@Override
		public void mouseReleased(MouseEvent e) { //Método cuando el usuario termina y suelta el botón
			if (e.getSource()==btnAceptar) {
				System.out.println("Suelta!");
				btnAceptar.setBounds(120,65,100,30);
			}
		}
		@Override
		public void mouseEntered(MouseEvent e) {//Método caundo el cursor pasa arriba del boton
			if (e.getSource()==btnAceptar) {
				System.out.println("Entra!");
				btnAceptar.setBounds(120,65,140,45);
				lblTitulo.setBackground(Color.blue);
			}
		}
		@Override
		public void mouseExited(MouseEvent e) { //Método cuando el cursor sale del botón a otro lado de la ventana
			if (e.getSource()==btnAceptar) {
				System.out.println("Sale!");
				btnAceptar.setBounds(120,65,110,25);
				lblTitulo.setBackground(Color.gray);
			}
		}
		
}
