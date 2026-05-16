package poo.jframe;

import javax.swing.JOptionPane; //importo la libreria para OptionPane para varias bentanas emergentes

import poo.jframe.gui.Window; //Importo para usar la clase Window

public class Aplication {
	Operations myOperations;

	public Aplication() {
		myOperations = new Operations();
		//presentarMenu();
		presentarWindow();
	}

	private void presentarWindow() {
		Window ventana = new Window();
		ventana.asignarOperaciones(myOperations); //llamo al método de la clase window y le ingreso los metódos de la clase Operations
		ventana.setVisible(true); //setVisible para hacer visible el panel dejava swing
	}
	//Otro forma de realizar la calculadora utilizando JOptionPane para abrir varias ventanas e ingresar los datos
	/*private void presentarMenu() {
		String menu = "Operaciones Matematicas\n";
		menu += "1. Sumar\n";
		menu += "2. Restar\n";
		menu += "3. Multiplicar\n";
		menu += "4. Dividir\n";
		menu += "5. Salir\n\n";
		menu += "Ingrese una opción\n";
		int cod = 0;
		do {
			int num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer número: "));
			int num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo número: "));
			cod = Integer.parseInt(JOptionPane.showInputDialog(menu));
			
			switch(cod) {
			case 1:
				int sum=myOperations.sumar(num1, num2);
				JOptionPane.showMessageDialog(null, "La suma es: " + sum);
				break;
			case 2:
				int rest=myOperations.restar(num1, num2);
				JOptionPane.showMessageDialog(null, "La resta es: " + rest);
				break;
			case 3:
				int mult=myOperations.multiplicar(num1, num2);
				JOptionPane.showMessageDialog(null, "La multiplicación es: " + mult);
				break;
			case 4:
				String div=myOperations.dividir(num1, num2);
				JOptionPane.showMessageDialog(null, div);
				break;	
			case 5: 
				JOptionPane.showMessageDialog(null, "Hasta Pronto!");
				break;
			default: JOptionPane.showMessageDialog(null, "Ingrese un código válido");
				break;
			}
		} while (cod != 5);
	}*/
}
