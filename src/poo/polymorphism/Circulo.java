package poo.polymorphism;

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
		return Math.PI*Math.pow(this.radio, 2);
	}

	@Override
	public double perimetro() {
		return 2*Math.PI*this.radio;
	}
	
}
