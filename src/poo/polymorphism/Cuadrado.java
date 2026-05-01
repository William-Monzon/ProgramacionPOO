package poo.polymorphism;

public class Cuadrado extends Figura{
	private double lado;

	public Cuadrado(double lado) {
		super();
		this.lado = lado;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	@Override
	public double area() {
		return Math.pow(this.lado, 2);
	}

	@Override
	public double perimetro() {
		return this.lado * 4; 
	}
	
	
}
