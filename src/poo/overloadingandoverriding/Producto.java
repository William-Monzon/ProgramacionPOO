package poo.overloadingandoverriding;

public class Producto {
	private String nombre;
	private double precio;
	public Producto(String nombre, double precio) {
		super();
		this.nombre = nombre;
		setPrecio(precio);
	}
	public Producto(String nombre) {
		super();
		this.nombre = nombre;
		this.precio = 0.0;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		if(precio<0) {
			throw new IllegalArgumentException("Precio inválido!");
		}
		this.precio = precio;
	}
	public void mostrar() {
		System.out.println("\nProducto: " + this.nombre + "\nPrecio: Q" + this.precio);
	}
	
}
