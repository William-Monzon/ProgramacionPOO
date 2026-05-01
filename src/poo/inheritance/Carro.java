package poo.inheritance;

public class Carro extends Vehiculo {

	public Carro(String placa, String marca) {
		super(placa, marca);
	}

	@Override
	public void arranque() {
		System.out.println("El carro arancó");
	}

	@Override
	public void descipcion() {
		super.descipcion();
	}
	
	
}
