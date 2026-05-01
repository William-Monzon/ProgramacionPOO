package poo.polymorphism;

public class Main {

	public static void main(String[] args) {
		Figura rectangulo = new Rectangulo(5, 7);
		
		System.out.println("\nRectangulo\nArea: " + rectangulo.area() + "\nPerimetro: " + rectangulo.perimetro());
		
		if (!(rectangulo instanceof Cuadrado)) {
			System.out.println("\nRectangulo no hereda de cuadrado");
		}
		Circulo circulo = new Circulo(5);
		if(circulo instanceof Figura) {
			System.out.println("\nCirculo\nArea: " + circulo.area() + "\nCircunferencia: " + circulo.perimetro());
		}
		Figura cuadrado = new Cuadrado(6);
		if(cuadrado instanceof Figura) {
			System.out.println("\nCuadrado\nArea: " + cuadrado.area() + "\nPerimetro: " + cuadrado.perimetro());
		}
	}

}
