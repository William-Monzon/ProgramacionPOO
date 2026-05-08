package poo.overloadingandoverriding;

public class Circulo extends Figura{

	private double radio;

	public Circulo(double radio) {
		super();
		this.radio = radio;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	@Override
	public double area() {
		return Math.PI*Math.pow(radio, 2);
	}
	
	public double area(double circunferencia) {
		return Math.pow(circunferencia, 2)/(4*Math.PI);
	}
}
