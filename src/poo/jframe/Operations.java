package poo.jframe;

public class Operations {  //Clase con klos métodos para hacer la suma, resta, multiplicación y división
	public int sumar(int num1, int num2) {
		return num1 + num2;
	}

	public int restar(int num1, int num2) {
		return num1 - num2;
	}

	public int multiplicar(int num1, int num2) {
		return num1 * num2;
	}

	public String dividir(int num1, int num2) {
		double div = 0;
		if (num2 != 0) { //división validada con if para no aceptar denominador 0
			div = num1 / num2;
			return "La división es = " + div ;
		} else {
			return "No se puede dividir entre cero!";
		}
	}
}
