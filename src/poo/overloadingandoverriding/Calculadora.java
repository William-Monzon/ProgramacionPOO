package poo.overloadingandoverriding;

public class Calculadora {

	public int suma(int num1, int num2) {
		return num1+num2;
	}
	
	public double suma(double num1, double num2) {
		return num1+num2;
	}
	public int suma(int num1, int num2, int num3) {
		return num1+num2+num3;
	}
	public double suma(double num1, double num2, double num3) {
		return num1+num2+num3;
	}
	public int resta(int num1, int num2) {
		return num1-num2;
	}
	
	public double resta(double num1, double num2) {
		return num1+-num2;
	}

}
