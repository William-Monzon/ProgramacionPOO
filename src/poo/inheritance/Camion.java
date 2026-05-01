package poo.inheritance;

public class Camion extends Vehiculo{

	public Camion(String placa, String marca) {
		super(placa, marca);
	}

	@Override
	public void arranque() {
		System.out.println("El Camión arrancó");
	}

	@Override
	public void descipcion() {
		super.descipcion();
	}
	
}
