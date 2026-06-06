package poo.abstracto;

public class Pajaro extends Animal {

	public Pajaro(String nombre) {
		super(nombre);
	}

	@Override
	public void eat() {
		System.out.println("El pájaro " + getNombre() + " come");
	}

	public void fly() {
		System.out.println("El pájaro " + getNombre() + " vuela");
	}

}
