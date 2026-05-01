package poo.inheritance;

public class Vehiculo {
	protected String placa;
	protected String marca;

	public Vehiculo(String placa, String marca) {
		super();
		this.placa = placa;
		this.marca = marca;
	}
	public void arranque() {
		System.out.println("El vehiculo arranco");
	}
	
	public void descipcion() {
		System.out.println("\nMarca: " + this.marca + "\nPlaca: " + this.placa);
	}
}
