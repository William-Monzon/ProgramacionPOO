package poo.overloadingandoverriding;

public class Main {

	public static void main(String[] args) {
		calculadora();
		producto();
		figura();

	}
	public static void calculadora() {
		Calculadora operacion = new Calculadora();
		System.out.println("\nCalculadora");
		System.out.println("Suma: " + operacion.suma(4, 2));
		System.out.println("Suma: " + operacion.suma(5, 2, 3));
		System.out.println("Suma: " + operacion.suma(5.63, 2.178, 3));
		
		System.out.println("Resta: " + operacion.resta(4, 2));
		System.out.println("Resta: " + operacion.resta(8.182, 5.1291));
	}
	
	public static void producto() {
		Producto prod1 = new Producto("Jabón", 34);
		Producto prod2 = new Producto("Agua");
		System.out.println("\nProductos");
		prod1.mostrar();
		prod2.mostrar();
	}

	public static void figura() {
		Circulo circulo = new Circulo(3);
		System.out.println("\nArea del Circulo");
		System.out.println("\nArea: " + circulo.area());
		System.out.println("\nArea: " + circulo.area(18.85));
		
	}	
}